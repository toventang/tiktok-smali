package com.ss.android.ttve.monitor;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static String f61194a;

    static {
        Covode.recordClassIndex(37681);
    }

    public static int c() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() {
                /* class com.ss.android.ttve.monitor.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(37682);
                }

                public final boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]", file.getName());
                }
            }).length;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 1;
        }
    }

    public static String b() {
        String str;
        MethodCollector.i(2447);
        InputStream inputStream = null;
        try {
            inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            str = "";
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            try {
                inputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            str = "0";
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            MethodCollector.o(2447);
            throw th;
        }
        String trim = str.trim();
        MethodCollector.o(2447);
        return trim;
    }

    public static String a() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        Throwable th;
        MethodCollector.i(2445);
        if (!TextUtils.isEmpty(f61194a)) {
            String str = f61194a;
            MethodCollector.o(2445);
            return str;
        }
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader);
                try {
                    String readLine = bufferedReader.readLine();
                    while (true) {
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.startsWith("Hardware") && readLine.contains(":")) {
                            String substring = readLine.substring(readLine.indexOf(":") + 1);
                            if (!TextUtils.isEmpty(substring)) {
                                f61194a = substring.trim();
                                break;
                            }
                        }
                        readLine = bufferedReader.readLine();
                    }
                    if (TextUtils.isEmpty(f61194a)) {
                        f61194a = a("ro.board.platform");
                    }
                    String str2 = f61194a;
                    a(bufferedReader);
                    a(fileReader);
                    MethodCollector.o(2445);
                    return str2;
                } catch (IOException unused) {
                    a(bufferedReader);
                    a(fileReader);
                    MethodCollector.o(2445);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    a(bufferedReader2);
                    a(fileReader);
                    MethodCollector.o(2445);
                    throw th;
                }
            } catch (IOException unused2) {
                bufferedReader = null;
                a(bufferedReader);
                a(fileReader);
                MethodCollector.o(2445);
                return null;
            } catch (Throwable th3) {
                th = th3;
                a(bufferedReader2);
                a(fileReader);
                MethodCollector.o(2445);
                throw th;
            }
        } catch (IOException unused3) {
            fileReader = null;
            bufferedReader = null;
            a(bufferedReader);
            a(fileReader);
            MethodCollector.o(2445);
            return null;
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
            a(bufferedReader2);
            a(fileReader);
            MethodCollector.o(2445);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        if (r4 == null) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0066 A[SYNTHETIC, Splitter:B:38:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0070 A[SYNTHETIC, Splitter:B:43:0x0070] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long d() {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.monitor.d.d():long");
    }

    private static void a(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        Display defaultDisplay = ((WindowManager) a(context, "window")).getDefaultDisplay();
        int i2 = Build.VERSION.SDK_INT;
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point.y;
    }

    private static String a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2460);
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
                    MethodCollector.o(2460);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
