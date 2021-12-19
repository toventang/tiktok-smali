package com.ss.android.ugc.effectmanager.common.task;

import com.bytedance.covode.number.Covode;

public interface SyncTaskListener<T> {
    static {
        Covode.recordClassIndex(95324);
    }

    void onFailed(SyncTask<T> syncTask, ExceptionResult exceptionResult);

    void onFinally(SyncTask<T> syncTask);

    void onProgress(SyncTask<T> syncTask, int i2, long j2);

    void onResponse(SyncTask<T> syncTask, T t);

    void onStart(SyncTask<T> syncTask);
}
