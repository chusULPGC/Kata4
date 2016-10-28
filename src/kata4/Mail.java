package kata4;

public class Mail {
    String mail;
    
    public Mail(String mail){
        this.mail=mail;
    }
    
    public String getMail(){
        return mail;
    }
    
    public String getDomain(){
       return mail.split("@")[1];
        
    }
    
}
