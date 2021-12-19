package com.ss.android.ugc.effectmanager.common.task;

import com.bytedance.covode.number.Covode;

public class BaseTaskResult {
    private String taskID;

    static {
        Covode.recordClassIndex(95314);
    }

    public String getTaskID() {
        return this.taskID;
    }

    public void setTaskID(String str) {
        this.taskID = str;
    }
}
