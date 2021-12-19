package com.bytedance.android.livesdk.performance;

import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencyPeriodDurationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencyPeriodIntervalSetting;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f20285a;

    /* renamed from: b  reason: collision with root package name */
    public final h.c f20286b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20287c = true;

    static {
        Covode.recordClassIndex(11971);
    }

    public final void run() {
        if (this.f20287c) {
            h.c cVar = this.f20286b;
            if (cVar != null) {
                cVar.a();
            }
            this.f20287c = false;
            this.f20285a.postDelayed(this, LiveFluencyPeriodDurationSetting.INSTANCE.getValue());
            return;
        }
        h.c cVar2 = this.f20286b;
        if (cVar2 != null) {
            cVar2.b();
        }
        this.f20287c = true;
        this.f20285a.postDelayed(this, LiveFluencyPeriodIntervalSetting.INSTANCE.getValue());
    }

    public p(Handler handler, h.c cVar) {
        l.d(handler, "");
        this.f20285a = handler;
        this.f20286b = cVar;
    }
}
