package model;

public class Student {
    private int id;
    private String name;
    private int old;
    private String address;
    private static int idIncrement = 1;

    public Student(String name, int old, String address) {
        this.id = idIncrement++;
        this.name = name;
        this.old = old;
        this.address = address;

    }
    public Student( int id, String name, int old, String address) {
        this.id = id;
        this.name = name;
        this.old = old;
        this.address = address;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", old=" + old +
                ", address=" + address +
                '}';
    }
}
