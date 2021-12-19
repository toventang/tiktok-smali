package com.bytedance.ies.bullet.kit.lynx.api;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public interface BulletReadableArray {
    static {
        Covode.recordClassIndex(18947);
    }

    BulletReadableArray getArray(int i2);

    boolean getBoolean(int i2);

    byte getByte(int i2);

    char getChar(int i2);

    double getDouble(int i2);

    BulletDynamic getDynamic(int i2);

    int getInt(int i2);

    long getLong(int i2);

    BulletReadableMap getMap(int i2);

    short getShort(int i2);

    String getString(int i2);

    BulletReadableType getType(int i2);

    boolean isNull(int i2);

    int size();

    ArrayList<Object> toArrayList();
}
