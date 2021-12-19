package com.facebook.a.b;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.bytedance.covode.number.Covode;

public final class f implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public a f46685a;

    public interface a {
        static {
            Covode.recordClassIndex(28449);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(28448);
    }

    public final void onAccuracyChanged(Sensor sensor, int i2) {
        com.facebook.internal.a.b.a.a(this);
    }

    f() {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                if (this.f46685a != null) {
                    float f2 = sensorEvent.values[0];
                    double d2 = (double) (f2 / 9.80665f);
                    double d3 = (double) (sensorEvent.values[1] / 9.80665f);
                    double d4 = (double) (sensorEvent.values[2] / 9.80665f);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    Double.isNaN(d4);
                    if (Math.sqrt((d2 * d2) + (d3 * d3) + (d4 * d4)) > 2.299999952316284d) {
                        this.f46685a.a();
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }
}
