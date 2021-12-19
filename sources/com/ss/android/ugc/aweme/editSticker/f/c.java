package com.ss.android.ugc.aweme.editSticker.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.d;
import com.ss.android.ugc.aweme.editSticker.h;
import h.c.f;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.cd;
import kotlinx.coroutines.z;

public final class c {
    static {
        Covode.recordClassIndex(55412);
    }

    public static final am a() {
        z a2 = cd.a(null);
        return an.a(d.f62009a.plus(a2).plus(new a(CoroutineExceptionHandler.f158926c)));
    }

    public static final class a extends h.c.a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(55413);
        }

        public a(f.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(f fVar, Throwable th) {
            h d2 = com.ss.android.ugc.aweme.editSticker.d.d();
            if (d2 != null) {
                d2.a(th);
            }
        }
    }
}
