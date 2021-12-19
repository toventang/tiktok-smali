package com.ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public class EffectTaskResult extends BaseTaskResult {
    private Effect effect;
    private ExceptionResult exception;
    private int progress;
    private long totalSize;

    static {
        Covode.recordClassIndex(95490);
    }

    public Effect getEffect() {
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

    public void setEffect(Effect effect2) {
        this.effect = effect2;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public EffectTaskResult setProgress(int i2) {
        this.progress = i2;
        return this;
    }

    public EffectTaskResult setTotalSize(long j2) {
        this.totalSize = j2;
        return this;
    }

    public EffectTaskResult(Effect effect2, ExceptionResult exceptionResult) {
        this.effect = effect2;
        this.exception = exceptionResult;
    }
}
