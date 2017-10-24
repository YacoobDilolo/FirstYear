public class Student{
   private String firstName;
   private String middleName;
   private String lastName;

   public void setNames(String first, String middle, String last){
      firstName = first;
      middleName = middle;
      lastName = last;
   // Set the first, middle and last names of this Student object.
   }
    
   public String getFullName(){
      return (firstName+" "+middleName.substring(0,1)+". "+lastName);
   // Obtain the full name of this Student with the middle name converted to an initial only.
   }
}