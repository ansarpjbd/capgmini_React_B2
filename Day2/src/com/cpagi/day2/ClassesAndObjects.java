package com.cpagi.day2;

class car
{
    private int no_of_seats;
    private String brand;
    private int price;    
    
    car()
    {
        System.out.println("Default constructor of car class");
    }
    
     car(int price, String brand, int no_of_seats) 
     {
         this.price = price;
         this.brand = brand;
         this.no_of_seats = no_of_seats;
    }
     public void setPrice(int price) {
            this.price = price;
        }
     public void setbrand(String brand) {
            this.brand = brand;
        }
     public void set_seats(int no_of_seats) {
            this.no_of_seats = no_of_seats;
        }
     public int getPrice() {
            return this.price;
        }
     public String getbrand() {
            return this.brand;
        }
     public int getseats() {
            return this.no_of_seats;
        }
     public void printDetails() {
            System.out.println("Brand " + this.brand);
            System.out.println("Price " + this.price);
            System.out.println("No of Seats " + this.no_of_seats);
        }
}

 

public class ClassesAndObjects 
{
    public static void main(String [] args)
    {
        car c1 = new car(50000, "Hyundai", 4);
        car c2 = new car(850000, "Toyota", 6);
       c1.printDetails();
    }
    
}
 