package com.ss.android.ugc.aweme.lego;

import com.bytedance.covode.number.Covode;

public enum ad {
    TASK_MAIN,
    TASK_BACKGROUND,
    TASK_SPARSE,
    TASK_BOOT_FINISH,
    TASK_APP_BACKGROUND,
    TASK_IDLE,
    REQUEST_P0,
    REQUEST_NORMAL,
    REQUEST_SPARSE,
    REQUEST_IDLE,
    INFLATE,
    SERVICE_MAIN,
    SERVICE_BACKGROUND,
    SERVICE_SPARSE,
    SERVICE_BOOT_FINISH,
    SERVICE_APP_BACKGROUND,
    SERVICE_IDLE;

    static {
        Covode.recordClassIndex(68736);
    }
}
