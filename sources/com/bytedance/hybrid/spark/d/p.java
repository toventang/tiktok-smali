package com.bytedance.hybrid.spark.d;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.a.a.b.a;
import h.f.b.l;

public final class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f31168a;

    /* renamed from: b  reason: collision with root package name */
    private final SparkActivity f31169b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f31170c;

    static {
        Covode.recordClassIndex(18100);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        boolean z;
        a aVar = this.f31168a;
        if (aVar != null) {
            z = aVar.getTransStatusBar();
        } else {
            z = false;
        }
        this.f31169b.f31205f = z;
        if (z) {
            this.f31170c.setVisibility(8);
        }
    }

    public p(a aVar, SparkActivity sparkActivity, ViewGroup viewGroup) {
        l.c(sparkActivity, "");
        l.c(viewGroup, "");
        this.f31168a = aVar;
        this.f31169b = sparkActivity;
        this.f31170c = viewGroup;
    }
}
