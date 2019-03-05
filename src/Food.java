

import java.util.ArrayList;

public class Food {
    public double getCalories (){return cal;}
    public double getFat (){return fat;}
    public double getCarbs (){return carbs;}
    public double getProtein (){return proteins;}
    public String getName (){return name;}
   
    ArrayList<Category> categories;
    double cal;
    double fat;
    double carbs;
    double proteins;
    String name;

    public Food (Category cat, double cal, double fat, double carbs, double proteins, String name){
        this.cal = cal;
        this.fat = fat;
        this.carbs = carbs;
        this.proteins = proteins;
        this.name = name;
        categories = new ArrayList<Category>();
        categories.add(cat);
    }

    public ArrayList<Category> getCategories(){
        return categories;
    }

    public void addCategory (Category category){
        categories.add(category);
    }
}