package com.bytedance.android.live.core.paging.c;

import android.util.Pair;
import com.bytedance.android.live.base.model.c.a;
import com.bytedance.covode.number.Covode;
import f.a.t;
import java.util.List;

public interface b<V> {
    static {
        Covode.recordClassIndex(4700);
    }

    t<Pair<List<V>, a>> a(boolean z, Long l2);
}
