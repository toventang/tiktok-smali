package com.ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.Npth;
import com.bytedance.crash.entity.d;
import com.bytedance.crash.j.i;
import com.bytedance.liko.b.b;

final /* synthetic */ class n implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LeakReporterInjectTask f107986a;

    static {
        Covode.recordClassIndex(69226);
    }

    n(LeakReporterInjectTask leakReporterInjectTask) {
        this.f107986a = leakReporterInjectTask;
    }

    @Override // com.bytedance.liko.b.b
    public final void a(String str) {
        if (Npth.isInit()) {
            d a2 = d.a(new StackTraceElement("FdLeakDetector", "report", "FdLeakWarning", 0), str, "FdLeakWarning", Thread.currentThread().getName(), "EnsureNotNull");
            a2.a("log_type", (Object) "fdLeak");
            i.a(a2);
        }
    }
}
