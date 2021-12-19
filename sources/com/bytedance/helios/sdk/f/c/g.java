package com.bytedance.helios.sdk.f.c;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class g extends f {
    static {
        Covode.recordClassIndex(17977);
    }

    @Override // com.bytedance.helios.sdk.f.c.f
    public final String a() {
        return "in";
    }

    @Override // com.bytedance.helios.sdk.f.c.f
    public final int b() {
        return 700;
    }

    public static final class a extends com.google.gson.b.a<List<? extends String>> {
        static {
            Covode.recordClassIndex(17978);
        }

        a() {
        }
    }

    @Override // com.bytedance.helios.sdk.f.c.f
    public final Object a(Object obj, Object obj2) {
        return Boolean.valueOf(((List) o.f30973a.a(String.valueOf(obj2), new a().type)).contains(String.valueOf(obj)));
    }
}
