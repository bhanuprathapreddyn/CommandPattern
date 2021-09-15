package command.commands;

import command.HolidayLight;
import command.InterfaceCommand;

public class BlinkCommand implements InterfaceCommand {

    private HolidayLight holidayLight;

    public BlinkCommand(HolidayLight holidayLight) {
        this.holidayLight = holidayLight;
    }

    @Override
    public void up() {
        holidayLight.blinkRight();
    }

    @Override
    public void down() {
        holidayLight.blinkLeft();
    }

}
