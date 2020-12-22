
package calculation;

import java.awt.Color;
public class Calculator extends javax.swing.JFrame {

    double firstNum;
    double secondNum;
    double result;
    String operations="";
    public Calculator() {
        initComponents();
        text.setBackground(new Color(0,0,0,64));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JTextField();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        point = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        div = new javax.swing.JButton();
        fact = new javax.swing.JButton();
        square = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        percent = new javax.swing.JButton();
        pow = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        back = new javax.swing.JButton();
        clr = new javax.swing.JButton();
        off = new javax.swing.JButton();
        minusw = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(360, 590));
        setPreferredSize(new java.awt.Dimension(355, 610));
        setResizable(false);
        getContentPane().setLayout(null);

        text.setEditable(false);
        text.setBackground(new java.awt.Color(204, 204, 255));
        text.setFont(new java.awt.Font("digital display tfb", 0, 72)); // NOI18N
        text.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        text.setBorder(null);
        text.setOpaque(false);
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });
        getContentPane().add(text);
        text.setBounds(26, 98, 300, 105);

        one.setAlignmentY(0.0F);
        one.setBorderPainted(false);
        one.setContentAreaFilled(false);
        one.setPreferredSize(new java.awt.Dimension(50, 48));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        getContentPane().add(one);
        one.setBounds(87, 445, 50, 48);

        two.setAlignmentY(0.0F);
        two.setBorderPainted(false);
        two.setContentAreaFilled(false);
        two.setPreferredSize(new java.awt.Dimension(50, 48));
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        getContentPane().add(two);
        two.setBounds(150, 445, 50, 48);

        three.setAlignmentY(0.0F);
        three.setBorderPainted(false);
        three.setContentAreaFilled(false);
        three.setPreferredSize(new java.awt.Dimension(50, 48));
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        getContentPane().add(three);
        three.setBounds(214, 445, 50, 48);

        four.setAlignmentY(0.0F);
        four.setBorderPainted(false);
        four.setContentAreaFilled(false);
        four.setPreferredSize(new java.awt.Dimension(50, 48));
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        getContentPane().add(four);
        four.setBounds(88, 386, 50, 48);

        five.setAlignmentY(0.0F);
        five.setBorderPainted(false);
        five.setContentAreaFilled(false);
        five.setPreferredSize(new java.awt.Dimension(50, 48));
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        getContentPane().add(five);
        five.setBounds(150, 386, 50, 48);

        six.setAlignmentY(0.0F);
        six.setBorderPainted(false);
        six.setContentAreaFilled(false);
        six.setPreferredSize(new java.awt.Dimension(50, 48));
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        getContentPane().add(six);
        six.setBounds(214, 386, 50, 48);

        seven.setAlignmentY(0.0F);
        seven.setBorderPainted(false);
        seven.setContentAreaFilled(false);
        seven.setPreferredSize(new java.awt.Dimension(50, 48));
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        getContentPane().add(seven);
        seven.setBounds(87, 327, 50, 48);

        eight.setAlignmentY(0.0F);
        eight.setBorderPainted(false);
        eight.setContentAreaFilled(false);
        eight.setPreferredSize(new java.awt.Dimension(50, 48));
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        getContentPane().add(eight);
        eight.setBounds(150, 327, 50, 48);

        nine.setAlignmentY(0.0F);
        nine.setBorderPainted(false);
        nine.setContentAreaFilled(false);
        nine.setPreferredSize(new java.awt.Dimension(50, 48));
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        getContentPane().add(nine);
        nine.setBounds(214, 327, 50, 48);

        zero.setAlignmentY(0.0F);
        zero.setBorderPainted(false);
        zero.setContentAreaFilled(false);
        zero.setPreferredSize(new java.awt.Dimension(50, 48));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        getContentPane().add(zero);
        zero.setBounds(87, 505, 50, 48);

        point.setAlignmentY(0.0F);
        point.setBorderPainted(false);
        point.setContentAreaFilled(false);
        point.setPreferredSize(new java.awt.Dimension(50, 48));
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });
        getContentPane().add(point);
        point.setBounds(150, 505, 50, 48);

        plus.setBorderPainted(false);
        plus.setContentAreaFilled(false);
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        getContentPane().add(plus);
        plus.setBounds(277, 448, 50, 100);

        minus.setAlignmentY(0.0F);
        minus.setBorderPainted(false);
        minus.setContentAreaFilled(false);
        minus.setPreferredSize(new java.awt.Dimension(50, 48));
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        getContentPane().add(minus);
        minus.setBounds(277, 386, 50, 48);

        mult.setAlignmentY(0.0F);
        mult.setBorderPainted(false);
        mult.setContentAreaFilled(false);
        mult.setPreferredSize(new java.awt.Dimension(50, 48));
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });
        getContentPane().add(mult);
        mult.setBounds(278, 327, 50, 48);

        div.setAlignmentY(0.0F);
        div.setBorderPainted(false);
        div.setContentAreaFilled(false);
        div.setPreferredSize(new java.awt.Dimension(50, 48));
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });
        getContentPane().add(div);
        div.setBounds(278, 270, 50, 48);

        fact.setAlignmentY(0.0F);
        fact.setBorderPainted(false);
        fact.setContentAreaFilled(false);
        fact.setPreferredSize(new java.awt.Dimension(50, 48));
        fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factActionPerformed(evt);
            }
        });
        getContentPane().add(fact);
        fact.setBounds(214, 270, 50, 48);

        square.setAlignmentY(0.0F);
        square.setBorderPainted(false);
        square.setContentAreaFilled(false);
        square.setPreferredSize(new java.awt.Dimension(50, 48));
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });
        getContentPane().add(square);
        square.setBounds(151, 270, 50, 48);

        sqrt.setAlignmentY(0.0F);
        sqrt.setBorderPainted(false);
        sqrt.setContentAreaFilled(false);
        sqrt.setPreferredSize(new java.awt.Dimension(50, 48));
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });
        getContentPane().add(sqrt);
        sqrt.setBounds(88, 270, 50, 48);

        percent.setAlignmentY(0.0F);
        percent.setBorderPainted(false);
        percent.setContentAreaFilled(false);
        percent.setPreferredSize(new java.awt.Dimension(50, 48));
        percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });
        getContentPane().add(percent);
        percent.setBounds(24, 330, 50, 48);

        pow.setAlignmentY(0.0F);
        pow.setBorderPainted(false);
        pow.setContentAreaFilled(false);
        pow.setPreferredSize(new java.awt.Dimension(50, 48));
        pow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powActionPerformed(evt);
            }
        });
        getContentPane().add(pow);
        pow.setBounds(24, 388, 50, 48);

        equal.setAlignmentY(0.0F);
        equal.setBorderPainted(false);
        equal.setContentAreaFilled(false);
        equal.setPreferredSize(new java.awt.Dimension(50, 48));
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        getContentPane().add(equal);
        equal.setBounds(214, 502, 50, 48);

        back.setAlignmentY(0.0F);
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setPreferredSize(new java.awt.Dimension(50, 48));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(24, 502, 50, 48);

        clr.setAlignmentY(0.0F);
        clr.setBorderPainted(false);
        clr.setContentAreaFilled(false);
        clr.setPreferredSize(new java.awt.Dimension(50, 48));
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });
        getContentPane().add(clr);
        clr.setBounds(24, 445, 50, 48);

        off.setAlignmentY(0.0F);
        off.setBorderPainted(false);
        off.setContentAreaFilled(false);
        off.setPreferredSize(new java.awt.Dimension(50, 48));
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });
        getContentPane().add(off);
        off.setBounds(24, 270, 50, 48);

        minusw.setBorderPainted(false);
        minusw.setContentAreaFilled(false);
        minusw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minuswActionPerformed(evt);
            }
        });
        getContentPane().add(minusw);
        minusw.setBounds(276, 235, 50, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculation/20108.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(355, 585));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 346, 585);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
       String number=text.getText()+"1";
       text.setText(number);
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        String number=text.getText()+"2";
       text.setText(number);
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        String number=text.getText()+"3";
       text.setText(number);
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        String number=text.getText()+"4";
       text.setText(number);
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        String number=text.getText()+"5";
       text.setText(number);
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        String number=text.getText()+"6";
       text.setText(number);
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        String number=text.getText()+"7";
       text.setText(number);
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        String number=text.getText()+"8";
       text.setText(number);
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        String number=text.getText()+"9";
       text.setText(number);
    }//GEN-LAST:event_nineActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        String number=text.getText()+"0";
       text.setText(number);
    }//GEN-LAST:event_zeroActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
         if(operations==""){
            firstNum=Double.parseDouble(text.getText()) ;
        text.setText("");
        operations="+";}
        else if(operations == "+")
            {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum+temp;
        text.setText("");
        operations="+";
        }
        else if(operations == "-")
           {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum-temp;
        text.setText("");
        operations="+";
        }
        else if(operations == "*")
            {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum*temp;
        text.setText("");
        operations="+";
        }
        else if(operations == "/")
           {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum/temp;
        text.setText("");
        operations="+";
        }
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed

  
        if(operations==""){
        firstNum=Double.parseDouble(text.getText()) ;
        text.setText("");
        operations="-";}
        else if(operations == "+")
            {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum+temp;
        text.setText("");
        operations="-";
        }
        else if(operations == "-")
           {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum-temp;
        text.setText("");
        operations="-";
        }
        else if(operations == "*")
            {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum*temp;
        text.setText("");
        operations="-";
        }
        else if(operations == "/")
           {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum/temp;
        text.setText("");
        operations="-";
        }
        
    }//GEN-LAST:event_minusActionPerformed

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
        if(operations=="")
        {firstNum=Double.parseDouble(text.getText()) ;
        text.setText("");
        operations="*";}
        else if(operations == "+")
            {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum+temp;
        text.setText("");
        operations="*";
        }
        else if(operations == "-")
           {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum-temp;
        text.setText("");
        operations="*";
        }
        else if(operations == "*")
            {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum*temp;
        text.setText("");
        operations="*";
        }
        else if(operations == "/")
           {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum/temp;
        text.setText("");
        operations="*";
        }
    }//GEN-LAST:event_multActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        if(operations=="") 
       {firstNum=Double.parseDouble(text.getText()) ;
        text.setText("");
        operations="/";}
       else if(operations == "+")
            {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum+temp;
        text.setText("");
        operations="/";
        }
        else if(operations == "-")
           {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum-temp;
        text.setText("");
        operations="/";
        }
        else if(operations == "*")
            {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum*temp;
        text.setText("");
        operations="/";
        }
        else if(operations == "/")
           {double temp=Double.parseDouble(text.getText());
        firstNum=firstNum/temp;
        text.setText("");
        operations="/";
        }
    }//GEN-LAST:event_divActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        String answer;
        secondNum=Double.parseDouble(text.getText());
        if(operations == "+")
            result=firstNum+secondNum;
        else if(operations == "-")
            result=firstNum-secondNum;
        else if(operations == "*")
            result=firstNum*secondNum;
        else if(operations == "/")
            result=firstNum/secondNum;
        else if(operations == "^")
            result=Math.pow(firstNum,secondNum);
        else if(operations == "%")
            result=(firstNum*secondNum)/100;
        if(operations == "")
        { answer=text.getText();}
        else{
        if(result%1 ==0.0)
         answer=String.format("%.0f",result); 
        else
        answer=String.format("%.2f",result);
        if(answer.length()>11){
            text.setText("out of limits");
        operations="";}
        else{
        text.setText(answer);
        firstNum=result;
        operations="";}
        }
    }//GEN-LAST:event_equalActionPerformed

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textActionPerformed

    private void factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factActionPerformed
        String number;
        double num,dumb=0;
         num=Double.parseDouble(text.getText());
         if(num%1>0.0 || num<0)
             text.setText("ERROR");
         else if(num>14)
             text.setText("Out of limit");
         else{
         dumb=num;
         if(num==0)
             number=String.format("%.0f",1);
         else
         { for(int i=1;i<num;i++){
           
           dumb=dumb*(num-i);
       }
          number=String.format("%.0f",dumb);}
       text.setText(number);
         }
    }//GEN-LAST:event_factActionPerformed

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed
        String number=text.getText();
        if(number.indexOf('.')<0){
            number=number+".";
        }
        else
            number=text.getText();
       text.setText(number);
    }//GEN-LAST:event_pointActionPerformed

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtActionPerformed
        String number;
        firstNum=Double.parseDouble(text.getText());
        if(firstNum<0)
            text.setText("error");
        else{
       double num=Math.sqrt(firstNum);
       if(num%1 ==0.0)
       number=String.format("%.0f",num);
       else
          number=String.format("%.2f",num);
       text.setText(number);
        }
    }//GEN-LAST:event_sqrtActionPerformed

    private void powActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powActionPerformed
        firstNum=Double.parseDouble(text.getText());
       text.setText("");
       operations="^";
    }//GEN-LAST:event_powActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        String back="";
        int len;
        len=text.getText().length();
        if(len>0){
            StringBuffer temp=new StringBuffer(text.getText());
            temp.deleteCharAt(len-1);
            back=temp.toString();
        }
        text.setText(back);
    }//GEN-LAST:event_backActionPerformed

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
        System.exit(0);
    }//GEN-LAST:event_offActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
        String number;
        firstNum=Double.parseDouble(text.getText());
        double num=Math.pow(firstNum,2);
        if(num%1==0.0){
        number=String.format("%.0f",num);
        }
        else{
            number=String.format("%.2f",num);
        }
        if(number.length()>11){
            text.setText("out of limits");
       }
        else
        text.setText(number);
    }//GEN-LAST:event_squareActionPerformed

    private void percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentActionPerformed
        firstNum=Double.parseDouble(text.getText());
        text.setText("");
        operations="%";
    }//GEN-LAST:event_percentActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
        text.setText("");
        firstNum=0;
    }//GEN-LAST:event_clrActionPerformed

    private void minuswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minuswActionPerformed
        String symbol="-";
        text.setText(symbol);
    }//GEN-LAST:event_minuswActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton clr;
    private javax.swing.JButton div;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton fact;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton minus;
    private javax.swing.JButton minusw;
    private javax.swing.JButton mult;
    private javax.swing.JButton nine;
    private javax.swing.JButton off;
    private javax.swing.JButton one;
    private javax.swing.JButton percent;
    private javax.swing.JButton plus;
    private javax.swing.JButton point;
    private javax.swing.JButton pow;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton sqrt;
    private javax.swing.JButton square;
    private javax.swing.JTextField text;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
