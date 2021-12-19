package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class j {
    static {
        Covode.recordClassIndex(57790);
    }

    public static final <E> void a(ArrayList<E> arrayList, List<? extends E> list) {
        l.d(arrayList, "");
        if (!b.a((Collection) list)) {
            if (list == null) {
                l.b();
            }
            arrayList.addAll(list);
        }
    }
}
