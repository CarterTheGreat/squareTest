void setup(){
  size(640, 640);
  imageMode(CENTER);
  background(255);
}

int i = 0;

void draw(){
  if(i < (650-180)/2){
    update(i);
  }else
    fill(0,0,0);
    text("You're Gay", (640-40)/2, (640/2) );
  i++;
}

void update(int i){
  int x = i;
  int y = i;
  fill(1, 205, 254);
  square(x, y, 50);
  
  int x1 = i;
  int y1 = 590-i;
  fill(255,113,206);
  square(x1, y1, 50);
  
  int x2 = 590-i;
  int y2 = i;
  fill(5,255,161);
  square(x2, y2, 50);
  
  int x3 = 590-i;
  int y3 = 590-i;
  fill(255,251,150);
  square(x3, y3, 50);
  
}
