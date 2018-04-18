package sdu.cs58.kritsada.trafficsignapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutMeActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);




    }//end oncreate

    public void clickBack(View view) {
       finish();
    }//end clickBack

    public void playSound(View view) {
    if (mediaPlayer != null){  //ตรสจสอบ obj ว่าเล่นเสียงอยู่ไหม
        mediaPlayer.stop();  //ถ้ามีให้หยุด
        mediaPlayer.release(); //คืน resource ที่ mediaplayer เดิมให้ระบบ
    }//end if
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.kk);
    mediaPlayer.start();
    }

    public void clickFacebook(View view) {
        Intent clickFacebook = new Intent(Intent.ACTION_VIEW);
        clickFacebook.setData(Uri.parse("https://www.facebook.com/michael.weremanchester"));
        startActivity(clickFacebook);
    }

    public void clickMobile(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel:0956933454"));
        startActivity(mobileIntent);
    }

    public void clickMap(View view) {
        String lat = "3.776233";
        String lng = "100.510757";
        String label = "มหาวิทยาลัยสวนดุสิต";
        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:"+lat +","+lng+"("+ label + ")" );

        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
    //ถ้ารันบน จีนี่โมชั่นจะเออเร่อเพราะ รันได้เฉพาะในเครื่องจริง    mapIntent.setPackage("com.google.android.apps.maps");//กรณีแอนดรอยมีแมพในเครื่องหลายตัว เลยให้บังคับใช้ googlemap
        startActivity(mapIntent);
    }
}//end class
