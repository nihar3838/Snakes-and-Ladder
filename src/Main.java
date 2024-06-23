import java.lang.Math;
public class Main {
    int win_position = 100;

    public static int Diceroll() {
        int diceroll = (int) (Math.random() * 6) + 1;
        return diceroll;
    }

    public static int Option() {
        int option = (int) (Math.random() * 3) + 1;
        return option;
    }

    public static void main(String[] args) {
        int Win_condition = 100;
        int player_position = 1;
        int prev_pos=1;
        while (player_position < 100) {
            int dice_roll = Diceroll();
            int option = Option();
            if(player_position+dice_roll >100){
                player_position =prev_pos;
            }
            if (option == 1) {
                player_position += dice_roll;
            }
            if (option == 2) {
                player_position -= dice_roll;
            }
            if(player_position<0){
                player_position =0;
            }
            if (option == 3) ;
            System.out.println("Dice roll is " + dice_roll);
            System.out.println(option);
            System.out.println("Player Position is " + player_position);
        }
    }
}