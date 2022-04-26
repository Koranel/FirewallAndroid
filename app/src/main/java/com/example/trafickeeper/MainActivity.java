package com.example.trafickeeper;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends Activity {
    public int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void OnSettingsClick (View v) {

    }
    public void OnAcceptClick (View v) {

        // получаем экземпляр FragmentTransaction
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        // добавляем фрагмент
        AcceptFragment myFragment = new AcceptFragment();
        if (i==0){
        fragmentTransaction.add(R.id.container, myFragment);
        fragmentTransaction.commit(); i+=1;}else{
            fragmentTransaction.replace(R.id.container, myFragment);
            fragmentTransaction.commit();}
    }
    public void OnWarningClick (View v) {

        // получаем экземпляр FragmentTransaction
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        // добавляем фрагмент
        WarnningFragment myFragment = new WarnningFragment();
        if(i==0){
        fragmentTransaction.add(R.id.container, myFragment);
        fragmentTransaction.commit();i+=1;}else{
            fragmentTransaction.replace(R.id.container, myFragment);
            fragmentTransaction.commit();}
    }
    public void OnDenayClick (View v) {

        // получаем экземпляр FragmentTransaction
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        // добавляем фрагмент
        DenayFragment myFragment = new DenayFragment();
        if(i==0){
        fragmentTransaction.add(R.id.container, myFragment);
        fragmentTransaction.commit();i+=1;}else{
            fragmentTransaction.replace(R.id.container, myFragment);
            fragmentTransaction.commit();}
    }

   }