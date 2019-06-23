package src;



public class Bat extends Mammal
{
    public void fly()
    {
        energy -= 50;
        System.out.println("The Giant Bat takes flight!");
        returnEnergy();
    }
    public void eatHumans()
    {
        energy += 25;
        System.out.println("The Giant Bat eats the townsfolk!");
        returnEnergy();
    }
    public void attackTown()
    {
        energy -= 100;
        System.out.println("The Giant Bat attacks the town!");
        returnEnergy();
    }
}
