package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class bc {

    /* renamed from: a  reason: collision with root package name */
    private static UserManager f50694a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f50695b = (!a());

    /* renamed from: c  reason: collision with root package name */
    private static boolean f50696c = false;

    private bc() {
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(31669);
    }

    static boolean a(Context context) {
        MethodCollector.i(6821);
        if (f50695b) {
            MethodCollector.o(6821);
            return true;
        }
        synchronized (bc.class) {
            try {
                if (f50695b) {
                    return true;
                }
                boolean b2 = b(context);
                if (b2) {
                    f50695b = b2;
                }
                MethodCollector.o(6821);
                return b2;
            } finally {
                MethodCollector.o(6821);
            }
        }
    }

    private static boolean b(Context context) {
        boolean z;
        boolean z2 = true;
        int i2 = 1;
        while (true) {
            z = false;
            if (i2 > 2) {
                break;
            }
            if (f50694a == null) {
                f50694a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f50694a;
            if (userManager == null) {
                return true;
            }
            try {
                if (!userManager.isUserUnlocked() && userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
                z = z2;
                if (z) {
                    f50694a = null;
                }
            } catch (NullPointerException unused) {
                f50694a = null;
                i2++;
            }
        }
        return z;
    }
}
