package com.bytedance.helios.sdk.f.c;

import com.bytedance.covode.number.Covode;

public final class k extends f {
    static {
        Covode.recordClassIndex(17982);
    }

    @Override // com.bytedance.helios.sdk.f.c.f
    public final String a() {
        return "%";
    }

    @Override // com.bytedance.helios.sdk.f.c.f
    public final int b() {
        return 700;
    }

    @Override // com.bytedance.helios.sdk.f.c.f
    public final Object a(Object obj, Object obj2) {
        return Long.valueOf(Long.parseLong(String.valueOf(obj)) % Long.parseLong(String.valueOf(obj2)));
    }
}
