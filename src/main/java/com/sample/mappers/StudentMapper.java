package com.sample.mappers;

import com.sample.model.Student;

public interface StudentMapper {
    void  insertStudent(Student student);

    Student callById(int param);
}
