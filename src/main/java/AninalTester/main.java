package AninalTester;

import Animal.Animals;
import Animal.DangerousAnimal;

public class main {
    public static void main(String[] args) {
        Animals Chicken =new Animals(2,1,2,1);
        System.out.println(Chicken.AnimalBodyPartTotal());


        DangerousAnimal Shark =new DangerousAnimal("no","Yes definitley","no","no","yes");
        System.out.println(Shark.getKilledByAnimal(Shark.venomous, Shark.eatsPeople));

    }
}
