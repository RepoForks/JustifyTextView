package com.gjl.justifytextview.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.gjl.justifytextview.BR;

/**
 * Created by guojilong on 16/3/14.
 */
public class User extends BaseObservable {
    private String name;
    private int age;
    private int gender;
    private int tel;

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
