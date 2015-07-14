package test;

import java.io.File;
import com.asprise.ocr.*;

public class OCR {

	public OCR(){
		// TODO Auto-generated method stub
		
		/*
		Ocr.setUp();
		
		Ocr ocr = new Ocr();
		ocr.startEngine("Eng", Ocr.SPEED_FASTEST);
		
		String s = ocr.recognize(new File[] {new File("testimage3.png")}, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		System.out.println(s);
		
		ocr.stopEngine();
		*/

	}
	
	public String ScanQuestion() {
		Ocr.setUp();
		
		Ocr oQuestion = new Ocr();
		oQuestion.startEngine("Eng", Ocr.SPEED_FASTEST);
		
		String sQuestion = oQuestion.recognize(new File[] {new File("question.jpg")}, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		System.out.println(sQuestion);
		
		oQuestion.stopEngine(); 
		
		return sQuestion;
	}
	
	public String ScanAnswers() {
		Ocr.setUp();
		
		Ocr oAnswers = new Ocr();
		oAnswers.startEngine("Eng", Ocr.SPEED_FASTEST);
		
		String sAnswers = oAnswers.recognize(new File[] {new File("testimage3.png")}, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		System.out.println(sAnswers);
		
		oAnswers.stopEngine();
	
		return sAnswers;
	}

}
