int x = 20;
int y = 100;
void setup() {
    size(800, 200);
}

void draw() {
  background(255,255,255);
  
  //1. Make a variable to hold the X co-ordinate of the dot, and set it to something.
  //3. make it a nice color
    fill(#29E81C);
    //4. if the mouse is pressed...
    if (mousePressed){
    x++;
    }
    //5. ... change the X co-ordinate so that the dot moves to the right
    //2. Draw an ellipse of height and width 100. Make sure to use your variable for the X position.
    ellipse (x,100,20,20);
    //6. Make your dot move really fast so that it can win the race 
    //(you have to figure out what part of your code to change)
    //7. Use this method to play a ding when your dot crosses the finish line. 
}


  

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding2.wav");
        sound.trigger();
        soundPlayed = true;
    }
}