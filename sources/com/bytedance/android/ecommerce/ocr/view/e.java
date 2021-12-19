package com.bytedance.android.ecommerce.ocr.view;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class e implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    boolean f7305a;

    /* renamed from: b  reason: collision with root package name */
    public a f7306b;

    /* renamed from: c  reason: collision with root package name */
    private SensorManager f7307c;

    /* renamed from: d  reason: collision with root package name */
    private Sensor f7308d;

    /* renamed from: e  reason: collision with root package name */
    private int f7309e;

    /* renamed from: f  reason: collision with root package name */
    private int f7310f;

    /* renamed from: g  reason: collision with root package name */
    private int f7311g;

    /* renamed from: h  reason: collision with root package name */
    private long f7312h;

    /* renamed from: i  reason: collision with root package name */
    private int f7313i;

    /* renamed from: j  reason: collision with root package name */
    private int f7314j = 1000;

    public interface a {
        static {
            Covode.recordClassIndex(3505);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(3504);
    }

    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public e(Context context) {
        SensorManager sensorManager = (SensorManager) a(context, "sensor");
        this.f7307c = sensorManager;
        this.f7308d = sensorManager.getDefaultSensor(1);
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        a aVar;
        if (sensorEvent.sensor != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f7312h >= ((long) this.f7314j)) {
                if (this.f7305a) {
                    this.f7313i = 0;
                    this.f7309e = 0;
                    this.f7310f = 0;
                    this.f7311g = 0;
                } else if (sensorEvent.sensor.getType() == 1) {
                    int i2 = (int) sensorEvent.values[0];
                    int i3 = (int) sensorEvent.values[1];
                    int i4 = (int) sensorEvent.values[2];
                    if (this.f7313i != 0) {
                        int abs = Math.abs(this.f7309e - i2);
                        int abs2 = Math.abs(this.f7310f - i3);
                        int abs3 = Math.abs(this.f7311g - i4);
                        if (Math.sqrt((double) ((abs * abs) + (abs2 * abs2) + (abs3 * abs3))) >= 1.4d) {
                            this.f7313i = 2;
                        } else {
                            if (this.f7313i == 2) {
                                this.f7312h = elapsedRealtime;
                                if (!this.f7305a && (aVar = this.f7306b) != null) {
                                    aVar.a();
                                }
                            }
                            this.f7313i = 1;
                        }
                    } else {
                        this.f7312h = elapsedRealtime;
                        this.f7313i = 1;
                    }
                    this.f7309e = i2;
                    this.f7310f = i3;
                    this.f7311g = i4;
                }
            }
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(5200);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(5200);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
