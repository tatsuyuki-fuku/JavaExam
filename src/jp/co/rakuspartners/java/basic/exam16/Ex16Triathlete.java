package jp.co.rakuspartners.java.basic.exam16;

public class Ex16Triathlete {
    String place;
    String tool;

    Ex16Triathlete(){
        this.place="自宅";
        this.tool ="手ぶら";
    }

    //場所の移動
    void move(String place){
        if(this.place==place){
            System.out.println("既に"+place+"にいます");
        }else{
        System.out.println(this.place+"から"+place+"へ移動しました");
        this.place=place;
        }
    }

    //ツールの変更
    void changeTool(String tool){
        if(this.tool==tool){
            System.out.println("既に"+tool+"を使っています");
        }else{
        System.out.println(this.tool+"から"+tool+"にツールを変更しました");
        this.tool=tool;
        }
    }

    //トレーニング
    void training(){
        System.out.println(this.place+"で"+this.tool+"を使用します");
        if(this.place=="海"&&this.tool=="水着"){
            System.out.println("泳ぎの練習をしました");
        }else if(this.place=="サイクリングロード"&&this.tool=="自転車") {
            System.out.println("自転車の練習をしました");
        }else if(this.place=="公園"&&this.tool=="シューズ"){
            System.out.println("走りの練習をしました");
        }else{
            System.out.println("練習できませんでした");
        }
    }


}
