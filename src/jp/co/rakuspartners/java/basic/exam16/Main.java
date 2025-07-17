package jp.co.rakuspartners.java.basic.exam16;

import java.util.Scanner;

public class Main {
    static final String GO = "g";
    static final String RIGHT = "r";
    static final String LEFT = "l";
    static final String BACK = "b";
    static final String SEARCH = "s";
    static final String DIRECTIOM = "d";

    public static void main(String args[]) {
        /**
         * 追記して宝の位置を設定してください。
         */
        Treasure treasure=new Treasure();
        treasure.startGame();


        String input = "";
        // コンソールで入力を受け付けるためのクラス
        Scanner s = new Scanner(System.in);
        boolean isFinish = false;
        // 宝を見つけるまで繰り返す
        while (!isFinish) {
            System.out.println(GO + ": 向いている方向に1歩進む");
            System.out.println(RIGHT + ": 右を向いて1歩進む");
            System.out.println(LEFT + ": 左を向いて1歩進む");
            System.out.println(BACK + ": 逆を向いて1歩進む");
            System.out.println(SEARCH + ": 宝の位置を探る。現在地点に宝があれば宝を手に入れる。");
            System.out.println(DIRECTIOM + ": 向いている方角を表示する");
            System.out.println("\nキーを入力してください。");
            // コンソールに入力された文字を受け取る。
            input = s.next();
            /**
             * 追記して、入力された文字に応じたtresureクラスのメソッドを実行するようにしてください。
             * 宝を見つけたらisFinishにtrueを代入するようにしてください。
             */
            switch (input) {
                case "g":
                    treasure.go();
                    break;
                case "r":
                    treasure.goRight();
                    break;
                case "l":
                    treasure.goLeft();
                    break;
                case "b":
                    treasure.back();
                    break;
                case "s":
                    if(treasure.search()){
                        isFinish = true;
                    }
                    break;
                case "d":
                    treasure.showDirection();
                    break;

                default:
                    break;
            }

        }
        // 入力を終了する。
        s.close();
        System.out.println("スコア: " + treasure.score);
    }
}