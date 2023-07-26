import java.util.Scanner;

class Guesser{
int numGuesser;
    public void guessNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Guesser guesses the number plz!");
        numGuesser = sc.nextInt();

    }
}
class Player
{
    int guessNumber;
    int numberGuess;
    int guessnum;
    Scanner sc = new Scanner(System.in);
    public void GuessNumber() {

        System.out.println("Hey Abhinav joshi guess the number!");
        guessNumber = sc.nextInt();
    }
    public void Numberguess() {

        System.out.println("Hey Abhishek joshi guess the number!");
        numberGuess = sc.nextInt();
    }
    public void Numguess() {
        System.out.println("Hey vikas joshi guess the number!");
        guessnum = sc.nextInt();
   }


}
class Umpair {
    Guesser guesser;
    Player P1, P2, P3;


    public void getNumberFromGuesser() {
       guesser = new Guesser();
        guesser.guessNumber();

    }

    public void collectFromPlayer() {
        P1 = new Player();
        P2 = new Player();
        P3 = new Player();
        P1.GuessNumber();
        P2.Numberguess();
        P3.Numguess();

    }

    public void calcResult() {
        System.out.println(guesser.numGuesser + " " + P1.guessNumber + " " + P2.numberGuess + " " + P3.guessnum);
        if (guesser.numGuesser == P1.guessNumber) {
            if (guesser.numGuesser == P2.numberGuess && guesser.numGuesser == P3.guessnum) {
                System.out.println("all are Winners!");
            }
            else if (guesser.numGuesser == P2.numberGuess) {
                System.out.println("Abhinav joshi and Abhishek joshi are winners!");
            }
            else if (guesser.numGuesser == P3.guessnum) {
                System.out.println("Abhinav joshi and Vikas joshi are Winners");
            }
            else {
                System.out.println("Abhinav joshi are win the game ");
            }
        }   else if (guesser.numGuesser == P2.numberGuess) {
            if (guesser.numGuesser == P3.guessnum) {
                System.out.println("Abhishek joshi and Vikas joshi are the winner ");
            } else {
                System.out.println("Abhishek joshi are Win");
            }
        } else if (guesser.numGuesser == P3.guessnum) {
            System.out.println("Vikas joshi are Win");
        } else {
            System.out.println("Game Lost");
        }
    }
}


public class Project1ByPW1 {
    public static void main(String[] args) {
        Umpair umpair = new Umpair();
        umpair.getNumberFromGuesser();
        umpair.collectFromPlayer();
        umpair.calcResult();
    }
}
