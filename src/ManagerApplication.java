import java.util.ArrayList;

public class ManagerApplication implements ServiceApplication {
    private int payment;
    private int id;

    private String mutuel;
    private String certificateOfBeingAlive;
    private int balance = 100000;

    private Citizen citizen; // remove default new Citizen()

    int sumOfApplication = 0;


    ArrayList<String> applications = new ArrayList<>();


    public ManagerApplication(Citizen citizen) {
        this.citizen = citizen;
    }
    public ManagerApplication(){

    }

    public int setPayment(){
        return payment;
    }

    public void setId( int id){
        this.id = id;
    }

    public void setMutuel( String mutuel){
        this.mutuel = mutuel;
    }

    public void setCertificateOfBeingAlive( String certificateOfBeingAlive){
        this.certificateOfBeingAlive = certificateOfBeingAlive;
    }

    public void setBalance( int balance){
        this.balance= balance;
    }


    @Override
    public void mutuelApplied() {
        if(id == citizen.getId() && mutuel.equals(citizen.getMutuel())){
            payment = 3000;

            if (balance >= payment) {
                balance -= payment;
                System.out.println("You payed 3000");
                applications.add(mutuel);
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Mutuel application not matched");
        }

        System.out.println("Total Of applications: " + applications.size());

    }


    @Override
    public void certificateOfbeingAliveApplied() {
        if (
                certificateOfBeingAlive != null &&
                        citizen.getCertificateOfBeingAlive() != null &&
                        id == citizen.getId() &&
                        certificateOfBeingAlive.equals(citizen.getCertificateOfBeingAlive())
        ) {

            payment = 500;

            if (balance >= payment) {
                balance -= payment;
                System.out.println("You payed 3000");


            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("CertificateOfBeingAlive application not matched");
        }
    }
}
