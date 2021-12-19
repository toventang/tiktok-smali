package com.lynx.react.bridge;

import com.bytedance.covode.number.Covode;

public interface WritableArray extends ReadableArray {
    static {
        Covode.recordClassIndex(34774);
    }

    void pushArray(WritableArray writableArray);

    void pushBoolean(boolean z);

    void pushByteArray(byte[] bArr);

    void pushDouble(double d2);

    void pushInt(int i2);

    void pushLong(long j2);

    void pushMap(WritableMap writableMap);

    void pushNull();

    void pushString(String str);
}
