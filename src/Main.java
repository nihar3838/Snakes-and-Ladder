public class Main {
    public static int random(){
        int rand = (int) ((Math.random() *6) +1);
        return rand;
    }
    public static int random3(){
        int rand = (int) ((Math.random() * 3) + 1);
        return rand;
    }
    public static int snakeLadder(int position){
        int rand = random();
        int check = random3();
        if(check == 2){
            if(position + rand > 100){
                return position;
            }
            position += rand;

            snakeLadder(position);
        } else if (check == 3) {
            if(position - rand < 0){
                position = 0;
            }else{
                position -= rand;
            }
        }else{;
        }
        return position;
    }
    public static void main(String[] args) {
        int WIN_POSITION = 100;
        System.out.println("Welcome to Snake and Ladder game.");
        int position1 = 0, diceRoll1 = 0, position2 = 0, diceRoll2 = 0;
        while(position1 < WIN_POSITION && position2 < WIN_POSITION) {
            position1 = snakeLadder(position1);
            position2 = snakeLadder(position2);
            diceRoll1++;
            diceRoll2++;
            System.out.println("Position of player 1 is " + position1 + " and the number of dice rolls are " + diceRoll1);
            System.out.println("Position of player 2 is " + position2 + " and the number of dice rolls are " + diceRoll2);
        }
        if(position1 == WIN_POSITION){
            System.out.println("Player 1 won the game.");
        }else{
            System.out.println("Player 2 won the game.");
        }


    }
}