package jp.co.rakuspartners.java.basic.exam16;

public class Ex17Bicycle {
    String bearing;

    //方角の指定
    void setBearing(String bearing){
        this.bearing=bearing;
        System.out.println(bearing+"の方角を向きます");
    }

    //左へ曲がります
    void turnLeft(){
        if("北".equals(this.bearing)){
            this.bearing="西";
        }else if("東".equals(this.bearing)){
            this.bearing="北";
        }else if("南".equals(this.bearing)){
            this.bearing="東";
        }else if("西".equals(this.bearing)){
            this.bearing="南";
        }else{
            System.out.println("方角を設定し直してください");
        }
        System.out.println("左へ曲がったので"+this.bearing+"を向きました"); 
    }

    //右へ曲がります
    void turnRight(){
        if("北".equals(this.bearing)){
            this.bearing="東";
        }else if("東".equals(this.bearing)){
            this.bearing="南";
        }else if("南".equals(this.bearing)){
            this.bearing="西";
        }else if("西".equals(this.bearing)){
            this.bearing="北";
        }else{
            System.out.println("方角を設定し直してください");
        }
        System.out.println("右へ曲がったので"+this.bearing+"を向きました"); 
    }

    //向いている方角を表示します
    void display(){
        System.out.println(this.bearing);
    }
}
