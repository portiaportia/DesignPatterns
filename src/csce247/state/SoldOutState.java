package csce247.state;

public class SoldOutState implements State {
	private GumballMachine machine;
	
	public SoldOutState(GumballMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You can't insert a quarter.  The machine is sold out");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");		
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there was no gumball");		
	}

	@Override
	public void dispense() {
		System.out.println("turning twice doesn't get you another gumball!");
	}

	
}
