package CodeSoftTask1;
import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGame {
    public static int getRandomValue(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max+1);
    }

    public static void main(String[] args) {
        int ans,guess;
        int min=1;
        int max=100;
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        ans=random.nextInt(max)+1;
        System.out.println("Guess a number between 1 and 100: ");
        guess=sc.nextInt();
        if(guess==ans){
            System.out.println("Good job,the number was:" +ans);
        }else{
            System.out.println("sorry the number was:"+ ans);
        }
    }
    }
