package jungle;

public class Specie {
  private String name;
  private String needs;

  public Specie() {
  }

  public Specie(String name, String needs) {
    this.name = name;
    this.needs = needs;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNeeds() {
    return needs;
  }

  public void setNeeds(String needs) {
    this.needs = needs;
  }
}