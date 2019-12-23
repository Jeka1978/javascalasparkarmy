package out_of_memory_benchmark;

import lombok.SneakyThrows;

import java.util.*;

/**
 * @author Evgeny Borisov
 */

//https://openjdk.java.net/projects/code-tools/jmh/
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Random random = new Random();
        Map<StringBuilder,Void> strings = new WeakHashMap<>();
        while (true) {
            StringBuilder stringBuilder = new StringBuilder("abc" + random.nextInt(100000));
            if (random.nextInt(100)==2) {
                strings.put(stringBuilder,null);
            }
            if (random.nextInt(1000000) == 2) {
                System.out.println(strings.size());
            }
        }



    }
}
