package com.ss.android.ugc.aweme.port.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ugc.aweme.port.in.bm;
import com.ss.android.vesdk.ba;

public final class o implements bm {
    static {
        Covode.recordClassIndex(74648);
    }

    @Override // com.ss.android.ugc.aweme.port.in.bm
    public final void a() {
        MethodCollector.i(11817);
        TEMonitorInvoker.nativeMonitorPerf(ba.f151052a);
        MethodCollector.o(11817);
    }
}
