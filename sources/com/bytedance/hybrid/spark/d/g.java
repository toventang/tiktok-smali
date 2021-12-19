package com.bytedance.hybrid.spark.d;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.lynx.a.a.b.a;
import h.f.b.l;

public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f31143a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f31144b;

    static {
        Covode.recordClassIndex(18087);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        a aVar = this.f31143a;
        if (aVar == null || !aVar.getHideNavBar()) {
            this.f31144b.setVisibility(0);
        } else {
            this.f31144b.setVisibility(8);
        }
    }

    public g(a aVar, ViewGroup viewGroup) {
        l.c(viewGroup, "");
        this.f31143a = aVar;
        this.f31144b = viewGroup;
    }
}
