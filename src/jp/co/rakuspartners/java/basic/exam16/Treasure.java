package jp.co.rakuspartners.java.basic.exam16;

import java.util.Random;

public class Treasure {
    static final int NORTH=3;
    static final int EAST =2;
    static final int SOUTH=1;
    static final int WEST =4;
    int score=100;
    int treasureX;
    int treasureY;
    int hereX = 0;
    int hereY = 0;
    int direction=1;

    void startGame(){
        Random rand = new Random();
        treasureX = rand.nextInt(20) - 10;
        treasureY = rand.nextInt(20) - 10;
        System.out.println("ゲームを開始する");
    }

    //向いている方向に進む
    void go(){
        if(direction==1){
            hereY++;
            System.out.println("移動しました");
        }else if(direction==2){
            hereX++;
            System.out.println("移動しました");
        }else if(direction==3){
            hereY--;
            System.out.println("移動しました");
        }else if(direction==4){
            hereX--;
            System.out.println("移動しました");
        }
    }

    void goRight(){
        if(direction==1){
            direction=2;
            hereX++;
            System.out.println("移動しました");
        }else if(direction==2){
            direction=3;
            hereY--;
            System.out.println("移動しました");
        }else if(direction==3){
            direction=4;
            hereX--;
            System.out.println("移動しました");
        }else if(direction==4){
            direction=1;
            hereY++;
            System.out.println("移動しました");
        }
    }

    void back(){
        if(direction==1){
            direction=3;
            hereY--;
            System.out.println("移動しました");
        }else if(direction==2){
            direction=4;
            hereX--;
            System.out.println("移動しました");
        }else if(direction==3){
            direction=1;
            hereY++;
            System.out.println("移動しました");
        }else if(direction==4){
            direction=2;
            hereX++;
            System.out.println("移動しました");
        }
    }

    void goLeft(){
        if(direction==1){
            direction=4;
            hereX--;
            System.out.println("移動しました");
        }else if(direction==2){
            direction=1;
            hereY++;
            System.out.println("移動しました");
        }else if(direction==3){
            direction=2;
            hereX++;
            System.out.println("移動しました");
        }else if(direction==4){
            direction=3;
            hereY--;
            System.out.println("移動しました");
        }
    }

    void showDirection(){
        switch (direction) {
            case 1:
            System.out.println("北を向いている");
                break;
            case 2:
                System.out.println("東を向いている");
                break;
            case 3:
                System.out.println("南を向いている");
                break;
            case 4:
                System.out.println("北を向いている");
                break;
            default:
                break;
        }
        
    }

    boolean search(){
        boolean found = false;
        int difX = (treasureX - hereX);
        int difY = (treasureY - hereY);
        //X座標の評価
        if(difX>=3){
            System.out.println("もっと東にありそうだ");
        }else if (difX<=-3){
            System.out.println("もっと西にありそうだ");
        }else if (difX>0&&difX<3){
            System.out.println("もう少し東にありそうだ");
        }else if (difX<0&&difX>-3){
            System.out.println("もう少し西にありそうだ");
        }

        //Y座標の評価
        if(difY>=3){
            System.out.println("もっと北にありそうだ");
        }else if (difY<=-3){
            System.out.println("もっと南にありそうだ");
        }else if (0<difY&&difY<3){
            System.out.println("もう少し北にありそうだ");
        }else if (0>difY&&difY>-3){
            System.out.println("もう少し南にありそうだ");
        }

        //座標一致
        if(difX==0&&difY==0){
            found=true;
            System.out.println("宝を見つけた！");
        }else{
            score -= 5;
        }
        return found;
    }
    

    








}
