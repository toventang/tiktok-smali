package com.ss.android.ugc.aweme.utils.permission;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.al;
import com.ss.android.ugc.aweme.app.g;

public class c implements al {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f143173a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f143174b = true;

    static {
        Covode.recordClassIndex(93714);
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void b() {
    }

    private c() {
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void a() {
        g.a();
    }

    public static c c() {
        MethodCollector.i(5730);
        if (f143173a == null) {
            synchronized (c.class) {
                try {
                    if (f143173a == null) {
                        f143173a = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5730);
                    throw th;
                }
            }
        }
        c cVar = f143173a;
        MethodCollector.o(5730);
        return cVar;
    }
}
