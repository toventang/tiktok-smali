package com.ss.android.ugc.aweme.utils;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.m.d;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;

public final class bs {
    static {
        Covode.recordClassIndex(93362);
    }

    public static final long a(Context context) {
        MethodCollector.i(11755);
        l.d(context, "");
        int i2 = Build.VERSION.SDK_INT;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Object a2 = a(context, "activity");
        if (a2 != null) {
            ((ActivityManager) a2).getMemoryInfo(memoryInfo);
            long j2 = memoryInfo.totalMem;
            MethodCollector.o(11755);
            return j2;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        MethodCollector.o(11755);
        throw nullPointerException;
    }

    private static final int a(String str, FileInputStream fileInputStream) {
        MethodCollector.i(11922);
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i2 = 0;
            while (i2 < read) {
                if (bArr[i2] == 10 || i2 == 0) {
                    if (bArr[i2] == 10) {
                        i2++;
                    }
                    int i3 = i2;
                    while (i3 < read) {
                        int i4 = i3 - i2;
                        if (bArr[i3] != ((byte) str.charAt(i4))) {
                            continue;
                            break;
                        } else if (i4 == str.length() - 1) {
                            while (i3 < 1024 && bArr[i3] != 10) {
                                if (Character.isDigit(bArr[i3])) {
                                    int i5 = i3 + 1;
                                    while (i5 < 1024 && Character.isDigit(bArr[i5])) {
                                        i5++;
                                    }
                                    int parseInt = Integer.parseInt(new String(bArr, i3, i5 - i3, d.f158808a));
                                    MethodCollector.o(11922);
                                    return parseInt;
                                }
                                i3++;
                            }
                            MethodCollector.o(11922);
                            return -1;
                        } else {
                            i3++;
                        }
                    }
                    continue;
                }
                i2++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        MethodCollector.o(11922);
        return -1;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11757);
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
                    MethodCollector.o(11757);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
