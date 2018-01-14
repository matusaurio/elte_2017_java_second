package jungle;

import java.util.ArrayList;
import java.util.Random;
import java.io.*;

public class Party implements Actions {
  public ArrayList<Animal> guests;
  public ArrayList<Song> songs;
  public ArrayList<Song> playedSongs;

  public Party() {
    guests = new ArrayList<Animal>();
    songs = new ArrayList<Song>();
    playedSongs = new ArrayList<Song>();
  }

  public ArrayList<Animal> getGuests() {
    return guests;
  }

  public void setGuests(ArrayList<Animal> guests) {
    this.guests = guests;
  }

  /* Register Guest */
  @Override
  public void addGuest(Animal guest) {
    guests.add(guest);
    songs.add(guest.getSong());
  }

  /* Remove Guest */
  @Override
  public boolean removeGuest(String guest) {
    for (int i = 0; i < guests.size(); i++) {
      Animal a = guests.get(i);
      if (a.getName().equalsIgnoreCase(guest)) {
        guests.remove(i);
        return true;
      }
    }
    return false;
  }

  /* Check unique name */
  public boolean checkName(String name) {
    for (Animal a : guests) {
      if (a.getName().equalsIgnoreCase(name)) {
        return false;
      }
    }
    return true;
  }

  /* Check Guest List */
  public boolean checkGuestByName(String name) {
    for (int i = 0; i < guests.size(); i++) {
      Animal a = guests.get(i);
      if (a.getName().equalsIgnoreCase(name)) {
        return true;
      }
    }
    return false;
  }

  /* Animal Needs by Name */
  public void checkNeedsByName(String name) {
    for (int i = 0; i < guests.size(); i++) {
      Animal a = guests.get(i);
      if (a.getName().equalsIgnoreCase(name)) {
        System.out.println("Needs by name:");
        System.out.println(a.getSpecie().getNeeds());
      }
    }
  }

  /* Animal Needs by Specie */
  public void checkNeedsBySpecie(String specie) {
    for (int i = 0; i < guests.size(); i++) {
      Animal a = guests.get(i);
      if (a.getSpecie().getName().equalsIgnoreCase(specie)) {
        System.out.println("Needs by specie:");
        System.out.println(a.getSpecie().getNeeds());
      }
    }
  }

  /* Generate random number */
  private int getRandomInt() {
    Random rand = new Random();
    return rand.nextInt(songs.size());
  }

  /* Pick a Song */
  public void pickRandomSong() {
    if (!songs.isEmpty()) {
      int index = getRandomInt();
      Song pickedSong = songs.get(index);
      songs.remove(index);
      playedSongs.add(pickedSong);
      System.out.println(pickedSong.getName() + " was played.");
    } else {
      System.out.println("There is no more songs in the playlist.");
    }
  }

  /* List Played Songs */
  public void checkPlayedSongs() {
    if (!playedSongs.isEmpty()) {
      for (Song s : playedSongs) {
        System.out.println(s.getName());
      }
    } else {
      System.out.println("There is not played songs.");
    }
  }

  /* List all guests */
  public void printAll() {
    System.out.println("\nList of guests");
    for (Animal g : guests) {
      System.out.println(g.getName());
    }
  }

  /* File Input Stream */
  public void readFile() throws FileNotFoundException {
    InputStream in = new FileInputStream("input.txt");
    BufferedReader reader = new BufferedReader(new InputStreamReader(in));

    ArrayList<String> inputArray = new ArrayList<String>();
    String line = null;

    try {
      while ((line = reader.readLine()) != null) {
        inputArray.add(line);
      }
    } catch (IOException e) {
      e.getMessage();
    } finally {
      try {
        reader.close();
      } catch (IOException e) {
        e.getMessage();
      }
    }
    System.out.println("File readed.");
    // System.out.println(inputArray.toString());
  }

  /* File Output Stream */
  public void saveFile() throws FileNotFoundException {
    PrintWriter pw = new PrintWriter(new FileOutputStream("output.txt"));
    try {
      for (Animal a : guests) {
        pw.println(a.toString());
      }
    } catch (Exception e) {
      e.getMessage();
    } finally {
      try {
        pw.close();
      } catch (Exception e) {
        e.getMessage();
      }
    }
    System.out.println("File saved.");
  }
}