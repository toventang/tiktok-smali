package com.ss.android.ugc.aweme.app.g;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;

public final class b extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    public Handler f66743a;

    /* renamed from: b  reason: collision with root package name */
    private Handler.Callback f66744b;

    static {
        Covode.recordClassIndex(41083);
    }

    /* access modifiers changed from: protected */
    public final void onLooperPrepared() {
        this.f66743a = new Handler(getLooper(), this.f66744b);
    }
}
