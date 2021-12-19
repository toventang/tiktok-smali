package com.bytedance.android.livesdk.watch;

import android.text.TextUtils;
import com.bytedance.android.b;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUseSurfaceViewExperiment;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f22424a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(13245);
    }

    public static void a() {
        boolean z;
        f fVar = f.a.f23366a;
        l.b(fVar, "");
        EnterRoomLinkSession a2 = fVar.a();
        l.b(a2, "");
        EnterRoomConfig enterRoomConfig = a2.f23354b;
        String str = enterRoomConfig.f23299c.J + "-" + enterRoomConfig.f23299c.L;
        if (TextUtils.equals(str, "homepage_hot-live_cell") || TextUtils.equals(str, "homepage_follow-live_cell")) {
            z = false;
        } else {
            z = true;
        }
        if (!LiveUseSurfaceViewExperiment.INSTANCE.isEnable() || !z) {
            b.a((int) R.layout.b9j);
        } else {
            b.a((int) R.layout.b9k);
        }
        b.a((int) R.layout.b9s);
    }
}
