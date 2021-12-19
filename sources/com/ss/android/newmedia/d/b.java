package com.ss.android.newmedia.d;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(37048);
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

    public static int a(Intent intent, String str) {
        Object a2;
        Bundle a3 = a(intent);
        if (a3 == null || (a2 = a(a3, str)) == null) {
            return -1;
        }
        if (a2 instanceof String) {
            try {
                return Integer.parseInt((String) a2);
            } catch (NumberFormatException unused) {
                return -1;
            }
        } else {
            try {
                return ((Integer) a2).intValue();
            } catch (ClassCastException unused2) {
                return -1;
            }
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
}
