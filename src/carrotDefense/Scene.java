package carrotDefense;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Scene extends JFrame {

//    private int life = 10;
//    private int money = 1000;

    public Scene(){

        String backPath = "./resources/back.png";
        String roadPath = "./resources/road.png";
        BufferedImage back = null;
        BufferedImage road = null;

        try {
            back = ImageIO.read(new File(backPath));
            back = back.getSubimage(2,2,960,640);
            road = ImageIO.read(new File(roadPath));
            road = road.getSubimage(2,2,960,482);

        } catch (IOException e) {
            e.printStackTrace();
        }

        assert back != null;
        assert road != null;
        JLabel backLabel = new JLabel(new ImageIcon(back));
        JLabel roadLabel = new JLabel(new ImageIcon(road));

        backLabel.setBounds(0,0, back.getWidth(), back.getHeight());
        roadLabel.setBounds(0,640-482, road.getWidth(), road.getHeight());

        this.add(roadLabel);
        this.add(backLabel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setResizable(false);
//        this.setLayout(new FlowLayout());
//        this.add(roadLabel);
//        this.getLayeredPane().add(backLabel, -10);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        // write your code here
        new Scene();
    }
}
