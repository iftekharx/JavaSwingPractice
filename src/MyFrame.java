import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrame extends JFrame{

    MyFrame(){
        setTitle("Title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setResizable(false);
        setSize(1000, 900);


        ImageIcon image = new ImageIcon("logo.png");
        setIconImage(image.getImage());

        ImageIcon computerImg = new ImageIcon("computer.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);


        // other components
        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(computerImg);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.black);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(-25);
        label.setBackground(Color.red);
        label.setOpaque(true); // display background color around its limits it takes
        // label expands
        label.setBorder(border);



        add(label);



        getContentPane().setBackground(new Color(255, 255,255));

        setVisible(true);
    }


}
