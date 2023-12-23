package odev3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import static javax.management.Query.value;

public class dosyaYazma {
    
   //ARRAY LİSTİN İTERATİF KULLANIMI İLE YAZILMASI:
    public static void writeContactArrayList(ArrayList kisilerArrayList){
        //İTERATÖR TANIMLAMASI:
        Iterator<Contact> itr = kisilerArrayList.iterator();
        while (itr.hasNext()) {
            //İTR.NEXT() İLE CONTACT TİPİNDE ELEMENTİNİN OLUŞTURULMASI:
              Contact element = itr.next();
              //ELEMENT DEĞİŞKENİNİ YARDIMIYLA DİZİDEKİ DEĞERLERİ İLGİLİ DEĞİŞKENLERE
              //ATIYORUZ:
              String pNo = element.getPhoneNumber();
              String fName = element.getFirstName();
              String lName =element.getLastName();
              String ssn = element.getSocialSecutiyNumber();
        try{
      	   File dosya = new File("C:\\Users\\hilal\\Desktop\\ödev3TXT\\contactArrayList.txt");
           FileWriter yazici = new FileWriter(dosya,true);
           BufferedWriter yaz = new BufferedWriter(yazici);
           //DOSYAYI OLUŞTURDUKTAN SONRA DEĞİŞKNLERİ YAZ.WRİTE İLE DOSYAYA YAZIYORUM.
              yaz.write(String.format("%n%s;%s;%s;%s" , pNo,fName,lName,
                      ssn));
              yaz.close(); 
        }
        catch (Exception hata){
              hata.printStackTrace();
      }
        }
    }
    
    //ARRAY LİSTİN İTERATİF KULLANIMI İLE DOSYAYA ORDER BY LAST NAME OLARAK YAZILMASI:
    public static void writeContactsArrayListOrderByLastName(ArrayList kisilerinLastNameComparator){
        //İTR.NEXT() İLE CONTACT TİPİNDE ELEMENTİNİN OLUŞTURULMASI:
        Iterator<Contact> itr = kisilerinLastNameComparator.iterator();
        while (itr.hasNext()) {
              //ELEMENT DEĞİŞKENİNİ YARDIMIYLA DİZİDEKİ DEĞERLERİ İLGİLİ DEĞİŞKENLERE
              //ATIYORUZ:
              Contact element = itr.next();
              //ELEMENT DEĞİŞKENİNİ YARDIMIYLA DİZİDEKİ DEĞERLERİ İLGİLİ DEĞİŞKENLERE
              //ATIYORUZ:
              String pNo = element.getPhoneNumber();
              String fName = element.getFirstName();
              String lName =element.getLastName();
              String ssn = element.getSocialSecutiyNumber();
        try{
      	   File dosya = new File("C:\\Users\\hilal\\Desktop\\ödev3TXT\\contactsArrayListOrderByLastName.txt");
           FileWriter yazici = new FileWriter(dosya,true);
           BufferedWriter yaz = new BufferedWriter(yazici);
           //DOSYAYI OLUŞTURDUKTAN SONRA DEĞİŞKNLERİ YAZ.WRİTE İLE DOSYAYA YAZIYORUM.
              yaz.write(String.format("%n%s;%s;%s;%s" , pNo,fName,lName,
                      ssn));
              yaz.close(); 
        }
        catch (Exception hata){
              hata.printStackTrace();
      }
        }
    }
    
    
    //HASHSETİNKULLANIMI İLE DOSYAYA YAZILMASI:
    public static void writeContactHashSet(HashSet kisilerinHashSet){
        //İTERATOR TANIMLAMASI:
        Iterator<Contact> itr = kisilerinHashSet.iterator();
        while (itr.hasNext()) {
              //ELEMENT DEĞİŞKENİNİ YARDIMIYLA DİZİDEKİ DEĞERLERİ İLGİLİ DEĞİŞKENLERE
              //ATIYORUZ:
              Contact element = itr.next();
              //ELEMENT DEĞİŞKENİNİ YARDIMIYLA DİZİDEKİ DEĞERLERİ İLGİLİ DEĞİŞKENLERE
              //ATIYORUZ:
              String pNo = element.getPhoneNumber();
              String fName = element.getFirstName();
              String lName =element.getLastName();
              String ssn = element.getSocialSecutiyNumber();
        try{
      	   File dosya = new File("C:\\Users\\hilal\\Desktop\\ödev3TXT\\contactHashSet.txt");
           FileWriter yazici = new FileWriter(dosya,true);
           BufferedWriter yaz = new BufferedWriter(yazici);
            //DOSYAYI OLUŞTURDUKTAN SONRA DEĞİŞKNLERİ YAZ.WRİTE İLE DOSYAYA YAZIYORUM.
              yaz.write(String.format("%n%s;%s;%s;%s" , pNo,fName,lName,
                      ssn));
              yaz.close(); 
        }
        catch (Exception hata){
              hata.printStackTrace();
         }
        }
      }
    
