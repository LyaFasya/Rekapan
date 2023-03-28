
package inheritance;

public class Managerr extends Employee {
    int nip = 64573899;
    String name = "BELLAAA";
    String status = "Menikah";
    String jobdesk = "Manager";
    int timehours = 7;
    double potongan;
    double bonus = 2000000;
    
    public void asyaa(){
        System.out.println("NIP : "+ nip +"\nNama : "+ name +"\nStatus : "+ status +"\nJobdesk : "+ jobdesk+ "\nJam Kerja : "
                            + timehours +" jam"+ "\nGaji Awal: "+salary);
        ngecek ();
        menggaji ();
        System.out.println("\nBonus : "+ bonus +"\nPotongan : -"+ potongan +"\nTotal Gaji : "+ salary);
    }
    
    public void ngecek (){
        if (status.equalsIgnoreCase("Menikah")) {
            bonus += 1000000;
        }
        else {
            bonus += 0;
        }
        
        if (timehours < 8) {
            int asya = 8 - timehours;
            asya *= 50000;
            potongan += asya;
        }
        else {
            potongan += 0;
        }
    }
    
    public void menggaji (){
        salary += bonus;
        salary -= potongan;
    }
}
