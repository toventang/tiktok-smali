package com.ss.android.ugc.aweme.base;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadFactory f68143a = new k();

    static {
        Covode.recordClassIndex(41983);
    }

    private k() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "image-net-requests-monitor");
    }
}
