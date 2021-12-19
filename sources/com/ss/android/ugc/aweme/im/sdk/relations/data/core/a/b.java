package com.ss.android.ugc.aweme.im.sdk.relations.data.core.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(66044);
    }

    public static final <R> List<R> a(LinkedHashMap<e<R>, List<R>> linkedHashMap) {
        l.d(linkedHashMap, "");
        ArrayList arrayList = new ArrayList();
        Collection<List<R>> values = linkedHashMap.values();
        l.b(values, "");
        for (T t : values) {
            l.b(t, "");
            arrayList.addAll(t);
        }
        return arrayList;
    }

    public static final <R> int b(LinkedHashMap<e<R>, List<R>> linkedHashMap) {
        l.d(linkedHashMap, "");
        Collection<List<R>> values = linkedHashMap.values();
        l.b(values, "");
        Iterator<T> it = values.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().size();
        }
        return i2;
    }
}
