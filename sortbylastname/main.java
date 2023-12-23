package odev3;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //OKUMA VE YAZMA SINIFLARINDAKİ METOTLARDA
        //NESNE ÜZERİNDEN ERİŞİM SAĞLAMAK İÇİN
        //OKU VE YAZ NESNELERİNİ OLUŞTURDUM:
        dosyaOkuma oku = new dosyaOkuma();
        dosyaYazma yaz=new dosyaYazma();
        
        
        //CONTACTS LİSTESİNİN readContacs() METODUYLA OKUNMASI VE
        //writeContactArrayList METODUYLA DOSYAYA YAZDIRILMASI:
        oku.readContacs();
        yaz.writeContactArrayList(oku.kisilerArrayList);
        
        //CONTACTS NESNESİNİN readContacsLastNameComparator() METODU İLE
        //OKUNUP, COLLECTİONSORT İLE SIRALANDIKTAN SONRA
        //writeContactsArrayListOrderByLastName() METODU İLE DOSYAYA YAZILMASI:
        oku.readContacsLastNameComparator();
        Collections.sort(oku.kisilerinLastNameComparator, new LastNameComparator());
        yaz.writeContactsArrayListOrderByLastName(oku.kisilerinLastNameComparator);
        
        //CONTACTS LİSTESİNİN READCONTACTSHASHSET İLE OKUNMASI VE
        //WRİTECONTACTHASHSET METODUYLA DOSYAYA YAZDIRILMASI:
        oku.readContacsHashSet();
        yaz.writeContactHashSet(oku.kisilerinHashSet);
        
        //CONTACTS LİSTESİNİN READCONTACTSTREESET İLE OKUNMASI VE
        //WRİTECONTACTSTREESETORDERBYLASTNAME METODUYLA DOSYAYA YAZDIRILMASI:
        oku.readContacsTreeSetLastNameComparator();
        yaz.writeContactsTreeSetOrderByLastName(oku.kisilerinTreeSet);
        
        //CONTACTS LİSTESİNİN READCONTACTSHASHMAP İLE OKUNMASI VE
        //WRİTECONTACTSHASHMAPE METODUYLA DOSYAYA YAZDIRILMASI:
        oku.readContacsHashMap();
        yaz.writeContactsHashMape(oku.kisilerinHashMap);
        
        //HATA ALIYORUM ÇÖZEMEDİM:
        //oku.readContacsTreeSet();
        //yaz.writeContactTreeSet(oku.kisilerinTreeSet); 
        
        
    }
}