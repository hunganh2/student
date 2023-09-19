package manager;

import java.util.ArrayList;

public interface Manager<E> {
    void add(E e);
    void delete(int id);
    int findById(int id);
    void update(int id, E e);
    ArrayList<E> findAll();
    ArrayList<E> studentTwenty();
    ArrayList<E> students25old();
}
