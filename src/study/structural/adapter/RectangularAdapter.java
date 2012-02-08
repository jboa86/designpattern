package study.structural.adapter;

public class RectangularAdapter extends CylindricalSocket {

	public String adapt(String rectaStem1, String rectaStem2) {
		
		// some conversion logic
		String cylinStem1 = rectaStem1;
		String cylinStem2 = rectaStem2;
		
		return supply(cylinStem1, cylinStem2);
	}

}
