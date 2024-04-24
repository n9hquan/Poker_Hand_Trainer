package Final_Project;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.jar.JarEntry;

public class test {
    public static void main(String[] args){
        int width = 1280;
        int height = 720;
        ImageIcon titleIcon = new ImageIcon("game_logo.jpg"); 
        JButton compareButton = new JButton();
        // compareButton.setPreferredSize(new Dimension(200,90));
        compareButton.setBorder(BorderFactory.createEtchedBorder());
        compareButton.setText("Compare Hands");
        compareButton.setFont(new Font("STSong",Font.BOLD, 15));
        int buttonWidth = 80;
        int buttonHeight = 20;
        compareButton.setBounds(new Rectangle((width - buttonWidth)/2, (height - buttonHeight)/2, buttonWidth, buttonHeight));
        compareButton.setSize(new Dimension(buttonWidth, buttonHeight));
        compareButton.setFocusable(false);
        // JPanel leftPanel = new JPanel();
        // leftPanel.setBackground(Color.BLUE);
        // leftPanel.add(compareButton);

        // * Start from here
        // Label for hand 1
        JLabel leftLabel = new JLabel();
        leftLabel.setText("Hand 1");
        leftLabel.setFont(new Font("STSong",Font.BOLD, 15));
        leftLabel.setHorizontalTextPosition(JLabel.CENTER);
        leftLabel.setForeground(Color.WHITE);

        // Label for hand 2
        JLabel rightLabel = new JLabel();
        rightLabel.setText("Hand 2");
        rightLabel.setFont(new Font("STSong",Font.BOLD, 15));
        rightLabel.setHorizontalTextPosition(JLabel.CENTER);
        rightLabel.setForeground(Color.WHITE);

        // Create Panels
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(Color.BLUE);
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBackground(Color.RED);
        leftPanel.setPreferredSize(new Dimension(575,575));
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBackground(Color.CYAN);
        rightPanel.setPreferredSize(new Dimension(575,575));
        JPanel topleftPanel = new JPanel(new GridBagLayout());
        topleftPanel.setPreferredSize(new Dimension(100,100));
        topleftPanel.setBackground(Color.BLACK);
        JPanel toprightPanel = new JPanel(new GridBagLayout());
        toprightPanel.setPreferredSize(new Dimension(100,100));
        toprightPanel.setBackground(Color.BLACK);
        GridBagConstraints constraints = new GridBagConstraints();

        JPanel secondleftPanel = new JPanel(new BorderLayout());
        secondleftPanel.setPreferredSize(new Dimension(100, 100));
        JPanel topsecondleftPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 10));
        topsecondleftPanel.setPreferredSize(new Dimension(100,100));
        topsecondleftPanel.setBackground(Color.BLACK);

        JPanel thirdleftPanel = new JPanel(new BorderLayout());
        thirdleftPanel.setPreferredSize(new Dimension(100,100));
        JPanel topthirdleftPanel = new JPanel();
        topthirdleftPanel.setPreferredSize(new Dimension(300, 300));
        topthirdleftPanel.setBackground(Color.BLACK);

        JPanel fourthleftPanel = new JPanel(new BorderLayout());
        fourthleftPanel.setPreferredSize(new Dimension(50,50));
        JPanel topfourthleftPanel = new JPanel();
        topfourthleftPanel.setPreferredSize(new Dimension(50, 50));
        topfourthleftPanel.setBackground(Color.BLACK);

        JPanel fifthleftPanel = new JPanel();
        fifthleftPanel.setPreferredSize(new Dimension(100, 100));
        fifthleftPanel.setBackground(Color.BLACK);

        // Create Text Field
        JTextField leftfirstTextfield = new JTextField();
        leftfirstTextfield.setPreferredSize(new Dimension(50,20));
        leftfirstTextfield.setBorder(BorderFactory.createEmptyBorder());
        leftfirstTextfield.setHorizontalAlignment(JTextField.CENTER);
        
        JTextField leftsecondTextfield = new JTextField();
        leftsecondTextfield.setPreferredSize(new Dimension(50,20));
        leftsecondTextfield.setBorder(BorderFactory.createEmptyBorder());
        leftsecondTextfield.setHorizontalAlignment(JTextField.CENTER);
        
        JTextField leftthirdTextfield = new JTextField();
        leftthirdTextfield.setPreferredSize(new Dimension(50,20));
        leftthirdTextfield.setBorder(BorderFactory.createEmptyBorder());
        leftthirdTextfield.setHorizontalAlignment(JTextField.CENTER);
        
        JTextField leftfourthTextfield = new JTextField();
        leftfourthTextfield.setPreferredSize(new Dimension(50,20));
        leftfourthTextfield.setBorder(BorderFactory.createEmptyBorder());
        leftfourthTextfield.setHorizontalAlignment(JTextField.CENTER);
        
        JTextField leftfifthTextfield = new JTextField();
        leftfifthTextfield.setPreferredSize(new Dimension(50,20));
        leftfifthTextfield.setBorder(BorderFactory.createEmptyBorder());
        leftfifthTextfield.setHorizontalAlignment(JTextField.CENTER);

        // Get input through ENTER and the cursor jumps to the next Text field
        leftfirstTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    String firstleftcard = leftfirstTextfield.getText();
                    System.out.println(firstleftcard);
                    leftsecondTextfield.requestFocusInWindow();
                }
            }
        });

        leftsecondTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    String secondleftcard = leftsecondTextfield.getText();
                    System.out.println(secondleftcard);
                    leftthirdTextfield.requestFocusInWindow();
                }
            }
        });

        leftthirdTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    String thirdleftcard = leftthirdTextfield.getText();
                    System.out.println(thirdleftcard);
                    leftfourthTextfield.requestFocusInWindow();
                }
            }
        });

        leftfourthTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    String fourthleftcard = leftfourthTextfield.getText();
                    System.out.println(fourthleftcard);
                    leftfifthTextfield.requestFocusInWindow();
                }
            }
        });

        leftfifthTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    String fifthleftcard = leftfifthTextfield.getText();
                    System.out.println(fifthleftcard);
                }
            }
        });

        // Create GUI frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Poker Game");
        frame.setSize(1280, 720);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setResizable(false);
        frame.setIconImage(titleIcon.getImage());
        // frame.setLayout(new GridBagLayout());
        // frame.add(compareButton, new GridBagConstraints());
        frame.setLocationRelativeTo(null);

        // Adding components into the frame
        frame.add(mainPanel);
        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(rightPanel, BorderLayout.EAST);
        leftPanel.add(topleftPanel, BorderLayout.NORTH);
        rightPanel.add(toprightPanel, BorderLayout.NORTH);
        topleftPanel.add(leftLabel);
        toprightPanel.add(rightLabel);
        leftPanel.add(secondleftPanel);
        secondleftPanel.add(topsecondleftPanel, BorderLayout.NORTH);
        secondleftPanel.add(thirdleftPanel);
        thirdleftPanel.add(topthirdleftPanel, BorderLayout.NORTH);
        thirdleftPanel.add(fourthleftPanel);
        fourthleftPanel.add(topfourthleftPanel, BorderLayout.NORTH);
        fourthleftPanel.add(fifthleftPanel);

        topsecondleftPanel.add(leftfirstTextfield);
        topsecondleftPanel.add(leftsecondTextfield);
        topsecondleftPanel.add(leftthirdTextfield);
        topsecondleftPanel.add(leftfourthTextfield);
        topsecondleftPanel.add(leftfifthTextfield);
    }
}
