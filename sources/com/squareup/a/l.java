package com.squareup.a;

import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import k.i;

public final class l {
    static {
        Covode.recordClassIndex(36007);
    }

    public static String a(String str, String str2) {
        try {
            return "Basic ".concat(String.valueOf(i.of((str + ":" + str2).getBytes("ISO-8859-1")).base64()));
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
