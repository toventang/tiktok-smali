package com.ss.android.ugc.aweme.detail;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f79764a;

    /* renamed from: b  reason: collision with root package name */
    public static Handler f79765b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public static final i f79766c = new i();

    private i() {
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f79767a = new a();

        static {
            Covode.recordClassIndex(49573);
        }

        a() {
        }

        public final void run() {
            i.a(false);
        }
    }

    static {
        Covode.recordClassIndex(49572);
    }

    public static void a(boolean z) {
        if (z) {
            f79765b.removeCallbacksAndMessages(null);
        }
        f79764a = z;
    }
}
