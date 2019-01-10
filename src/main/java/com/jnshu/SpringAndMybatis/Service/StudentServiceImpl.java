package com.jnshu.SpringAndMybatis.Service;

import com.jnshu.SpringAndMybatis.DAO.StudentMapper;
import com.jnshu.SpringAndMybatis.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    public void insert(Student student) throws Exception{
        studentMapper.insert(student);
    }
    public boolean delete(int id) throws Exception{
        return studentMapper.delete(id);
    }
    public boolean update(Student student) throws Exception{
        return studentMapper.update(student);
    }
    public Student queryById(int id) throws Exception{
        return studentMapper.queryById(id);
    }
    public List<Student> queryAll() throws Exception{
        return studentMapper.queryAll();
    }
}
