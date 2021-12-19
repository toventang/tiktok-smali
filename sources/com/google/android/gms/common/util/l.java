package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static String f50513a;

    /* renamed from: b  reason: collision with root package name */
    private static int f50514b;

    static {
        Covode.recordClassIndex(31474);
    }

    public static String a() {
        if (f50513a == null) {
            if (f50514b == 0) {
                f50514b = Process.myPid();
            }
            f50513a = a(f50514b);
        }
        return f50513a;
    }

    private static BufferedReader a(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static String a(int i2) {
        BufferedReader bufferedReader;
        Throwable th;
        MethodCollector.i(11367);
        String str = null;
        if (i2 <= 0) {
            MethodCollector.o(11367);
            return null;
        }
        try {
            bufferedReader = a(new StringBuilder(25).append("/proc/").append(i2).append("/cmdline").toString());
            try {
                str = bufferedReader.readLine().trim();
                j.a(bufferedReader);
            } catch (IOException unused) {
                j.a(bufferedReader);
                MethodCollector.o(11367);
                return str;
            } catch (Throwable th2) {
                th = th2;
                j.a(bufferedReader);
                MethodCollector.o(11367);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
            j.a(bufferedReader);
            MethodCollector.o(11367);
            return str;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            j.a(bufferedReader);
            MethodCollector.o(11367);
            throw th;
        }
        MethodCollector.o(11367);
        return str;
    }
}
