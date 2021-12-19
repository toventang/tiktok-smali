package com.bytedance.realx.base;

import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.util.Map;

class JniHelper {
    static {
        Covode.recordClassIndex(25932);
    }

    JniHelper() {
    }

    static Object getStringClass() {
        return String.class;
    }

    static Object getKey(Map.Entry entry) {
        return entry.getKey();
    }

    static Object getValue(Map.Entry entry) {
        return entry.getValue();
    }

    static byte[] getStringBytes(String str) {
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("utf-8 is unsupported");
        }
    }
}
