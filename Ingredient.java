/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author chinh.ho
 */
public class Ingredient {

    private String ingredient; 	 	//store ingredient name as a string
    private int numberOfMeasurement;  	//stores the number of Measurement
    private String unit; 		//store unit of measurement as a string
    private float amount; 		//store float number of ingredient amount.

    //name mutator (setter) method
    public void setName(String ingredient) {
        this.ingredient = ingredient;
    }
   
    //name mutator (setter) method
    public void setUnit(String numberOfMeasurement) {
        this.unit = numberOfMeasurement;
    }



    //name number mutator (setter) method
    public void setCalories(int number) {
        this.numberOfMeasurement = number;
    }

     //name number mutator (setter) method
    public void setAmount(float amount) {
        this.amount = amount;
    }

    //name accessor (getter) method
    public String getName() {
        return this.ingredient;
    }

     //name accessor (getter) method
    public String getUnit() {
        return this.unit;
    }

    
    //number accessor (getter) method
    public int getCalories() {
        return this.numberOfMeasurement;
    }

     //number accessor (getter) method
    public float getAmount() {
        return this.amount;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner scnr = new Scanner(System.in);  //scaner to read user input
        String nameOfIngredient = "";           //ingredient read from user
        String unitMeasurement = "";            //unit of mesureament read from user
        float ingredientAmount = 0;		//float number read from user
        int numberCaloriesPerUnit = 0;          //integer number read from user
        double totalCalories = 0.0;             //double number read from user
        boolean validNumber = false;		//boolean for valicating number
        String regex = "^[a-zA-Z 0-9-]+$";	//regular expession for ingredient name
        
	//Create instance of Ingredient object
        Ingredient ingredient1 = new Ingredient();
        
        //Read in the Ingredient from the user
        System.out.println("Please enter an Ingredient name: ");
        nameOfIngredient = scnr.next();
        
        //Validate ingredient input
        if (Pattern.matches(regex, nameOfIngredient)) {
            System.out.println("You enter a valid ingredient!");
        }
        else {
            //If not valid, display an error and second attemp
            System.out.println("Error! You did not enter an ingredient.");
            System.out.println("Please try again. Enter the ingredient name: ");
            nameOfIngredient = scnr.next();
            
            //Check if valid
            if (Pattern.matches(regex, nameOfIngredient)) {
                System.out.println("You enter a valid ingredient!");
            }
            else {
            //Display an error, no more attemps
                System.out.println("Error: You did not enter a valid ingredient."
                                + "You are out of attemps.");
                
            }
        }
        
        //Prompt user for unit of measurement
        System.out.println("Please enter Unit Of Measurement fot this Ingredient. "
                            + "You have four option: Cup(s), Tbsp, Tsp, Gram(s).");

	//read unit of measurement from user
        if (scnr.hasNext()) {
            unitMeasurement = scnr.next();
            
	    //check if user enter a valid option
            if ((unitMeasurement.equals("Cup(s)")) || (unitMeasurement.equals("Tbsp")) || (unitMeasurement.equals("Tsp")) ||
                    (unitMeasurement.equals("Gram(s)"))) {
                System.out.println("You have selected " + unitMeasurement);
            }
	    //user does not enter a valid option, display an error, and prompt user
            else {
                System.out.println("It is not a valid! You have one more time to try.");
                System.out.println("Please enter a valid option");
                unitMeasurement = scnr.next();
                if ((unitMeasurement.equals("Cup(s)")) || (unitMeasurement.equals("Tbsp")) || (unitMeasurement.equals("Tsp")) ||
                    (unitMeasurement.equals("Gram(s)"))) {
                    System.out.println("You have selected " + unitMeasurement);
                }
                else {
                    System.out.println("You did not enter an valid option. Sorry! You are out of attemps");
                }
            }
        }
        
        //--------------------------------------------------
        //Read the number of calories per unit.
        do {
            System.out.println("Please enter number of Calories per unit: ");
            //check if user enter integer
            if (scnr.hasNextInt()) {
                //store number of calories
                numberCaloriesPerUnit = scnr.nextInt();
                //check if number of calories is non-negative
                if (numberCaloriesPerUnit >=0) {
                    validNumber = true;
                }
                else {
                    //number is negative, display an error
                    System.out.println("Error! You enteren a negative number.");
                    System.out.println("Please try again");
                }
            }
            //user enter invalid input, so display an error
            else {
                System.out.println("Error! You enteren a negative number.");
                System.out.println("Please try again");
            }
            
        }while (!validNumber);
        
        //--------------------------------------------------------
        //read amount of ingredient
        do {
            System.out.println("Please enter amount of Ingredient: ");
            //check if user enter float
            if (scnr.hasNextFloat()) {
                //store number of calories
                ingredientAmount = scnr.nextFloat();
                //check if number of calories is non-negative
                if (ingredientAmount >=0.0) {
                    validNumber = true;
                }
                else {
                    //number is negative, display an error
                    System.out.println("Error! You enteren a negative number.");
                    System.out.println("Please try again");
                }
            }
            //user enter invalid input, so display an error
            else {
                System.out.println("Error! You entered a negative number.");
                System.out.println("Please try again");
            }
            
        }while (!validNumber);
        
        //calculate total calories for the ingredient
        totalCalories = numberCaloriesPerUnit * ingredientAmount;
        
        //display recipe
        System.out.println("Recipe " + nameOfIngredient + " will contain "
            + numberCaloriesPerUnit + " of" + unitMeasurement + ".");
        System.out.println(nameOfIngredient + " has total" + totalCalories + "calories.");
	
	//Save ingredient information in Ingredient object.
	ingredient1.setName(nameOfIngredient);
	ingredient1.setUnit(unitMeasurement);
	ingredient1.setCalories(numberCaloriesPerUnit);
	ingredient1.setAmount(ingredientAmount);
	
	//Print ingredient1 infomation.
	System.out.println("Ingredient 1 is " + ingredient1.getName());
	System.out.println(ingredient1.getName() + " uses "+ ingredient1.getUnit() + " to measure.");
	System.out.println("Ingredient 1 has " + ingredient1.getCalories() + " colories per " + ingredient1.getUnit());
	System.out.println("Ingredient 1 need " + ingredient1.getAmount() + " of " + ingredient1.getUnit());

    }        
}            
        
            
        
        
        
                                

        
    
    

