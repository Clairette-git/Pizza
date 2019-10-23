/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class TestClass {
    public static void main(String[] args) {
       
        
        try{
             //initializing new pizzaconfig
        PizzaConfig pizza=new PizzaConfig();
        // seting price of pizza
        pizza.setBasePrice(2000);
        // adding an optionset using name
        pizza.AddOptionSet("meat");
        //or add using optionset
        OptionSet delivery =new OptionSet();
        delivery.setName("delivery");
        OptionSet.Option takeAway=delivery.new  Option("take-away",1000);
        delivery.AddChoice(takeAway);// adding option to optionset
        pizza.AddOptionSet(delivery); //addind optionset to pizzaconfig
        
            //finding optionset and add an option with name
        pizza.getOptionSet("meat").AddChoice("pepperoni", 800);
      
            System.out.println("-----------printing after adding two optionset-----------");
         pizza.print();
       
        //add another option
        pizza.getOptionSet("meat").AddChoice("beef", 200);
            System.out.println("-------------printing after adding option in optionset meat----------");
         pizza.print();
         
         //delete option
          pizza.getOptionSet("meat").deleteOption("beef");
          System.out.println("-----------printing after deleting an option in optionset meat------");
          pizza.print();
          //delete optionset
           System.out.println("--------printing after deleting optionset delivery-----");
          pizza.deleteOptionSet("meat");
          pizza.print();
             //--------------------------------------update----------------------------------
         //updating the price of delivery
             pizza.getOptionSet(0).getChoice(0).setPrice(15000);
             
             System.out.println("--------printing after updating the price-----");
         
          pizza.print();    
        
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
       
      //--------------------------------------update----------------------------------
      
    }
}
