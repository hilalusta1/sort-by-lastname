package odev3;

import java.io.FileNotFoundException;
import java.util.ArrayList;

//CONTACTS SINIFININ COMPARABLE İNTERFACEİ İLE İMPLEMENT EDİLMESİ:
public class Contact implements Comparable<Contact> {
    //SINIF DEĞİŞKENLERİ:
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    //CONTACT SINIFININ GEREKLİ CONSTRUCTOR YAPISI:
    public Contact(){
        
    }
    public Contact(String phoneNumber, String fName, String lName, String ssn){
        this.phoneNumber = phoneNumber;
        this.firstName = fName;
        this.lastName = lName;
        this.socialSecurityNumber = ssn;
    }
    
    public Contact(String ssn, String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
        this.socialSecurityNumber = ssn;
    }
    
    //CONTACT SINIFININ GETTER VE SETTER METOTLARI:
    public String getSocialSecutiyNumber(){
        return socialSecurityNumber;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }

    //COMPARABLE İNTERFACEİNİ İMPLEMENTS ETTİĞİMİZ İÇİN 
    //COMPARETO METOTUNUDA OVERRİDE ETMEK ZORUNDAYIZ!
    @Override
    public int compareTo(Contact o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
