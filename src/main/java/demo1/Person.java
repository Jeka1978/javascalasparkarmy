package demo1;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    @NonNull
    private String name;
    private int age;
    private int salary;
    @Singular
    private Map<String,Integer> beers;

    @Singular("דג")
    private List<String> fish;

}
