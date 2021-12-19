package com.bytedance.ies.bullet.kit.lynx.api;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public interface BulletReadableMap {
    static {
        Covode.recordClassIndex(18948);
    }

    BulletReadableArray getArray(String str);

    BulletReadableArray getArray(String str, BulletReadableArray bulletReadableArray);

    boolean getBoolean(String str);

    boolean getBoolean(String str, boolean z);

    double getDouble(String str);

    double getDouble(String str, double d2);

    BulletDynamic getDynamic(String str);

    int getInt(String str);

    int getInt(String str, int i2);

    BulletReadableMap getMap(String str);

    BulletReadableMap getMap(String str, BulletReadableMap bulletReadableMap);

    String getString(String str);

    String getString(String str, String str2);

    BulletReadableType getType(String str);

    boolean hasKey(String str);

    boolean isNull(String str);

    int size();

    HashMap<String, Object> toHashMap();
}
