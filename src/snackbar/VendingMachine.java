package snackbar;

class VendingMachine
{
  private static int maxId = 0;
  private int id;
  private String name;

  public VendingMachine(String name)
  {
    maxId++;
    id = maxId;
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public void SetName(String name)
  {
    this.name = name;
  }

  public int getId()
  {
    return id;
  }

}
