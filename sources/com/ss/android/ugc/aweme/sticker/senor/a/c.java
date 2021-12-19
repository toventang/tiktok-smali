package com.ss.android.ugc.aweme.sticker.senor.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends a {

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.senor.c f135686c;

    static {
        Covode.recordClassIndex(88694);
    }

    public final void onAccuracyChanged(Sensor sensor, int i2) {
        l.d(sensor, "");
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i2;
        l.d(sensorEvent, "");
        int i3 = 0;
        float f2 = sensorEvent.values[0];
        float f3 = sensorEvent.values[1];
        float[] fArr = sensorEvent.values;
        if (f3 > 0.0f && Math.abs(f2) < f3) {
            i2 = 0;
        } else if (f2 > 0.0f && Math.abs(f3) < f2) {
            i2 = 270;
        } else if (f3 >= 0.0f || Math.abs(f2) >= (-f3)) {
            i2 = 90;
        } else {
            i2 = LiveFeedRefreshTimeSetting.DEFAULT;
        }
        if (!TextUtils.equals(Build.MODEL, "vivo X9")) {
            i3 = i2;
        }
        if (this.f135676a) {
            this.f135686c.a((float) i3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.ss.android.ugc.aweme.sticker.senor.c cVar, boolean z) {
        super(z);
        l.d(cVar, "");
        this.f135686c = cVar;
    }
}
