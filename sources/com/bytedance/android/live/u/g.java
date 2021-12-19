package com.bytedance.android.live.u;

import android.view.View;
import androidx.core.d.c;
import com.bytedance.android.b;
import com.bytedance.android.live.core.f.j;
import com.bytedance.android.livesdk.livesetting.performance.LiveBannerWebviewOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastFluencyOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableX2cSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftFluencyOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayFluencyOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveScrapFluencyOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveSlotFluencyOptSetting;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import h.f.b.l;

public final class g implements FluencyOpt {

    /* renamed from: a  reason: collision with root package name */
    public static final g f12827a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f12828b = new Object();

    private g() {
    }

    static {
        Covode.recordClassIndex(7133);
    }

    public static final boolean c() {
        if (!LiveEnableX2cSetting.INSTANCE.enable() || !a()) {
            return false;
        }
        return true;
    }

    public static final boolean b() {
        if (!LiveGiftFluencyOptSetting.INSTANCE.enable() || !a()) {
            return false;
        }
        return true;
    }

    public static final boolean d() {
        if (!LiveScrapFluencyOptSetting.INSTANCE.enable() || !a()) {
            return false;
        }
        return true;
    }

    public static final boolean a() {
        if (p.f() && LiveBroadcastFluencyOptSetting.INSTANCE.enable()) {
            return true;
        }
        if (!p.e() || !LivePlayFluencyOptSetting.INSTANCE.enable()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final View getPreloadLayout(int i2) {
        return b.b(i2);
    }

    public static final void a(Runnable runnable) {
        l.d(runnable, "");
        f12827a.post(runnable, null);
    }

    public static final void b(Runnable runnable) {
        l.d(runnable, "");
        d(runnable);
    }

    public static final void c(Runnable runnable) {
        l.d(runnable, "");
        a(null, runnable, 1);
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final void removeMessages(Object obj) {
        l.d(obj, "");
        j.a().removeCallbacksAndMessages(obj);
    }

    private static final void d(Runnable runnable) {
        if (a(0)) {
            com.ss.android.ugc.aweme.cw.g.c().submit(runnable);
        } else {
            runnable.run();
        }
    }

    private static boolean a(int i2) {
        if (i2 == 0) {
            return a();
        }
        if (i2 == 1) {
            return b();
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    return a();
                }
                return d();
            } else if (!LiveBannerWebviewOptSetting.INSTANCE.enable() || !a()) {
                return false;
            } else {
                return true;
            }
        } else if (!LiveSlotFluencyOptSetting.INSTANCE.enable() || !a()) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final void post(Runnable runnable, Object obj) {
        l.d(runnable, "");
        a(obj, runnable, 0);
    }

    public static final void b(Runnable runnable, Object obj) {
        l.d(runnable, "");
        a(obj, runnable, 2);
    }

    public static final void a(Runnable runnable, Object obj) {
        l.d(runnable, "");
        a(obj, runnable, 3);
    }

    private static final void a(Object obj, Runnable runnable, int i2) {
        if (a(i2)) {
            c.a(j.a(), runnable, obj, 0);
        } else {
            runnable.run();
        }
    }
}
