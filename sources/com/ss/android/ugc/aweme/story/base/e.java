package com.ss.android.ugc.aweme.story.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.filter.d.a;
import com.ss.android.ugc.aweme.story.edit.business.shared.a.c;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static volatile a f136895a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f136896b = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(89469);
    }

    public final void b() {
        a().d().f();
        a().c().a();
    }

    public final a a() {
        MethodCollector.i(1708);
        if (f136895a == null) {
            synchronized (this) {
                try {
                    if (f136895a == null) {
                        f136895a = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1708);
                    throw th;
                }
            }
        }
        a aVar = f136895a;
        if (aVar == null) {
            l.b();
        }
        MethodCollector.o(1708);
        return aVar;
    }
}
