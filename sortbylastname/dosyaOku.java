package odev3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class dosyaOkuma {
    //KULLANILACAK LİSTELERİN OLUŞTURULMASI:
    ArrayList<Contact> kisilerArrayList = new ArrayList<Contact>();
    ArrayList<Contact> kisilerinLastNameComparator = new ArrayList<Contact>();
    HashSet <Contact> kisilerinHashSet = new HashSet<>();
    TreeSet<Contact> kisilerinTreeSet= new TreeSet<Contact>(new LastNameComparator());
    TreeSet<Contact> kisilerinTreeSetC = new TreeSet<Contact>();
    HashMap<String, Contact> kisilerinHashMap = new HashMap<String, Contact>();
    
    //CONTACTS.TXT DOSYASININ OKUNUP ARRAYLİSTE ATANMASI VE ARRAYLİST<CONTACT> TİPİNDE
    //LİSTE RETURN EDİLMESİ:
    public ArrayList<Contact> readContacs() throws FileNotFoundException{
        File f = new File("C:\\Users\\hilal\\Desktop\\ödev3TXT\\contacts.txt");
        Scanner sc = new Scanner(f);

        String lines;
        String[] details;

        while (sc.hasNextLine()) { //BİR SONRAKİ DEĞER BOŞ OLANA KADAR DEVAM EDELİM:
            lines = sc.nextLine();
            details = lines.split(" "); //DEĞERLERİ " " KARAKTERİNE GÖRE AYIRALIM:
            //DOSYAYİ İNDİS NUMARASINA GÖRE DEĞİŞKENLERE ATIYORUZ:
            String pNumber = details[0];
            String fName = details[1];
            String lName = details[2];
            String ssn = details[3];
            //YUKARIDA ARRAY LİST OLARAK TANIMLADIĞIMIZ LİSTEYE ELEMANLARI ADD İLE EKLİYORUZ:
            kisilerArrayList.add(new Contact(pNumber, fName, lName, ssn));
        }
        sc.close();
        return kisilerArrayList;
        }
    
    //CONTACTS.TXT DOSYASININ OKUNUP ARRAYLİSTE ATANMASI VE ARRAYLİST<CONTACT> TİPİNDE
    //LİSTE RETURN EDİLMESİ!
    //READCONTACTS() METODUNDAN FARKLI OLARAK BU METOTU LAST NAME COMPARATOR İÇİN KULLANACAK OLUŞUM
    //ÜSTTEKİ SINIFI DOSYAYI SIRALAMADAN YAZDIRMAK İÇİN KULLANDIM:
    public ArrayList<Contact> readContacsLastNameComparator() throws FileNotFoundException{
        File f = new File("C:\\Users\\hilal\\Desktop\\ödev3TXT\\contacts.txt");
        Scanner sc = new Scanner(f);

        String lines;
        String[] details;

        while (sc.hasNextLine()) { //BİR SONRAKİ DEĞER BOŞ OLANA KADAR DEVAM EDELİM:
            lines = sc.nextLine();
            details = lines.split(" "); //DEĞERLERİ " " KARAKTERİNE GÖRE AYIRALIM:
            //DOSYAYİ İNDİS NUMARASINA GÖRE DEĞİŞKENLERE ATIYORUZ:
            String pNumber = details[0];
            String fName = details[1];
            String lName = details[2];
            String ssn = details[3];
            //YUKARIDA ARRAY LİST OLARAK TANIMLADIĞIMIZ LİSTEYE ELEMANLARI ADD İLE EKLİYORUZ:
            kisilerinLastNameComparator.add(new Contact(pNumber, fName, lName, ssn));
        }
        sc.close();
        return kisilerinLastNameComparator;
        }
    
    //CONTACTS.TXT DOSYASININ OKUNUP HASHSET'E ATANMASI VE HASHSET<CONTACT> TİPİNDE
    //LİSTE RETURN EDİLMESİ!
    public HashSet<Contact> readContacsHashSet() throws FileNotFoundException{
        File f = new File("C:\\Users\\hilal\\Desktop\\ödev3TXT\\contacts.txt");
        Scanner sc = new Scanner(f);

        String lines;
        String[] details;

        while (sc.hasNextLine()) { //BİR SONRAKİ DEĞER BOŞ OLANA KADAR DEVAM EDELİM:
            lines = sc.nextLine();
            details = lines.split(" "); //DEĞERLERİ " " KARAKTERİNE GÖRE AYIRALIM:
            //DOSYAYİ İNDİS NUMARASINA GÖRE DEĞİŞKENLERE ATIYORUZ:
            String pNumber = details[0];
            String fName = details[1];
            String lName = details[2];
            String ssn = details[3];
            //YUKARIDA HASHSET OLARAK TANIMLADIĞIMIZ LİSTEYE ELEMANLARI ADD İLE EKLİYORUZ:
            kisilerinHashSet.add(new Contact(pNumber, fName, lName, ssn));
        }
        sc.close();
        return kisilerinHashSet;
        }
    
    //CONTACTS.TXT DOSYASININ OKUNUP TREESET'E ATANMASI VE TREESET<CONTACT> TİPİNDE
    //LİSTE RETURN EDİLMESİ!
    //BU METODUN READCONTACSTREESET() METODUNDAN FARKI BURADAKİ LİSTE 
    //LAST NAME COMPARATOR SINIFINI İÇERİSİNDE BARINDIRIYOR. 
    //YANİ LİSTE OLUŞURKEN ZATEN SIRALANIYOR:
    public TreeSet<Contact> readContacsTreeSetLastNameComparator() throws FileNotFoundException{
        File f = new File("C:\\Users\\hilal\\Desktop\\ödev3TXT\\contacts.txt");
        Scanner sc = new Scanner(f);

        String lines;
        String[] details;

        while (sc.hasNextLine()) { //BİR SONRAKİ DEĞER BOŞ OLANA KADAR DEVAM EDELİM:
            lines = sc.nextLine();
            details = lines.split(" "); //DEĞERLERİ " " KARAKTERİNE GÖRE AYIRALIM:
            //DOSYAYİ İNDİS NUMARASINA GÖRE DEĞİŞKENLERE ATIYORUZ:
            String pNumber = details[0];
            String fName = details[1];
            String lName = details[2];
            String ssn = details[3];
            //YUKARIDA TREESET OLARAK TANIMLADIĞIMIZ LİSTEYE ELEMANLARI ADD İLE EKLİYORUZ:
            kisilerinTreeSet.add(new Contact(pNumber, fName, lName, ssn));
        }
        sc.close();
        return kisilerinTreeSet;
        }
    
    //CONTACTS.TXT DOSYASININ OKUNUP TREESET'E ATANMASI VE TREESET<CONTACT> TİPİNDE
    //LİSTE RETURN EDİLMESİ!
    public TreeSet<Contact> readContacsTreeSet() throws FileNotFoundException{
        File f = new File("C:\\Users\\hilal\\Desktop\\ödev3TXT\\contacts.txt");
        Scanner sc = new Scanner(f);

        String lines;
        String[] details;

        while (sc.hasNextLine()) { //BİR SONRAKİ DEĞER BOŞ OLANA KADAR DEVAM EDELİM:
            lines = sc.nextLine();
            details = lines.split(" "); //DEĞERLERİ " " KARAKTERİNE GÖRE AYIRALIM:
            //DOSYAYİ İNDİS NUMARASINA GÖRE DEĞİŞKENLERE ATIYORUZ:
            String pNumber = details[0];
            String fName = details[1];
            String lName = details[2];
            String ssn = details[3];
            //YUKARIDA TREESET OLARAK TANIMLADIĞIMIZ LİSTEYE ELEMANLARI ADD İLE EKLİYORUZ:
            kisilerinTreeSetC.add(new Contact(pNumber, fName, lName, ssn));
        }
        sc.close();
        return kisilerinTreeSet;
        }
    
    //CONTACTS.TXT DOSYASININ OKUNUP HASHMAP'E ATANMASI VE HASPMAP<CONTACT> TİPİNDE
    //LİSTE RETURN EDİLMESİ!
    public HashMap<String,Contact> readContacsHashMap() throws FileNotFoundException{
        File f = new File("C:\\Users\\hilal\\Desktop\\ödev3TXT\\contacts.txt");
        Scanner sc = new Scanner(f);

        String lines;
        String[] details;

        while (sc.hasNextLine()) { //BİR SONRAKİ DEĞER BOŞ OLANA KADAR DEVAM EDELİM:
            lines = sc.nextLine();
            details = lines.split(" "); //DEĞERLERİ " " KARAKTERİNE GÖRE AYIRALIM:
            //DOSYAYİ İNDİS NUMARASINA GÖRE DEĞİŞKENLERE ATIYORUZ:
            String pNumber = details[0];
            String fName = details[1];
            String lName = details[2];
            String ssn = details[3];
            //KİSİLERİNHASHMAP LİSTESİNE ANAHTAR OLARAK PNUMBER VE DEĞER OLARAK
            //SSN,FNAME,LNAME DEĞERLERİNİN ATANARAK EKLENMESİ:
            kisilerinHashMap.put(pNumber, new Contact(ssn,fName,lName));
        }
        sc.close();
        return kisilerinHashMap;
        }
    
}
