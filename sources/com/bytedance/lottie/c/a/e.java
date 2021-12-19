package com.bytedance.lottie.c.a;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.i;
import com.bytedance.lottie.a.b.j;
import com.bytedance.lottie.g.a;
import java.util.Collections;
import java.util.List;

public final class e implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<PointF>> f40472a;

    static {
        Covode.recordClassIndex(24878);
    }

    public e() {
        this.f40472a = Collections.singletonList(new a(new PointF(0.0f, 0.0f)));
    }

    @Override // com.bytedance.lottie.c.a.m
    public final com.bytedance.lottie.a.b.a<PointF, PointF> a() {
        if (this.f40472a.get(0).c()) {
            return new j(this.f40472a);
        }
        return new i(this.f40472a);
    }

    public e(List<a<PointF>> list) {
        this.f40472a = list;
    }
}
