import java.lang.Math;
public class Snake_ladder {
    public static int Diceroll(){
        int diceroll = (int)(Math.random()*6) +1;
        return diceroll;
    }
    public static void main(String[] args) {
        int Win_condition =100;
        int player_position =1;
        int dice_role = Diceroll();
        System.out.println(dice_role);
    }
}