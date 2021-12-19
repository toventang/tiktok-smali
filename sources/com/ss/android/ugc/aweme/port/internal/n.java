package com.ss.android.ugc.aweme.port.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.property.b;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class n implements IVideoConfigService {

    /* renamed from: a  reason: collision with root package name */
    private static int f115698a = 576;

    /* renamed from: b  reason: collision with root package name */
    private static int f115699b = 1024;

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicBoolean f115700c = new AtomicBoolean(false);

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoHeight() {
        a();
        return f115699b;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoWidth() {
        a();
        return f115698a;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final void invalidate() {
        f115700c.set(false);
    }

    static {
        Covode.recordClassIndex(74647);
    }

    private static void a() {
        int[] g2;
        MethodCollector.i(12125);
        AtomicBoolean atomicBoolean = f115700c;
        if (atomicBoolean.get()) {
            MethodCollector.o(12125);
            return;
        }
        synchronized (atomicBoolean) {
            try {
                if (atomicBoolean.compareAndSet(false, true) && (g2 = b.g()) != null && g2.length == 2 && g2[0] > 0 && g2[1] > 0) {
                    f115698a = g2[0];
                    f115699b = g2[1];
                }
            } finally {
                MethodCollector.o(12125);
            }
        }
    }
}
