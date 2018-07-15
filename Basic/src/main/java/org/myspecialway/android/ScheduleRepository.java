package org.myspecialway.android;

public class ScheduleRepository {
    ScheduleData scheduleData;

    public ScheduleRepository(ScheduleData scheduleData) {
        this.scheduleData = scheduleData;
    }

    public ScheduleData getScheduleData() {
        return scheduleData;
    }
}
