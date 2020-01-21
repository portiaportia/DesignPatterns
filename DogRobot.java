
public class DogRobot extends Robot{
	public DogRobot(String name)
	{
		super(name);
		moveBehavior = new CrawlBehavior();
		talkBehavior = new BarkBehavior();
	}
	public String toString()
	{
		return name + " is a happy Dog Robot";
	}
}
