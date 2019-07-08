package csce247.state;

public class SoldState implements State {
	private GumballMachine machine;
	
	public SoldState(GumballMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");		
	}

	@Override
	public void turnCrank() {
		System.out.println("turning twice doesn't get you another gumball!");		
	}

	@Override
	public void dispense() {
		machine.releaseBall();
		
		if(machine.getCount() > 0) {
			machine.setState(machine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of gumballs");
			machine.setState(machine.getSoldOutState());
		}
	}

	
}
