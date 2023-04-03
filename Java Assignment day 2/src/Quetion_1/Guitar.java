package Quetion_1;

public class Guitar extends Instrument{
	private String sound;

	public Guitar(String sound) {
		super();
		this.sound = sound;
	}
	
	public void play()
	{
		System.out.println("Guitar is playing "+sound);
	}

}
