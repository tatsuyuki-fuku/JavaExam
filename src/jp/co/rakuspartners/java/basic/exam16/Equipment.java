package jp.co.rakuspartners.java.basic.exam16;

public class Equipment {
    String weaponLowName="ひのきのぼう";
    String weaponMidName="どうのつるぎ";
    String weaponHiName ="レイピア";
    int weaponLowAttack =7;
    int weaponMidAttack =12;
    int weaponHiAttack  =24;
    final int strength =5;
    String equiqment=null;
    int statusc;
    int statusnow =strength;

    void showItems(){
        System.out.println("道具：");
        System.out.println(weaponLowName);
        System.out.println(weaponMidName);      
        System.out.println(weaponHiName);
    }
    void Attack(){
        if(equiqment==weaponLowName){
            statusnow=strength+weaponLowAttack;
        }else if(equiqment==weaponMidName){
            statusnow=strength+weaponMidAttack;
        }else if(equiqment==weaponHiName){
            statusnow=strength+weaponHiAttack;
        }else{
            statusnow=strength;
        }
    }

    void showStatus(){
        System.out.println("こうげき力"+statusnow);
    }

    void equiq(String weapon){
        if(weapon==weaponLowName){
            equiqment=weapon;
            statusc=statusnow;
            statusnow=strength+weaponLowAttack;
            System.out.println(weapon+"を装備した");
            System.out.println("こうげき"+statusc+"→"+statusnow);            
        }else if(weapon==weaponMidName){
            equiqment=weapon;
            statusc=statusnow;
            statusnow=strength+weaponMidAttack;
            System.out.println(weapon+"を装備した");
            System.out.println("こうげき"+statusc+"→"+statusnow);
        }else if(weapon==weaponHiName){
            equiqment=weapon;
            statusc=statusnow;
            statusnow=strength+weaponHiAttack;
            System.out.println(weapon+"を装備した");
            System.out.println("こうげき"+statusc+"→"+statusnow);
        }
    }

}


