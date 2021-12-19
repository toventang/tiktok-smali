package com.bytedance.lobby.internal;

import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lobby.auth.AuthResult;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f40237b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<e<String, Integer>, List<com.bytedance.lobby.auth.a>> f40238a = new androidx.c.a();

    static {
        Covode.recordClassIndex(24801);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(8235);
        if (f40237b == null) {
            synchronized (a.class) {
                try {
                    if (f40237b == null) {
                        f40237b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8235);
                    throw th;
                }
            }
        }
        a aVar = f40237b;
        MethodCollector.o(8235);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i2, AuthResult authResult) {
        MethodCollector.i(8293);
        synchronized (this.f40238a) {
            try {
                List<com.bytedance.lobby.auth.a> list = this.f40238a.get(new e(str, Integer.valueOf(i2)));
                if (!(list == null || authResult == null)) {
                    for (com.bytedance.lobby.auth.a aVar : list) {
                        aVar.a(authResult);
                    }
                    list.clear();
                }
            } finally {
                MethodCollector.o(8293);
            }
        }
    }
}
