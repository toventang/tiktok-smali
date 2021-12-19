package com.airbnb.lottie.e.a;

import android.graphics.PointF;
import com.airbnb.lottie.a.b.i;
import com.airbnb.lottie.a.b.j;
import com.airbnb.lottie.j.a;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

public final class e implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<PointF>> f5348a;

    static {
        Covode.recordClassIndex(2247);
    }

    public e() {
        this.f5348a = Collections.singletonList(new a(new PointF(0.0f, 0.0f)));
    }

    @Override // com.airbnb.lottie.e.a.m
    public final com.airbnb.lottie.a.b.a<PointF, PointF> a() {
        if (this.f5348a.get(0).d()) {
            return new j(this.f5348a);
        }
        return new i(this.f5348a);
    }

    public e(List<a<PointF>> list) {
        this.f5348a = list;
    }
}
