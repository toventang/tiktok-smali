package com.google.android.gms.common.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f50508a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f50509b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f50510c;

    static {
        Covode.recordClassIndex(31470);
    }

    public static boolean b(Context context) {
        if (!a(context)) {
            return false;
        }
        if (!k.d()) {
            return true;
        }
        if (!c(context) || k.e()) {
            return false;
        }
        return true;
    }

    public static boolean a(Context context) {
        boolean z;
        if (f50509b == null) {
            if (!k.b() || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                z = false;
            } else {
                z = true;
            }
            f50509b = Boolean.valueOf(z);
        }
        return f50509b.booleanValue();
    }

    private static boolean c(Context context) {
        boolean z;
        if (f50510c == null) {
            if (!k.c() || !context.getPackageManager().hasSystemFeature("cn.google")) {
                z = false;
            } else {
                z = true;
            }
            f50510c = Boolean.valueOf(z);
        }
        return f50510c.booleanValue();
    }
}
