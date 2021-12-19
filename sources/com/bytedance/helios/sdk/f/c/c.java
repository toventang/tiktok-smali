package com.bytedance.helios.sdk.f.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends f {
    static {
        Covode.recordClassIndex(17973);
    }

    @Override // com.bytedance.helios.sdk.f.c.f
    public final String a() {
        return "==";
    }

    @Override // com.bytedance.helios.sdk.f.c.f
    public final int b() {
        return 400;
    }

    @Override // com.bytedance.helios.sdk.f.c.f
    public final Object a(Object obj, Object obj2) {
        boolean z;
        try {
            if ((obj instanceof Double) || (obj2 instanceof Double)) {
                if (Double.parseDouble(String.valueOf(obj)) == Double.parseDouble(String.valueOf(obj2))) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(l.a((Object) String.valueOf(obj), (Object) String.valueOf(obj2)));
    }
}
