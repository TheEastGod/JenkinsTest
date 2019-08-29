package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yct.yctridingsdk.view.QRCodeFragment;
import com.yct.yctridingsdk.view.RidingRecordListActivity;
import com.yct.yctridingsdk.view.paymanage.NoPayPswListActivity;


public class MainActivity extends AppCompatActivity {

    private String certificate = "IwIAAAEBNRcZaVIEACAZCCYSAAAgGQgxMwFZomOwwLCSosBLJEOgj3Q0yLpVkI1ifThneDVBnZrFw5rksHXdFdzmWue1hsJTBFvf2/QO0QenjVTp9CJVbsZVPD5ERJL7aPcR50fqgPCQyI0wQGoJiAre/PBN0Ypp0ik=";
    private String userId = "13517196952";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        QRCodeFragment qrCodeFragment = QRCodeFragment.newInstance(userId,certificate);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_content, qrCodeFragment).show(qrCodeFragment).commit();

        findViewById(R.id.button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NoPayPswListActivity.start(MainActivity.this);
            }
        });

        findViewById(R.id.button_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RidingRecordListActivity.start(MainActivity.this);
            }
        });
    }
}
