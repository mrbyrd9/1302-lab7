/* Decompiler 6ms, total 83ms, lines 66 */
package lab7;

public class Car implements Comparable<Car> {
   public String make;
   public String model;
   public int year;

   public Car(String mk, String mdl, int yr) {
      this.make = mk;
      this.model = mdl;
      this.year = yr;
   }

   public void setYear(int yr) {
      this.year = yr;
   }

   public void setMake(String mk) {
      this.make = mk;
   }

   public void setModel(String mdl) {
      this.model = mdl;
   }

   public String getMake() {
      return this.make;
   }

   public String getModel() {
      return this.model;
   }

   public int getYear() {
      return this.year;
   }

   public String toString() {
      String myString = " Make: " + this.make + " Model: " + this.model + " Year: " + this.year;
      return myString;
   }

   public boolean equals(Car carIns) {
      boolean equals = false;
      if (this.getMake() == carIns.getMake() && this.getModel() == carIns.getModel()) {
         if (this.getYear() == carIns.getYear()) {
            equals = true;
         }
      } else {
         equals = false;
      }

      return equals;
   }

   public int compareTo(Car o) {
      return 0;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public int compareTo(Object var1) {
      return this.compareTo((Car)var1);
   }
}
