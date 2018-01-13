package jungle;

public class Land extends Animal {
  private int paws;

  public Land(String name, Specie specie, Song song, int paws){
    super(name, specie, song);
    this.paws = paws;
  }

  public int getPaws() {
    return paws;
  }

  public void setPaws(int paws) {
    this.paws = paws;
  }
  
}