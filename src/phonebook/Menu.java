package phonebook;

import java.util.Scanner;

public class Menu {
	boolean exit;
	boolean exit1;
	private Scanner sc;
	public String fn; // add
	private String ln; // add
	private long fix; // add
	private long nr; // add
	private String ml; // add
	private int yn;// add
	private Scanner pl;
	private String dln; // delete
	private String dfn; // delete
	private int fnl; // search
	private String who; // search
	private String modp; // modify
	private String modn;// modify
	private int nr1; // modify

	public void runMenu() {
		while (!exit) {
			exit1 = false;

			printHeader();
			printMenu();
			int choice = getInput();
			if (!exit1)
				read(choice);
		}

	}

	int getInput() {

		sc = new Scanner(System.in);

		int choice = -1;
		while (choice < 0 || choice > 5)
			try {
				System.out.print("\nEnter your choice:");
				choice = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Please try again");
			}
		return choice;
	}

	private void printSearch() {
		System.out.println("1) First Name");
		System.out.println("2) Last name");
		System.out.println("3) Fix number");
		System.out.println("4) Phone number");
		System.out.println("5) Mail");
	}

	private void printHeader() {
		System.out.println("      My Contact       ");
		System.out.println("    Book Application    \n");

	}

	private void printMenu() {
		System.out.println("1) Add contacts");
		System.out.println("2) Delete contacts");
		System.out.println("3) Modify contacts");
		System.out.println("4) Search");
		System.out.println("0) Exit");
	}

	public void printAdd() {
		InsertApp app = new InsertApp();

		// READ FROM KEYBOARD
		pl = new Scanner(System.in);
		System.out.println("First Name:");
		fn = pl.nextLine();
		System.out.println("Last name:");
		ln = pl.nextLine();
		System.out.println("Fix number:");
		fix = pl.nextLong();
		System.out.println("Phone number:");
		nr = pl.nextLong();
		System.out.println("Mail:");
		ml = sc.nextLine();

		System.out.println("\n Do you want to save this contact?(1=YES/0=NO");
		yn = sc.nextInt();
		// SAVE TO DATABASE
		if (yn == 1)
			app.insert(fn, ln, fix, nr, ml);

	}

	private void read(int choice) {

		switch (choice) {
		case 1:
			printAdd();
			if (yn == 1) {
				exit1 = true;
				break;
			} else if (yn == 0)
				break;
		case 2:
			Delete dl = new Delete();
			Select sl = new Select();
			pl = new Scanner(System.in);

			System.out.println("\n Who do you want to remove from contacts?:");
			sl.selectAll();
			System.out.println("First Name: ");
			dfn = sc.nextLine();
			System.out.println("Last Name: ");
			dln = sc.nextLine();
			System.out.println("\nAre you sure you want to remove " + ln + " from contacts?(1=YES/0=NO):");
			yn = sc.nextInt();
			if (yn == 1) {
				dl.delete1(dfn, dln);
				System.out.println("\n Contact deleted!");
				
				break;
			} else if (yn == 0)
			{	
				System.out.println("\n Something went wrong!Try again!");

				break;
			}
			case 3:
			
			Select sl1 = new Select();
			Modify mod = new Modify();
			pl = new Scanner(System.in);

			System.out.println("\nWho do you want to modify from contacts?:");
			sl1.selectAll();
			System.out.println("Last Name: ");
			modn = pl.nextLine();
			System.out.println("\nwhat do you want to modify to " + modn + " contact info?");
			printSearch();

			nr1 = pl.nextInt();

			System.out.println("Type new: ");
			modp = sc.nextLine();
			mod.modify1(modn, modp, nr1);

			break;
		case 4:
			Search src = new Search();
			System.out.println("\nBy what would you like to search?");
			printSearch();
			fnl = sc.nextInt();
			if (fnl == 1 || fnl == 2) {
				System.out.println("\nInsert name:");
				who = sc.next();
			} else if (fnl == 3 || fnl == 4) {
				System.out.println("\nInsert number: ");
				who = sc.next();
			}

			else if (fnl == 5) {
				System.out.println("\nInsert adress");
				who = sc.next();
			}

			src.select1(fnl, who);

			break;
		case 0:
			exit = true;
			System.out.println("Hope it worked and thanks for watching");
			break;
		}

	}
}
