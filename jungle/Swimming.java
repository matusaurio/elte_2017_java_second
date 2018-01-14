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
    return this.name + "\n" + this.specie.getName() + "\n" + this.specie.getNeeds() + "\n" + this.song.getName() + "\n" + this.whereCome;
  }
}