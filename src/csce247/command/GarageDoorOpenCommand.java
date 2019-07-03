package csce247.command;

public class GarageDoorOpenCommand implements Command {
	private GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.up();
		garageDoor.lightOn();
	}
	
	public String getName() {
		return "Garage Door Open";
	}
}
