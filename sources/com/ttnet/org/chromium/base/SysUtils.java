package com.ttnet.org.chromium.base;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ttnet.org.chromium.base.metrics.a;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SysUtils {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f155193a = true;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f155194b;

    /* renamed from: c  reason: collision with root package name */
    private static Integer f155195c;

    /* renamed from: d  reason: collision with root package name */
    private static a.C4115a f155196d = new a.C4115a("Android.SysUtilsLowEndMatches");

    private static native void nativeLogPageFaultCountToTracing();

    private SysUtils() {
    }

    static {
        Covode.recordClassIndex(103276);
    }

    public static boolean isCurrentlyLowMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) a(c.f155223a, "activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    private static int a() {
        MethodCollector.i(13219);
        Pattern compile = Pattern.compile("^MemTotal:\\s+([0-9]+) kB$");
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            FileReader fileReader = new FileReader("/proc/meminfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        Matcher matcher = compile.matcher(readLine);
                        if (matcher.find()) {
                            int parseInt = Integer.parseInt(matcher.group(1));
                            if (parseInt <= 1024) {
                                matcher.group(1);
                            } else {
                                bufferedReader.close();
                                fileReader.close();
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                MethodCollector.o(13219);
                                return parseInt;
                            }
                        }
                    } catch (Throwable th) {
                        bufferedReader.close();
                        MethodCollector.o(13219);
                        throw th;
                    }
                }
                bufferedReader.close();
                fileReader.close();
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                MethodCollector.o(13219);
                return 0;
            } catch (Throwable th2) {
                fileReader.close();
                MethodCollector.o(13219);
                throw th2;
            }
        } catch (Exception unused) {
        } catch (Throwable th3) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            MethodCollector.o(13219);
            throw th3;
        }
    }

    public static boolean isLowEndDevice() {
        boolean z;
        boolean z2;
        if (f155194b == null) {
            boolean z3 = true;
            if (f155193a || CommandLine.f155128a.get() != null) {
                if (!CommandLine.b().a()) {
                    if (CommandLine.b().a()) {
                        z3 = false;
                    } else {
                        Integer valueOf = Integer.valueOf(a());
                        f155195c = valueOf;
                        if (valueOf.intValue() <= 0 || (Build.VERSION.SDK_INT < 26 ? f155195c.intValue() / 1024 > 512 : f155195c.intValue() / 1024 > 1024)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (c.f155223a != null) {
                            int i2 = Build.VERSION.SDK_INT;
                            z2 = ((ActivityManager) a(c.f155223a, "activity")).isLowRamDevice();
                        } else {
                            z2 = false;
                        }
                        a.C4115a aVar = f155196d;
                        if (z != z2) {
                            z3 = false;
                        }
                        aVar.a(z3);
                        z3 = z;
                    }
                }
                f155194b = Boolean.valueOf(z3);
            } else {
                throw new AssertionError();
            }
        }
        return f155194b.booleanValue();
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(13221);
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
                    MethodCollector.o(13221);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
