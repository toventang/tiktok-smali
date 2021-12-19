package com.ss.android.ugc.tools.i;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.t;
import com.google.gson.v;
import h.f.b.l;

public final class a extends v<Integer> {
    static {
        Covode.recordClassIndex(98351);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.v
    public final /* synthetic */ Integer read(com.google.gson.c.a aVar) {
        return a(aVar);
    }

    private static Integer a(com.google.gson.c.a aVar) {
        l.d(aVar, "");
        b f2 = aVar.f();
        if (f2 != null) {
            int i2 = b.f149356a[f2.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    aVar.k();
                    return null;
                } else if (i2 == 3) {
                    try {
                        return Integer.valueOf(aVar.n());
                    } catch (NumberFormatException e2) {
                        throw new t(e2);
                    }
                } else if (i2 == 4) {
                    if (Boolean.parseBoolean(aVar.i())) {
                        return 1;
                    }
                    return 0;
                }
            } else if (aVar.j()) {
                return 1;
            } else {
                return 0;
            }
        }
        throw new IllegalStateException("Expected BOOLEAN or NUMBER but was ".concat(String.valueOf(f2)));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
    @Override // com.google.gson.v
    public final /* synthetic */ void write(c cVar, Integer num) {
        Integer num2 = num;
        l.d(cVar, "");
        if (num2 == null) {
            cVar.f();
        } else {
            cVar.a(num2);
        }
    }
}
