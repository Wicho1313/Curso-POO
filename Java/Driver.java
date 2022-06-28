public class Driver extends Account{
    
    public Driver (String name, String document , String email, String password){
        super(name, document, email, password);
        
        this.name = name;
        this.document = document;   
        this.email = email;
        this.password = password;
    }

    public void printDataDriver() {
        System.out.println("DRIVER:\n" + "Document: " + document + "\nName: " + name +"\nEmail: " + email + "\nPassword: " + password + "\n");
    }
}
