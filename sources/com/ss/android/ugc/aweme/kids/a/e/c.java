package com.ss.android.ugc.aweme.kids.a.e;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(67503);
    }

    public static final List<d> a(List<? extends d> list) {
        l.d(list, "");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (hashSet.add(t.f105309b)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
