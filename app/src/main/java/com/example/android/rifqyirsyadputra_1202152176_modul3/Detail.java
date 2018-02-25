package com.example.android.rifqyirsyadputra_1202152176_modul3;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Detail extends AppCompatActivity {

    TextView title, volume;
    ImageView image, botol;
    private int volumes = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String Title = intent.getStringExtra("Title");
        Integer Background = intent.getIntExtra("Background",0);

        title = (TextView)findViewById(R.id.detailTitle);
        volume = (TextView)findViewById(R.id.volume);
        image = (ImageView)findViewById(R.id.detailImage);
        botol = (ImageView)findViewById(R.id.botol);

        title.setText(Title);
        Bottle();
        image.setImageResource(Background);
    }
    
    ////Untuk mengurangi volume air
    public void increase(View view) {
        volumes++;
        Bottle();
    }
    
    
    //Untuk mengurangi volume air
    public void decrease(View view) {
        volumes--;
        Bottle();
    }

    // Untuk Mengatur Level List Drawable
    public void Bottle(){
        if (volumes <= 0 ){
            volume.setText("1L");
            botol.setImageResource(R.drawable.ic_battery_20);
            Toast.makeText(this,"Air sedikit",Toast.LENGTH_SHORT).show();
        }else if (volumes == 1){
            volume.setText("2L");
            botol.setImageResource(R.drawable.ic_battery_30);
        }else if(volumes == 2){
            volume.setText("3L");
            botol.setImageResource(R.drawable.ic_battery_50);
        }else if (volumes == 3){
            volume.setText("4L");
            botol.setImageResource(R.drawable.ic_battery_60);
        }else if(volumes == 4){
            volume.setText("5L");
            botol.setImageResource(R.drawable.ic_battery_80);
        }else{
            volume.setText("6L");
            botol.setImageResource(R.drawable.ic_battery_100);
            Toast.makeText(this,"Air Sudah Full",Toast.LENGTH_SHORT).show();
        }
    }
}
