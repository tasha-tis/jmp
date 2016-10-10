package jmp.ood.bad.six;

        import java.util.ArrayList;
        import java.util.List;

public class SuperList<T> {

    public List<T> storage = new ArrayList<>();

    private T get(final int index) {
        return storage.get(index);
    }

    private boolean put (final T element) {
        return storage.add(element);
    }
}
