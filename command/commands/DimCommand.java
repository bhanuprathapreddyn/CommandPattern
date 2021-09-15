package command.commands;

import command.InterfaceCommand;
import command.HolidayLight;

public class DimCommand implements InterfaceCommand {

	private HolidayLight holidayLight;

	public DimCommand(HolidayLight holidayLight) {
		this.holidayLight = holidayLight;
	}

	@Override
	public void up() {
		holidayLight.lightDimUp();
	}

	@Override
	public void down() {
		holidayLight.lightDimDown();
	}

}
