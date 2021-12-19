package com.lynx.react.bridge;

import com.bytedance.covode.number.Covode;

public interface WritableMap extends ReadableMap {
    static {
        Covode.recordClassIndex(34775);
    }

    void merge(ReadableMap readableMap);

    void putArray(String str, WritableArray writableArray);

    void putBoolean(String str, boolean z);

    void putByteArray(String str, byte[] bArr);

    void putByteArrayAsString(byte[] bArr, byte[] bArr2);

    void putDouble(String str, double d2);

    void putInt(String str, int i2);

    void putLong(String str, long j2);

    void putMap(String str, WritableMap writableMap);

    void putNull(String str);

    void putString(String str, String str2);
}
