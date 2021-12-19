package com.ss.android.ugc.tools.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.c;
import f.a.d.f;
import h.f.b.l;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final f<Throwable> f150012a = a.f150013a;

    static {
        Covode.recordClassIndex(98758);
    }

    static final class a<T> implements f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f150013a = new a();

        static {
            Covode.recordClassIndex(98759);
        }

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            Throwable th2 = th;
            if (c.f149147b) {
                Thread currentThread = Thread.currentThread();
                l.b(currentThread, "");
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                return;
            }
            f.a.h.a.a(th2);
        }
    }
}
