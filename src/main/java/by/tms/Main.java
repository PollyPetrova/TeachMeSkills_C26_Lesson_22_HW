package by.tms;

import by.tms.console.ConsoleApplication;
import by.tms.web.WebApplication;

import java.io.IOException;


public class Main {
	public static void main(String[] args) {
		Application application = new WebApplication();
		application.run();
	}
}
