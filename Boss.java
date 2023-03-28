
package inheritance;

public class Boss extends Employee {
    int nip = 65783462;
    String name = "FASYAAA";
    String status = "Menikah";
    String jobdesk = "Boss Besarrr";
    int timehours = 11;
    double potongan;
    double bonus = 1000000;
    
    public void syaa(){
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
