package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {

	Random gen = new Random (); 
	int r1 = gen .nextInt((100)+1);
	System.out.println(r1);
	
	int r2 = gen .nextInt((250-100)+1);
	System.out.println(r2);
	
	int r3 = gen .nextInt((326-257)+1);
	System.out.println(r3);
	
	int r4 = gen .nextInt((437-374)+1);
	System.out.println(r4);
	
	int r5 = gen .nextInt((592-464)+1);
	
	JOptionPane.showMessageDialog(null, r1+"-"+r2+"-"+r3+"-"+r4+"-"+r5);	
	
	}}
