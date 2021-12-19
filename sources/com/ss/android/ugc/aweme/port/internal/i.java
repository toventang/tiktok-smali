package com.ss.android.ugc.aweme.port.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.property.b;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class i implements IVideoConfigService {

    /* renamed from: a  reason: collision with root package name */
    private static int f115674a = 576;

    /* renamed from: b  reason: collision with root package name */
    private static int f115675b = 1024;

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicBoolean f115676c = new AtomicBoolean(false);

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoHeight() {
        a();
        return f115675b;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoWidth() {
        a();
        return f115674a;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final void invalidate() {
        f115676c.set(false);
    }

    static {
        Covode.recordClassIndex(74631);
    }

    private static void a() {
        int[] h2;
        MethodCollector.i(12269);
        AtomicBoolean atomicBoolean = f115676c;
        if (atomicBoolean.get()) {
            MethodCollector.o(12269);
            return;
        }
        synchronized (atomicBoolean) {
            try {
                if (atomicBoolean.compareAndSet(false, true) && (h2 = b.h()) != null && h2.length == 2 && h2[0] > 0 && h2[1] > 0) {
                    f115674a = h2[0];
                    f115675b = h2[1];
                }
            } finally {
                MethodCollector.o(12269);
            }
        }
    }
}
