package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Locale;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f155828a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static int f155829b = 0;

    static {
        Covode.recordClassIndex(103542);
    }

    static void a(StringBuilder sb) {
        sb.append(" Cronet/");
        sb.append("TTNetVersion:a6246045 2021-11-26 QuicVersion:705d0b81 2021-08-12");
    }

    private static int b(Context context) {
        int i2;
        MethodCollector.i(12183);
        synchronized (f155828a) {
            try {
                if (f155829b == 0) {
                    try {
                        f155829b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException unused) {
                        IllegalStateException illegalStateException = new IllegalStateException("Cannot determine package version");
                        MethodCollector.o(12183);
                        throw illegalStateException;
                    }
                }
                i2 = f155829b;
            } finally {
                MethodCollector.o(12183);
            }
        }
        return i2;
    }

    public static String a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        sb.append(b(context));
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append("; Build/");
            sb.append(str2);
        }
        sb.append(";");
        a(sb);
        sb.append(')');
        return sb.toString();
    }
}
