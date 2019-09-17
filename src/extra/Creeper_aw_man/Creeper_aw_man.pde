PImage creeper;     
PImage minecraft;
void setup(){ size(1917,1196); minecraft = loadImage("Creeper.jpg");  creeper=loadImage("Aw man.png");     //in setup method   
minecraft.resize(width, height);       creeper.resize(50, 50);    
         
}

void draw(){
  background(minecraft); 
  
  image(creeper, 590, 770, 50, 50);     //in draw method
}
