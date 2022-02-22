/* Decompiler 2ms, total 74ms, lines 18 */
package lab7;

public class CarTest {
   public static void main(String[] args) {
      CarList clst = new CarList();
      clst.addToEnd(new Car("Ford", "Fusion", 2005));
      clst.addToEnd(new Car("Nissan", "Altima", 1988));
      clst.addToFront(new Car("Toyota", "Camry", 2018));
      clst.addToFront(new Car("Cheverolet", "Spark", 2016));
      System.out.println(clst.contains(new Car("Toyota", "Camry", 2018)));
      System.out.println(clst.delete(new Car("Toyota", "Camry", 2018)));
      clst.delete(new Car("Nissan", "Murano", 1988));
      System.out.println("");
      System.out.print("List Elements:");
      System.out.println(clst);
   }
}
