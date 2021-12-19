package com.bytedance.platform.b.a;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.b.d;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static Handler f41905a = new Handler(f41909e.getLooper());

    /* renamed from: b  reason: collision with root package name */
    public static boolean f41906b;

    /* renamed from: c  reason: collision with root package name */
    public static int f41907c = 10000;

    /* renamed from: d  reason: collision with root package name */
    public static int f41908d = 10000;

    /* renamed from: e  reason: collision with root package name */
    private static HandlerThread f41909e = d.a("pool-monitor");

    static {
        Covode.recordClassIndex(25597);
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr == null) {
            return str;
        }
        for (int i2 = 0; i2 < stackTraceElementArr.length; i2++) {
            str = str + stackTraceElementArr[i2].toString() + "\n";
        }
        return str;
    }
}
