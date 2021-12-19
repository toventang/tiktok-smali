package org.apache.http.util;

import com.bytedance.covode.number.Covode;

public final class LangUtils {
    static {
        Covode.recordClassIndex(106434);
    }

    public static int hashCode(int i2, int i3) {
        return (i2 * 37) + i3;
    }

    public static int hashCode(int i2, boolean z) {
        return hashCode(i2, z ? 1 : 0);
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static int hashCode(int i2, Object obj) {
        int i3;
        if (obj != null) {
            i3 = obj.hashCode();
        } else {
            i3 = 0;
        }
        return hashCode(i2, i3);
    }

    public static boolean equals(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            if (objArr2 == null) {
                return true;
            }
            return false;
        } else if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        } else {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                if (!equals(objArr[i2], objArr2[i2])) {
                    return false;
                }
            }
            return true;
        }
    }
}
