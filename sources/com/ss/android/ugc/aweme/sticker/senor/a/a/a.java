package com.ss.android.ugc.aweme.sticker.senor.a.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.sticker.senor.a.a {

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.senor.a f135677c;

    static {
        Covode.recordClassIndex(88689);
    }

    public final void onAccuracyChanged(Sensor sensor, int i2) {
        l.d(sensor, "");
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        l.d(sensorEvent, "");
        double a2 = a(sensorEvent);
        if (this.f135676a) {
            this.f135677c.a((double) sensorEvent.values[0], (double) sensorEvent.values[1], (double) sensorEvent.values[2], a2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.ss.android.ugc.aweme.sticker.senor.a aVar, boolean z) {
        super(z);
        l.d(aVar, "");
        this.f135677c = aVar;
    }
}
