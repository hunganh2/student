package manager;

import model.Student;

import java.util.ArrayList;

public class StudentManager implements Manager<Student> {
    ArrayList<Student> list = new ArrayList<>();

    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void delete(int id) {
        int index = findById(id);
        list.remove(index);
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(int id, Student student) {
        int index = findById(id);
        list.set(index, student);

    }

    @Override
    public ArrayList<Student> findAll() {
        return list;
    }

    public ArrayList<Student> studentTwenty() {
        ArrayList<Student> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getOld() == 20) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }

    public ArrayList<Student> students25old() {
        ArrayList<Student> students25old = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).getOld() == 25) && (list.get(i).getAddress().equals("Hà tây"))) {
                students25old.add(list.get(i));
            }
        }
        return students25old;
    }

}
