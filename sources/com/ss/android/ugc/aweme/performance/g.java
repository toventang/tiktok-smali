package com.ss.android.ugc.aweme.performance;

import android.app.ActivityManager;
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
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final FileFilter f114804a = new FileFilter() {
        /* class com.ss.android.ugc.aweme.performance.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(73855);
        }

        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i2 = 3; i2 < name.length(); i2++) {
                if (!Character.isDigit(name.charAt(i2))) {
                    return false;
                }
            }
            return true;
        }
    };

    static {
        Covode.recordClassIndex(73854);
    }

    public static int a() {
        int i2 = Build.VERSION.SDK_INT;
        try {
            int a2 = a("/sys/devices/system/cpu/possible");
            if (a2 == -1) {
                a2 = a("/sys/devices/system/cpu/present");
            }
            if (a2 == -1) {
                return new File("/sys/devices/system/cpu/").listFiles(f114804a).length;
            }
            return a2;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static int b() {
        MethodCollector.i(4450);
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < a(); i4++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i5 = 0;
                        while (Character.isDigit(bArr[i5]) && i5 < 128) {
                            i5++;
                        }
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i5)));
                        if (valueOf.intValue() > i3) {
                            i3 = valueOf.intValue();
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th) {
                        fileInputStream.close();
                        MethodCollector.o(4450);
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
            }
        }
        if (i3 == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int a2 = a("cpu MHz", fileInputStream2) * 1000;
                if (a2 > i3) {
                    i3 = a2;
                }
                fileInputStream2.close();
            } catch (Throwable th2) {
                fileInputStream2.close();
                MethodCollector.o(4450);
                throw th2;
            }
        }
        i2 = i3;
        MethodCollector.o(4450);
        return i2;
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long a(Context context) {
        MethodCollector.i(4459);
        int i2 = Build.VERSION.SDK_INT;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) a(context, "activity")).getMemoryInfo(memoryInfo);
        long j2 = memoryInfo.totalMem;
        MethodCollector.o(4459);
        return j2;
    }

    private static int a(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        MethodCollector.i(4433);
        int i2 = -1;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2));
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (readLine.matches("0-[\\d]+$")) {
                            i2 = Integer.parseInt(readLine.substring(2)) + 1;
                        }
                    }
                    a(fileInputStream2);
                    a(bufferedReader);
                    MethodCollector.o(4433);
                    return i2;
                } catch (IOException unused) {
                    fileInputStream = fileInputStream2;
                    a(fileInputStream);
                    a(bufferedReader);
                    MethodCollector.o(4433);
                    return -1;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    a(fileInputStream);
                    a(bufferedReader);
                    MethodCollector.o(4433);
                    throw th;
                }
            } catch (IOException unused2) {
                bufferedReader = null;
                fileInputStream = fileInputStream2;
                a(fileInputStream);
                a(bufferedReader);
                MethodCollector.o(4433);
                return -1;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                fileInputStream = fileInputStream2;
                a(fileInputStream);
                a(bufferedReader);
                MethodCollector.o(4433);
                throw th;
            }
        } catch (IOException unused3) {
            bufferedReader = null;
            a(fileInputStream);
            a(bufferedReader);
            MethodCollector.o(4433);
            return -1;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            a(fileInputStream);
            a(bufferedReader);
            MethodCollector.o(4433);
            throw th;
        }
    }

    private static int a(String str, FileInputStream fileInputStream) {
        MethodCollector.i(4470);
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
                        if (bArr[i3] != str.charAt(i4)) {
                            continue;
                            break;
                        } else if (i4 == str.length() - 1) {
                            while (i3 < 1024 && bArr[i3] != 10) {
                                if (Character.isDigit(bArr[i3])) {
                                    int i5 = i3 + 1;
                                    while (i5 < 1024 && Character.isDigit(bArr[i5])) {
                                        i5++;
                                    }
                                    int parseInt = Integer.parseInt(new String(bArr, 0, i3, i5 - i3));
                                    MethodCollector.o(4470);
                                    return parseInt;
                                }
                                i3++;
                            }
                            MethodCollector.o(4470);
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
        MethodCollector.o(4470);
        return -1;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(4468);
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
                    MethodCollector.o(4468);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
