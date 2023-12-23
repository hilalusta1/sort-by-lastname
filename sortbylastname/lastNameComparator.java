package odev3;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

//LASTNAMECOMPARATOR SINIFIMIN COMPARATOR İNTERFACE'İNİ İMPLEMETS ETMESİ:
public class LastNameComparator implements Comparator<Contact> {
    //COMPARATOR ARAYÜZÜNDEN GELEN COMPARE METODUNUN OVERRİDE EDİLMESİ
    //VE CONTACT A VE CONTACT B NESNELERİNİ KARŞILAŞTIRMASI:
    @Override
    public int compare(Contact a, Contact b) {
        //COMPARE METODUNDA A VE B NESNELERİNİ KARŞILAŞTIRDIKTAN SONRA
        //RETURN İLE GERİ DÖNÜŞ SAĞLADIM:
        return a.getLastName().compareTo(b.getLastName());
    }
}
