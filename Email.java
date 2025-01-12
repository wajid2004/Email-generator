import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = ".aeycompany.com";
    //Constructor to recive the firstName and lastName
    public Email(String firtName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        // Call a method for the department -- return the department;
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine emails to generate an email

        email = firtName.toLowerCase() + " " + lastName.toLowerCase() + "@" + department + companySuffix;


        
    }
    // Ask for the deparment
    private String setDepartment() {
        System.out.print("Enter the department:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";

        } else if (depChoice == 2) {
            return "development";
        } else if (depChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }


    }
    private String randomPassword(int length) {
        String passwordSit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSit.length());
            password[i] = passwordSit.charAt(rand);

        }
        return new String(password);
    }
    public void setMailCapacity(int capacity) {
        this.mailboxCapacity = capacity;

    }
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
    public void changePassword(String password) {
        this.password = password;

    }
    public int getMailBoxCapacity() {
        return mailboxCapacity;}
    public String getAlternateEmail() {
        return alternateEmail;
    }
    public String getPassword() {
        return password;
    }
    public String showInfo() {
        return "\nDISPLAY NAME: " + firstName + "" + lastName +
        "\nCOMPANY EMAIL: " + email +
        "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    
    }


}
