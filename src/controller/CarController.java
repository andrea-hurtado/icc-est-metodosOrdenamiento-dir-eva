package controller;

import models.Car;

public class CarController {
  

  public void sortByName(Car[] cars){
    for (int i = 0; i < cars.length; i++) {
      int indexMin = i;
      for (int j = 0; j < cars.length; j++) {
        if (cars[j].getName().compareToIgnoreCase(cars[indexMin].getName()) < 0) {
          indexMin = j;
        }
        if (i!= indexMin) {
          Car temp = cars[indexMin];
          cars[indexMin] = cars[i];
          cars[i] = temp;
          
        }
      }
    }
  }
}
