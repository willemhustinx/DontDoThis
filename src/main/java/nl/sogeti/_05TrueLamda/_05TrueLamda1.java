package nl.sogeti._05TrueLamda;

import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings("ALL")
public class _05TrueLamda1 {
    public static void main(String... args) {
        var ints = List.of(1, 2, 3);
        ints.forEach(i -> System.out.println(i));
    }
}
