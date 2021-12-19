package com.bytedance.sdk.xbridge.registry.core.model.idl;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

public interface IDLXDynamic {
    static {
        Covode.recordClassIndex(26912);
    }

    List<Object> asArray();

    boolean asBoolean();

    byte[] asByteArray();

    double asDouble();

    int asInt();

    long asLong();

    Map<String, Object> asMap();

    String asString();

    XDynamicType getType();

    boolean isNull();

    void recycle();
}
