import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JFrame title goes here");
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ImageIcon image = new ImageIcon("bread.png");
        frame.setIconImage(image.getImage());

        frame.setVisible(true);




    }
}
