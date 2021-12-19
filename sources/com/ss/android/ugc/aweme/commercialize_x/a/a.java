package com.ss.android.ugc.aweme.commercialize_x.a;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.feed.e.c;
import com.ss.android.ugc.aweme.commercialize.profile.impl.e;
import com.ss.android.ugc.aweme.commercialize_ad_api.service.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f76339a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final SparseArray<Class<? extends b>> f76340b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private static final SparseArray<b> f76341c = new SparseArray<>();

    private a() {
    }

    static {
        Covode.recordClassIndex(47108);
    }

    public static void a() {
        SparseArray<Class<? extends b>> sparseArray = b.f76342a;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            f76340b.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
        }
        SparseArray<Class<? extends b>> sparseArray2 = f76340b;
        sparseArray2.put(1, com.ss.android.ugc.aweme.ad.feed.f.a.class);
        sparseArray2.put(4, c.class);
        sparseArray2.put(2, com.ss.android.ugc.aweme.ad.feed.button.a.class);
        sparseArray2.put(3, com.ss.android.ugc.aweme.ad.feed.mask.a.class);
        sparseArray2.put(5, com.ss.android.ugc.aweme.ad.comment.a.class);
        sparseArray2.put(6, com.ss.android.ugc.aweme.ad.comment.b.class);
        sparseArray2.put(8, com.ss.android.ugc.aweme.ad.comment.c.class);
        sparseArray2.put(15, e.class);
        sparseArray2.put(16, com.ss.android.ugc.aweme.commercialize.profile.impl.b.class);
        sparseArray2.put(21, com.ss.android.ugc.aweme.commercialize.profile.impl.a.a.class);
        sparseArray2.put(18, com.ss.android.ugc.aweme.ad.feed.interactive.a.class);
    }

    public static final b a(int i2) {
        Class<? extends b> cls;
        try {
            SparseArray<b> sparseArray = f76341c;
            b bVar = sparseArray.get(i2);
            if (bVar != null || (cls = f76340b.get(i2)) == null) {
                return bVar;
            }
            b bVar2 = (b) cls.newInstance();
            sparseArray.put(i2, bVar2);
            return bVar2;
        } catch (Throwable unused) {
            return null;
        }
    }
}
