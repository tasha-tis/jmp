package jmp.ood.bad.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleList<T> {

    private List<T> storage = new ArrayList<>();

    public boolean put(final T element) {
        return storage.add(element);
    }

    public T get(final int index) {
        return storage.get(index);
    }

    public int count() {
        return storage.size();
    }

    public List<T> getEachN(final int n) {
        // @formatter:off
        return IntStream
                .range(0, count())
                .filter(index -> index % n == 0)
                .mapToObj(storage::get)
                .collect(Collectors.toList());
        // @formatter:on
    }
}
