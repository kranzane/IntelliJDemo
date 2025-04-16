import java.util.*;
import java.util.stream.Collectors;

public class FindUniqueElements {
    public static void main(String[] args) {
        List<Character> list = Arrays.asList('A','B','C','D','A','B','C','D');

        List<Character> collect = list.stream().distinct().collect(Collectors.toList());

        System.out.println(collect);


    }
}
