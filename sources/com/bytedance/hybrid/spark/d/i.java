package com.bytedance.hybrid.spark.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.a.a.b.a;
import h.f.b.l;

public final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f31147a;

    /* renamed from: b  reason: collision with root package name */
    private final SparkActivity f31148b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.hybrid.spark.a.i f31149c;

    static {
        Covode.recordClassIndex(18089);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        com.bytedance.lynx.a.a.e.a navBarColor;
        Integer valueOf;
        a aVar = this.f31147a;
        if (aVar != null && (navBarColor = aVar.getNavBarColor()) != null && (valueOf = Integer.valueOf(navBarColor.getColor(this.f31148b))) != null) {
            int intValue = valueOf.intValue();
            com.bytedance.hybrid.spark.a.i iVar = this.f31149c;
            if (iVar != null) {
                iVar.b(intValue);
            }
        }
    }

    public i(a aVar, SparkActivity sparkActivity, com.bytedance.hybrid.spark.a.i iVar) {
        l.c(sparkActivity, "");
        this.f31147a = aVar;
        this.f31148b = sparkActivity;
        this.f31149c = iVar;
    }
}
