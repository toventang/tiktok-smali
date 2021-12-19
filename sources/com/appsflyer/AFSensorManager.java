package com.appsflyer;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.appsflyer.internal.r;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class AFSensorManager {
    public static volatile AFSensorManager sInstance;

    /* renamed from: ȷ  reason: contains not printable characters */
    private static final BitSet f39;

    /* renamed from: ɪ  reason: contains not printable characters */
    private static final Handler f40 = new Handler(Looper.getMainLooper());

    /* renamed from: ı  reason: contains not printable characters */
    final Handler f41;

    /* renamed from: Ɩ  reason: contains not printable characters */
    int f42;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Map<r, r> f43;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final Runnable f44;

    /* renamed from: ɩ  reason: contains not printable characters */
    final SensorManager f45;

    /* renamed from: ɹ  reason: contains not printable characters */
    final Runnable f46;

    /* renamed from: ɾ  reason: contains not printable characters */
    long f47;

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f48;

    /* renamed from: ι  reason: contains not printable characters */
    final Object f49 = new Object();

    /* renamed from: І  reason: contains not printable characters */
    final Runnable f50;

    /* renamed from: і  reason: contains not printable characters */
    final Runnable f51;

    /* renamed from: Ӏ  reason: contains not printable characters */
    boolean f52;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final Map<r, Map<String, Object>> f53;

    static {
        Covode.recordClassIndex(2653);
        BitSet bitSet = new BitSet(6);
        f39 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<Map<String, Object>> m29() {
        for (r rVar : this.f43.values()) {
            rVar.m194(this.f53, true);
        }
        Map<r, Map<String, Object>> map = this.f53;
        if (map == null || map.isEmpty()) {
            return new CopyOnWriteArrayList(Collections.emptyList());
        }
        return new CopyOnWriteArrayList(this.f53.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m30() {
        try {
            if (!this.f43.isEmpty()) {
                for (r rVar : this.f43.values()) {
                    this.f45.unregisterListener(rVar);
                    rVar.m194(this.f53, true);
                }
            }
        } catch (Throwable unused) {
        }
        this.f42 = 0;
        this.f52 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final List<Map<String, Object>> m31() {
        MethodCollector.i(4073);
        synchronized (this.f49) {
            try {
                if (!this.f43.isEmpty() && this.f52) {
                    for (r rVar : this.f43.values()) {
                        rVar.m194(this.f53, false);
                    }
                }
                if (this.f53.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.emptyList());
                }
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f53.values());
                MethodCollector.o(4073);
                return copyOnWriteArrayList;
            } finally {
                MethodCollector.o(4073);
            }
        }
    }

    public static Context com_appsflyer_AFSensorManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static boolean m27(int i2) {
        if (i2 < 0 || !f39.get(i2)) {
            return false;
        }
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static AFSensorManager m26(Context context) {
        if (sInstance != null) {
            return sInstance;
        }
        return m23((SensorManager) com_appsflyer_AFSensorManager_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(com_appsflyer_AFSensorManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context), "sensor"), f40);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static AFSensorManager m23(SensorManager sensorManager, Handler handler) {
        MethodCollector.i(3254);
        if (sInstance == null) {
            synchronized (AFSensorManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new AFSensorManager(sensorManager, handler);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3254);
                    throw th;
                }
            }
        }
        AFSensorManager aFSensorManager = sInstance;
        MethodCollector.o(3254);
        return aFSensorManager;
    }

    private AFSensorManager(SensorManager sensorManager, Handler handler) {
        BitSet bitSet = f39;
        this.f43 = new HashMap(bitSet.size());
        this.f53 = new ConcurrentHashMap(bitSet.size());
        this.f46 = new Runnable() {
            /* class com.appsflyer.AFSensorManager.AnonymousClass2 */

            static {
                Covode.recordClassIndex(2654);
            }

            public final void run() {
                MethodCollector.i(205);
                synchronized (AFSensorManager.this.f49) {
                    try {
                        AFSensorManager aFSensorManager = AFSensorManager.this;
                        try {
                            for (Sensor sensor : aFSensorManager.f45.getSensorList(-1)) {
                                if (AFSensorManager.m27(sensor.getType())) {
                                    r rVar = new r(sensor.getType(), sensor.getName(), sensor.getVendor());
                                    if (!aFSensorManager.f43.containsKey(rVar)) {
                                        aFSensorManager.f43.put(rVar, rVar);
                                    }
                                    aFSensorManager.f45.registerListener(aFSensorManager.f43.get(rVar), sensor, 0);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        aFSensorManager.f52 = true;
                        AFSensorManager.this.f41.postDelayed(AFSensorManager.this.f44, 100);
                        AFSensorManager.this.f48 = true;
                    } finally {
                        MethodCollector.o(205);
                    }
                }
            }
        };
        this.f51 = new Runnable() {
            /* class com.appsflyer.AFSensorManager.AnonymousClass5 */

            static {
                Covode.recordClassIndex(2657);
            }

            public final void run() {
                MethodCollector.i(2423);
                synchronized (AFSensorManager.this.f49) {
                    try {
                        AFSensorManager.this.m30();
                    } finally {
                        MethodCollector.o(2423);
                    }
                }
            }
        };
        this.f50 = new Runnable() {
            /* class com.appsflyer.AFSensorManager.AnonymousClass3 */

            static {
                Covode.recordClassIndex(2655);
            }

            public final void run() {
                MethodCollector.i(3093);
                synchronized (AFSensorManager.this.f49) {
                    try {
                        if (AFSensorManager.this.f48) {
                            AFSensorManager.this.f41.removeCallbacks(AFSensorManager.this.f46);
                            AFSensorManager.this.f41.removeCallbacks(AFSensorManager.this.f51);
                            AFSensorManager.this.m30();
                            AFSensorManager.this.f48 = false;
                        }
                    } finally {
                        MethodCollector.o(3093);
                    }
                }
            }
        };
        this.f42 = 1;
        this.f47 = 0;
        this.f44 = new Runnable() {
            /* class com.appsflyer.AFSensorManager.AnonymousClass4 */

            static {
                Covode.recordClassIndex(2656);
            }

            public final void run() {
                MethodCollector.i(2889);
                synchronized (AFSensorManager.this.f49) {
                    try {
                        if (AFSensorManager.this.f42 == 0) {
                            AFSensorManager.this.f42 = 1;
                        }
                        AFSensorManager.this.f41.postDelayed(AFSensorManager.this.f51, ((long) AFSensorManager.this.f42) * 500);
                    } finally {
                        MethodCollector.o(2889);
                    }
                }
            }
        };
        this.f45 = sensorManager;
        this.f41 = handler;
    }

    public static Object com_appsflyer_AFSensorManager_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(223);
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
                    MethodCollector.o(223);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
