package com.ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.playerkit.simapicommon.a;
import java.util.Map;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f143772a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static i f143773b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Map<String, String> f143774c;

    static {
        Covode.recordClassIndex(94061);
    }

    public static i b() {
        MethodCollector.i(6987);
        i iVar = f143773b;
        if (iVar != null) {
            MethodCollector.o(6987);
            return iVar;
        }
        synchronized (f143772a) {
            try {
                i iVar2 = f143773b;
                if (iVar2 != null) {
                    return iVar2;
                }
                i a2 = j.a();
                f143773b = a2;
                MethodCollector.o(6987);
                return a2;
            } finally {
                MethodCollector.o(6987);
            }
        }
    }

    public static i a() {
        MethodCollector.i(6985);
        if (f143773b == null) {
            synchronized (f143772a) {
                try {
                    if (f143773b == null) {
                        f143773b = j.a();
                        a.b().ensureNotReachHere(new Exception(), "VideoPreloadManagerService getInstance NULL.");
                        if (a.a().isDebug()) {
                            RuntimeException runtimeException = new RuntimeException("VideoPreloadManagerService getInstance NULL.");
                            MethodCollector.o(6985);
                            throw runtimeException;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6985);
                    throw th;
                }
            }
        }
        i iVar = f143773b;
        MethodCollector.o(6985);
        return iVar;
    }
}
