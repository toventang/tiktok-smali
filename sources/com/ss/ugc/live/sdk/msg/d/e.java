package com.ss.ugc.live.sdk.msg.d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.i;
import h.m;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f154182a = {new y(ab.a(e.class), "sHandler", "getSHandler()Landroid/os/Handler;")};

    /* renamed from: b  reason: collision with root package name */
    public static final e f154183b = new e();

    /* renamed from: c  reason: collision with root package name */
    private static final h f154184c = h.i.a(m.SYNCHRONIZED, a.f154185a);

    private e() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f154185a = new a();

        static {
            Covode.recordClassIndex(102823);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    private static boolean a() {
        return l.a(Looper.myLooper(), Looper.getMainLooper());
    }

    static {
        Covode.recordClassIndex(102822);
    }

    private static void b(Runnable runnable) {
        if (runnable != null) {
            ((Handler) f154184c.getValue()).post(runnable);
        }
    }

    public static final void a(Runnable runnable) {
        l.c(runnable, "");
        if (a()) {
            runnable.run();
        } else {
            b(runnable);
        }
    }
}
