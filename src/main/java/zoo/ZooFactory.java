package zoo;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class ZooFactory {

    private List<Supplier<? extends Animal>> animalSuppliers = asList(
            Cat::new,
            Dog::new,
            Horse::new
    );


    public Animal createRandomAnimal(){
        Random random = new Random();
        int i = random.nextInt(animalSuppliers.size());
        return animalSuppliers.get(i).get();

    }
}











