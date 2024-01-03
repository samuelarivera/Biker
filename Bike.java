public class Bike {
  private boolean needsOil = false; 		
  private String groundType; 		
  private int weight; 		// weight in pounds
  private String color; 	// "brown", "black", etc
  private int tireAir = 100; 		
  private int chainsHealth = 100; 

  /* Methods are defined next */
  public void characteristics(String getType, int getWeight, String getColor){
      groundType = getType;
      weight= getWeight;
      color= getColor;
  }
  public void ride() {
    needsOil = true;
    tireAir = tireAir - 10;
    chainsHealth = chainsHealth - 10;
  }

  public void repair() {
    needsOil = false;
    tireAir = 100;
    chainsHealth = 100;
  }

  public void jump () {
    tireAir = tireAir - 20;
    chainsHealth = chainsHealth - 10;
  }

  public void brake() {
   tireAir = tireAir - 10;
    chainsHealth= chainsHealth - 5;
  }

  public void rust() {
      String addRust = "Rusty " + color;
      color = addRust;
  }

}

