package com.ss.android.ugc.effectmanager.common.task;

import com.bytedance.covode.number.Covode;

public class SyncTask<T> {
    private boolean mCanceled;
    private SyncTaskListener<T> mSyncTaskListener;

    static {
        Covode.recordClassIndex(95323);
    }

    public void cancel() {
        this.mCanceled = true;
    }

    public void execute() {
    }

    public boolean isCanceled() {
        return this.mCanceled;
    }

    public void setListener(SyncTaskListener<T> syncTaskListener) {
        this.mSyncTaskListener = syncTaskListener;
    }

    public void onFinally(SyncTask<T> syncTask) {
        SyncTaskListener<T> syncTaskListener = this.mSyncTaskListener;
        if (syncTaskListener != null) {
            syncTaskListener.onFinally(syncTask);
        }
    }

    public void onStart(SyncTask<T> syncTask) {
        SyncTaskListener<T> syncTaskListener = this.mSyncTaskListener;
        if (syncTaskListener != null) {
            syncTaskListener.onStart(syncTask);
        }
    }

    public void onFailed(SyncTask<T> syncTask, ExceptionResult exceptionResult) {
        SyncTaskListener<T> syncTaskListener = this.mSyncTaskListener;
        if (syncTaskListener != null) {
            syncTaskListener.onFailed(syncTask, exceptionResult);
        }
    }

    public void onResponse(SyncTask<T> syncTask, T t) {
        SyncTaskListener<T> syncTaskListener = this.mSyncTaskListener;
        if (syncTaskListener != null) {
            syncTaskListener.onResponse(syncTask, t);
        }
    }

    public void onProgress(SyncTask<T> syncTask, int i2, long j2) {
        SyncTaskListener<T> syncTaskListener = this.mSyncTaskListener;
        if (syncTaskListener != null) {
            syncTaskListener.onProgress(syncTask, i2, j2);
        }
    }
}
