package com.bytedance.lottie.a.b;

import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.b.l;
import java.util.ArrayList;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<l, Path>> f40432a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a<Integer, Integer>> f40433b;

    /* renamed from: c  reason: collision with root package name */
    public final List<com.bytedance.lottie.c.b.g> f40434c;

    static {
        Covode.recordClassIndex(24858);
    }

    public g(List<com.bytedance.lottie.c.b.g> list) {
        this.f40434c = list;
        this.f40432a = new ArrayList(list.size());
        this.f40433b = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f40432a.add(list.get(i2).f40527b.a());
            this.f40433b.add(list.get(i2).f40528c.a());
        }
    }
}
