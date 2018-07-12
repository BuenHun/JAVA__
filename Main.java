

class Dice {
    private int number = 0;

     void roll_to_ten() {

        for (int i=1; i<11; i++)
        {

            number = (int) (Math.random() * 6+1);
            System.out.println(i+" dice of order : "+number);
        }


    }
    public int getNum() {
        return this.number;
    }


}



public class Main {

    public static void main(String[] args) {


        Dice dice=new Dice();
        dice.roll_to_ten();
    }

}
