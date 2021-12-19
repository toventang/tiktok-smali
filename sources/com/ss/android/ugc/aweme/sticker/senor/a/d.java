package com.ss.android.ugc.aweme.sticker.senor.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.senor.c;
import h.f.b.l;

public final class d extends a {

    /* renamed from: c  reason: collision with root package name */
    private final c f135687c;

    static {
        Covode.recordClassIndex(88695);
    }

    public final void onAccuracyChanged(Sensor sensor, int i2) {
        l.d(sensor, "");
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        l.d(sensorEvent, "");
        if (this.f135676a) {
            c cVar = this.f135687c;
            float[] fArr = sensorEvent.values;
            l.b(fArr, "");
            cVar.a(fArr, a(sensorEvent));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(c cVar, boolean z) {
        super(z);
        l.d(cVar, "");
        this.f135687c = cVar;
    }
}
