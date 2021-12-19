package com.bytedance.lottie.c.b;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.a.b;
import com.bytedance.lottie.a.a.e;
import com.bytedance.lottie.c.a.f;
import com.bytedance.lottie.c.a.m;
import com.bytedance.lottie.i;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f40498a;

    /* renamed from: b  reason: collision with root package name */
    public final m<PointF, PointF> f40499b;

    /* renamed from: c  reason: collision with root package name */
    public final f f40500c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f40501d;

    static {
        Covode.recordClassIndex(24889);
    }

    @Override // com.bytedance.lottie.c.b.b
    public final b a(i iVar, com.bytedance.lottie.c.c.a aVar) {
        return new e(iVar, aVar, this);
    }

    public a(String str, m<PointF, PointF> mVar, f fVar, boolean z) {
        this.f40498a = str;
        this.f40499b = mVar;
        this.f40500c = fVar;
        this.f40501d = z;
    }
}
