package csce247.command;

public class Remote {
	private Command[] onCommands;
	private Command[] offCommands;
 
	public Remote() {
		onCommands = new Command[2];
		offCommands = new Command[2];
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
  
	public String toString() {
		String result = "";
		result += "----- Remote Control -----\n";
		
		for(int i = 0; i < onCommands.length; i++) {
			result += "slot " + (i+1) + ": " + onCommands[i].getName() + ", " + offCommands[i].getName()+"\n";
		}

		return result;
	}
}
