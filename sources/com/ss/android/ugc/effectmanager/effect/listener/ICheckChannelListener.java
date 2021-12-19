package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;

public interface ICheckChannelListener {
    static {
        Covode.recordClassIndex(95367);
    }

    void checkChannelFailed(ExceptionResult exceptionResult);

    void checkChannelSuccess(boolean z);
}
