package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.c;

public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f107258a = new c.a();

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f107259c;

    static {
        Covode.recordClassIndex(68610);
    }

    public static b a() {
        MethodCollector.i(3041);
        if (f107259c == null) {
            synchronized (b.class) {
                try {
                    if (f107259c == null) {
                        f107259c = new b(new h(new i(new f(new e(new d(new a(new j())))))));
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3041);
                    throw th;
                }
            }
        }
        b bVar = f107259c;
        MethodCollector.o(3041);
        return bVar;
    }

    private b(c cVar) {
        super(cVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.lancet.ssretrofitchain.c
    public final c.a a(g gVar, Request request, u uVar) {
        return f107258a;
    }
}
