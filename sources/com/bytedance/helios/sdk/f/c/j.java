package com.bytedance.helios.sdk.f.c;

import com.bytedance.covode.number.Covode;

public final class j extends f {
    static {
        Covode.recordClassIndex(17981);
    }

    @Override // com.bytedance.helios.sdk.f.c.f
    public final String a() {
        return "<";
    }

    @Override // com.bytedance.helios.sdk.f.c.f
    public final int b() {
        return 500;
    }

    @Override // com.bytedance.helios.sdk.f.c.f
    public final Object a(Object obj, Object obj2) {
        boolean z;
        if (Double.parseDouble(String.valueOf(obj)) < Double.parseDouble(String.valueOf(obj2))) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
