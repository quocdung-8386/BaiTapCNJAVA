import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Bai2 extends JFrame {

    public Bai2() {

        super("Welcome");

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public void showWelcomeMessage() {
        JOptionPane.showMessageDialog(
            this,
            "Welcome to Java Swing",
            "Welcome",
            JOptionPane.INFORMATION_MESSAGE
        );

        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Bai2 app = new Bai2();
            app.setVisible(true);
            app.showWelcomeMessage();
        });
    }
}

