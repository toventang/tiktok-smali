package com.squareup.a.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.d.a.a.a.a.a;

public final class i {
    static {
        Covode.recordClassIndex(35951);
    }

    public static boolean a(String str) {
        if (str.equals("POST") || str.equals("PATCH") || str.equals(a.f28513c) || str.equals(a.f28514d) || str.equals("MOVE")) {
            return true;
        }
        return false;
    }

    public static boolean b(String str) {
        if (str.equals("POST") || str.equals(a.f28513c) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            return true;
        }
        return false;
    }

    public static boolean c(String str) {
        if (b(str) || str.equals(a.f28515e) || str.equals(a.f28514d) || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK")) {
            return true;
        }
        return false;
    }
}
