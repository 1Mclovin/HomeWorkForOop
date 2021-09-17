package Animal;
public class Animals {
    // what do animals consist of
    public int legs;
    public int head;
    public int eyes;
    public int heart;

    //constructor

    public Animals (int legs,int head,int eyes,int heart){
        this.legs=legs;
        this.head=head;
        this.eyes=eyes;
        this.heart=heart;
    }

    public Integer AnimalBodyPartTotal(){
      return  this.legs + this.eyes + this.heart + this.head;

    }

    @Override
    public String toString() {
        return "Animals{" +
                "legs=" + legs +
                ", head=" + head +
                ", eyes=" + eyes +
                ", heart=" + heart +
                '}';
    }
}
