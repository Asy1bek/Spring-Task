package kz.bitlab.academy.springfirstsprint.service;

import kz.bitlab.academy.springfirstsprint.entity.StudentEntity;

import java.util.ArrayList;
import java.util.List;

public class  StudentService {

    private static List<StudentEntity> students = new ArrayList<>();
    private static Long id = 1L;

    static {
        students.add(new StudentEntity(id++, "Ilyas", "Zhuanyshev", 88, "B"));
        students.add(new StudentEntity(id++, "Serik", "Erikov", 91, "A"));
        students.add(new StudentEntity(id++, "Erik", "Serikov", 65, "C"));
        students.add(new StudentEntity(id++, "Nurzhan", "Bolatov", 48, "F"));
        students.add(new StudentEntity(id++, "Patrick", "Zuckerberg", 100, "A"));
    }

    public static List<StudentEntity> findAll() {
        return students;
    }


}
