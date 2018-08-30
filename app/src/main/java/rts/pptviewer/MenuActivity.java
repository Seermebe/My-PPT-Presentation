package rts.pptviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    private Button bt_am_item01;
    private Button bt_am_item02;
    private Button bt_am_item03;
    private Button bt_am_item04;
    private Button bt_am_item05;
    private Button bt_am_item06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bt_am_item01 = (Button) findViewById(R.id.bt_am_item01);
        bt_am_item02 = (Button) findViewById(R.id.bt_am_item02);
        bt_am_item03 = (Button) findViewById(R.id.bt_am_item03);
        bt_am_item04 = (Button) findViewById(R.id.bt_am_item04);
        bt_am_item05 = (Button) findViewById(R.id.bt_am_item05);
        bt_am_item06 = (Button) findViewById(R.id.bt_am_item06);

        bt_am_item01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callFullSlide();
                Toast.makeText(getBaseContext(),"Clima", Toast.LENGTH_LONG).show();
            }
        });

        bt_am_item02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callSlideVideo1();
                Toast.makeText(getBaseContext(),"Restaurantes", Toast.LENGTH_SHORT).show();
            }
        });

        bt_am_item03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callSlideVideo2();
                Toast.makeText(getBaseContext(),"Actividades", Toast.LENGTH_LONG).show();
            }
        });

        bt_am_item04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Mapas", Toast.LENGTH_LONG).show();
            }
        });

        bt_am_item05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Transporte", Toast.LENGTH_LONG).show();
            }
        });

        bt_am_item06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Fotos", Toast.LENGTH_LONG).show();
            }
        });

    }

    private void callFullSlide() {
        Intent intent = new Intent(getBaseContext(), SlideActivity.class);
        startActivity(intent);
    }

    private void callSlideVideo1(){
        Intent intent = new Intent(getBaseContext(), PlaybackActivity.class);
        intent.putExtra(PlaybackActivity.INTENT_NAME_VIDEO_PATH, 1);
        startActivity(intent);
    }

    private void callSlideVideo2(){
        Intent intent = new Intent(getBaseContext(), PlaybackActivity.class);
        intent.putExtra(PlaybackActivity.INTENT_NAME_VIDEO_PATH, 2);
        startActivity(intent);
    }

}
