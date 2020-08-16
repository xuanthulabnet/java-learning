public class Student {

  private String Name;
  private int Age;

  public Student(String name) {
      this.Name = name;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    this.Name = name;
  }

  public void setAge(int age) {
      this.Age = age;
  }

  public int getAge() {
      return this.Age;
  }
}