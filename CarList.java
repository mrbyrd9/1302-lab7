/* Decompiler 7ms, total 85ms, lines 86 */
package lab7;

import java.util.LinkedList;

public class CarList {
   CarNode front = null;
   LinkedList<Car> clst = new LinkedList();

   public void addToEnd(Car carIns) {
      CarNode tempNode = new CarNode(carIns);
      CarNode current = this.front;
      if (this.front == null) {
         this.front = tempNode;
      } else {
         while(true) {
            if (current.next == null) {
               current.next = tempNode;
               break;
            }

            current = current.next;
         }
      }

   }

   public void addToFront(Car carIns) {
      if (this.front == null) {
         this.front = new CarNode(carIns);
      } else {
         CarNode tempNode = new CarNode(carIns);
         tempNode.next = this.front;
         this.front = tempNode;
      }

   }

   public boolean contains(Car carIns) {
      boolean found = false;

      for(CarNode current = this.front; current != null; current = current.next) {
         if (current.car.equals(carIns)) {
            return true;
         }
      }

      return found;
   }

   public boolean delete(Car carIns) {
      boolean found = false;
      if (this.front != null) {
         CarNode current = this.front;

         for(CarNode temp = null; current != null; current = current.next) {
            if (current.car.equals(carIns)) {
               if (temp == null) {
                  this.front = this.front.next;
                  return true;
               }

               temp.next = current.next;
               return true;
            }

            temp = current;
         }
      }

      return false;
   }

   public String toString() {
      String myString = "";

      for(CarNode current = this.front; current != null; current = current.next) {
         myString = myString + current.car + "\n";
      }

      return myString;
   }

   public static void main(String[] args) {
   }
}
