package com.ss.android.ugc.aweme.services.performance;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import h.f.a.a;
import java.util.Map;

public interface IAVPerformance {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(79748);
    }

    void end(PerformanceMonitor performanceMonitor, String str);

    void end(String str, String str2);

    void enter(Context context, String str);

    void leave(Context context, String str);

    void pause(Context context, String str, String str2, String str3);

    void recordPerformanceLog(String str, a<? extends Map<String, String>> aVar);

    void start(PerformanceMonitor performanceMonitor, String str);

    void start(String str, String str2);

    void step(PerformanceMonitor performanceMonitor, String str);

    void step(String str, String str2);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79749);
        }
    }
}
