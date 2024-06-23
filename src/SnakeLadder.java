import java.lang.Math;
public class SnakeLadder {
    int WIN_CONDITION = 100;

    public static int Diceroll() {
        return (int) (Math.random() * 6) + 1;

    }

    public static int Option() {
        return (int) (Math.random() * 3) + 1;

    }

    public static void main(String[] args) {
        int WIN_CONDITION = 100;

        int player_position = 1;
        int prev_pos=1;
        while (player_position < WIN_CONDITION) {
            int dice_roll = Diceroll();
            int option = Option();
            if(player_position+dice_roll >WIN_CONDITION){
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

            System.out.println("Dice roll is " + dice_roll);
            System.out.println(option);
            System.out.println("Player Position is " + player_position);
            if(player_position==WIN_CONDITION){
                System.out.println("Player Win");
                break;
            }

        }
    }
}