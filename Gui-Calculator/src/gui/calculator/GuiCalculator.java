/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.calculator;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Francis
 */
public final class GuiCalculator extends JFrame implements ActionListener{
    
    private static JFrame frame;
    private static JTextField display = new JTextField();
    private static JButton one = new JButton("1");
    private static JButton two = new JButton("2");
    private static JButton three = new JButton("3");
    private static JButton four = new JButton("4");
    private static JButton five = new JButton("5");
    private static JButton six = new JButton("6");
    private static JButton seven = new JButton("7");
    private static JButton eight = new JButton("8");
    private static JButton nine = new JButton("9");
    private static JButton zero = new JButton("0");
    private static JButton clear = new JButton("DEL");
    private static JButton equals = new JButton("=");
    
    private static JButton add = new JButton("+");
    private static JButton minus = new JButton("-");
    private static JButton multiply = new JButton("*");
    private static JButton divide = new JButton("/");
    
    public GuiCalculator(){
        
        frame = new JFrame("GUI-Calculator");  
        frame.setSize(320, 300);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        
        display.setBounds(20,20,260,30);
        display.setLayout(null);
        display.setEnabled(false);
        display.setHorizontalAlignment(display.RIGHT);
        frame.add(display);
        
        one.setBounds(21,51,60,30);
        one.setLayout(null);
        one.addActionListener(this);
        frame.add(one);
        two.setBounds(82,51,60,30);
        two.setLayout(null);
        two.addActionListener(this);
        frame.add(two);
        three.setBounds(143,51,60,30);
        three.setLayout(null);
        three.addActionListener(this);
        frame.add(three);
        four.setBounds(21,82,60,30);
        four.setLayout(null);
        four.addActionListener(this);
        frame.add(four);
        five.setBounds(82,82,60,30);
        five.setLayout(null);
        five.addActionListener(this);
        frame.add(five);
        six.setBounds(143,82,60,30);
        six.setLayout(null);
        six.addActionListener(this);
        frame.add(six);
        seven.setBounds(21,113,60,30);
        seven.setLayout(null);
        seven.addActionListener(this);
        frame.add(seven);
        eight.setBounds(82,113,60,30);
        eight.setLayout(null);
        eight.addActionListener(this);
        frame.add(eight);
        nine.setBounds(143,113,60,30);
        nine.setLayout(null);
        nine.addActionListener(this);
        frame.add(nine);
        zero.setBounds(82,144,60,30);
        zero.setLayout(null);
        zero.addActionListener(this);
        frame.add(zero);
        clear.setBounds(21,144,60,30);
        clear.setLayout(null);
        clear.addActionListener(this);
        frame.add(clear);
        equals.setBounds(143,144,60,30);
        equals.setLayout(null);
        equals.addActionListener(this);
        frame.add(equals);
        
        add.setBounds(204,51,60,30);
        add.setLayout(null);
        add.addActionListener(this);
        frame.add(add);
        minus.setBounds(204,82,60,30);
        minus.setLayout(null);
        minus.addActionListener(this);
        frame.add(minus);
        multiply.setBounds(204,113,60,30);
        multiply.setLayout(null);
        multiply.addActionListener(this);
        frame.add(multiply);
        divide.setBounds(204,144,60,30);
        divide.setLayout(null);
        divide.addActionListener(this);
        frame.add(divide);
    }
    
    public static String oldVal = "", operator;
    public static int firstVal, secondVal, operatorLocation;
    public static int result;
        
    public void actionPerformed (ActionEvent e) { 
        
        if(e.getSource()==one){
            oldVal += one.getText();
        }else if(e.getSource()==two){
            oldVal += two.getText();
        }else if(e.getSource()==three){
            oldVal += three.getText();
        }else if(e.getSource()==four){
            oldVal += four.getText();
        }else if(e.getSource()==five){
            oldVal += five.getText();
        }else if(e.getSource()==six){
            oldVal += six.getText();
        }else if(e.getSource()==seven){
            oldVal += seven.getText();
        }else if(e.getSource()==eight){
            oldVal += eight.getText();
        }else if(e.getSource()==nine){
            oldVal += nine.getText();
        }else if(e.getSource()==zero){
            oldVal += zero.getText();
        }else if(e.getSource()==add){
            firstVal = Integer.parseInt(display.getText());
            operator = add.getText();
            oldVal += add.getText();
        }else if(e.getSource()==minus){
            firstVal = Integer.parseInt(display.getText());
            operator = minus.getText();
            oldVal += minus.getText();
        }else if(e.getSource()==multiply){
            firstVal = Integer.parseInt(display.getText());
            operator = multiply.getText();
            oldVal += multiply.getText();
        }else if(e.getSource()==divide){
            firstVal = Integer.parseInt(display.getText());
            operator = divide.getText();
            oldVal += divide.getText();
        }else if(e.getSource()==clear){
            oldVal = "";
            display.setText(""); 
        }else if(e.getSource()==equals){
            
            if(operator == "+"){
                operatorLocation = (oldVal.indexOf('+'))+1;
                secondVal = Integer.parseInt(oldVal.substring(operatorLocation));
                result = firstVal+secondVal;
            }else if(operator == "-"){
                operatorLocation = (oldVal.indexOf('-'))+1;
                secondVal = Integer.parseInt(oldVal.substring(operatorLocation));
                result = firstVal-secondVal;
            }else if(operator == "*"){
                operatorLocation = (oldVal.indexOf('*'))+1;
                secondVal = Integer.parseInt(oldVal.substring(operatorLocation));
                result = firstVal*secondVal;
            }else if(operator == "/"){
                operatorLocation = (oldVal.indexOf('/'))+1;
                secondVal = Integer.parseInt(oldVal.substring(operatorLocation));
                result = firstVal/secondVal;
            }
            display.setText(String.valueOf(result)); 
            oldVal = String.valueOf(result);
            return;
        }
        display.setText(oldVal); 
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GuiCalculator gui = new GuiCalculator();
        gui.frame.setVisible(true);
        // TODO code application logic here
    }
    
}
