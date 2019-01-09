package com.jnshu.SpringAndMybatis.Service;

import com.jnshu.SpringAndMybatis.Model.Student;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class StudentServiceImplTest {
    ApplicationContext applicationContext;
    private static Logger logger = Logger.getLogger("StudentServiceImplTest.class");
    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void insert() throws Exception{
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        Student student1 = new Student("小强", 123456, "JAVA", "2019-01-01", "清华大学", 456, "www.abc.com", "ijg","khjg", "知乎");
        for (int i=0;i<1000;i++) {
            studentService.insert(student1);
            long id = student1.getId();
            System.out.println(id);
        }
    }

    @Test
    public void delete() throws Exception {
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        for (int i = 35; i < 305; i++) {
            int result = studentService.delete(i);
            System.out.println(result);
        }
    }

    @Test
    public void update() throws Exception {
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        Student student2 = new Student("小强", 12345, "JAVA", "2019-01-01", "清华大学", 456, "www.abc.com", "加油", "大强", "知乎");
        student2.setId(5);

        int result = studentService.update(student2);
        System.out.println(result);
    }

    @Test
    public void queryById() throws Exception {
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        int id = 1;
        System.out.println(studentService.queryById(id));
    }

    @Test
    public void queryAll() throws Exception {
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        try {
            System.out.println(studentService.queryAll());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("查询失败");
        }
    }
}