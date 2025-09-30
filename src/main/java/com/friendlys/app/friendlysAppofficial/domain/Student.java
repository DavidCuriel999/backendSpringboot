package com.friendlys.app.friendlysAppofficial.domain;

public class Student {
    // Atributos de un alumno
    private int id;
    private String firstName;
    private String email;
    private int age;
    private String course;

    // Constructor

    public Student(int id, String firstName, String email, int age, String course) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.age = age;
        this.course = course;
    }


    //Metodos Getter & Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
