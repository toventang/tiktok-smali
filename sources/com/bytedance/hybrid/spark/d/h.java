package com.bytedance.hybrid.spark.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.a.a.b.a;
import h.f.b.l;

public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f31145a;

    /* renamed from: b  reason: collision with root package name */
    private final SparkActivity f31146b;

    static {
        Covode.recordClassIndex(18088);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        boolean hideStatusBar;
        a aVar = this.f31145a;
        if (aVar != null && (hideStatusBar = aVar.getHideStatusBar())) {
            this.f31146b.f31202c = hideStatusBar;
        }
    }

    public h(a aVar, SparkActivity sparkActivity) {
        l.c(sparkActivity, "");
        this.f31145a = aVar;
        this.f31146b = sparkActivity;
    }
}
