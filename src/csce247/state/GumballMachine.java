package csce247.state;

public class GumballMachine {
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	
	private State state;
	int count = 0;
	
	public GumballMachine(int count) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		
		this.count = count;
		
		if(count > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();	
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes rollout out of the slot");
		if(count != 0) {
			count--;
		}
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public int getCount() {
		return count;
	}
	
	public String toString() {
		String result = "\nGumball machine:\n";
		result += "Inventory " + count + " gumball(s)\n";
		return result;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}
	
	public State getNoQuarterState() {
		return noQuarterState;
	}
	
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public State getSoldState() {
		return soldState;
	}
}
