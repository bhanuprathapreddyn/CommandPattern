package command;

public class HolidayLight {

	private boolean switchedOn;
	private int dim;

	public HolidayLight(boolean switchedOn, int dim) {
		this.switchedOn = switchedOn;
		this.dim = dim;
	}

	public void lightsOn() {
		this.switchedOn = true;
		System.out.println("lights are on");
	}

	public void lightsOff() {
		this.switchedOn = false;
		System.out.println("lights are off");
	}

	public void lightDimUp() {
		this.dim += 5;
		System.out.println("light intensity increased");
	}

	public void lightDimDown() {
		this.dim -= 10;
		System.out.println("light intensity decreased");
	}
	public void blinkRight() {
		System.out.println("lights blinking right");
	}
	public void blinkLeft() {
		System.out.println("lights blinking left");
	}

	@Override
	public String toString() {
		return "HolidayLight [status=" + switchedOn + ", intensity=" + dim + "]";
	}

}
