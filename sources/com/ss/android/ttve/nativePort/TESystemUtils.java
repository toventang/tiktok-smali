package com.ss.android.ttve.nativePort;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ttve.audio.a;
import com.ss.android.ttve.model.f;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.vesdk.runtime.VERuntime;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TESystemUtils {
    static {
        Covode.recordClassIndex(37731);
    }

    public static int getOutputAudioDeviceType() {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.a().ordinal();
        }
        return f.DEFAULT.ordinal();
    }

    public static boolean hasLowLatencyFeature() {
        PackageManager packageManager;
        Context context = VERuntime.a.INSTANCE.veRuntime.f151396a;
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        return packageManager.hasSystemFeature("android.hardware.audio.low_latency");
    }

    public static Pair<Integer, Integer> getSuggestedOutputProperty() {
        Context context = VERuntime.a.INSTANCE.veRuntime.f151396a;
        if (context == null) {
            return null;
        }
        int i2 = Build.VERSION.SDK_INT;
        AudioManager audioManager = (AudioManager) com_ss_android_ttve_nativePort_TESystemUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, DataType.AUDIO);
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        String property2 = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(property)), Integer.valueOf(Integer.parseInt(property2)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getOutputLatency(int i2) {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("android.media.AudioSystem");
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("getOutputLatency", Integer.TYPE)) == null) {
                return 0;
            }
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(cls, Integer.valueOf(i2))).intValue();
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return 0;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return 0;
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
            return 0;
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static Object com_ss_android_ttve_nativePort_TESystemUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(2519);
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
                    MethodCollector.o(2519);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
