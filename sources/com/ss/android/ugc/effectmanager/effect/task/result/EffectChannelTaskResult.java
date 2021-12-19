package com.ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

public class EffectChannelTaskResult extends BaseTaskResult {
    private EffectChannelResponse effectChannels;
    private ExceptionResult exception;

    static {
        Covode.recordClassIndex(95487);
    }

    public EffectChannelResponse getEffectChannels() {
        return this.effectChannels;
    }

    public ExceptionResult getException() {
        return this.exception;
    }

    public void setEffectChannels(EffectChannelResponse effectChannelResponse) {
        this.effectChannels = effectChannelResponse;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public EffectChannelTaskResult(EffectChannelResponse effectChannelResponse, ExceptionResult exceptionResult) {
        this.effectChannels = effectChannelResponse;
        this.exception = exceptionResult;
    }
}
