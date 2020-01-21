
public class HumanRobot extends Robot{
	public HumanRobot(String name)
	{
		super(name);
		moveBehavior= new WalkBehavior();
		talkBehavior= new SpeakBehavior();
	}
	public String toString() {
		return name + " is a typical human robot";
	}

}
