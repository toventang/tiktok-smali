package com.bytedance.geckox.utils;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileLock {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Integer> f30119a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final int f30120b;

    /* renamed from: c  reason: collision with root package name */
    private final String f30121c;

    private static native int nGetFD(String str);

    private static native void nLockFile(int i2);

    private static native void nLockFileSegment(int i2, int i3);

    private static native void nRelease(int i2);

    private static native boolean nTryLock(int i2);

    private static native void nUnlockFile(int i2);

    static {
        Covode.recordClassIndex(17482);
        h.a("file_lock");
    }

    public final void a() {
        MethodCollector.i(8165);
        try {
            nUnlockFile(this.f30120b);
            MethodCollector.o(8165);
        } catch (Exception unused) {
            RuntimeException runtimeException = new RuntimeException("release lock failed，path:" + this.f30121c);
            MethodCollector.o(8165);
            throw runtimeException;
        }
    }

    public final void b() {
        Integer remove;
        MethodCollector.i(8225);
        Map<String, Integer> map = f30119a;
        synchronized (map) {
            try {
                remove = map.remove(this.f30121c);
            } catch (Throwable th) {
                MethodCollector.o(8225);
                throw th;
            }
        }
        try {
            nRelease(remove.intValue());
            MethodCollector.o(8225);
        } catch (Exception e2) {
            RuntimeException runtimeException = new RuntimeException("release lock failed, file:" + this.f30121c + " caused by:" + e2.getMessage());
            MethodCollector.o(8225);
            throw runtimeException;
        }
    }

    private static int d(String str) {
        Integer num;
        MethodCollector.i(8157);
        Map<String, Integer> map = f30119a;
        synchronized (map) {
            try {
                num = map.get(str);
                if (num == null) {
                    new File(str).getParentFile().mkdirs();
                    num = Integer.valueOf(nGetFD(str));
                    map.put(str, num);
                }
            } catch (Throwable th) {
                MethodCollector.o(8157);
                throw th;
            }
        }
        int intValue = num.intValue();
        MethodCollector.o(8157);
        return intValue;
    }

    public static FileLock a(String str) {
        MethodCollector.i(7431);
        try {
            int d2 = d(str);
            nLockFile(d2);
            FileLock fileLock = new FileLock(str, d2);
            MethodCollector.o(7431);
            return fileLock;
        } catch (Exception e2) {
            RuntimeException runtimeException = new RuntimeException("lock failed, file:" + str + ", pid:" + Process.myPid() + " caused by:" + e2.getMessage());
            MethodCollector.o(7431);
            throw runtimeException;
        }
    }

    public static FileLock b(String str) {
        MethodCollector.i(7508);
        try {
            int d2 = d(str);
            if (!nTryLock(d2)) {
                MethodCollector.o(7508);
                return null;
            }
            FileLock fileLock = new FileLock(str, d2);
            MethodCollector.o(7508);
            return fileLock;
        } catch (Exception e2) {
            RuntimeException runtimeException = new RuntimeException("try lock failed, file:" + str + " caused by:" + e2.getMessage());
            MethodCollector.o(7508);
            throw runtimeException;
        }
    }

    public static FileLock c(String str) {
        MethodCollector.i(7556);
        try {
            int d2 = d(str);
            if (!nTryLock(d2)) {
                new FileLock(str, d2).b();
                MethodCollector.o(7556);
                return null;
            }
            FileLock fileLock = new FileLock(str, d2);
            MethodCollector.o(7556);
            return fileLock;
        } catch (Exception e2) {
            RuntimeException runtimeException = new RuntimeException("try lock failed, file:" + str + " caused by:" + e2.getMessage());
            MethodCollector.o(7556);
            throw runtimeException;
        }
    }

    private FileLock(String str, int i2) {
        this.f30121c = str;
        this.f30120b = i2;
    }

    public static FileLock a(String str, int i2) {
        MethodCollector.i(7570);
        try {
            int d2 = d(str);
            nLockFileSegment(d2, i2);
            FileLock fileLock = new FileLock(str, d2);
            MethodCollector.o(7570);
            return fileLock;
        } catch (Exception e2) {
            RuntimeException runtimeException = new RuntimeException("lock segment failed, file:" + str + " caused by:" + e2.getMessage());
            MethodCollector.o(7570);
            throw runtimeException;
        }
    }
}
