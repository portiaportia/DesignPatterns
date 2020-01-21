
public class WallERobot extends Robot{
	public WallERobot(String name)
	{
		super(name);
		moveBehavior = new WalkBehavior();
		talkBehavior = new SimpleSpeakBehavior();
	}
	public String toString()
	{
		return name + " is an environmentally friendly Wall-E Robot";
	}
}
