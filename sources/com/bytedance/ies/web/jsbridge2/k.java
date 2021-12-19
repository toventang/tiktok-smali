package com.bytedance.ies.web.jsbridge2;

import android.util.Log;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    static boolean f35671a;

    static {
        Covode.recordClassIndex(21299);
    }

    static void a(RuntimeException runtimeException) {
        if (f35671a) {
            throw runtimeException;
        }
    }

    static void b(Throwable th) {
        if (f35671a) {
            Log.getStackTraceString(th);
        }
    }

    static void a(Throwable th) {
        if (f35671a) {
            Log.getStackTraceString(th);
        }
    }
}
