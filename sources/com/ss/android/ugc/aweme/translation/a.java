package com.ss.android.ugc.aweme.translation;

import androidx.c.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.translation.a.d;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f141006b;

    /* renamed from: a  reason: collision with root package name */
    public e<String, d> f141007a = new e<>(100);

    static {
        Covode.recordClassIndex(92054);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(5315);
        if (f141006b == null) {
            synchronized (a.class) {
                try {
                    if (f141006b == null) {
                        f141006b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5315);
                    throw th;
                }
            }
        }
        a aVar = f141006b;
        MethodCollector.o(5315);
        return aVar;
    }

    public final d a(String str) {
        if (str == null) {
            return null;
        }
        return this.f141007a.a(str);
    }
}
