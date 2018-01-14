package jungle;

public class Flying extends Animal {
  private double wingsExtension;

  public Flying(String name, Specie specie, Song song, double wingsExtension) {
    super(name, specie, song);
    this.wingsExtension = wingsExtension;
  }

  public double getWingsExtension() {
    return wingsExtension;
  }

  public void setWingsExtension(double wingsExtension) {
    this.wingsExtension = wingsExtension;
  }

  public String toString() {
    return this.name + "\n" + this.specie.getName() + "\n" + this.specie.getNeeds() + "\n" + this.song.getName() + "\n" + this.wingsExtension;
  }

}