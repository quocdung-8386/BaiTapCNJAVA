import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Bai4 extends JFrame {

    public Bai4() {
        super("Image Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Image image = loadImage("/sample.jpg");

        if (image != null) {
            ImagePanel imagePanel = new ImagePanel(image);
            imagePanel.setPreferredSize(new Dimension(image.getWidth(null), image.getHeight(null)));
            add(imagePanel, BorderLayout.CENTER);
        } else {
            JLabel errorLabel = new JLabel("Không thể tải hình ảnh!", SwingConstants.CENTER);
            add(errorLabel, BorderLayout.CENTER);
            setPreferredSize(new Dimension(400, 200));
        }

        pack();
        setLocationRelativeTo(null);
    }

    private Image loadImage(String resourcePath) {
        URL imgURL = getClass().getResource(resourcePath);
        if (imgURL != null) {
            return new ImageIcon(imgURL).getImage();
        } else {
            System.err.println("Không tìm thấy tệp tài nguyên: " + resourcePath);
            return null;
        }
    }

    static class ImagePanel extends JPanel {
        private final Image image;

        public ImagePanel(Image image) {
            this.image = image;
            setBackground(Color.BLACK);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (image != null) {
                Graphics2D g2d = (Graphics2D) g;

                g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int panelWidth = getWidth();
                int panelHeight = getHeight();
                int imgWidth = image.getWidth(this);
                int imgHeight = image.getHeight(this);

                if (imgWidth > 0 && imgHeight > 0) {
                    double scale = Math.min((double) panelWidth / imgWidth, (double) panelHeight / imgHeight);
                    int newWidth = (int) (imgWidth * scale);
                    int newHeight = (int) (imgHeight * scale);

                    int x = (panelWidth - newWidth) / 2;
                    int y = (panelHeight - newHeight) / 2;

                    g2d.drawImage(image, x, y, newWidth, newHeight, this);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Bai4 viewer = new Bai4();
            viewer.setVisible(true);
        });
    }
}


