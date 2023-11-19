public class SmartKitchen {
    CoffeeMaker brewMaster;
    DishWasher dishWasher;
    Refrigerator iceBox;

   public SmartKitchen(){
       brewMaster = new CoffeeMaker();
       dishWasher = new DishWasher();
       iceBox = new Refrigerator();
   }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getOrderFood() {
        return iceBox;
    }
    public void setKitchenState(boolean coffeeFlag, boolean waterFlag, boolean orderFlag){
       brewMaster.setHasWorkToDo(coffeeFlag);
       dishWasher.setHasWorkToDo(waterFlag);
       iceBox.setHasWorkToDo(orderFlag);
    }
    public void doKitchenWork(){
       brewMaster.brewCoffee();
       dishWasher.doWash();
       iceBox.orderFood();
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing the coffee");
            hasWorkToDo = false;
        }
    }
}
class DishWasher {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doWash(){
        if(hasWorkToDo){
            System.out.println("Washing dishes");
            hasWorkToDo = false;
        }
    }
}
class Refrigerator {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordering food");
            hasWorkToDo =  false;
        }
    }
}