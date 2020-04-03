/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercise5;

/**
 *
 * @author Lijuan Cao
 */
public class InfoModel {
    private String finalDate;
    private String name;
    private MealChoice mChoice;
   


    // Getters and Setters
    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public MealChoice getMealChoice() {
        return mChoice;
    }
    
    public void setMealChoice(MealChoice mChoice) {
        this.mChoice = mChoice;
    }   
    
}
