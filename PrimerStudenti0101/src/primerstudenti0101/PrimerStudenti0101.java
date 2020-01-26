
package primerstudenti0101;

/**
 *
 * @author User
 */
public class PrimerStudenti0101 {

    public static void main(String[] args) {
       Student s1 = new Student("Vladan", "Cupric","mm16001", 9.13);
       Student s2 = new Student("Aleksandar", "Pljakic","ai18022", 6.43);
       Student s3 = new Student("Zvezdan", "Katic","ml13551", 7.73);
       
       Student []studenti = {s1,s2,s3};
       for(Student student:studenti){
           System.out.println(student + " ");
       }
       s3.toString();
        System.out.println(s3.toString());
        System.out.println(s3.getPrezime());
        System.out.println(s3.getSmer());
    }
    
}
