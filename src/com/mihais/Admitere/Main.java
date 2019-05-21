package com.mihais.Admitere;

import com.mihais.Admitere.Models.Catalog;
import com.mihais.Admitere.Models.Examen;
import com.mihais.Admitere.Models.Materie;
import com.mihais.Admitere.Models.Nota;
import com.mihais.Admitere.Models.Persoane.Candidat;
import com.mihais.Admitere.Models.Persoane.Profesor;
import com.mihais.Admitere.Services.CandidatFileService;
import com.mihais.Admitere.Services.CandidatService;
import com.mihais.Admitere.Services.CatalogService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args){

        Candidat candidat1 = new Candidat("Alex Ion",
                                            18,
                                                "1990704339921",
                                                 "alexion@gmail.com",
                                                     456,
                                                        "Baia Mare");
        Candidat candidat2 = new Candidat("Paula Ionescu",
                                             19,
                                                "2981203119057",
                                                  "PaulaIonescu@gmail.com",
                                                      457,
                                                       "Ploiesti");
        Candidat candidat3 = new Candidat("Costin Alexandrescu",
                                            22,
                                              "1950122014039",
                                                "calexandrescu@gmail.com",
                                                    500,
                                                     "Bucuresti");
        Candidat candidat4 = new Candidat();

        Materie analiza = new Materie("Analiza");
        Materie algebra = new Materie("Algebra");
        Materie structuriDate = new Materie("Structuri de date");

        Profesor profAnaliza = new Profesor("Gabriela Vasilescu", 43, "2680623661023", "GabrielaVasilescu@gmail.com", "Analiza");
        Profesor profAlgebra = new Profesor("Adrian Pop", 36, "1750174560373", "AdrianPop@gmail.com", "Algebra");
        Profesor profStructuriDate = new Profesor("Marcela Stoica", 32, "2798365668623", "MarcelaStoica@gmail.com", "Structuri de date");

        Examen examAnaliza = new Examen(profAnaliza, analiza, "12;00", "12 mai 2019", " 2 ore");
        Examen examAlgebra = new Examen(profAlgebra, algebra, "13:30", "17 mai 2019", "1 ora 30 min");
        Examen examStructuriDate = new Examen(profStructuriDate, structuriDate, " 10:00", "21 mai 2019", " 2 ore");

        Nota cinci = new Nota(5);
        Nota sapte = new Nota(7);
        Nota opt = new Nota(8);
        Nota noua = new Nota(9);
        Nota zece = new Nota(10);

        //citire - scriere candidat in fisier (Etapa II)
        CandidatFileService fisierServiceCandidati = CandidatFileService.getInstance();
        fisierServiceCandidati.writeCandidatToFile(candidat1, "candidat.csv");
        candidat4 = fisierServiceCandidati.readCandidatFromFile("candidat.csv");
        System.out.println(candidat4.toString());

        //operatii cu candidati
        CandidatService candidatService = CandidatService.getInstance();

        candidatService.addCandidat(candidat1);
        candidatService.addCandidat(candidat2);
        candidatService.addCandidat(candidat3);

        candidatService.removeCandidat(candidat2);

        ArrayList<Candidat> candidatiBaiaMare = candidatService.getCandidatiDinOrasul("Baia Mare");
        List<Candidat> candidatiSortatiCNP = candidatService.getCandidatiSortedByCNP();

        for(Candidat c : candidatiBaiaMare){
            System.out.println(c.getNume() + " " + c.getCandidatID());
        }

        //operatii cu catalogul
        CatalogService catalogService = CatalogService.getInstance();

        catalogService.addOnlyExamen(examAnaliza);
        catalogService.addOnlyExamen(examAlgebra);
        catalogService.addOnlyExamen(examStructuriDate);

        catalogService.addNota(examAnaliza, candidat1, sapte);
        catalogService.addNota(examAnaliza, candidat2, opt);
        catalogService.addNota(examAlgebra, candidat3, cinci);
        catalogService.addNota(examStructuriDate, candidat1, noua);
        catalogService.addNota(examStructuriDate, candidat2, zece);
        catalogService.addNota(examStructuriDate, candidat3, opt);

        for(Catalog c : catalogService.getCatalog()){
            System.out.println(c.toString());
        }

        catalogService.removeCandidat(candidat1);
        catalogService.removeNota(examStructuriDate, candidat2);


        for(Catalog c : catalogService.getCatalog()){
            System.out.println(c.toString());
        }

    }
}
