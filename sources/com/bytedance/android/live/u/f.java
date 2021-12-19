package com.bytedance.android.live.u;

import androidx.core.d.c;
import com.bytedance.android.live.core.f.j;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchDogStopDelayDurationSetting;
import com.bytedance.covode.number.Covode;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f12824a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f12825b = new Object();

    private f() {
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12826a = new a();

        static {
            Covode.recordClassIndex(7132);
        }

        a() {
        }

        public final void run() {
            b.a().d();
        }
    }

    static {
        Covode.recordClassIndex(7131);
    }

    public static final void a() {
        if (g.a() || h.b()) {
            b.a().b();
            b.a().c();
        }
    }

    public static final void b() {
        if (g.a() || h.b()) {
            c.a(j.a(), a.f12826a, f12825b, LiveWatchDogStopDelayDurationSetting.INSTANCE.getValue());
        }
    }

    public static final void c() {
        if (g.a() || h.b()) {
            j.a().removeCallbacksAndMessages(f12825b);
            b.a().d();
        }
    }
}
