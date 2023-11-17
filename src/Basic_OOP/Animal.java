/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic_OOP;

/**
 *
 * @author PC
 */
public class Animal {
     String animal_name;
        double animal_price;
        
        Animal(String animal_name,double animal_price){
        this.animal_name = animal_name;
        this.animal_price = animal_price;
    }

        void showFoodName(){
            System.out.println(animal_name);
        }
     void showFoodPrice(){
            System.out.println(animal_price);
        }
}
