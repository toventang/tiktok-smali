package com.ttnet.org.chromium.url;

import com.bytedance.covode.number.Covode;
import java.net.IDN;

public class IDNStringUtil {
    static {
        Covode.recordClassIndex(103578);
    }

    private static String idnToASCII(String str) {
        try {
            return IDN.toASCII(str, 2);
        } catch (Exception unused) {
            return null;
        }
    }
}
