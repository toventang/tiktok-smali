package com.ss.android.ugc.aweme.utils;

import android.os.Handler;
import android.os.Looper;
import b.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public final class hx {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f143079a = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f143080a;

        static {
            Covode.recordClassIndex(93654);
        }

        a(h.f.a.a aVar) {
            this.f143080a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ z call() {
            this.f143080a.invoke();
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(93653);
    }

    public static /* synthetic */ void a(h.f.a.a aVar) {
        ExecutorService executorService = i.f4824a;
        l.b(executorService, "");
        a(executorService, aVar);
    }

    public static final void a(long j2, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        if (j2 > 0) {
            f143079a.postDelayed(new hy(aVar), j2);
        } else if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.invoke();
        } else {
            f143079a.post(new hy(aVar));
        }
    }

    private static void a(ExecutorService executorService, h.f.a.a<z> aVar) {
        l.d(executorService, "");
        l.d(aVar, "");
        if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
            i.a(new a(aVar), executorService);
        } else {
            aVar.invoke();
        }
    }
}
