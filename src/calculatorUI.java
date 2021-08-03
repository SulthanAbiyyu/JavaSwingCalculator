import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorUI {
    private JPanel panel1;
    private JLabel screenNum;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton cButton;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton xButton;
    private JButton button16;


    // Logic
    int[] num = {0,0};
    String operator = "";
    int i = 0;
    int hasil = 0;

    public calculatorUI() {
        // 1
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operator == ""){
                    i--;
                    num[0]=num[0]*10+1;
                    screenNum.setText(String.valueOf(num[0]));
                    i++;
                }else if(i==1&&num[1]>0){
                    num[1]=num[1]*10+1;
                    screenNum.setText(num[0]+ operator + num[1]);
                }else if(num[1]==0){

                    num[1] = 1;
                    screenNum.setText(num[0]+ operator + num[1]);
                    i++;
                }else{
                    num[i]=1;
                    screenNum.setText("1");
                    i++;
                }
            }
        });

        // 2
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operator == ""){
                    i--;
                    num[0]=num[0]*10+2;
                    screenNum.setText(String.valueOf(num[0]));
                    i++;
                }else if(i==1&&num[1]>0){
                    num[1]=num[1]*10+2;
                    screenNum.setText(num[0]+ operator + num[1]);
                }else if(num[1]==0){

                    num[1] = 2;
                    screenNum.setText(num[0]+ operator + num[1]);
                    i++;
                }else{
                    num[i]=2;
                    screenNum.setText("2");
                    i++;
                }
            }
        });

        // 3
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operator == ""){
                    i--;
                    num[0]=num[0]*10+3;
                    screenNum.setText(String.valueOf(num[0]));
                    i++;
                }else if(i==1&&num[1]>0){
                    num[1]=num[1]*10+3;
                    screenNum.setText(num[0]+ operator + num[1]);
                }else if(num[1]==0){

                    num[1] = 3;
                    screenNum.setText(num[0]+ operator + num[1]);
                    i++;
                }else{
                    num[i]=3;
                    screenNum.setText("3");
                    i++;
                }
            }
        });

        // 4
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operator == ""){
                    i--;
                    num[0]=num[0]*10+4;
                    screenNum.setText(String.valueOf(num[0]));
                    i++;
                }else if(i==1&&num[1]>0){
                    num[1]=num[1]*10+4;
                    screenNum.setText(num[0]+ operator + num[1]);
                }else if(num[1]==0){

                    num[1] = 4;
                    screenNum.setText(num[0]+ operator + num[1]);
                    i++;
                }else{
                    num[i]=4;
                    screenNum.setText("4");
                    i++;
                }
            }
        });

        // 5
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operator == ""){
                    i--;
                    num[0]=num[0]*10+5;
                    screenNum.setText(String.valueOf(num[0]));
                    i++;
                }else if(i==1&&num[1]>0){
                    num[1]=num[1]*10+5;
                    screenNum.setText(num[0]+ operator + num[1]);
                }else if(num[1]==0){

                    num[1] = 5;
                    screenNum.setText(num[0]+ operator + num[1]);
                    i++;
                }else{
                    num[i]=5;
                    screenNum.setText("5");
                    i++;
                }
            }
        });

        // 6
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operator == ""){
                    i--;
                    num[0]=num[0]*10+6;
                    screenNum.setText(String.valueOf(num[0]));
                    i++;
                }else if(i==1&&num[1]>0){
                    num[1]=num[1]*10+6;
                    screenNum.setText(num[0]+ operator + num[1]);
                }else if(num[1]==0){

                    num[1] = 6;
                    screenNum.setText(num[0]+ operator + num[1]);
                    i++;
                }else{
                    num[i]=6;
                    screenNum.setText("6");
                    i++;
                }
            }
        });

        // 7
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operator == ""){
                    i--;
                    num[0]=num[0]*10+7;
                    screenNum.setText(String.valueOf(num[0]));
                    i++;
                }else if(i==1&&num[1]>0){
                    num[1]=num[1]*10+7;
                    screenNum.setText(num[0]+ operator + num[1]);
                }else if(num[1]==0){

                    num[1] = 7;
                    screenNum.setText(num[0]+ operator + num[1]);
                    i++;
                }else{
                    num[i]=7;
                    screenNum.setText("7");
                    i++;
                }
            }
        });

        // 8
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operator == ""){
                    i--;
                    num[0]=num[0]*10+8;
                    screenNum.setText(String.valueOf(num[0]));
                    i++;
                }else if(i==1&&num[1]>0){
                    num[1]=num[1]*10+8;
                    screenNum.setText(num[0]+ operator + num[1]);
                }else if(num[1]==0){

                    num[1] = 8;
                    screenNum.setText(num[0]+ operator + num[1]);
                    i++;
                }else{
                    num[i]=8;
                    screenNum.setText("8");
                    i++;
                }
            }
        });

        // 9
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operator == ""){
                    i--;
                    num[0]=num[0]*10+9;
                    screenNum.setText(String.valueOf(num[0]));
                    i++;
                }else if(i==1&&num[1]>0){
                    num[1]=num[1]*10+9;
                    screenNum.setText(num[0]+ operator + num[1]);
                }else if(num[1]==0){

                    num[1] = 9;
                    screenNum.setText(num[0]+ operator + num[1]);
                    i++;
                }else{
                    num[i]=9;
                    screenNum.setText("9");
                    i++;
                }
            }
        });

        // 0
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(operator == ""){
                    i--;
                    num[0]=num[0]*10+0;
                    screenNum.setText(String.valueOf(num[0]));
                    i++;
                }else if(i==1&&num[1]>0){
                    num[1]=num[1]*10+0;
                    screenNum.setText(num[0]+ operator + num[1]);
                }else if(num[1]==0){

                }else{
                    num[i]=0;
                    screenNum.setText("9");
                    i++;}
            }
        });

        // plus
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "+";
                screenNum.setText(num[0]+"+");
                }
        });

        // minus
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "-";
                screenNum.setText(num[0]+"-");
            }
        });

        // kali
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "*";
                screenNum.setText(num[0]+"*");
            }
        });

        // bagi
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "/";
                screenNum.setText(num[0]+"/");
            }
        });

        // sama dengan
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operator == "+"){
                    hasil = num[0]+num[1];
                }else if(operator == "-"){
                    hasil = num[0]-num[1];
                }else if(operator == "*"){
                    hasil = num[0]*num[1];
                }else if(operator == "/"){
                    hasil = num[0]/num[1];
                }

                screenNum.setText(String.valueOf(hasil));
                num[0] = hasil;
                num[1]=0;

            }
        });

        // Clear
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num[0] = 0;
                num[1] = 0;
                operator = "";
                screenNum.setText("0");
                i = 0;
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculatorUI");
        frame.setContentPane(new calculatorUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
