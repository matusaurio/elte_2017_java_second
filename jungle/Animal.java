package jungle;

public abstract class Animal {
  public String name;
  public Specie specie;
  public Song song;

  public Animal(String name, Specie specie, Song song) {
    this.name = name;
    this.specie = specie;
    this.song = song;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Specie getSpecie() {
    return specie;
  }

  public void setSpecie(Specie specie) {
    this.specie = specie;
  }

  public Song getSong() {
    return song;
  }

  public void setSong(Song song) {
    this.song = song;
  }
}