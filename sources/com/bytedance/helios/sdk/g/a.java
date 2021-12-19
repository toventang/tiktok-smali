package com.bytedance.helios.sdk.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import h.m.d;

public final class a {
    static {
        Covode.recordClassIndex(17997);
    }

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        return str.getBytes(d.f158808a);
    }

    public static long a(byte[] bArr) {
        int length = bArr.length;
        int i2 = length >> 3;
        long j2 = 104729;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = (i3 << 3) + 0;
            j2 = (Long.rotateLeft(j2 ^ (Long.rotateLeft(((((((((((long) bArr[i4]) & 255) | ((((long) bArr[i4 + 1]) & 255) << 8)) | ((((long) bArr[i4 + 2]) & 255) << 16)) | ((((long) bArr[i4 + 3]) & 255) << 24)) | ((((long) bArr[i4 + 4]) & 255) << 32)) | ((((long) bArr[i4 + 5]) & 255) << 40)) | ((((long) bArr[i4 + 6]) & 255) << 48)) | ((((long) bArr[i4 + 7]) & 255) << 56)) * -8663945395140668459L, 31) * 5545529020109919103L), 27) * 5) + 1390208809;
        }
        int i5 = (i2 << 3) + 0;
        long j3 = 0;
        switch ((length + 0) - i5) {
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                j3 = 0 ^ ((((long) bArr[i5 + 6]) & 255) << 48);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                j3 ^= (((long) bArr[i5 + 5]) & 255) << 40;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                j3 ^= (((long) bArr[i5 + 4]) & 255) << 32;
            case 4:
                j3 ^= (((long) bArr[i5 + 3]) & 255) << 24;
            case 3:
                j3 ^= (((long) bArr[i5 + 2]) & 255) << 16;
            case 2:
                j3 ^= (((long) bArr[i5 + 1]) & 255) << 8;
            case 1:
                j2 ^= Long.rotateLeft(((((long) bArr[i5]) & 255) ^ j3) * -8663945395140668459L, 31) * 5545529020109919103L;
                break;
        }
        long j4 = ((long) length) ^ j2;
        long j5 = (j4 ^ (j4 >>> 33)) * -49064778989728563L;
        long j6 = (j5 ^ (j5 >>> 33)) * -4265267296055464877L;
        return j6 ^ (j6 >>> 33);
    }
}
