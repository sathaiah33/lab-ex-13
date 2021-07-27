/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

/**
 *
 * @author rakesh
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
public class ButtonColor extends JFrame implements ActionListener
{
private JButton m_btn1;
private Color[] colors = new Color[] {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, new Color(138, 43, 226)};
private int index;
  
public ButtonColor()
{
initialize();
}
  
private void initialize()
{
index = 0;
  
m_btn1 = new JButton("Click Me");
m_btn1.addActionListener(this);
setLayout(new BorderLayout());
add(m_btn1, BorderLayout.NORTH);
}
  
public void actionPerformed(ActionEvent e)
{
if(index < (colors.length - 1))
{
index++;
}
else
{
index = 0;
}
m_btn1.setBackground(colors[index]);
}
  
public static void main(String[] p)
{
ButtonColor thisFrame = new ButtonColor();
thisFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
thisFrame.setSize(200,200);
thisFrame.setVisible(true);
}
}
