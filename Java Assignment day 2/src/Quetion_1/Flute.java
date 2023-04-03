package Quetion_1;

public class Flute extends Instrument {
	
	private String sound;

	public Flute(String sound) {
		super();
		this.sound = sound;
	}
	
	@Override
	public void play()
	{
		System.out.println("Flute is playing "+sound);
	}
	
	

}
