package com.ss.android.ugc.aweme.kids.setting.base.session;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f106824b;

    /* renamed from: a  reason: collision with root package name */
    HashMap<String, a> f106825a = new HashMap<>();

    static {
        Covode.recordClassIndex(68310);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(4738);
        if (f106824b == null) {
            synchronized (b.class) {
                try {
                    if (f106824b == null) {
                        f106824b = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4738);
                    throw th;
                }
            }
        }
        b bVar = f106824b;
        MethodCollector.o(4738);
        return bVar;
    }

    public final synchronized void a(a aVar) {
        MethodCollector.i(4904);
        this.f106825a.values().remove(aVar);
        MethodCollector.o(4904);
    }

    public final synchronized <T> a<T> b(String str) {
        a<T> aVar;
        MethodCollector.i(4849);
        aVar = this.f106825a.get(str);
        MethodCollector.o(4849);
        return aVar;
    }

    public final synchronized <T> a<T> a(String str) {
        a<T> aVar;
        MethodCollector.i(4843);
        if (!this.f106825a.containsKey(str)) {
            this.f106825a.put(str, new a());
        }
        aVar = this.f106825a.get(str);
        MethodCollector.o(4843);
        return aVar;
    }
}
