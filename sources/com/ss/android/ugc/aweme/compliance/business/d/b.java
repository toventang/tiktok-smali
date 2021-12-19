package com.ss.android.ugc.aweme.compliance.business.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private long f76916a;

    static {
        Covode.recordClassIndex(47542);
    }

    public b(long j2) {
        this.f76916a = j2;
    }

    public final synchronized void a(long j2) {
        MethodCollector.i(5978);
        this.f76916a += j2;
        MethodCollector.o(5978);
    }

    public final synchronized boolean c(long j2) {
        MethodCollector.i(6047);
        if (this.f76916a >= j2) {
            MethodCollector.o(6047);
            return true;
        }
        MethodCollector.o(6047);
        return false;
    }

    public final synchronized long b(long j2) {
        MethodCollector.i(6044);
        long j3 = this.f76916a;
        if (j3 == 0) {
            MethodCollector.o(6044);
            return 0;
        } else if (j3 < j2) {
            this.f76916a = 0;
            MethodCollector.o(6044);
            return j3;
        } else {
            this.f76916a = j3 - j2;
            MethodCollector.o(6044);
            return j2;
        }
    }
}
