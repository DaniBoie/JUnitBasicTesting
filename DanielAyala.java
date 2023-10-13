import java.lang.Math;

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
    shift = Math.floorMod(shift, name.length());
    var rotatedName = name.substring(shift) + name.substring(0, shift);
    return rotatedName;
  }

}
