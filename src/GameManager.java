public class GameManager {
    private String[][] table= {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

    public GameManager(){

    }

    public String printTable(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(" | " + table[i][j]);
            }
        System.out.println(" | \n---------------");
        }
        return null;
    }
    public boolean check(String pos){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(table[i][j].equals(pos)){
                    return true;
                }
            }
        }
            return false;
    }
    public void play(String pos, String player){
        if(pos.equals("1")){table[0][0] = player;}
        else if(pos.equals("2")){table[0][1] = player;}
        else if(pos.equals("3")){table[0][2] = player;}
        else if(pos.equals("4")){table[1][0] = player;}
        else if(pos.equals("5")){table[1][1] = player;}
        else if(pos.equals("6")){table[1][2] = player;}
        else if(pos.equals("7")){table[2][0] = player;}
        else if(pos.equals("8")){table[2][1] = player;}
        else if(pos.equals("9")){table[2][2] = player;}
    }
    public String winner(int plays){
        String[] checkWinner = new String[8];
        String winner = "null";
        if(plays==9){
            return "Tie Game";
        }
        checkWinner[0] = table[0][0] + table[0][1] + table[0][2];
        checkWinner[1] = table[1][0] + table[1][1] + table[1][2];
        checkWinner[2] = table[2][0] + table[2][1] + table[2][2];

        checkWinner[3] = table[0][0] + table[1][0] + table[2][0];
        checkWinner[4] = table[0][1] + table[1][1] + table[2][1];
        checkWinner[5] = table[0][2] + table[1][2] + table[2][2];

        checkWinner[6] = table[0][0] + table[1][1] + table[2][2];
        checkWinner[7] = table[0][2] + table[1][1] + table[2][0];

        for (int i = 0; i < checkWinner.length; i++) {
            if(checkWinner[i].equals("XXX")) {
                winner = "Player 1";
            }
            else if(checkWinner[i].equals("OOO")){
                winner = "Player 2";
            }
            }
        return winner;
        }


}
