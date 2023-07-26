import java.util.Collection;

public interface Collention<E> {
    int size();

    boolean isEmpty();

    boolean contains(Object element);

    boolean add(E element);

    boolean remove(Object element);

    boolean ContainsAll(Collection<?> c);

    boolean addAll(Collection<? extends E> c);

    boolean removeALL(Collection<?> c);

    boolean retainAll(Collection<?> c);

    void clear();

}
