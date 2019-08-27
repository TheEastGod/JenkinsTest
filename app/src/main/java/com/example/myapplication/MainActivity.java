package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yct.yctridingsdk.view.QRCodeFragment;


public class MainActivity extends AppCompatActivity {

    private String certificate = "IwIAAAEBNRcZaVIEACAZCCYSAAAgGQgxMwFZomOwwLCSosBLJEOgj3Q0yLpVkI1ifThneDVBnZrFw5rksHXdFdzmWue1hsJTBFvf2/QO0QenjVTp9CJVbsZVPD5ERJL7aPcR50fqgPCQyI0wQGoJiAre/PBN0Ypp0ik=";
    private String userId = "13517196952";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        QRCodeFragment qrCodeFragment = QRCodeFragment.newInstance(userId,certificate);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_content, qrCodeFragment).show(qrCodeFragment).commit();
    }
}
