import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        MyContainer container = new MyContainer();

        this.setTitle("Snake game");
        this.setSize(1250, 700);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        ImageIcon image = new ImageIcon("./assets/logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().add(container);
        this.setVisible(true);


    }

}

class MyContainer extends JPanel {

    MyContainer() {
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.add(new JLabel("This is cont inside"));
        this.setPreferredSize(new Dimension(200, 100));
    }

}
