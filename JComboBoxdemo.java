import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JComboBoxdemo extends JFrame implements ItemListener
{
 JComboBox box;
 JLabel lbl;
 JComboBoxdemo()
 {
 Container c = getContentPane();
 c.setLayout(null);
 box= new JComboBox();
// add item to it 
 box.addItem("India");
 box.addItem("America");
 box.addItem("germany");
 box.addItem("japan");
 box.addItem("france");
// set location of combo box
 box.setBounds(100,50,100,40);
 c.add(box);
 lbl=new JLabel();
 lbl.setBounds(100,200,200,40);
 c.add(lbl);
 box.addItemListener(this);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
 public void itemStateChanged(ItemEvent ie)
 {
 // know which item is selected
 String str=(String)box.getSelectedItem();
 lbl.setText("you selected:"+str);
 }
public static void main(String arg[])
{
 JComboBoxdemo demo = new JComboBoxdemo();
 demo.setTitle("My comboBox");
 demo.setVisible(true);
}
}
 