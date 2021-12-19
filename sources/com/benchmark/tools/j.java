package com.benchmark.tools;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class j {
    static {
        Covode.recordClassIndex(3070);
    }

    public static int a() {
        int i2 = Build.VERSION.SDK_INT;
        return Runtime.getRuntime().availableProcessors();
    }

    public static long b() {
        String str;
        MethodCollector.i(3489);
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            str = "";
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
            str = "0";
        }
        long parseLong = Long.parseLong(str.trim());
        MethodCollector.o(3489);
        return parseLong;
    }

    public static float a(float f2) {
        return ((float) Math.floor((double) (f2 * 100.0f))) / 100.0f;
    }

    public static synchronized String a(String str) {
        byte[] digest;
        String str2;
        synchronized (j.class) {
            MethodCollector.i(3493);
            byte[] bytes = str.getBytes();
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                instance.update(bytes);
                str2 = "";
                for (byte b2 : instance.digest()) {
                    String hexString = Integer.toHexString(b2 & 255);
                    if (hexString.length() == 1) {
                        str2 = str2 + "0";
                    }
                    str2 = str2 + hexString;
                }
                MethodCollector.o(3493);
            } catch (NoSuchAlgorithmException unused) {
                MethodCollector.o(3493);
                return null;
            }
        }
        return str2;
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3485);
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
                    MethodCollector.o(3485);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
