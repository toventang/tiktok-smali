package com.bytedance.android.live.broadcast.api.c;

import com.bytedance.android.livesdk.ab.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {
    static {
        Covode.recordClassIndex(3707);
    }

    public static final a a(a aVar) {
        l.d(aVar, "");
        return aVar.a("LiveBroadcastBusinessLog");
    }

    public static final a b(a aVar) {
        l.d(aVar, "");
        return c(aVar.a(b.a.a("").d()));
    }

    private static a c(a aVar) {
        l.d(aVar, "");
        Float valueOf = Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue());
        l.d("device_score", "");
        if (valueOf == null || Float.isNaN(valueOf.floatValue()) || Float.isInfinite(valueOf.floatValue())) {
            aVar.f13424a.put("device_score", Float.valueOf(0.0f));
            aVar.f13425b.put("device_score", Float.valueOf(0.0f));
        } else {
            aVar.f13424a.put("device_score", valueOf);
            aVar.f13425b.put("device_score", valueOf);
        }
        return aVar;
    }
}
