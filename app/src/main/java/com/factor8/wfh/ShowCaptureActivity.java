package com.factor8.wfh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import java.io.FileNotFoundException;

public class ShowCaptureActivity extends AppCompatActivity {
    String Uid;
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_capture);



        try {
            bitmap = BitmapFactory.decodeStream(getApplication().openFileInput("imageToSend"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            finish();
            return;
        }

        ImageView mImage = findViewById(R.id.imageCaptured);
        mImage.setImageBitmap(bitmap);

//        Uid = FirebaseAuth.getInstance().getUid();
//
//        Button mSend = findViewById(R.id.send);
//        mSend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ChooseReceiverActivity.class);
//                startActivity(intent);
//                return;
//            }
//        });
    }
}
