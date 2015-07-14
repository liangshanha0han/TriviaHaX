package test;

import java.awt.AWTException;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
		
		ScreenCap screenCap= new ScreenCap();
		screenCap.CapQuestion();
		screenCap.CapAnswers();

		OCR test = new OCR();
		
		String sQuestion = test.ScanQuestion();
		String sAnswers = test.ScanAnswers();
		
		System.out.println(sQuestion);
		System.out.println(sAnswers);
		
		

	}

}
