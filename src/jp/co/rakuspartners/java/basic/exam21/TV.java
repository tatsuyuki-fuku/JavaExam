package jp.co.rakuspartners.java.basic.exam21;

public class TV {
    private int channel;

    void changeChannel(int channel){
        if(channel<=0||13<=channel){
            System.out.println("チャンネルは1~12までの間で設定してください");
            return;
        }
        this.channel=channel;
        System.out.println(this.channel+"チャンネルに切り替わりました");
    }
}
