package com.ss.android.ugc.aweme.download.impl.component_impl;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.download.component_api.a;

public class e {

    /* renamed from: b  reason: collision with root package name */
    private static volatile e f83121b;

    /* renamed from: a  reason: collision with root package name */
    SparseArray<a> f83122a = new SparseArray<>();

    static {
        Covode.recordClassIndex(51828);
    }

    private e() {
    }

    public static e a() {
        MethodCollector.i(6186);
        if (f83121b == null) {
            synchronized (e.class) {
                try {
                    if (f83121b == null) {
                        f83121b = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6186);
                    throw th;
                }
            }
        }
        e eVar = f83121b;
        MethodCollector.o(6186);
        return eVar;
    }

    public final void a(int i2, a aVar) {
        if (aVar != null) {
            this.f83122a.put(i2, aVar);
        }
    }
}
