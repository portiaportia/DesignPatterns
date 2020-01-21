
public class iRobot extends Robot{
	public iRobot(String name)
	{
	super(name);
	moveBehavior = new RunBehavior();
	talkBehavior= new SpeakBehavior();
	}
	public String toString()
	{
	return name + " is a scary iRobot!!!";
	}

}
