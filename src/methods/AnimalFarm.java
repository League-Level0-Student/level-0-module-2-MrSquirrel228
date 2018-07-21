package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

AnimalFarm() {

	
	// * 1. Ask the user which animal they want, then play the sound of that animal.
	 
	  String r = JOptionPane.showInputDialog(null, "what aminal noise would you like to hear");
	  
	  if (r.equals ("cow")) {
		  playMoo();
	  }
	 
	  if(r.equals ("duck")) {
		  playQuack();
	  }
	 
	  if (r.equals("cat")) {
		  playMeow();
	  }
	
	  if (r.equals("dog")) {
		  playWoof();
	  }
	  
	  if (r.equals("llama")) {
		  playLlama();
	  }
	  
}
	 
	/* 2. Make it so that the user can keep entering new animals. */


void playMoo() {
	playNoise(cow);
}

void playQuack() {
	playNoise(duck);
}

void playWoof() {
	playNoise(dog);
}

void playMeow() {
	playNoise(cat);
}

void playLlama() {
	playNoise(llamaFile);
}

String duck = "quack.wav";
String cow = "moo.wav";
String dog = "woof.wav";
String cat = "meow.wav";
String llamaFile = "llama.wav";


/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		 Clip clip = AudioSystem.getClip();
		 clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
		 clip.start();
		 Thread.sleep(3400);
	} catch (Exception ex) {
  	ex.printStackTrace();
	}
}

public static void main(String[] args) {
	new AnimalFarm();
}

}

