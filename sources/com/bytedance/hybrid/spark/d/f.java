package com.bytedance.hybrid.spark.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.a.a.b.a;
import h.f.b.l;

public final class f implements com.bytedance.hybrid.spark.a.f {

    /* renamed from: a  reason: collision with root package name */
    private final a f31141a;

    /* renamed from: b  reason: collision with root package name */
    private final SparkActivity f31142b;

    static {
        Covode.recordClassIndex(18086);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        boolean z;
        a aVar = this.f31141a;
        if (aVar != null) {
            z = aVar.getDisableBackPress();
        } else {
            z = false;
        }
        this.f31142b.f31201b = z;
    }

    public f(a aVar, SparkActivity sparkActivity) {
        l.c(sparkActivity, "");
        this.f31141a = aVar;
        this.f31142b = sparkActivity;
    }
}
