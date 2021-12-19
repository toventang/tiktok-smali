package com.google.android.gms.common.util;

import com.bytedance.covode.number.Covode;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f50511a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f50512b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    static {
        Covode.recordClassIndex(31471);
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i2 = 0; i2 < length; i2++) {
            char[] cArr = f50512b;
            sb.append(cArr[(bArr[i2] & 240) >>> 4]);
            sb.append(cArr[bArr[i2] & 15]);
        }
        return sb.toString();
    }
}
