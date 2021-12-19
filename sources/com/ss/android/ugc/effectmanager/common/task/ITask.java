package com.ss.android.ugc.effectmanager.common.task;

import com.bytedance.covode.number.Covode;

public interface ITask {
    static {
        Covode.recordClassIndex(95317);
    }

    void cancel();

    void execute();
}
