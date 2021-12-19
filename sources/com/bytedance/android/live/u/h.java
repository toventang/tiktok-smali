package com.bytedance.android.live.u;

import android.view.View;
import androidx.core.d.c;
import com.bytedance.android.live.core.f.j;
import com.bytedance.android.livesdk.livesetting.performance.LiveBannerWebviewOptSettingV2;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastFluencyOptSettingV2;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftFluencyOptSettingV2;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayFluencyOptSettingV2;
import com.bytedance.android.livesdk.livesetting.performance.LiveScrapFluencyOptSettingV2;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.ss.android.ugc.aweme.cw.g;
import h.f.b.l;
import h.z;

public final class h implements FluencyOpt {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f12829a = LiveBroadcastFluencyOptSettingV2.INSTANCE.enable();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f12830b = LivePlayFluencyOptSettingV2.INSTANCE.enable();

    /* renamed from: c  reason: collision with root package name */
    public static final h f12831c = new h();

    private h() {
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f12832a;

        static {
            Covode.recordClassIndex(7135);
        }

        a(h.f.a.a aVar) {
            this.f12832a = aVar;
        }

        public final void run() {
            this.f12832a.invoke();
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f12833a;

        static {
            Covode.recordClassIndex(7136);
        }

        public b(h.f.a.a aVar) {
            this.f12833a = aVar;
        }

        public final void run() {
            this.f12833a.invoke();
        }
    }

    public static final void a() {
        f12829a = LiveBroadcastFluencyOptSettingV2.INSTANCE.enable();
        f12830b = false;
    }

    public static final int e() {
        if (b()) {
            return 20;
        }
        return 10;
    }

    static {
        Covode.recordClassIndex(7134);
    }

    public static final boolean b() {
        if (f12829a || f12830b) {
            return true;
        }
        return false;
    }

    public static final boolean c() {
        if (!LiveGiftFluencyOptSettingV2.INSTANCE.enable() || !b()) {
            return false;
        }
        return true;
    }

    public static final boolean d() {
        if (!LiveBannerWebviewOptSettingV2.INSTANCE.enable() || !b()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final View getPreloadLayout(int i2) {
        return com.bytedance.android.b.b(i2);
    }

    public static final void b(Runnable runnable) {
        l.d(runnable, "");
        g.c().submit(runnable);
    }

    public static final void c(Runnable runnable) {
        l.d(runnable, "");
        a(null, runnable, 3, 0);
    }

    public static final void d(Runnable runnable) {
        l.d(runnable, "");
        a(null, runnable, 1, 0);
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final void removeMessages(Object obj) {
        l.d(obj, "");
        j.a().removeCallbacksAndMessages(obj);
    }

    public static final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        a(new a(aVar));
    }

    public static final void a(Runnable runnable) {
        l.d(runnable, "");
        f12831c.post(runnable, null);
    }

    private static boolean a(int i2) {
        if (i2 == 0) {
            return b();
        }
        if (i2 == 1) {
            return c();
        }
        if (i2 == 2) {
            return d();
        }
        if (i2 != 3) {
            return b();
        }
        if (!LiveScrapFluencyOptSettingV2.INSTANCE.enable() || !g.a()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final void post(Runnable runnable, Object obj) {
        l.d(runnable, "");
        a(obj, runnable, 0, 0);
    }

    public static final void a(Runnable runnable, int i2) {
        if (a(i2)) {
            g.c().submit(runnable);
        } else {
            runnable.run();
        }
    }

    public static final void a(Object obj, Runnable runnable, int i2, long j2) {
        if (a(i2)) {
            c.a(j.a(), runnable, obj, j2);
        } else {
            runnable.run();
        }
    }
}
