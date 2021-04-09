package com.company;
import java.time.LocalDateTime;

public class Human {
    public String firstName;
    public String lastName;
    protected String phone;
    private Car auto;
    private Double salary;

    public Human(String firstName, String lastName, String phone, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.salary = salary;
    }

    public Double getSalary() {
        System.out.println(java.time.LocalDateTime.now());
        System.out.println(this.salary);
        return this.salary;
    }

    public void setSalary(Double salary) {
        if(salary > 0){
            System.out.println("nowa wartość wysłana do księgowości");
            System.out.println("proszę o zgłoszenie się do pani Hani z kadr");
            System.out.println("tylko nie kręć mordo bo zus już wszystko wie");
            this.salary = salary;
        }
    }

    public Car getAuto(){
        return this.auto;
    }

    public void setAuto(Car auto){
        if(auto.price < salary){
            System.out.println("kupiony za gotówkę");
            this.auto = auto;
        }
        else if((auto.price)/12 < salary){
            System.out.println("kupiony na kredyt");
            this.auto = auto;
        }
        else System.out.println("jak można być biednym po prostu przestań");
    }

    void write() {
        System.out.println("Hi " + firstName);
    }
}
