package com.bytedance.apm.q;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.c;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static String f25256a;

    static {
        Covode.recordClassIndex(14713);
    }

    public static String a() {
        String str = f25256a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String b2 = b();
        f25256a = b2;
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    private static String b() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder(32);
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb.append((char) read);
                    } else {
                        String sb2 = sb.toString();
                        c.a(bufferedReader);
                        return sb2;
                    }
                }
            } catch (Throwable unused) {
                c.a(bufferedReader);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            c.a(bufferedReader);
            return null;
        }
    }
}
