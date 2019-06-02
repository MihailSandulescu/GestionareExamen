package com.mihais.Admitere.Services;

import java.io.*;

public class FileSerializableService {

    private static FileSerializableService ourInstance = new FileSerializableService();

    private String candidatSerializablePath = "/home/mihais/IdeaProjects/Admitere/candidat.txt";

    public static FileSerializableService getInstance() {
        return ourInstance;
    }

    private FileSerializableService() {
    }

    public void writeObjectToFile(Object object, String path) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object readObjectFromFile(String path) {
        Object object = null;

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
            object = objectInputStream.readObject();
            objectInputStream.close();

        } catch (IOException|ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    public String getCandidatSerializablePath() {
        return candidatSerializablePath;
    }
}
