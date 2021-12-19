package com.bytedance.sdk.xbridge.registry.core.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.registry.core.b;
import java.util.Map;

public interface a<Data> {
    static {
        Covode.recordClassIndex(26891);
    }

    Map<String, Object> a(Data data, Class<? extends b> cls);
}
