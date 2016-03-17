package com.gjl.justifytextview.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.gjl.justifytextview.R;
import com.gjl.justifytextview.bean.User;
import com.gjl.justifytextview.databinding.ActivityDatabindingBinding;

/**
 * Created by guojilong on 16/3/16.
 */
public class DataBindingActivity extends AppCompatActivity implements View.OnClickListener {


    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityDatabindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding);
        user = new User();
        user.setName("demo");
        user.setAge(18);
        user.setGender(1);
        user.setTel(12345567);
        binding.setListener(this);
        binding.setUser(user);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.tv_age:

                user.setAge(user.getAge() + 1);

                break;

            default:
                if (v instanceof TextView) {

                    Toast.makeText(getBaseContext(), ((TextView) v).getText(), Toast.LENGTH_LONG).show();
                }

                break;
        }

    }
}

