package com.ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;

public class DownloadProviderEffectTaskResult extends BaseTaskResult {
    private ProviderEffect effect;
    private ExceptionResult exception;
    private int progress;
    private long totalSize;

    static {
        Covode.recordClassIndex(95486);
    }

    public ProviderEffect getEffect() {
        return this.effect;
    }

    public ExceptionResult getException() {
        return this.exception;
    }

    public int getProgress() {
        return this.progress;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public void setEffect(ProviderEffect providerEffect) {
        this.effect = providerEffect;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public DownloadProviderEffectTaskResult setProgress(int i2) {
        this.progress = i2;
        return this;
    }

    public DownloadProviderEffectTaskResult setTotalSize(long j2) {
        this.totalSize = j2;
        return this;
    }

    public DownloadProviderEffectTaskResult(ProviderEffect providerEffect, ExceptionResult exceptionResult) {
        this(providerEffect, exceptionResult, -1, -1);
    }

    public DownloadProviderEffectTaskResult(ProviderEffect providerEffect, ExceptionResult exceptionResult, int i2, long j2) {
        this.effect = providerEffect;
        this.exception = exceptionResult;
        this.progress = i2;
        this.totalSize = j2;
    }
}
