public class Dog
{
  
  private String name;
  private String breed;
  private double weight;
  private String color;
  private boolean houseTrained;

// public Dog()
// {
//   name = "Bentley"
//   breed = "golden doodle";
//   weight = 15.9;
//   color = "red";
//   houseTrained = true;
// }

public Dog(String name, String breed, double weight, String color, boolean houseTrained){
  this.name = name;
  this.breed = breed;
  this.weight = weight;
  this.color = color;
  this.houseTrained = houseTrained;
}

public String getName(){
  return this.name;
}

public String getBreed(){
  return this.breed;
}

public double getWeight(){
  return this.weight;
}

public String getColor(){
  return this.color;
}

public boolean getTrained(){
  return this.houseTrained;
}

// public void gained(){
//   weight++;
// }



public String toString()
{
  return name + "🐶";
  
  // return name + " is a " + breed + " and is " + weight + "lbs who has "
}


}