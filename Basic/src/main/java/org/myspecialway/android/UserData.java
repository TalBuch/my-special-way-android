package org.myspecialway.android;

import android.arch.lifecycle.MutableLiveData;

public class UserData {

     MutableLiveData<String> userName;
    MutableLiveData<String> userAvatar;

    public UserData(String userName) {
        this.userName.setValue(userName);
    }

    public  MutableLiveData<String> getUserName() {
        return userName;
    }

    public  MutableLiveData<String> getUserAvatar() {
        return userAvatar;
    }

    public  void setUserAvatar(String newUserAvatar) {
        userAvatar.setValue(newUserAvatar);
    }
}
