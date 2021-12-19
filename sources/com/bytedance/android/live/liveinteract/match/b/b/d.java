package com.bytedance.android.live.liveinteract.match.b.b;

import com.bytedance.covode.number.Covode;

public enum d {
    DISABLED,
    TASK_NOTICE,
    TASK_IN_PROCESS,
    TASK_SUCCEED,
    TASK_FAILED,
    BONUS_IN_PROCESS,
    BONUS_FINISHED;

    static {
        Covode.recordClassIndex(5703);
    }
}
