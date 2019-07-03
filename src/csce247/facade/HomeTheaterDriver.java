package csce247.facade;

public class HomeTheaterDriver {
	public static void main(String[] args) {
		
		Amplifier amp = new Amplifier("Amplifier");
		Tuner tuner = new Tuner("Tuner", amp);
		DVDPlayer dvd = new DVDPlayer("DVD Player", amp);
		CDPlayer cd = new CDPlayer("CD Player", amp);
		Projector projector = new Projector("Projector", dvd);
		TheaterLights lights = new TheaterLights("Ceiling Lights");
		Screen screen = new Screen("Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
 
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, 
																projector, screen, lights, popper);
 
		homeTheater.watchMovie("Jurassic Park");
		homeTheater.endMovie();
	}
}
