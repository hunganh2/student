package view;

import manager.StudentManager;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuStudent {
    StudentManager studentManager = new StudentManager();
    Scanner input = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println(" Menu Student Manager");
            System.out.println(" 1 thêm mới học sinh");
            System.out.println(" 2 sửa học sinh");
            System.out.println(" 3 xóa học sinh");
            System.out.println(" 4 hiển thị tất cả");
            System.out.println(" 5 hiển thị học sinh 20 tuổi");
            System.out.println(" 6 hiển thị học sinh 25 tuổi ở Hà Tây");
            System.out.println(" 0 thoát ");
            System.out.println(" nhập lựa chọn của bạn");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showMenuEdit();
                    break;
                case 3:
                    showMenuDelete();
                    break;
                case 4:
                    showAll();
                    break;
                case 5:
                    showTwenty();
                    break;
                case 6:
                    showStudent25old();
                    break;
            }
        } while (choice != 0);

    }

    public void showMenuAdd() {
        System.out.println(" *** menu thêm mới *** ");
        System.out.println("nhập tên");
        String name = inputString.nextLine();
        System.out.println("nhập tuổi");
        int old = input.nextInt();
        System.out.println("nhập địa chỉ");
        String address = inputString.nextLine();
        Student student = new Student(name, old, address);
        studentManager.add(student);
        System.out.println(" *** thêm thành công ***");

    }

    public void showAll() {
        System.out.println(" danh sách sinh viên là");
        ArrayList<Student> list = studentManager.findAll();
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public void showMenuDelete() {
        System.out.println("*** xóa học sinh ***");
        System.out.println("nhập id học sinh muốn xóa: ");
        int idDelete = input.nextInt();
        studentManager.delete(idDelete);
        System.out.println(" *** xóa thành công*** ");
    }

    public void showMenuEdit() {
        System.out.println("*** Menu edit ***");
        System.out.println(" nhập id muốn sửa ");
        int idEdit = input.nextInt();
        System.out.println("nhập tên");
        String nameEdit = inputString.nextLine();
        System.out.println("nhập tuổi");
        int oldEdit = input.nextInt();
        System.out.println("nhập địa chỉ");
        String addressEdit = inputString.nextLine();
        Student newstudent = new Student(idEdit, nameEdit, oldEdit, addressEdit);
        studentManager.update(idEdit, newstudent);
        System.out.println(" sửa thành công ");
    }

    public void showTwenty() {
        ArrayList<Student> newList = studentManager.studentTwenty();
        for (Student student : newList) {
            System.out.println(student);
        }
    }
    public void showStudent25old(){
        ArrayList<Student> old23list = studentManager.students25old();
        for (Student student : old23list){
            System.out.println(student);
        }
    }

}
