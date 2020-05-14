/**
 * Michael Gaither III
 * 24 January 2020
 * 6th period, AP Comp Sci
 * 
 * zoo_Gaither.java
 * Create a zoo using what I have learned about OOP.
 */
public class zoo{
    public static void main(String[] args){
        System.out.println("----- Welcome to Michael's Zoo-----\n");
        Animal Bear = new Animal("Bear", 15, "Male", 540);
        Animal Lion = new Animal("Lion", 6, "Female", 346);
        Animal Racoon = new Animal("Racoon", 1, "Male", 20);
        
        System.out.println(Bear);
        System.out.println(Lion);
        System.out.println(Racoon);
        Racoon.eat();
        Lion.sleep();
        
        Bird Owl = new Bird("Owl", 18, "female", 6, 10,  "white", 3.5);
        Bird Turkey = new Bird("Turkey", 2, "male", 9,  8, "brown", 2);
        Bird Penguin = new Bird("Penguin", 4, "female", 25, 38, "white/black", 1);
        
        System.out.println(Owl);
        System.out.println(Turkey);
        System.out.println(Penguin);
        Owl.fly();
        Turkey.sleep();
        Penguin.nest();
        
        Fish Shark = new Fish("Shark", 19, "male", 220, 168, 8, "Pacific Ocean");
        Fish clownFish = new Fish("Clown Fish", 3, "male", 2, 5, 6, "The Great Barrier Reef");
        Fish blueTang = new Fish("Blue Tang", 2, "female", 1, 4, 5, "The Great Barrier Reef");
        
        System.out.println(Shark);
        System.out.println(clownFish);
        System.out.println(blueTang);
        Shark.swim();
        clownFish.sleep();
        blueTang.gotCaught();
    }
}