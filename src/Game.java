import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game implements ActionListener {

    private Random random = new Random();
    private JFrame jFrame = new JFrame();
    private JPanel title_panel = new JPanel();
    private JPanel button_panel = new JPanel();
    private JLabel text = new JLabel();
    private JButton[] buttons = new JButton[9];
    private boolean player_turn;

    public Game(){
        init();
    }


    public void init(){
        /**********JFRAME**********/
        jFrame.setSize(650, 650);
        jFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
        jFrame.setLayout(new BorderLayout());
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**********JLABEL_TEXT**********/
        text.setBackground(new Color( 214, 236, 239));
        text.setForeground(Color.BLACK);
        text.setFont(new Font("MV Boli", Font.BOLD, 75));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setText("TIC-TAC-TOE");
        text.setOpaque(true);
        /**********JPANEL_TITLE**********/
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 650, 100);
        /**********JPANEL_BUTTON**********/
        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(Color.BLACK);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        title_panel.add(text);
        jFrame.add(title_panel, BorderLayout.NORTH);
        jFrame.add(button_panel);
        turn();

    }
    public void turn(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(random.nextInt(2)==0){
            player_turn = true;
            text.setText("Player 1 Turn");
        }
        else {
            player_turn = false;
            text.setText("Player 2 Turn");
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if(e.getSource()==buttons[i]){
                if(player_turn){
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(Color.RED);
                        buttons[i].setText("X");
                        player_turn = false;
                        text.setText("Player 2 Turn");
                        check();
                    }
                }
                else{
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(Color.BLUE);
                        buttons[i].setText("O");
                        player_turn = true;
                        text.setText("Player 1 Turn");
                        check();
                    }

                }
            }
        }
    }
    public void check(){
        /**********CHECK_PLAYER1_WINS**********/
        if((buttons[0].getText()=="X") && (buttons[1].getText()=="X") && (buttons[2].getText()=="X")){
            xWins(0, 1, 2);
        }if((buttons[3].getText()=="X") && (buttons[4].getText()=="X") && (buttons[5].getText()=="X")){
            xWins(3, 4, 5);
        }if((buttons[6].getText()=="X") && (buttons[7].getText()=="X") && (buttons[8].getText()=="X")){
            xWins(6, 7, 8);
        }if((buttons[0].getText()=="X") && (buttons[3].getText()=="X") && (buttons[6].getText()=="X")){
            xWins(0, 3, 6);
        }if((buttons[1].getText()=="X") && (buttons[4].getText()=="X") && (buttons[7].getText()=="X")){
            xWins(1, 4, 7);
        }if((buttons[2].getText()=="X") && (buttons[5].getText()=="X") && (buttons[8].getText()=="X")){
            xWins(2, 5, 8);
        }if((buttons[0].getText()=="X") && (buttons[4].getText()=="X") && (buttons[8].getText()=="X")){
            xWins(0, 4, 8);
        }if((buttons[2].getText()=="X") && (buttons[4].getText()=="X") && (buttons[6].getText()=="X")){
            xWins(2, 4, 6);
        }


        /**********CHECK_PLAYER1_WINS**********/
        if((buttons[0].getText()=="O") && (buttons[1].getText()=="O") && (buttons[2].getText()=="O")){
            oWins(0, 1, 2);
        }if((buttons[3].getText()=="O") && (buttons[4].getText()=="O") && (buttons[5].getText()=="O")){
            oWins(3, 4, 5);
        }if((buttons[6].getText()=="O") && (buttons[7].getText()=="O") && (buttons[8].getText()=="O")){
            oWins(6, 7, 8);
        }if((buttons[0].getText()=="O") && (buttons[3].getText()=="O") && (buttons[6].getText()=="O")){
            oWins(0, 3, 6);
        }if((buttons[1].getText()=="O") && (buttons[4].getText()=="O") && (buttons[7].getText()=="O")){
            oWins(1, 4, 7);
        }if((buttons[2].getText()=="O") && (buttons[5].getText()=="O") && (buttons[8].getText()=="O")){
            oWins(2, 5, 8);
        }if((buttons[0].getText()=="O") && (buttons[4].getText()=="O") && (buttons[8].getText()=="O")){
            oWins(0, 4, 8);
        }if((buttons[2].getText()=="O") && (buttons[4].getText()=="O") && (buttons[6].getText()=="O")){
            oWins(2, 4, 6);
        }
    }
    public void xWins(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        text.setText("Player 1 Wins!!");

    }
    public void oWins(int a, int b, int c){
        buttons[a].setBackground(new Color(214, 236, 239));
        buttons[b].setBackground(new Color(214, 236, 239));
        buttons[c].setBackground(new Color(214, 236, 239));

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        text.setText("Player 2 Wins!!");

    }
}
