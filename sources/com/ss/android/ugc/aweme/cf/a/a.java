package com.ss.android.ugc.aweme.cf.a;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(43073);
    }

    private static int a(int i2, int i3, int i4, int i5, int i6) {
        return ((((((((i2 + 31) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6;
    }

    public static int a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i2 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        if (obj3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = obj3.hashCode();
        }
        if (obj4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj4.hashCode();
        }
        if (obj5 != null) {
            i2 = obj5.hashCode();
        }
        return a(hashCode, hashCode2, hashCode3, hashCode4, i2);
    }
}
