package org.xichuan.entity;

import java.util.List;

public class Grade {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "students=" + students +
                '}';
    }
}
