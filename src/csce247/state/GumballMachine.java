package csce247.state;

public class GumballMachine {
	private static final int SOLD_OUT = 0;
	private static final int NO_QUARTER = 1;
	private static final int HAS_QUARTER = 2;
	private static final int SOLD = 3;
	
	private int state = SOLD_OUT;
	int count = 0;
	
	public GumballMachine(int count) {
		this.count = count;
		
		if(count > 0) {
			state = NO_QUARTER;
		}
	}
	
	public void insertQuarter() {
		if(state==HAS_QUARTER) {
			System.out.println("You can't insert another quarter");
		} else if(state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
		} else if(state==SOLD_OUT) {
			System.out.println("You can't insert a quarter.  The machine is sold out");
		} else if(state == SOLD) {
			System.out.println("Please wait, we're already giving you a gumball");
		}	
	}
	
	public void ejectQuarter() {
		if(state==HAS_QUARTER) {
			System.out.println("Quarter returned");
			state = NO_QUARTER;
		} else if(state == NO_QUARTER) {
			System.out.println("You haven't inserted a quarter");
		} else if(state==SOLD_OUT) {
			System.out.println("Sorry, you already turned the crank");
		} else if(state == SOLD) {
			System.out.println("You can't eject, you haven't inserted a quarter yet");
		}
			
	}
	
	public void turnCrank() {
		if(state==HAS_QUARTER) {
			System.out.println("You turned");
			state = SOLD;
			dispense();
		} else if(state == NO_QUARTER) {
			System.out.println("You turned but there is no quarter");
		} else if(state==SOLD_OUT) {
			System.out.println("You turned but there was no gumball");
		} else if(state == SOLD) {
			System.out.println("turning twice doesn't get you another gumball!");
		}
			
	}
	
	public void dispense() {
		if(state==HAS_QUARTER) {
			System.out.println("No gumball dispensed");
		} else if(state == NO_QUARTER) {
			System.out.println("You need to pay first");
		} else if(state==SOLD_OUT) {
			System.out.println("No gumball dispensed");
		} else if(state == SOLD) {
			System.out.println("A gumball comes rolling down");
			count--;
			
			if(count == 0) {
				System.out.println("Oops, out of gumballs!");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		}
	}
	
	public String toString() {
		String result = "\nGumball machine:\n";
		
		result += "Inventory " + count + " gumball(s)\n";
		
		if(state==HAS_QUARTER) {
			result +="quarter inserted\n";
		} else if(state == NO_QUARTER) {
			result +="waiting for a quarter\n";
		} else if(state==SOLD_OUT) {
			result +="machine is sold out\n";
		} else if(state == SOLD) {
			result +="A gumball was purchased\n";
		}
		
		return result;
	}
}
