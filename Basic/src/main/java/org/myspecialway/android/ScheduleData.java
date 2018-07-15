package org.myspecialway.android;

import android.arch.lifecycle.MutableLiveData;

class ScheduleData {
    MutableLiveData<String> currentScheduleName;

    public ScheduleData(String newScheduleName) {
        this.currentScheduleName.setValue(newScheduleName);
    }

    public MutableLiveData<String> getCurrentScheduleName() {
        return currentScheduleName;
    }
}
