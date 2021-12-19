package com.ss.android.ugc.aweme.sticker.senor.a.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.senor.a.a;
import com.ss.android.ugc.aweme.sticker.senor.c;
import h.f.b.l;

public final class d extends a {

    /* renamed from: c  reason: collision with root package name */
    private final c f135682c;

    /* renamed from: d  reason: collision with root package name */
    private final SensorManager f135683d;

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.senor.a f135684e;

    static {
        Covode.recordClassIndex(88692);
    }

    public final void onAccuracyChanged(Sensor sensor, int i2) {
        l.d(sensor, "");
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        l.d(sensorEvent, "");
        double a2 = a(sensorEvent);
        if (this.f135676a) {
            float[] fArr = new float[9];
            if (this.f135683d != null) {
                SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
            }
            double[] dArr = new double[9];
            int i2 = 0;
            do {
                dArr[i2] = (double) fArr[i2];
                i2++;
            } while (i2 < 9);
            this.f135684e.a(dArr, a2);
            c cVar = this.f135682c;
            float[] fArr2 = sensorEvent.values;
            l.b(fArr2, "");
            cVar.a(fArr2, a2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(c cVar, SensorManager sensorManager, com.ss.android.ugc.aweme.sticker.senor.a aVar, boolean z) {
        super(z);
        l.d(cVar, "");
        l.d(aVar, "");
        this.f135682c = cVar;
        this.f135683d = sensorManager;
        this.f135684e = aVar;
    }
}
