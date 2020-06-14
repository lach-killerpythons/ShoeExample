/*
This is a Java nested class example
--uses abstract class
--sets finals in constructor
--main loop instantiates the subclasses
--polymorphism used between Shoe, Walking, Running
--instanceof is used to check for child type
 */

public class ShoeExample {
    abstract class Shoe {
        public final String myBrand;
        public final double mySize;
        Shoe(String brand, double size){
            this.myBrand=brand;
            this.mySize=size;
        }
    }
    class Walking extends Shoe {
        public final Boolean goreTex;
        public Walking(String brand, double size,Boolean goreTex){
            super(brand,size);
            this.goreTex=goreTex;
        }
    }

    class Running extends Shoe {
        public final double weight;
        public Running(String brand, double size,double weight){
            super(brand,size);
            this.weight=weight;
        }
    }

    public static void main(String[] args){
        ShoeExample S1 = new ShoeExample();
        ShoeExample.Shoe w1 = S1.new Walking("Merrell",42,false);
        ShoeExample.Shoe w2 = S1.new Walking("Hanwag",43.5,true);
        ShoeExample.Shoe r1 = S1.new Running("Nike",43,250);
        Shoe[] shoeStore = {w1,w2,r1};
        for(Shoe S:shoeStore){
            System.out.print(S.myBrand + "\t" + S.mySize + "\t");
            if (S instanceof Running){
                System.out.print("weight: "+((Running) S).weight);
            }
            if (S instanceof Walking){
                System.out.print("gortex: "+((Walking) S).goreTex);
            }
            System.out.println();
        }
    }
}