    //TREESETİN DOSYAYA İTERATOR İLE YAZILMASI:
    public static void writeContactTreeSet(TreeSet kisilerinTreeSet){
        //İTERATOR TANIMLAMASI:
        Iterator<Contact> it = kisilerinTreeSet.iterator();
        while (it.hasNext()) {
              Contact element = it.next();
              //ELEMENT DEĞİŞKENİNİ YARDIMIYLA DİZİDEKİ DEĞERLERİ İLGİLİ DEĞİŞKENLERE
              //ATIYORUZ:
              String ssn = element.getSocialSecutiyNumber();
              String fName = element.getFirstName();
              String lName =element.getLastName();
              String pNo = element.getPhoneNumber();
        try{
      	   File dosya = new File("C:\\Users\\hilal\\Desktop\\ödev3TXT\\contactTreeSet.txt");
           FileWriter yazici = new FileWriter(dosya,true);
           BufferedWriter yaz = new BufferedWriter(yazici);
           //DOSYAYI OLUŞTURDUKTAN SONRA DEĞİŞKNLERİ YAZ.WRİTE İLE DOSYAYA YAZIYORUM.
           yaz.write(String.format("%n%s;%s;%s;%s" , pNo,fName,lName,
                      ssn));
           yaz.close(); 
        }
        catch (Exception hata){
              hata.printStackTrace();
         }
        }
      }
    
    
    
    //HASHMAP İTERATİF KULLANIMLA YAZILMASI:
    public static void writeContactsHashMape(HashMap kisilerinHashMap) throws FileNotFoundException{
        dosyaOkuma okunacak = new dosyaOkuma();
        //HASH MAP İÇİN OLUŞTURULAN İTERATOR TANIMLAMASI:
        Iterator<Map.Entry<String, Contact>> entries = kisilerinHashMap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Contact> entry = entries.next();
            //ENTRY YARDIMIYLA KEY VE VALUE DEĞERLERİNİN DEĞİŞKENLERE ATANMASI:
            String key = entry.getKey();
            Contact value = entry.getValue();
        try{
      	   File dosya = new File("C:\\Users\\hilal\\Desktop\\ödev3TXT\\file.txt.txt");
           FileWriter yazici = new FileWriter(dosya,true);
           BufferedWriter yaz = new BufferedWriter(yazici);
           //KEY VE VALUE DEĞERLERİNİN, VALUE DEĞERİNİN GETTERLARLA DOSAYA YAZDIRILMASI:
           yaz.write(String.format("%n%s;%s" , key, value.getFirstName() + " "+ value.getLastName() + 
                   " " + value.getSocialSecutiyNumber()));
           yaz.close(); 
        }
        catch (Exception hata){
              hata.printStackTrace();
         }
    }
    }
    
    //COMPARATOR ARAYÜZÜ ARRAY LİSTİ SIRALAMA:
    public static void writeContactsTreeSetOrderByLastName(TreeSet kisilerinTreeSet){
        Iterator<Contact> it = kisilerinTreeSet.iterator();
        while (it.hasNext()) {
              Contact element = it.next();
              String pNo = element.getPhoneNumber();
              String fName = element.getFirstName();
              String lName =element.getLastName();
              String ssn = element.getSocialSecutiyNumber();
        try{
      	   File dosya = new File("C:\\Users\\hilal\\Desktop\\ödev3TXT\\contactTreeSetOrderByLastName.txt");
           FileWriter yazici = new FileWriter(dosya,true);
           BufferedWriter yaz = new BufferedWriter(yazici);
           yaz.write(String.format("%n%s;%s;%s;%s" , pNo,fName,lName,
                      ssn));
           yaz.close(); 
        }
        catch (Exception hata){
              hata.printStackTrace();
         }
        }
      }
}