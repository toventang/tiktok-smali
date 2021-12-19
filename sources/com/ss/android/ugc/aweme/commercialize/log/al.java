package com.ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashSet;
import java.util.Set;

public class al {

    /* renamed from: c  reason: collision with root package name */
    private static al f74740c;

    /* renamed from: a  reason: collision with root package name */
    public Set<String> f74741a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public boolean f74742b = false;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f74743d = new HashSet();

    static {
        Covode.recordClassIndex(46095);
    }

    public static al a() {
        MethodCollector.i(12632);
        if (f74740c == null) {
            synchronized (al.class) {
                try {
                    if (f74740c == null) {
                        f74740c = new al();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12632);
                    throw th;
                }
            }
        }
        al alVar = f74740c;
        MethodCollector.o(12632);
        return alVar;
    }

    public final boolean a(String str) {
        return this.f74741a.contains(str);
    }

    public final void b(String str) {
        this.f74741a.add(str);
    }
}
