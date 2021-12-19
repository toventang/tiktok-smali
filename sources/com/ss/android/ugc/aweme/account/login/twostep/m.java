package com.ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.account.g.a;
import com.ss.android.ugc.aweme.account.g.b;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f63977a = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static volatile m f63978c;

    /* renamed from: b  reason: collision with root package name */
    public a f63979b;

    private m() {
    }

    static {
        Covode.recordClassIndex(39421);
    }

    public static m a() {
        MethodCollector.i(8632);
        if (f63978c == null) {
            synchronized (m.class) {
                try {
                    if (f63978c == null) {
                        f63978c = new m();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8632);
                    throw th;
                }
            }
        }
        m mVar = f63978c;
        MethodCollector.o(8632);
        return mVar;
    }

    public final void a(b bVar) {
        MethodCollector.i(8633);
        synchronized (f63977a) {
            try {
                a aVar = this.f63979b;
                if (aVar != null) {
                    aVar.onComplete(bVar);
                    this.f63979b = null;
                }
            } finally {
                MethodCollector.o(8633);
            }
        }
    }
}
