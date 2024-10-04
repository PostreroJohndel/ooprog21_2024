public class BloodData {
   private String bloodType;
   private String rhFactor;
   
   public BloodData() {
        defaultPatient(); //This initializes default values which is in my defaultPatient
    }
   
   //default patient state in number 4
   public void defaultPatient() {
      this.bloodType = "A";
      this.rhFactor = "-";
   }
   
   //My getter for bloodType
   public String getBloodType() {
      return bloodType;
   }
   // this is my setters for bloodType with validation
   public void setBloodType(String bloodType) {
      if (bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("AB") || bloodType.equals("O")) {
         this.bloodType = bloodType;
      } else {
         System.out.println("\tInvalid blood type!!! Please try again.");
      }
   }
   
   //My getter for rhFactor
   public String getRhFactor() {
      return rhFactor;
   }
   
   // this is my setters for rhFactor with validation
   public void setRhFactor(String rhFactor) {
      if (rhFactor.equals("+") || rhFactor.equals("-")) {
          this.rhFactor = rhFactor;
      } else {
          System.out.println("\tInvalid Rh factor!!! Please try again.");
      }
   }

   public void displayBloodInfo() {
      System.out.println("\n\tThe Blood type: " + this.bloodType);   
      System.out.println("\tThe Rh factor: " + this.rhFactor);
      System.out.printf("\tThe result: %s%s", this.bloodType, this.rhFactor);
   }
}
