package com.ss.android.ugc.aweme.m;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.math.BigDecimal;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static AudioManager f109042a;

    /* renamed from: b  reason: collision with root package name */
    public static int f109043b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f109044c = false;

    /* renamed from: d  reason: collision with root package name */
    public static C2795a f109045d = null;

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f109046e = false;

    /* renamed from: f  reason: collision with root package name */
    private static int f109047f = -1;

    static {
        Covode.recordClassIndex(69831);
    }

    /* renamed from: com.ss.android.ugc.aweme.m.a$a  reason: collision with other inner class name */
    public static class C2795a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<AudioManager> f109048a;

        static {
            Covode.recordClassIndex(69832);
        }

        public C2795a(AudioManager audioManager) {
            this.f109048a = new WeakReference<>(audioManager);
        }

        public final void onReceive(Context context, Intent intent) {
            int streamVolume;
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && this.f109048a.get() != null && (streamVolume = this.f109048a.get().getStreamVolume(3)) >= 0) {
                    a.f109043b = streamVolume;
                }
            } catch (Exception unused) {
                a.f109043b = -1;
            }
        }
    }

    public static int a(Context context) {
        if (d(context)) {
            return -1;
        }
        if (f109047f < 0) {
            f109047f = f109042a.getStreamMaxVolume(3);
        }
        return f109047f;
    }

    public static int b(Context context) {
        if (d(context)) {
            return -1;
        }
        try {
            return f109042a.getStreamVolume(3);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static boolean d(Context context) {
        if (f109042a == null) {
            try {
                f109042a = (AudioManager) a(context, DataType.AUDIO);
            } catch (Exception unused) {
            }
        }
        if (f109042a == null) {
            return true;
        }
        return false;
    }

    public static double a(int i2) {
        if (d(d.a())) {
            return 0.0d;
        }
        try {
            if (f109047f < 0) {
                f109047f = a(d.a());
            }
            if (f109043b < 0 || !f109044c) {
                f109043b = b(d.a());
            }
            double d2 = (double) f109043b;
            Double.isNaN(d2);
            double d3 = (double) f109047f;
            Double.isNaN(d3);
            return new BigDecimal((d2 * 1.0d) / d3).setScale(i2, 4).doubleValue();
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static boolean c(Context context) {
        if (d(context)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            AudioDeviceInfo[] devices = f109042a.getDevices(2);
            if (devices == null) {
                return false;
            }
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                int type = audioDeviceInfo.getType();
                if (type == 3 || type == 4 || type == 7 || type == 8) {
                    return true;
                }
            }
            return false;
        } else if (f109042a.isWiredHeadsetOn() || f109042a.isBluetoothScoOn() || f109042a.isBluetoothA2dpOn()) {
            return true;
        } else {
            return false;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2285);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(2285);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static boolean a(Context context, int i2) {
        if (d(context)) {
            return false;
        }
        try {
            f109042a.setStreamVolume(3, i2, 16);
            return true;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.m.a.a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    private static Intent b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }
}
