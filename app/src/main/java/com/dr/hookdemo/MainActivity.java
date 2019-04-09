package com.dr.hookdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    
    
    public void productPhone(View view) {
        
        HuaWei huaWei=new HuaWei("华为", "META-X");
    
        try {
            hookHuaWei(huaWei);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    
    
        Toast.makeText(this, huaWei.makeHuaWei(), Toast.LENGTH_LONG).show();
        
    }
    
    
    public static void hookHuaWei(HuaWei huaWei) throws NoSuchFieldException, IllegalAccessException {
        Class clzz=huaWei.getClass();
        Field field=clzz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(huaWei, "小米");
    }
}
