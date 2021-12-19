package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.lensAlgorithm.videoStable.VELensVideoStabResults;
import com.ss.android.ttve.lensAlgorithm.videoStable.VEVideoStabConfig;

public class TELensAlgorithm {

    /* renamed from: a  reason: collision with root package name */
    public long f61239a;

    private native long nativeCreateLensEngine();

    private native int nativeDestroyLensEngine(long j2);

    public native VELensVideoStabResults nativeGetVideoStabResult(long j2, Object obj, VEVideoStabConfig vEVideoStabConfig);

    static {
        Covode.recordClassIndex(37726);
        d.a();
    }

    public final synchronized int a() {
        MethodCollector.i(8790);
        long nativeCreateLensEngine = nativeCreateLensEngine();
        this.f61239a = nativeCreateLensEngine;
        if (nativeCreateLensEngine <= 0) {
            MethodCollector.o(8790);
            return -112;
        }
        MethodCollector.o(8790);
        return 0;
    }

    public final synchronized int b() {
        MethodCollector.i(8970);
        long j2 = this.f61239a;
        if (j2 <= 0) {
            MethodCollector.o(8970);
            return -112;
        }
        int nativeDestroyLensEngine = nativeDestroyLensEngine(j2);
        this.f61239a = 0;
        MethodCollector.o(8970);
        return nativeDestroyLensEngine;
    }
}
