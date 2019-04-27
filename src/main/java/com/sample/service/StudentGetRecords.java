package com.sample.service;

import com.sample.mappers.StudentMapper;
import com.sample.model.Student;
import com.sample.util.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class StudentGetRecords {



    public static void insertStudent(Student  student) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            studentMapper.insertStudent(student);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public static void callProcedure(){
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        //select a particular student  by  id
    //    Student student = (Student) sqlSession.selectOne("callById", 3);

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
       Student student= studentMapper.callById(3);

        //Print the student details
        System.out.println("Details of the student are:: ");
        System.out.println("Id :"+student.getId());
        System.out.println("Name :"+student.getName());
        System.out.println("Branch :"+student.getBranch());
        System.out.println("Percentage :"+student.getPercentage());
        System.out.println("Email :"+student.getEmail());
        System.out.println("Phone :"+student.getPhone());
        sqlSession.commit();
        sqlSession.close();

    }

    public static void main(String args[]) throws IOException {

       /* Student student1=new Student();
        student1.setBranch("hyderabad");
        student1.setEmail("test1@mail.com");
        student1.setName("krishna");
        student1.setPercentage(20);
        student1.setPhone(1234);

        Student student2=new Student();
        student2.setBranch("bangalore");
        student2.setEmail("test2@mail.com");
        student2.setName("chaitanya");
        student2.setPercentage(10);
        student2.setPhone(5678);*/

      // insertStudent(student2);

     callProcedure();

    }
}
