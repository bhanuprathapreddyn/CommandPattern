package command;

import command.commands.DimCommand;
import command.commands.OnOffCommand;
import command.commands.BlinkCommand;

public class Main {

	public static void main(String[] args) {

		HolidayLight holidayLight = new HolidayLight(true, 25);

		OnOffCommand onOffCommand = new OnOffCommand(holidayLight);
		DimCommand dimCommand = new DimCommand(holidayLight);
		BlinkCommand blinkCommand = new BlinkCommand(holidayLight);


		Command command = new Command(onOffCommand, dimCommand, blinkCommand);

		System.out.println(holidayLight);
		System.out.println();

		command.setCommand("on");
		System.out.println(holidayLight);
		System.out.println();

		command.setCommand("dimDown");
		System.out.println(holidayLight);
		System.out.println();

		command.setCommand("off");
		System.out.println(holidayLight);
		System.out.println();

		command.setCommand("on");
		System.out.println(holidayLight);
		System.out.println();

		command.setCommand("dimUp");
		System.out.println(holidayLight);
		System.out.println();

		command.setCommand("blinkRight");
		System.out.println(holidayLight);
		System.out.println();

		command.setCommand("blinkLeft");
		System.out.println(holidayLight);
		System.out.println();

		command.setCommand("dimDown");
		System.out.println(holidayLight);
		System.out.println();

		command.setCommand("off");
		System.out.println(holidayLight);
		System.out.println();

	}

}
