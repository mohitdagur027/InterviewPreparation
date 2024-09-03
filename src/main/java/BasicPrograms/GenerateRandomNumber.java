package BasicPrograms;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        int min=100;
        int max=200;
        int num=(int)(Math.random()*(max-min+1)+min);
        System.out.println("Random number between 100 and 200 "+num);
    }
}
