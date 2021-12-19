package com.ss.android.ugc.asve.f;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;
import h.z;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f62089a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(38163);
    }

    public static final void a(a<z> aVar) {
        l.d(aVar, "");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        l.b(mainLooper, "");
        if (l.a(currentThread, mainLooper.getThread())) {
            aVar.invoke();
        } else {
            f62089a.post(new h(aVar));
        }
    }
}
