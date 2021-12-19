package com.bytedance.android.livesdk.browser.i;

import android.content.Context;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f14432a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray<b> f14433b = new SparseArray<>();

    static {
        Covode.recordClassIndex(7998);
    }

    private c() {
    }

    public static a a() {
        MethodCollector.i(7974);
        if (f14432a == null) {
            synchronized (c.class) {
                try {
                    if (f14432a == null) {
                        f14432a = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7974);
                    throw th;
                }
            }
        }
        c cVar = f14432a;
        MethodCollector.o(7974);
        return cVar;
    }

    @Override // com.bytedance.android.livesdk.browser.i.a
    public final void a(Context context) {
        this.f14433b.remove(context.hashCode());
    }
}
