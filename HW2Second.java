import stanford.karel.*;

public class HW2Second extends SuperKarel {

	public void run() {
		go();
	}



	private void go() {
		if (leftIsBlocked()) {
			find_up();
			go_up();
			find_up();
			go_home();
			go();
		} else {
			go_up();
		}
		go();
	}

	private void find_up() {
		while (leftIsBlocked()) {
			if (frontIsClear())
				move();
		}
		go_up();
		go_home();
	}

	private void go_up() {
		turnLeft();
		movy();
		turnRight();
	}

	private void go_home() {
		turnAround();
		movy();
		turnAround();
	}

	private void movy() {
		while (frontIsClear()) {
			move();
		}
	}
}
