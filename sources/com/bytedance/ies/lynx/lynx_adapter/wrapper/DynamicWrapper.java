package com.bytedance.ies.lynx.lynx_adapter.wrapper;

import com.bytedance.covode.number.Covode;

public interface DynamicWrapper {
    static {
        Covode.recordClassIndex(20426);
    }

    ReadableArrayWrapper asArray();

    boolean asBoolean();

    double asDouble();

    int asInt();

    ReadableMapWrapper asMap();

    String asString();

    ReadableTypeWrapper getType();

    boolean isNull();

    void recycle();
}
