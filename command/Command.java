package command;

import command.commands.*;

public class Command {

	private InterfaceCommand onOffCommand;
	private InterfaceCommand dimCommand;
	private InterfaceCommand blinkCommand;


	public Command(OnOffCommand onOffCommand, DimCommand dimCommand, BlinkCommand blinkCommand) {
		this.onOffCommand = onOffCommand;
		this.dimCommand = dimCommand;
		this.blinkCommand = blinkCommand;
	}

	public void setCommand(String button) {

		System.out.println("Command : " + button);

		switch (button) {
		case "on"-> this.onOffCommand.up();
		case "off" -> this.onOffCommand.down();
		case "dimUp" -> this.dimCommand.up();
		case "dimDown"-> this.dimCommand.down();
		case "blinkRight" -> this.blinkCommand.up();
		case "blinkLeft"-> this.blinkCommand.down();
		}
	}

}
