package com.ss.android.ttve.audio;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ttve.model.f;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.vesdk.runtime.VERuntime;
import java.lang.reflect.Field;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f61040a = a.class.getSimpleName();

    static {
        Covode.recordClassIndex(37597);
    }

    public static AudioDeviceInfo b() {
        AudioDeviceInfo[] devices = ((AudioManager) a(VERuntime.a.INSTANCE.veRuntime.f151396a, DataType.AUDIO)).getDevices(1);
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (audioDeviceInfo.getType() == 15) {
                return audioDeviceInfo;
            }
        }
        return null;
    }

    public static f a() {
        boolean[] zArr = new boolean[f.values().length];
        int ordinal = f.BLUETOOTH.ordinal();
        int ordinal2 = f.WIRED.ordinal();
        AudioDeviceInfo[] devices = ((AudioManager) a(VERuntime.a.INSTANCE.veRuntime.f151396a, DataType.AUDIO)).getDevices(2);
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 8) {
                zArr[ordinal] = true;
            } else if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                zArr[ordinal2] = true;
            }
        }
        if (zArr[ordinal2]) {
            return f.WIRED;
        }
        if (zArr[ordinal]) {
            return f.BLUETOOTH;
        }
        return f.DEFAULT;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(428);
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
                    MethodCollector.o(428);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
