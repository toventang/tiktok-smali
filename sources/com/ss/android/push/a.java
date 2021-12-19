package com.ss.android.push;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(37115);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static boolean b(Intent intent, String str) {
        Object a2;
        Bundle a3 = a(intent);
        if (a3 == null || (a2 = a(a3, str)) == null) {
            return false;
        }
        if (a2 instanceof String) {
            try {
                return Boolean.parseBoolean((String) a2);
            } catch (NumberFormatException unused) {
                return false;
            }
        } else {
            try {
                return ((Boolean) a2).booleanValue();
            } catch (ClassCastException unused2) {
                return false;
            }
        }
    }

    public static long a(Intent intent, String str) {
        Object a2;
        Bundle a3 = a(intent);
        if (a3 == null || (a2 = a(a3, str)) == null) {
            return -1;
        }
        if (a2 instanceof String) {
            try {
                return Long.parseLong((String) a2);
            } catch (NumberFormatException unused) {
                return -1;
            }
        } else {
            try {
                return ((Long) a2).longValue();
            } catch (ClassCastException unused2) {
                return -1;
            }
        }
    }

    public static int a(Intent intent, String str, int i2) {
        Object a2;
        Bundle a3 = a(intent);
        if (a3 == null || (a2 = a(a3, str)) == null) {
            return i2;
        }
        if (a2 instanceof String) {
            try {
                return Integer.parseInt((String) a2);
            } catch (NumberFormatException unused) {
                return i2;
            }
        } else {
            try {
                return ((Integer) a2).intValue();
            } catch (ClassCastException unused2) {
                return i2;
            }
        }
    }
}
