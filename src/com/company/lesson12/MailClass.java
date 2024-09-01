package com.company.lesson12;

import java.io.*;

public class MailClass {

    public static void main(String[] args) {

        User user = new User("Jared", 27, SEX.MALE);

        //Task1. serialization of an object to a file
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mihail\\IdeaProjects\\HomeworkNew\\src\\com\\company\\data\\Object.txt"));
            objectOutputStream.writeObject(user);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Task 1.deserialization file to object and print
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Mihail\\IdeaProjects\\HomeworkNew\\src\\com\\company\\data\\Object.txt"));
            try {
                Object object = objectInputStream.readObject();
                if (object instanceof User){
                    User user1 = (User) object;
                    System.out.println(user1.toString());
                }
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Task 2.
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("C:\\Users\\Mihail\\IdeaProjects\\HomeworkNew\\src\\com\\company\\data\\Dialog.txt"));
            FileWriter fileWriter1 = new FileWriter("C:\\Users\\Mihail\\IdeaProjects\\HomeworkNew\\src\\com\\company\\data\\Dialog1.txt");
            FileWriter fileWriter2 = new FileWriter("C:\\Users\\Mihail\\IdeaProjects\\HomeworkNew\\src\\com\\company\\data\\Dialog2.txt");
            FileWriter fileWriter = null;

            String line = lineNumberReader.readLine();

            while (line != null){
                if (line.startsWith("User1:")){
                    fileWriter = fileWriter1;
                } else if (line.startsWith("User2:")) {
                    fileWriter = fileWriter2;
                }
                fileWriter.write(line);
                fileWriter.write("\n");
                line = lineNumberReader.readLine();
            }

            fileWriter.close();
            fileWriter1.close();
            fileWriter2.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

}
