
public abstract class Robot {
	protected String name;
	MoveBehavior moveBehavior;
	TalkBehavior talkBehavior;
	
	public Robot(String name)
	{
		this.name = name;
	}
	
	public abstract String toString(); 
	
	public String move()
	{
		return moveBehavior.move(); 
	}
	public String talk()
	{
		return talkBehavior.talk();
	}
	public void setMoveBehavior(MoveBehavior mb) 
	{
		moveBehavior= mb;
	}
	public void setTalkBehavior(TalkBehavior tb)
	{
		talkBehavior = tb;
	}
	
}
