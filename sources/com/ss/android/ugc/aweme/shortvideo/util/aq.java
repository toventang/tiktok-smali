package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.google.c.a.k;
import java.util.ArrayList;
import java.util.List;

public final class aq {
    static {
        Covode.recordClassIndex(86595);
    }

    public static <T> List<T> a(List<T> list, f<T, Boolean> fVar) {
        k.a(list);
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (fVar.a(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
