package com.example.employee;


public class Employee {

    public int hashCode;
    
    //private fields to store employee data
    private int id;
    private String name;


    public Employee(){

    }

    //constructor to initialize employee data
    public Employee(int id, String name){
        this.id = id;
        this.name=name;
    }

    //getters and setters for id and name
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
    this.name = name;
    }

    //Override Hashcode() for obj comparison in collections
    @Override
    public int hashCode(){
        return id; //using id as the hash code for this example
    }

    //override equals() to check for object equality
    @Override
    public boolean equals(Object obj){
         if(this == obj){
             return true; //same obj reference
         }
         if(obj == null || getClass() !=obj.getClass()){
             return false;
         }
         Employee employee = (Employee)obj; //cast to employee
        return this.id == employee.getId() && this.name.equals(employee.getName()); //compare to id and name
    }

    //Override toString() for meaningful string representation
    @Override
    public String toString(){
        return "Employee{"+
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
