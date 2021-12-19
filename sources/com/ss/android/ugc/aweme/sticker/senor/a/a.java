package com.ss.android.ugc.aweme.sticker.senor.a;

import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.j.h;

public abstract class a implements SensorEventListener {

    /* renamed from: b  reason: collision with root package name */
    public static final C3538a f135675b = new C3538a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f135676a;

    static {
        Covode.recordClassIndex(88687);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.senor.a.a$a  reason: collision with other inner class name */
    public static final class C3538a {
        static {
            Covode.recordClassIndex(88688);
        }

        private C3538a() {
        }

        public /* synthetic */ C3538a(byte b2) {
            this();
        }
    }

    public a(boolean z) {
        this.f135676a = z;
    }

    protected static double a(SensorEvent sensorEvent) {
        l.d(sensorEvent, "");
        long j2 = sensorEvent.timestamp;
        long nanoTime = System.nanoTime();
        long abs = Math.abs(nanoTime - j2);
        int i2 = Build.VERSION.SDK_INT;
        long abs2 = Math.abs(SystemClock.elapsedRealtimeNanos() - j2);
        return (double) (nanoTime - h.b(h.b(abs, abs2), Math.abs((SystemClock.uptimeMillis() * 1000000) - j2)));
    }
}
