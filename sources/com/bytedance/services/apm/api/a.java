package com.bytedance.services.apm.api;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static IEnsure f44093a;

    static {
        Covode.recordClassIndex(26956);
    }

    public static void a(String str) {
        IEnsure iEnsure = f44093a;
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere(str);
        }
    }

    public static void a(Throwable th) {
        IEnsure iEnsure = f44093a;
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere(th);
        }
    }

    public static boolean a(Object obj) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        IEnsure iEnsure = f44093a;
        if (iEnsure == null) {
            return z;
        }
        iEnsure.ensureNotNull(obj);
        return z;
    }

    public static void a(String str, Map<String, String> map) {
        IEnsure iEnsure = f44093a;
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere(str, map);
        }
    }

    public static void a(Throwable th, String str) {
        IEnsure iEnsure = f44093a;
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere(th, str);
        }
    }

    public static boolean a(Object obj, String str) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        IEnsure iEnsure = f44093a;
        if (iEnsure == null) {
            return z;
        }
        iEnsure.ensureNotNull(obj, str);
        return z;
    }
}
