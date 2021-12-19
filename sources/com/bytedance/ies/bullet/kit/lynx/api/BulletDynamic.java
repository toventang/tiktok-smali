package com.bytedance.ies.bullet.kit.lynx.api;

import com.bytedance.covode.number.Covode;

public interface BulletDynamic {
    static {
        Covode.recordClassIndex(18944);
    }

    BulletReadableArray asArray();

    boolean asBoolean();

    double asDouble();

    int asInt();

    BulletReadableMap asMap();

    String asString();

    BulletReadableType getType();

    boolean isNull();

    void recycle();
}
