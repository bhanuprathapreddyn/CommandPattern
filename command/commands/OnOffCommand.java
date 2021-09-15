package command.commands;

import command.InterfaceCommand;
import command.HolidayLight;

public class OnOffCommand implements InterfaceCommand {

	private HolidayLight holidayLight;

	public OnOffCommand(HolidayLight holidayLight) {
		this.holidayLight = holidayLight;
	}

	@Override
	public void up() {
		holidayLight.lightsOn();
	}

	@Override
	public void down() {
		holidayLight.lightsOff();
	}

}
