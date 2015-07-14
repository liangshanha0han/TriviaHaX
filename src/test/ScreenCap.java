package test;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ScreenCap {
	
	public void CapQuestion() throws AWTException, IOException {
		BufferedImage screencapture = new Robot().createScreenCapture(new Rectangle(380, 210, 760, 360));
		
		File file = new File("question.jpg");
		ImageIO.write(screencapture, "jpg", file);
	}
	
	public void CapAnswers() throws AWTException, IOException {
		BufferedImage screencapture = new Robot().createScreenCapture(new Rectangle(380, 210, 760, 360));
		
		File file = new File("answers.jpg");
		ImageIO.write(screencapture, "jpg", file);
	}

}
