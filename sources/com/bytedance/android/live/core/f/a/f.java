package com.bytedance.android.live.core.f.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadFactory f9043a = new f();

    static {
        Covode.recordClassIndex(4603);
    }

    private f() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "image-net-requests-monitor");
    }
}
