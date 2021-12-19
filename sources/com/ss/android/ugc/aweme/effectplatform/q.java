package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import h.f.b.l;

public abstract class q implements ICheckChannelListener {

    /* renamed from: b  reason: collision with root package name */
    public final ICheckChannelListener f89071b;

    static {
        Covode.recordClassIndex(56016);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public void checkChannelFailed(ExceptionResult exceptionResult) {
        this.f89071b.checkChannelFailed(exceptionResult);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public void checkChannelSuccess(boolean z) {
        this.f89071b.checkChannelSuccess(z);
    }

    public q(ICheckChannelListener iCheckChannelListener) {
        l.d(iCheckChannelListener, "");
        this.f89071b = iCheckChannelListener;
    }
}
