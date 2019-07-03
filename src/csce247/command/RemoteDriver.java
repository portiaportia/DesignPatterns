package csce247.command;

public class RemoteDriver {
	
	public static void main(String[] args) {
		Remote remote = new Remote();
		
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		GarageDoorOpenCommand garageOpenCommand = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageCloseCommand = new GarageDoorCloseCommand(garageDoor);
		
		remote.setCommand(0, lightOnCommand, lightOffCommand);
		remote.setCommand(1,  garageOpenCommand, garageCloseCommand);
		
		System.out.println(remote);
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
	}
}
