package com.bytedance.lottie.c.b;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.a.n;
import com.bytedance.lottie.c.a.b;
import com.bytedance.lottie.c.a.f;
import com.bytedance.lottie.c.a.m;
import com.bytedance.lottie.c.c.a;
import com.bytedance.lottie.i;

public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f40543a;

    /* renamed from: b  reason: collision with root package name */
    public final m<PointF, PointF> f40544b;

    /* renamed from: c  reason: collision with root package name */
    public final f f40545c;

    /* renamed from: d  reason: collision with root package name */
    public final b f40546d;

    static {
        Covode.recordClassIndex(24901);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f40544b + ", size=" + this.f40545c + '}';
    }

    @Override // com.bytedance.lottie.c.b.b
    public final com.bytedance.lottie.a.a.b a(i iVar, a aVar) {
        return new n(iVar, aVar, this);
    }

    public j(String str, m<PointF, PointF> mVar, f fVar, b bVar) {
        this.f40543a = str;
        this.f40544b = mVar;
        this.f40545c = fVar;
        this.f40546d = bVar;
    }
}
