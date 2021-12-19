package com.airbnb.lottie.a.b;

import android.graphics.Path;
import com.airbnb.lottie.e.b.l;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<l, Path>> f5274a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a<Integer, Integer>> f5275b;

    /* renamed from: c  reason: collision with root package name */
    public final List<com.airbnb.lottie.e.b.g> f5276c;

    static {
        Covode.recordClassIndex(2218);
    }

    public g(List<com.airbnb.lottie.e.b.g> list) {
        this.f5276c = list;
        this.f5274a = new ArrayList(list.size());
        this.f5275b = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f5274a.add(list.get(i2).f5403b.a());
            this.f5275b.add(list.get(i2).f5404c.a());
        }
    }
}
