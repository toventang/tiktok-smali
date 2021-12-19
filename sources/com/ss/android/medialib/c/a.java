package com.ss.android.medialib.c;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f59715a = a.class.getSimpleName();

    static {
        Covode.recordClassIndex(36872);
    }

    public static Pair<Integer, Integer> a(Context context) {
        int i2 = 256;
        int i3 = 44100;
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                packageManager.hasSystemFeature("android.hardware.audio.low_latency");
                packageManager.hasSystemFeature("android.hardware.audio.pro");
            }
            int i4 = Build.VERSION.SDK_INT;
            AudioManager audioManager = (AudioManager) a(context, DataType.AUDIO);
            i3 = a(audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"), 44100);
            i2 = a(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER"), 256);
        }
        return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i2));
    }

    private static int a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return i2;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i2;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(4448);
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
                    MethodCollector.o(4448);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
