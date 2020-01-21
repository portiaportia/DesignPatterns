import java.util.Random;

public class SimpleSpeakBehavior implements TalkBehavior{
	String[] randSSB = {"Wall-E","EVA!","Pop","Eva?","Eee-va?"};

	public String talk()
	{
		Random r = new Random();
		return randSSB[r.nextInt(randSSB.length)];
	}

}
