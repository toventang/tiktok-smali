package com.ss.android.ugc.aweme.services.performance;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface ICreativePerformanceMonitorService {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(79753);
    }

    Map<String, Double> getCpuRate();

    Map<String, Long> getMemory();

    void startBlockMonitor(String str, int i2, long j2, LagDataCallback lagDataCallback);

    void startBlockMonitor(String str, int i2, LagDataCallback lagDataCallback);

    void startFpsMonitor(String str, long j2, LagDataCallback lagDataCallback);

    void startFpsMonitor(String str, LagDataCallback lagDataCallback);

    void stopBlockMonitor(String str);

    void stopFpsMonitor(String str);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79754);
        }
    }
}
