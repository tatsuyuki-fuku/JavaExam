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
    int befSta;
    int nowSta =strength;

    //武器一覧を表示する
    void showItems(){
        System.out.println("道具：");
        System.out.println(weaponLowName);
        System.out.println(weaponMidName);      
        System.out.println(weaponHiName);
    }

    //攻撃力を計算する
    void Attack(){
        if(equiqment==weaponLowName){
            nowSta=strength+weaponLowAttack;
        }else if(equiqment==weaponMidName){
            nowSta=strength+weaponMidAttack;
        }else if(equiqment==weaponHiName){
            nowSta=strength+weaponHiAttack;
        }else{
            nowSta=strength;
        }
    }

    //攻撃力を表示
    void showStatus(){
        System.out.println("こうげき力"+nowSta);
    }

    //装備の入れ替え
    void equiq(String weapon){
        if(weapon==weaponLowName){
            equiqment=weapon;
            befSta=nowSta;
            nowSta=strength+weaponLowAttack;
            System.out.println(weapon+"を装備した");
            System.out.println("こうげき"+befSta+"→"+nowSta);            
        }else if(weapon==weaponMidName){
            equiqment=weapon;
            befSta=nowSta;
            nowSta=strength+weaponMidAttack;
            System.out.println(weapon+"を装備した");
            System.out.println("こうげき"+befSta+"→"+nowSta);
        }else if(weapon==weaponHiName){
            equiqment=weapon;
            befSta=nowSta;
            nowSta=strength+weaponHiAttack;
            System.out.println(weapon+"を装備した");
            System.out.println("こうげき"+befSta+"→"+nowSta);
        }
    }

}


