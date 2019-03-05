

import java.util.*;

public class MealTracker {
    ArrayList<Meal> meals;
    User user;
    public MealTracker(User user){
        this.user = user;
        this.meals = new ArrayList<Meal>();
    }
    public void addMeal(Meal m){
        meals.add(m);
    }
    public void viewMeals(){
        for (Meal m : meals){
            System.out.println(m);
        }
    }

    public int getMealCount(){
        return meals.size();
    }

    public double getAdherance(){
        int count = 0;
        
        for (Meal m : meals){
           if (m.adherant){
               count++;
           }

        }
        return 1.0 * count / meals.size();
       
    }

    public boolean isOnTrack() {
        return user.targetAdherance <= getAdherance();
    }
}