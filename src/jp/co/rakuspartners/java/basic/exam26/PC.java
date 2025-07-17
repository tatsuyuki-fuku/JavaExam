package jp.co.rakuspartners.java.basic.exam26;

public class PC implements Electrical {
    private boolean powerOn;

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    @Override
    public void power(){
        //(powerOn==ture)と(powerON)は同じ内容の条件式
        if(powerOn){
            System.out.println("PCの電源が切れました");
            powerOn=false;
        }else{
            System.out.println("設定ファイルを読み込んでいます");
            //3秒間待つ
            try {
                Thread.sleep(3000); // 3000ミリ秒 = 3秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            powerOn = true;
            System.out.println("PCの電源が入りました");
        }
    }

}
