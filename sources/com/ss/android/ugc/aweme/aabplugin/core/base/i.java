package com.ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f62488a;

    static {
        Covode.recordClassIndex(38454);
    }

    i(a aVar) {
        this.f62488a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        MethodCollector.i(9598);
        a aVar = this.f62488a;
        if (!((Boolean) obj).booleanValue()) {
            aVar.b();
            synchronized (a.class) {
                try {
                    if (a.f62460b && a.f62462d != null && !a.f62462d.isDisposed()) {
                        a.f62462d.dispose();
                        a.f62460b = false;
                    }
                } finally {
                    MethodCollector.o(9598);
                }
            }
            return;
        }
        MethodCollector.o(9598);
    }
}
