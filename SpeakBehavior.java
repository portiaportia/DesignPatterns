import java.util.Random;

public class SpeakBehavior implements TalkBehavior{
	
	String[] randSB = {"Hello","How are you","Good Day"};

	public String talk()
	{
		Random r = new Random();
		return randSB[r.nextInt(randSB.length)];
	}
}
