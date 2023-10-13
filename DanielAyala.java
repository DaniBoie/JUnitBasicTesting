
public class DanielAyala {

  String getFullName() {
    return "Daniel Ayala";
  }

  String getFirstName() {
    return "Daniel";
  }

  String getLastName() {
    return "Ayala";
  }

  String getUCInetID() {
    return "djayala1";
  }

  int getStudentNumber() {
    return 28399460;
  }

  String getRotatedFullName(int shift) {
    var name = getFullName();
    // if (shift >= 0) {
      System.out.println(name.substring(0, -2));
    // } else {

    // }
    return "";
  }

}