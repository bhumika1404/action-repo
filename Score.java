import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener{
    Score(String name, int score){
        setBounds(400,150,750,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,200, 300,250);
        add(image);

        JLabel heading=new JLabel("Thank you "+ name + " for playing Simple minds");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);

        JLabel score1=new JLabel("Your Score is: "+ score);
        score1.setBounds(350, 200, 300, 30);
        score1.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(score1);

        JButton next=new JButton("Play Again");
        next.setBounds(380, 270, 150, 30);
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new Score("User",0);
    }
}
