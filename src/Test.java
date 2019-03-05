
class Test {

  public static void main(String[] args) {
    System.out.println("Testing your Square and Triangle classes...");
    Food pork = new Food(Category.PROTEIN,3,1,1,1,"pork");
    Food onion = new Food(Category.VEGETABLE,1,1,1,1,"onion");
    Food apple = new Food(Category.FRUIT,1,1,1,1,"bread");
    Food butter = new Food(Category.FAT,1,1,1,1,"butter");
    
    Meal meal = new Meal();
    
    meal.addFood(onion); 
    meal.addFood(pork);
    meal.addFood(apple);
    meal.addFood(butter);
    
    Meal meal2 = new Meal();
    
    meal.addFood(onion); 
    meal.addFood(pork);
    meal.addFood(apple);
  
    
    
    System.out.println(meal);
    User user = new User("eric", "chen", "f",.5d);
    MealTracker tracker = new MealTracker(user);
    tracker.addMeal(meal);
    tracker.addMeal(meal2);
    tracker.addMeal(meal2);
    
    System.out.println(tracker.getAdherance());
    System.out.println(tracker.isOnTrack());
  }

}
