package csce247.command;

public class GarageDoorCloseCommand implements Command {
	private GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.down();
		garageDoor.lightOff();
	}
	
	public String getName() {
		return "Garage Door Close";
	}
}
