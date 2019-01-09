package com.jnshu.SpringAndMybatis.Model;

/**
 * Value Object 类，封装属性及获取修改方法
 * 属性与表中字段一一对应，且用private修饰
 */

public class Student {
    private int id;
    private String create_at;
    private String update_at;
    private String name;
    private long qq;
    private String type;
    private String admission_at;
    private String college;
    private int student_id;
    private String link;
    private String wish;
    private String senior;
    private String way;

    /**
     *添加一个构造方法，初始化各属性
     * 但要求必须保留一个无参构造方法
     */
    public Student(){}
    public Student(String name,long qq,String type,String admission_at,String college,int student_id,String link,String wish,String senior,String way){
        this.name = name;
        this.qq = qq;
        this.type = type;
        this.admission_at = admission_at;
        this.college = college;
        this.student_id = student_id;
        this.link = link;
        this.wish = wish;
        this.senior = senior;
        this.way = way;
    }

    /**
     *各成员变量的get,set方法
     */

    public int getId(){

        return id;
    }
    public void setId(int id){

        this.id = id;
    }
    public String getCreate_at(){
        return create_at;
    }
    public void setCreate_at(String create_at){
        this.create_at = create_at;
    }
    public String getUpdate_at(){
        return update_at;
    }
    public void setUpdate_at(String update_at){
        this.update_at = update_at;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public long getQq(){

        return qq;
    }
    public void setQq(long qq){

        this.qq = qq;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getAdmission_at(){
        return admission_at;
    }
    public void setAdmission_at(String admission_at){
        this.admission_at = admission_at;
    }
    public String getCollege(){
        return college;
    }
    public void setCollege(String college){
        this.college = college;
    }
    public int getStudent_id(){
        return student_id;
    }
    public void setStudent_id(int student_id){
        this.student_id = student_id;
    }
    public String getLink(){
        return link;
    }
    public void setLink(String link){
        this.link = link;
    }
    public String getWish(){
        return wish;
    }
    public void setWish(String wish){
        this.wish = wish;
    }
    public String getSenior(){
        return senior;
    }
    public void setSenior(String senior){
        this.senior = senior;
    }
    public String getWay(){
        return way;
    }
    public void setWay(String way){
        this.way = way;
    }
    //增加toStrong方法，以字符串的形式将对象中的属性打印出来
    public String toString(){
        return this.id + ","+this.create_at + ","+this.update_at + ","+this.update_at + ","+this.name + ","+this.qq + ","+this.type + ","+this.admission_at + ","+this.college + ","+this.student_id + ","+this.link + ","+this.wish + ","+this.senior + ","+this.way;
    }
}