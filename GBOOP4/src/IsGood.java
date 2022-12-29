import java.util.Collection;

public interface IsGood<T> {
    boolean isGood(T item);
    public Collection<T> filter(Collection<T> items);
}
