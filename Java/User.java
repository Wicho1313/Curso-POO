public class User extends Account{
    
    public User (String name, String document, String email, String password){
        super(name, document, email, password);
        
        this.name = name;
        this.document = document;   
        this.email = email;
        this.password = password;
    }

    public void printDataUser() {
        System.out.println("USER:\n" + "Document: " + document + "\nName: " + name +"\nEmail: " + email + "\nPassword: " + password+ "\n");
    }
}
