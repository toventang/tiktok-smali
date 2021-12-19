package com.bytedance.retrofit2.mime;

import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;

public class TypedString extends TypedByteArray {
    static {
        Covode.recordClassIndex(26053);
    }

    @Override // com.bytedance.retrofit2.mime.TypedByteArray
    public String toString() {
        try {
            return "TypedString[" + new String(getBytes(), "UTF-8") + "]";
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("Must be able to decode UTF-8");
        }
    }

    public TypedString(String str) {
        super("text/plain; charset=UTF-8", convertToBytes(str), new String[0]);
    }

    private static byte[] convertToBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }
}
