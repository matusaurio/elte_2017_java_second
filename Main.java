import java.util.Scanner;

import jungle.*;

public class Main {
  public static Party party = new Party();

  public static void main (String args[]) {

    Scanner sc = new Scanner(System.in);

    int in = 0;
    int input = 0;

    while(in != 4) {
      in = roleMenu();
      switch (in) {
      case 1:
        System.out.println("\nHi Mufasa...");
        while(input != 8) {
          input = mainMenu();
          switch(input) {
            case 1:
              System.out.println("### Register Guest ###");
              System.out.print("Name: ");
              String name = sc.next();
              System.out.print("Specie: ");
              String specie = sc.next();
              System.out.print("Special needs for the specie: ");
              String needs = sc.next();
              System.out.print("Song: ");
              String song = sc.next();
              System.out.println("Arrival mode: ");
              System.out.println("1. Flying");
              System.out.println("2. Swimming");
              System.out.println("3. Land");
              int arrival = sc.nextInt();
              if (arrival == 1) {
                System.out.print("Enter the extension of its wings: ");
                double wingsExtension = sc.nextDouble();
                registerFlyingGuest(name, specie, needs, song, wingsExtension);
              } else if (arrival == 2) {
                System.out.print("Where do you come from (sea or river): ");
                String whereCome = sc.next();
                registerSwimmingGuest(name, specie, needs, song, whereCome);
              } else if (arrival == 3) {
                System.out.print("Number of paws: ");
                int paws = sc.nextInt();
                registerLandGuest(name, specie, needs, song, paws);
              }
              break;
            case 2:
              System.out.println("### Remove Guest ###");
              System.out.print("Enter the name of the guest to remove: ");
              String remove = sc.next();
              party.removeGuest(remove);
              System.out.println(remove + " was removed.");
              break;
            case 3:
              System.out.println("### Pick a Song ###");
              System.out.println("You are not allowed to perform this action.");
              break;
            case 4:
              System.out.println("### List Played Songs ###");
              System.out.println("You are not allowed to perform this action.");
              break;
            case 5:
              System.out.println("### Check Guest List ###");
              System.out.println("You are not allowed to perform this action.");
              break;
            case 6:
              System.out.println("### Animal Needs by Name ###");
              System.out.println("You are not allowed to perform this action.");
              break;
            case 7:
              System.out.println("### Animal Needs by Specie ###");
              System.out.println("You are not allowed to perform this action.");
              break;
            case 8:
              break;
          }
        }
        input = 0;
        break;
      case 2: 
        System.out.println("Hi Rafiki...");
        while(input != 8) {
          input = mainMenu();
          switch(input) {
            case 1:
              System.out.println("### Register Guest ###");
              System.out.println("You are not allowed to perform this action.");
              break;
            case 2:
              System.out.println("### Remove Guest ###");
              System.out.println("You are not allowed to perform this action.");
              break;
            case 3:
              System.out.println("### Pick a Song ###");
              System.out.println("You are not allowed to perform this action.");
              break;
            case 4:
              System.out.println("### List Played Songs ###");
              System.out.println("You are not allowed to perform this action.");
              break;
            case 5:
              System.out.println("### Check Guest List ###");
              System.out.print("Enter the name to check: ");
              String check = sc.next();
              if (party.checkGuestByName(check)) {
                System.out.println(check + " is on the list.");
              } else {
                System.out.println(check + " is not on the list.");
              }
              break;
            case 6:
              System.out.println("### Animal Needs by Name ###");
              System.out.print("Enter the name to check: ");
              String needsName = sc.next();
              party.checkNeedsByName(needsName);
              break;
            case 7:
              System.out.println("### Animal Needs by Specie ###");
              System.out.print("Enter the specie name to check: ");
              String needsSpecie = sc.next();
              party.checkNeedsBySpecie(needsSpecie);
              break;
            case 8:
              break;
          }
        }
        input = 0;
        break;
      case 3: 
        System.out.println("Hi Zazu...");
        while(input != 8) {
          input = mainMenu();
          switch(input) {
            case 1:
              System.out.println("### Register Guest ###");
              System.out.println("You are not allowed to perform this action.");
              break;
            case 2:
              System.out.println("### Remove Guest ###");
              System.out.println("You are not allowed to perform this action.");
              break;
            case 3:
              System.out.println("### Pick a Song ###");
              party.pickRandomSong();
              break;
            case 4:
              System.out.println("### List Played Songs ###");
              party.checkPlayedSongs();
              break;
            case 5:
              System.out.println("### Check Guest List ###");
              System.out.println("You are not allowed to perform this action.");
              party.printAll();
              break;
            case 6:
              System.out.println("### Animal Needs by Name ###");
              System.out.println("You are not allowed to perform this action.");
              break;
            case 7:
              System.out.println("### Animal Needs by Specie ###");
              System.out.println("You are not allowed to perform this action.");
              break;
            case 8:
              break;
          }
        }
        input = 0;
        break;
      case 4:
        break;
      }
    }
    
  }

  public static int roleMenu() {
    try {
      System.out.println("------ Jungle Party by The Lion King!!! ------");
      System.out.println("Who are you?");
      System.out.println("1. Mufasa");
      System.out.println("2. Rafiki");
      System.out.println("3. Zazu");
      System.out.println("4. Exit\n");

      System.out.print("Enter an option: ");
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();

      return input;
    } catch(Exception e) {
      System.out.println(e.getMessage());
      return 0;
    }
  }

  public static int mainMenu(){
    try {
      System.out.println("\n------ Main Menu ------");
      System.out.println("Select an option:");
      System.out.println("1. Register guest");
      System.out.println("2. Remove guest");
      System.out.println("3. Pick a song");
      System.out.println("4. List played songs");
      System.out.println("5. Check if an animal is on the guest list");
      System.out.println("6. List animal needs by animal name");
      System.out.println("7. List animal needs by specie name");
      System.out.println("8. Exit\n");

      System.out.print("Enter an option: ");
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();

      return input;
    } catch(Exception e) {
      System.out.println(e.getMessage());
      return 0;
    }
  }

  public static void registerFlyingGuest(String name, String specie, String needs, String song, double wingsExtension){
    Specie sp = new Specie(specie, needs);
    Song sg = new Song(song);
    Animal f = new Flying(name, sp, sg, wingsExtension);
    party.addGuest(f);
    System.out.println(f.getName() + " was added.");
  }
  public static void registerSwimmingGuest(String name, String specie, String needs, String song, String whereCome){
    Specie sp = new Specie(specie, needs);
    Song sg = new Song(song);
    Animal s = new Swimming(name, sp, sg, whereCome);
    party.addGuest(s);
    System.out.println(s.getName() + " was added.");
  }
  public static void registerLandGuest(String name, String specie, String needs, String song, int paws){
    Specie sp = new Specie(specie, needs);
    Song sg = new Song(song);
    Animal l = new Land(name, sp, sg, paws);
    party.addGuest(l);
    System.out.println(l.getName() + " was added.");
  }

}