package com.bytedance.ies.lynx.lynx_adapter.wrapper;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public interface ReadableArrayWrapper {
    static {
        Covode.recordClassIndex(20427);
    }

    ReadableArrayWrapper getArray(int i2);

    boolean getBoolean(int i2);

    byte getByte(int i2);

    byte[] getByteArray(int i2);

    char getChar(int i2);

    double getDouble(int i2);

    DynamicWrapper getDynamic(int i2);

    int getInt(int i2);

    long getLong(int i2);

    ReadableMapWrapper getMap(int i2);

    short getShort(int i2);

    String getString(int i2);

    ReadableTypeWrapper getType(int i2);

    boolean isNull(int i2);

    int size();

    ArrayList<Object> toArrayList();
}
