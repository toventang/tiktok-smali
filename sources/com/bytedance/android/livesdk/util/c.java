package com.bytedance.android.livesdk.util;

import android.ss.com.vboost.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.livesetting.broadcast.VBoostEnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f22114a = new c();

    public enum a {
        ENTER_GIFT_PANEL(d.TT_LIVING_ENTER_GIFT_PANEL, 1000),
        LIVE_SLIDE(d.TT_LIVING_SCROLL, 1000),
        ENTER_LIVE_ROOM(d.DY_TAB_LIVING_LOAD, 2500),
        ENTER_BROADCAST_ROOM(d.DY_TAB_LIVING_LOAD, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        
        private final d targetScene;
        private final int timeout;

        public final d getTargetScene() {
            return this.targetScene;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        static {
            Covode.recordClassIndex(13026);
        }

        private a(d dVar, int i2) {
            this.targetScene = dVar;
            this.timeout = i2;
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(13025);
        android.ss.com.vboost.a.a(y.e());
    }

    public static void a(a aVar) {
        l.d(aVar, "");
        if (VBoostEnableSetting.INSTANCE.isEnable()) {
            android.ss.com.vboost.a.a(aVar.getTargetScene(), aVar.getTimeout());
        }
    }
}
