package Quetion_1;

public class Piano extends Instrument {
	private String sound;

	public Piano(String sound) {
		super();
		this.sound = sound;
	}
	@Override
	public void play()
	{
		System.out.println("Piano is playing "+sound);
	}

}
