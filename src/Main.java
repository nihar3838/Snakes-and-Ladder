
import java.lang.Math;
public class Snake_ladder {
    int WIN_CONDITION = 100;

    public static int Diceroll() {
        return (int) (Math.random() * 6) + 1;

    }

    public static int Option() {
         return (int) (Math.random() * 3) + 1;

    }

    public static void main(String[] args) {
        int WIN_CONDITION = 100;
        int COUNT =0;
        int PLAYER_POSITION = 1;
        int PREV_POS =1;
        while (PLAYER_POSITION < WIN_CONDITION) {
            int dice_roll = Diceroll();
            int option = Option();
            if(PLAYER_POSITION +dice_roll >WIN_CONDITION){
                PLAYER_POSITION = PREV_POS;
                COUNT++;
            }
            if (option == 1) {
                PLAYER_POSITION += dice_roll;
                COUNT++;
            }
            if (option == 2) {
                PLAYER_POSITION -= dice_roll;
                COUNT++;
            }
            if(PLAYER_POSITION <0){
                PLAYER_POSITION =0;
                COUNT++;
            }

            System.out.println("Dice roll is " + dice_roll);
            System.out.println(option);
            System.out.println("Player Position is " + PLAYER_POSITION);
            if(PLAYER_POSITION ==WIN_CONDITION){
                System.out.println("Player Win");
                System.out.println("Dice Was Played " + COUNT + " Times");
                break;
            }

        }
    }
}
