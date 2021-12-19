package com.facebook.c.a;

import com.bytedance.covode.number.Covode;
import com.facebook.common.k.d;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public final class f {
    static {
        Covode.recordClassIndex(28573);
    }

    private static String c(e eVar) {
        return d.a(eVar.a().getBytes("UTF-8"));
    }

    public static String b(e eVar) {
        try {
            if (eVar instanceof g) {
                return c(((g) eVar).f46954a.get(0));
            }
            return c(eVar);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static List<String> a(e eVar) {
        try {
            if (eVar instanceof g) {
                List<e> list = ((g) eVar).f46954a;
                ArrayList arrayList = new ArrayList(list.size());
                for (int i2 = 0; i2 < list.size(); i2++) {
                    arrayList.add(c(list.get(i2)));
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(c(eVar));
            return arrayList2;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }
}
