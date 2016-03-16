package com.gjl.justifytextview.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.gjl.justifytextview.R;
import com.gjl.justifytextview.databinding.ActivityJustifytextviewBinding;

/**
 * Created by guojilong on 16/3/15.
 */
public class JustifyTextViewActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityJustifytextviewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_justifytextview);
        binding.ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.normalTv.setText(binding.edit.getText().toString() + "");
                binding.justfyTv.setText(binding.edit.getText().toString() + "");
            }
        });
    }
}
