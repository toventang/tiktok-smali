package com.apiguard3;

import com.apiguard3.internal.setNextFocusUpId;
import com.bytedance.covode.number.Covode;

public enum AGState {
    APIGuardStateNotReady,
    APIGuardStateInProgress,
    APIGuardStateFailed,
    APIGuardStateReady;
    
    private static char AGRequest;
    private static int addHeader;
    private static int getBody = 0;
    private static int getMethod;
    private static long getUrl;

    static void AGRequest() {
        AGRequest = 890;
        getUrl = 0;
        getMethod = 0;
    }

    static {
        Covode.recordClassIndex(2481);
        addHeader = 1;
        AGRequest();
        int i2 = getBody + 71;
        addHeader = i2 % 128;
        if (i2 % 2 == 0) {
            throw new NullPointerException("hashCode");
        }
    }

    private static String getUrl(String str, String str2, String str3, char c2, int i2) {
        char c3;
        int i3 = addHeader + 43;
        getBody = i3 % 128;
        if (i3 % 2 == 0) {
            c3 = 14;
        } else {
            c3 = '?';
        }
        char[] cArr = str3;
        cArr = str3;
        if (c3 == '?' ? str3 != null : str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        int i4 = 0;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            int i5 = getBody + 121;
            addHeader = i5 % 128;
            int i6 = i5 % 2;
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        char[] cArr7 = (char[]) cArr2.clone();
        char[] cArr8 = (char[]) cArr4.clone();
        cArr7[0] = (char) (c2 ^ cArr7[0]);
        cArr8[2] = (char) (cArr8[2] + ((char) i2));
        int length = cArr6.length;
        char[] cArr9 = new char[length];
        while (i4 < length) {
            int i7 = getBody + 95;
            addHeader = i7 % 128;
            int i8 = i7 % 2;
            setNextFocusUpId.getHeaders(cArr7, cArr8, i4);
            cArr9[i4] = (char) ((int) (((((long) (cArr6[i4] ^ cArr7[(i4 + 3) % 4])) ^ getUrl) ^ ((long) getMethod)) ^ ((long) AGRequest)));
            i4++;
            int i9 = getBody + 51;
            addHeader = i9 % 128;
            int i10 = i9 % 2;
        }
        return new String(cArr9);
    }
}
