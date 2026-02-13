import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Citizen citizen1 = new Citizen();
        ManagerApplication application1 = new ManagerApplication(citizen1);
        int[] array = new int[100];

        boolean isregistered = true;

        int inputNumber = 0;
        System.out.print("Enter Your Id: ");
        int id = scanner.nextInt();
        citizen1.setId(id);

        scanner.nextLine();

        System.out.print("Enter Your email: ");
        String email = scanner.nextLine();
        citizen1.setEmail(email);

        System.out.print("Enter Your phoneNumber: ");
        int phoneNumber = scanner.nextInt();
        citizen1.setPhoneNumber(phoneNumber);

        scanner.nextLine();

        System.out.print("Enter Your Password: ");
        String password = scanner.nextLine();
        citizen1.setPassword(password);

        System.out.print("Confirm Password: ");
        String confirmPassword = scanner.nextLine();
        citizen1.setConfirmPassword(confirmPassword);

        if (!isregistered) {
            if (email != null && phoneNumber != 0 && confirmPassword.equals(password) && password != null && confirmPassword != null) {

                System.out.println(citizen1.signUp());
            } else {
                System.out.println("Enter again Your credentials");

                System.out.print("Enter Your Id: ");
                id = scanner.nextInt();
                citizen1.setId(id);

                scanner.nextLine();

                System.out.print("Enter Your email: ");
                email = scanner.nextLine();
                citizen1.setEmail(email);

                System.out.print("Enter Your phoneNumber: ");
                phoneNumber = scanner.nextInt();
                citizen1.setPhoneNumber(phoneNumber);

                scanner.nextLine();

                System.out.print("Enter Your Password: ");
                password = scanner.nextLine();
                citizen1.setPassword(password);

                System.out.print("Confirm Password: ");
                confirmPassword = scanner.nextLine();
                citizen1.setConfirmPassword(confirmPassword);
                System.out.println(citizen1.signUp());
            }

        } else {
            for (int i = 0; i <= array.length; i++) {
                if (email != null && phoneNumber != 0 && password != null) {
                    System.out.println(citizen1.login());

                    System.out.println("1. Pay mutuel");
                    System.out.println("2. Pay Certificate Of Being Alive");
                    System.out.print("Choose a number: ");
                    inputNumber = scanner.nextInt();
                    scanner.nextLine();
                    if (inputNumber == 1) {


                        System.out.println(citizen1.mutuelService());
                        System.out.print("Enter Your MutuelApplication: ");
                        String mutuel = scanner.nextLine();
                        citizen1.setMutuel(mutuel);

                        application1.setId(citizen1.getId());
                        application1.setMutuel(citizen1.getMutuel());

                        application1.mutuelApplied();


                    } else {
                        System.out.println(citizen1.certificateOfBeingAliveService());

                        System.out.print("Enter Your Certificate of Being Alive Application: ");
                        String certificateOfBeingAlive = scanner.nextLine();
                        citizen1.setCertificateOfBeingAlive(certificateOfBeingAlive);

                        application1.setId(citizen1.getId());
                        application1.setCertificateOfBeingAlive(citizen1.getCertificateOfBeingAlive());

                        application1.certificateOfbeingAliveApplied();
                    }


                } else {
                    for (i = 0; i <= array.length; i++) {
                        System.out.println("Enter again Your email and Password");

                        System.out.print("Enter Your Id: ");
                        id = scanner.nextInt();
                        citizen1.setId(id);

                        System.out.print("Enter Your email: ");
                        email = scanner.nextLine();
                        citizen1.setEmail(email);

                        System.out.print("Enter Your Password: ");
                        password = scanner.nextLine();
                        citizen1.setPassword(password);
                        System.out.println(citizen1.login());


                        System.out.println("1. Pay mutuel");
                        System.out.println("2. Pay Certificate Of Being Alive");
                        System.out.print("Choose a number: ");
                        inputNumber = scanner.nextInt();
                        scanner.nextLine();
                        if (inputNumber == 1) {
                            System.out.println(citizen1.mutuelService());

                            System.out.print("Enter Your MutuelApplication: ");
                            String mutuel = scanner.nextLine();
                            citizen1.setMutuel(mutuel);

                            application1.setId(citizen1.getId());
                            application1.setMutuel(citizen1.getMutuel());

                            application1.mutuelApplied();

                        } else {
                            System.out.println(citizen1.certificateOfBeingAliveService());
                            System.out.print("Enter Your Certificate of Being Alive Application: ");
                            String certificateOfBeingAlive = scanner.nextLine();
                            citizen1.setCertificateOfBeingAlive(certificateOfBeingAlive);

                            application1.setId(citizen1.getId());
                            application1.setCertificateOfBeingAlive(citizen1.getCertificateOfBeingAlive());

                            application1.certificateOfbeingAliveApplied();
                        }
                    }
                }
            }

        }


    }
}





