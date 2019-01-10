package com.jnshu.SpringAndMybatis.Client;

import com.jnshu.SpringAndMybatis.Model.Student;
import com.jnshu.SpringAndMybatis.Service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        //插入数据
        Student student1 = new Student("小强", 123456, "JAVA", "2019-01-01", "清华大学", 456, "www.abc.com", "加油", "大强", "知乎");
        try {
            studentService.insert(student1);
            long id = student1.getId();
            System.out.println(id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("插入数据失败");
        }
//删除数据
        try {
            boolean result = studentService.delete(66);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("删除数据失败");
        }
        //修改数据
        Student student2 = new Student("小强", 123456, "JAVA", "2019-01-01", "清华大学", 456, "www.abc.com", "加油", "大强", "知乎");
student2.setId(66);
        try {
            boolean result = studentService.update(student2);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("修改数据失败");
        }
        //根据id查询数据
        int id = 66;
        try {
            System.out.println(studentService.queryById(id));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("查询失败");
        }
        //查询所有记录
        try {
            System.out.println(studentService.queryAll());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("查询失败");
        }
    }
}
