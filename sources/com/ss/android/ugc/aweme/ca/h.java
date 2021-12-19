package com.ss.android.ugc.aweme.ca;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f69606a;

    /* renamed from: b  reason: collision with root package name */
    public static final h f69607b = new h();

    private h() {
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f69608a;

        static {
            Covode.recordClassIndex(42941);
        }

        a(Runnable runnable) {
            this.f69608a = runnable;
        }

        public final void run() {
            this.f69608a.run();
        }
    }

    static {
        Covode.recordClassIndex(42940);
    }

    public static boolean a() {
        if (!com.ss.android.ugc.aweme.s.a.r() || f69606a) {
            return false;
        }
        return true;
    }

    public static void a(Runnable runnable) {
        l.d(runnable, "");
        if (!a() || !com.ss.android.ugc.aweme.db.a.a(new a(runnable))) {
            runnable.run();
        }
    }
}
