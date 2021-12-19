package com.ss.android.ugc.aweme.notification.b;

import android.os.Looper;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.c;
import h.f.b.l;
import h.h;
import h.i;
import h.m;

public final class a {
    static {
        Covode.recordClassIndex(72799);
    }

    public static final <T> h<T> a(h.f.a.a<? extends T> aVar) {
        l.d(aVar, "");
        return i.a(m.NONE, aVar);
    }

    public static final void b(View view) {
        l.d(view, "");
        n.a(view, 0);
    }

    public static final void a(View view) {
        l.d(view, "");
        n.a(view, 8);
    }

    public static final <T> void a(c<T> cVar, T t) {
        l.d(cVar, "");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        l.b(mainLooper, "");
        if (currentThread == mainLooper.getThread()) {
            cVar.setValue(t);
        } else {
            cVar.postValue(t);
        }
    }
}
