package Animal;

public class DangerousAnimal {

    public String claws;
    public String sharpTeeth;
    public String venomous;
    public String harmless;
    public String eatsPeople;

    public DangerousAnimal(String claws,String sharpTeeth,String venomous,String harmless,String eatsPeople){
        this.claws=claws;
        this.sharpTeeth=sharpTeeth;
        this.venomous=venomous;
        this.harmless=harmless;
        this.eatsPeople=eatsPeople;
    }
    public boolean getKilledByAnimal(String venomous,String eatsPeople){
        if(eatsPeople.equalsIgnoreCase(eatsPeople)){
            return true;
        }else if(eatsPeople.equalsIgnoreCase(eatsPeople)){
            return true;
        }
         return false;
    }

    @Override
    public String toString() {
        return "DangerousAnimal{" +
                "claws='" + claws + '\'' +
                ", sharpTeeth='" + sharpTeeth + '\'' +
                ", venomous='" + venomous + '\'' +
                ", harmless='" + harmless + '\'' +
                ", eatsPeople='" + eatsPeople + '\'' +
                '}';
    }
}


