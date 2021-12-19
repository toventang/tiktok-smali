package com.ss.android.socialbase.downloader.k;

import com.bytedance.covode.number.Covode;

public final class j {
    static {
        Covode.recordClassIndex(37530);
    }

    public static StringBuilder a(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 < i2 - 1) {
                sb.append("?,");
            } else {
                sb.append('?');
            }
        }
        return sb;
    }

    public static StringBuilder b(StringBuilder sb, String[] strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            sb.append('\"').append(strArr[i2]).append('\"');
            sb.append("=?");
            if (i2 < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    public static StringBuilder a(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append('\"').append(strArr[i2]).append('\"');
            if (i2 < length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    public static StringBuilder a(StringBuilder sb, String str, String[] strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            sb.append(str).append(".\"").append(strArr[i2]).append('\"');
            sb.append("=?");
            if (i2 < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }
}
