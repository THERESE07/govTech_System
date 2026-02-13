import java.util.Scanner;

public class Citizen extends GovernmentService {
    private String email;
    private int phoneNumber;
    private String password;
    private String confirmPassword;

    private String mutuel;
    private String  certificateOfBeingAlive;

   private int id;

    public Citizen(){

    }

    public Citizen(String email, int phoneNumber, String password, String confirmPassword){
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.confirmPassword = confirmPassword;

    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setEmail(String email){
        this.email = email;
    }



    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword){
        this.confirmPassword = confirmPassword;
    }


    public void setMutuel(String mutuel){
        this.mutuel = mutuel;
    }

    public String getMutuel(){
        return  mutuel;
    }

    public String getCertificateOfBeingAlive(){
        return  mutuel;
    }

    public void setCertificateOfBeingAlive(String certificateOfBeingAlive){
        this.certificateOfBeingAlive = certificateOfBeingAlive;
    }

    public String setCertificateOfBeingAlive(){
        return certificateOfBeingAlive;
    }

    public String signUp(){
        return "You have Successfully Signed up";

    }

    public String login(){
        return "You have successfully Logged in";


    }


    @Override
    public String mutuelService() {
        System.out.println("Here You can pay the mutuel Service by paying 3000frw here on website ");
        if(id != 0 && mutuel == null ){
            return "Start Application";
        }
        return "";
    }

    @Override
    public String certificateOfBeingAliveService() {
        System.out.println("Here You can pay the Certificate of Being Alive Service by paying 3000frw here on website ");
        if(id != 0 && certificateOfBeingAlive == null ){
            return "Start Application";
        }
        return "";
    }


}
