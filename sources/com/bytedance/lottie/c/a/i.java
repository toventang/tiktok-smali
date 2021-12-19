package com.bytedance.lottie.c.a;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.a.b.m;

public final class i implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private final b f40473a;

    /* renamed from: b  reason: collision with root package name */
    private final b f40474b;

    static {
        Covode.recordClassIndex(24882);
    }

    @Override // com.bytedance.lottie.c.a.m
    public final a<PointF, PointF> a() {
        return new m(this.f40473a.a(), this.f40474b.a());
    }

    public i(b bVar, b bVar2) {
        this.f40473a = bVar;
        this.f40474b = bVar2;
    }
}
