package com.ss.android.ugc.aweme.notice.api.a;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.api.bean.h;
import com.ss.android.ugc.aweme.notice.api.e.e;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<Class> f112648a;

    static {
        Covode.recordClassIndex(72395);
        SparseArray<Class> sparseArray = new SparseArray<>();
        f112648a = sparseArray;
        sparseArray.put(1, h.class);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.e.e
    public final Class a(int i2) {
        return f112648a.get(i2);
    }
}
