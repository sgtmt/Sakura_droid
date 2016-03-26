package com.sg_tmt.sakura_droid;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.afollestad.materialdialogs.MaterialDialog;
import com.sg_tmt.sakura_droid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    int n;
    String choice_data ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setActivity(this);
    }
    public void playBtn(View view){

        choice();
        new MaterialDialog.Builder(this).title("占い結果").content("占い結果は\n" +choice_data
                ).positiveText("はい").negativeText("いいえ").show();

    }
    public void infoBtn(View view){

    new MaterialDialog.Builder(this).title("used to").content("▶のボタンをクリックすると運勢を占うよ\n" +
            "横の▶のボタンを押してね").positiveText("はい").negativeText("いいえ").show();
    }
    public void choice(){
        n=(int)Math.random()*7+1;
        switch (n){
            case 1:
                choice_data="大吉";
                break;
            case 2:
                choice_data="中吉";
                break;
            case 3:
                choice_data="小吉";
                break;
            case 4:
                choice_data="吉";
                break;
            case 5:
                choice_data="末吉";
                break;
            case 6:
                choice_data="凶";
                break;
            case 7:
                choice_data="大凶";
                break;

        }
    }
}
