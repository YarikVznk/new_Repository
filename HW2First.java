import stanford.karel.*;
kaudyfgweruf
public class HW2First extends SuperKarel{
         
	public void run() {
		gogaz();
		takegaz();
		goback();
		}
		private void gogaz(){
			go1();
			turnRight();
			turnRight();
			turnRight();
			turnRight();
			go2();
			turnLeft();
			go3();
			}
		private void takegaz(){
			pickBeeper();
			turnAround();
		}
		private void goback(){
			go1();
			turnRight();
			go1();
			turnRight();
		}
			private void go1(){
				while(frontIsClear()){
					move();
					}
				}
			private void go2(){
				while(leftIsBlocked()){
					move();
					}
				}
			private void go3(){
				while(noBeepersPresent()){
					move();
					}
				}
			
}
