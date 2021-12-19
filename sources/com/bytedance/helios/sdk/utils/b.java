package com.bytedance.helios.sdk.utils;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public final class b {
    static {
        Covode.recordClassIndex(18005);
    }

    public static final String a(Set<String> set) {
        l.c(set, "");
        ArrayList arrayList = new ArrayList(n.a(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add("\"" + ((String) it.next()) + '\"');
        }
        return arrayList.toString();
    }
}
