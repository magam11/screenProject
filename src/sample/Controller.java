package sample;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class Controller {

    @FXML
    public void screenWindow(MouseEvent mouseEvent) throws Exception {
        String desktopPath = System.getProperty("user.home")+"\\Desktop\\";
        captureScreen(desktopPath+System.currentTimeMillis()+".jpg");
    }

    public void captureScreen(String fileName) throws Exception {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle screenRectangle = new Rectangle(screenSize);
        Robot robot = new Robot();
        BufferedImage image = robot.createScreenCapture(screenRectangle);
        ImageIO.write(image, "jpg", new File(fileName));

    }
}
