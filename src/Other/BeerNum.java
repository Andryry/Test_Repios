package Other;

public class BeerNum {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "Бутылки";
        while (beerNum >0){
            System.out.println(beerNum + " " + word + " пива на столе");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum -=1;
            if (beerNum >1) {
                System.out.println(beerNum + " " + word + " пива на стене");
            }
            if (beerNum == 1){
                word = "Бутылка";
            }
            if (beerNum == 0)  {
                System.out.println("Нет бутыло пива на стене.");
            }
        }
    }
}
