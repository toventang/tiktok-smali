package com.bytedance.ies.lynx.lynx_adapter.wrapper;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public interface ReadableMapWrapper {
    static {
        Covode.recordClassIndex(20428);
    }

    ReadableArrayWrapper getArray(String str);

    ReadableArrayWrapper getArray(String str, ReadableArrayWrapper readableArrayWrapper);

    boolean getBoolean(String str);

    boolean getBoolean(String str, boolean z);

    byte[] getByteArray(String str);

    byte[] getByteArray(String str, byte[] bArr);

    double getDouble(String str);

    double getDouble(String str, double d2);

    DynamicWrapper getDynamic(String str);

    int getInt(String str);

    int getInt(String str, int i2);

    Long getLong(String str);

    Long getLong(String str, long j2);

    ReadableMapWrapper getMap(String str);

    ReadableMapWrapper getMap(String str, ReadableMapWrapper readableMapWrapper);

    String getString(String str);

    String getString(String str, String str2);

    ReadableTypeWrapper getType(String str);

    boolean hasKey(String str);

    boolean isNull(String str);

    int size();

    HashMap<String, Object> toHashMap();
}
