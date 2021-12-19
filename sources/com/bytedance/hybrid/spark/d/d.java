package com.bytedance.hybrid.spark.d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.lynx.a.a.b.b;
import h.f.b.l;

public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f31136a;

    /* renamed from: b  reason: collision with root package name */
    private final View f31137b;

    /* renamed from: c  reason: collision with root package name */
    private final int f31138c;

    static {
        Covode.recordClassIndex(18084);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        this.f31137b.getLayoutParams().height = this.f31138c;
    }

    public d(b bVar, View view, int i2) {
        l.c(bVar, "");
        l.c(view, "");
        this.f31136a = bVar;
        this.f31137b = view;
        this.f31138c = i2;
    }
}
