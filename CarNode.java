/* Decompiler 2ms, total 70ms, lines 33 */
package lab7;

public class CarNode {
   public Car car;
   public CarNode next;

   public CarNode(Car carIns) {
      this.car = carIns;
      this.next = null;
   }

   public CarNode(Car carIns, CarNode next) {
      this.car = carIns;
      this.next = next;
   }

   public Car getCar() {
      return this.car;
   }

   public CarNode next() {
      return this.next;
   }

   public void setCar(Car carIns) {
      this.car = carIns;
   }

   public void setNext(CarNode next) {
      this.next = next;
   }
}
