package com.ss.android.ugc.aweme.tools.beauty.h;

import com.bytedance.covode.number.Covode;
import h.c.f;
import h.f.b.l;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.cd;
import kotlinx.coroutines.z;

public final class a {
    static {
        Covode.recordClassIndex(90926);
    }

    public static final am a() {
        z a2 = cd.a(null);
        return an.a(com.ss.android.ugc.aweme.dependence.beauty.b.a.f79582a.plus(a2).plus(new C3671a(CoroutineExceptionHandler.f158926c)));
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.h.a$a  reason: collision with other inner class name */
    public static final class C3671a extends h.c.a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(90927);
        }

        public C3671a(f.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(f fVar, Throwable th) {
            l.c(fVar, "");
            l.c(th, "");
            com.ss.android.ugc.aweme.dependence.beauty.a.a(th);
        }
    }
}
