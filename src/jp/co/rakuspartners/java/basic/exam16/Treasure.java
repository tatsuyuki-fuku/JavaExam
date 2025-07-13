package jp.co.rakuspartners.java.basic.exam16;

import java.util.Random;

public class Treasure {
    static final int NORTH=3;
    static final int EAST =2;
    static final int SOUTH=1;
    static final int WEST =4;
    int score;
    int treasureX;
    int treasureY;
    int hereX = 0;
    int hereY = 0;
    int direction;

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
        System.out.println(direction+"を向いている");
    }

    

    








}
