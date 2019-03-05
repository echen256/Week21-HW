
import java.util.*;

public class Meal {

    public double getCalories() {return calories;}
    public double getFat()   {return fat;}
    public double getCarbohydrates() {  return carbs;}
    public double getProtein()   {return protein;}
    
    public double calories;
    public double fat;
    public double carbs;
    public double protein;
    
    
    public String getName;
    
    public ArrayList<Food> foods;
    
    public boolean adherant;

    public Meal (){
        foods = new ArrayList();
    }

    public void addFood (Food f){
        foods.add(f);
        calculateAdherance();
     
    }
    
    @Override
    public String toString() {
    	return "carbs: " + carbs + " fat:" + fat + " calories:" + calories + " protein:" + protein;
    }

    public void calculateAdherance (){
        HashSet<Category> catSet = new HashSet<Category>();
        calories = 0d;
        fat = 0d;
        carbs = 0d;
        protein = 0d;
        for( Food f : foods){
        	calories += f.getProtein();
        	fat += f.getFat();
        	carbs += f.getCarbs();
        	protein += f.getProtein();
            catSet.addAll(f.getCategories());
        }  
        catSet.remove(Category.BEVERAGE);
        adherant = catSet.size() == 4;
    }

    public void viewFoods () {
        for (int i = 0; i < foods.size();i++){
            System.out.println(foods.get(i));
        }
    }
}