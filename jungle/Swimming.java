package jungle;

public class Swimming extends Animal {
  private String whereCome;

  public Swimming(String name, Specie specie, Song song, String whereCome) {
    super(name, specie, song);
    this.whereCome = whereCome;
  }

  public String getWhereCome() {
    return whereCome;
  }

  public void setWhereCome(String whereCome) {
    this.whereCome = whereCome;
  }

  public String toString() {
    return "Name: " + this.name 
      + "\nSpecie: " + this.specie.getName() 
      + "\nNeeds: " + this.specie.getNeeds() 
      + "\nSong: " + this.song.getName() 
      + "\nCome from: " + this.whereCome + "\n";
  }
}