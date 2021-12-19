package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public final class Config {
    private static char AGRequest = 25416;
    private static int AGRequest$Builder = 1;
    private static int getBody;
    private static char getHeaders = 14937;
    private static char getMethod = 18473;
    private static char getUrl = 29217;

    static {
        Covode.recordClassIndex(2510);
    }

    private static byte[] getHeaders(ByteBuffer byteBuffer) {
        char c2;
        int i2 = getBody + 69;
        AGRequest$Builder = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        int i4 = AGRequest$Builder + 45;
        getBody = i4 % 128;
        if (i4 % 2 == 0) {
            c2 = 'F';
        } else {
            c2 = 'P';
        }
        if (c2 == 'F') {
            return bArr;
        }
        throw new NullPointerException("hashCode");
    }

    public static String getMethod(byte... bArr) {
        boolean z;
        char[] AGRequest2 = AGRequest(bArr);
        boolean z2 = false;
        if (AGRequest2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new String(AGRequest2);
        }
        int i2 = AGRequest$Builder;
        int i3 = i2 + 75;
        getBody = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 79;
        getBody = i5 % 128;
        if (i5 % 2 != 0) {
            z2 = true;
        }
        if (!z2) {
            return null;
        }
        throw new NullPointerException("hashCode");
    }

    private static char[] AGRequest(byte... bArr) {
        boolean z;
        char c2;
        int i2 = AGRequest$Builder + 43;
        getBody = i2 % 128;
        int i3 = i2 % 2;
        boolean z2 = true;
        if (i3 == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            throw new NullPointerException("hashCode");
        }
        if (bArr == null) {
            z2 = false;
        }
        if (z2) {
            if (bArr.length != 0) {
                c2 = '*';
            } else {
                c2 = 'R';
            }
            if (c2 != '*') {
                return new char[0];
            }
            CharBuffer decode = Charset.forName(getMethod("䤇䥹礉錆鷇窳").intern()).decode(ByteBuffer.wrap(bArr));
            char[] cArr = new char[decode.length()];
            decode.get(cArr);
            int i4 = getBody + 9;
            AGRequest$Builder = i4 % 128;
            int i5 = i4 % 2;
            return cArr;
        }
        int i6 = AGRequest$Builder + 21;
        getBody = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public static byte[] getHeaders(char... cArr) {
        boolean z;
        char c2;
        int i2 = getBody;
        int i3 = i2 + 113;
        AGRequest$Builder = i3 % 128;
        int i4 = i3 % 2;
        if (cArr != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i5 = i2 + 77;
            int i6 = i5 % 128;
            AGRequest$Builder = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 5;
            getBody = i8 % 128;
            if (i8 % 2 == 0) {
                c2 = '0';
            } else {
                c2 = 'b';
            }
            if (c2 == '0') {
                return null;
            }
            throw new NullPointerException("hashCode");
        } else if (cArr.length == 0) {
            byte[] bArr = new byte[0];
            int i9 = i2 + 27;
            AGRequest$Builder = i9 % 128;
            if (i9 % 2 != 0) {
                return bArr;
            }
            throw new NullPointerException("hashCode");
        } else {
            byte[] headers = getHeaders(Charset.forName(getMethod("䤇䥹礉錆鷇窳").intern()).encode(CharBuffer.wrap(cArr)));
            int i10 = getBody + 85;
            AGRequest$Builder = i10 % 128;
            int i11 = i10 % 2;
            return headers;
        }
    }

    private static String getMethod(String str) {
        int i2 = AGRequest$Builder + 119;
        getBody = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = new char[cArr2.length];
        char[] cArr4 = new char[2];
        for (int i4 = 0; i4 < cArr2.length; i4 += 2) {
            int i5 = AGRequest$Builder + 21;
            getBody = i5 % 128;
            int i6 = i5 % 2;
            cArr4[0] = cArr2[i4];
            int i7 = i4 + 1;
            cArr4[1] = cArr2[i7];
            setOnApplyWindowInsetsListener.AGRequest(cArr4, getHeaders, AGRequest, getMethod, getUrl);
            cArr3[i4] = cArr4[0];
            cArr3[i7] = cArr4[1];
        }
        return new String(cArr3, 1, (int) cArr3[0]);
    }

    public static byte[] getUrl(String str) {
        char c2;
        int i2 = getBody;
        int i3 = i2 + 69;
        AGRequest$Builder = i3 % 128;
        int i4 = i3 % 2;
        boolean z = false;
        if (str != null) {
            if (!str.isEmpty()) {
                c2 = '\"';
            } else {
                c2 = 27;
            }
            if (c2 != 27) {
                return getHeaders(Charset.forName(getMethod("䤇䥹礉錆鷇窳").intern()).encode(str));
            }
            return new byte[0];
        }
        int i5 = i2 + 23;
        AGRequest$Builder = i5 % 128;
        if (i5 % 2 == 0) {
            z = true;
        }
        if (!z) {
            return null;
        }
        throw new NullPointerException("hashCode");
    }
}
