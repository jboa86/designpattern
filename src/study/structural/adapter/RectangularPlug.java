package study.structural.adapter;

public class RectangularPlug {
	
	private String rectaStem1;
	private String rectaStem2;

	public void getPower() {
		RectangularAdapter adapter = new RectangularAdapter();
		String power = adapter.adapt(rectaStem1, rectaStem2);
		System.out.println(power);
	}

}
