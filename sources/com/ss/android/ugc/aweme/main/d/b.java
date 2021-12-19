package com.ss.android.ugc.aweme.main.d;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.al;
import java.util.concurrent.TimeUnit;

public final class b implements al {

    /* renamed from: a  reason: collision with root package name */
    static boolean f109234a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f109235b = new b();

    @Override // com.ss.android.ugc.aweme.al
    public final void b() {
        f109234a = true;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f109236a = new a();

        static {
            Covode.recordClassIndex(69951);
        }

        a() {
        }

        public final void run() {
            boolean z = b.f109234a;
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(69950);
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void a() {
        if (f109234a) {
            f109234a = false;
            new Handler().postDelayed(a.f109236a, TimeUnit.SECONDS.toMillis(5));
        }
    }
}
