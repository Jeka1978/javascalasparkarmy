package serialization;

import lombok.SneakyThrows;

import java.io.*;

/**
 * @author Evgeny Borisov
 */
public class MainToRead {
    @SneakyThrows
    public static void main(String[] args) {
        Soldier jonathan = new Soldier("Jonathan", 23);
        File file = new File("c:\\tmp\\soldier.obj");


        FileInputStream fos = new FileInputStream(file);
        ObjectInputStream oos = new ObjectInputStream(fos);
        Soldier o = (Soldier) oos.readObject();
        System.out.println("o = " + o);

    }
}




