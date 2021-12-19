package com.ss.android.ugc.aweme.sticker.senor.a.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.senor.a.a;
import com.ss.android.ugc.aweme.sticker.senor.a.c;
import h.f.b.l;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private final c f135678c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.senor.a f135679d;

    static {
        Covode.recordClassIndex(88690);
    }

    public final void onAccuracyChanged(Sensor sensor, int i2) {
        l.d(sensor, "");
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        l.d(sensorEvent, "");
        if (this.f135676a) {
            this.f135679d.c((double) sensorEvent.values[0], (double) sensorEvent.values[1], (double) sensorEvent.values[2], a(sensorEvent));
            this.f135678c.onSensorChanged(sensorEvent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(com.ss.android.ugc.aweme.sticker.senor.a aVar, boolean z) {
        super(z);
        l.d(aVar, "");
        this.f135679d = aVar;
        this.f135678c = new c(aVar.a(), z);
    }
}
