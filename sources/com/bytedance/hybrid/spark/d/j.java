package com.bytedance.hybrid.spark.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.hybrid.spark.a.i;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.a.a.b.a;
import h.f.b.l;

public final class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f31150a;

    /* renamed from: b  reason: collision with root package name */
    private final SparkActivity f31151b;

    /* renamed from: c  reason: collision with root package name */
    private final i f31152c;

    static {
        Covode.recordClassIndex(18090);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        com.bytedance.lynx.a.a.e.a titleColor;
        Integer valueOf;
        a aVar = this.f31150a;
        if (aVar != null && (titleColor = aVar.getTitleColor()) != null && (valueOf = Integer.valueOf(titleColor.getColor(this.f31151b))) != null) {
            int intValue = valueOf.intValue();
            i iVar = this.f31152c;
            if (iVar != null) {
                iVar.a(intValue);
            }
        }
    }

    public j(a aVar, SparkActivity sparkActivity, i iVar) {
        l.c(sparkActivity, "");
        this.f31150a = aVar;
        this.f31151b = sparkActivity;
        this.f31152c = iVar;
    }
}
