package com.bytedance.hybrid.spark.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.hybrid.spark.b;
import com.bytedance.hybrid.spark.d;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.immersionbar.e;
import com.bytedance.lynx.a.a.b.a;
import h.f.b.l;

public final class n implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f31161a;

    /* renamed from: b  reason: collision with root package name */
    private final SparkActivity f31162b;

    /* renamed from: c  reason: collision with root package name */
    private final e f31163c;

    static {
        Covode.recordClassIndex(18096);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        Integer num;
        com.bytedance.lynx.a.a.e.a statusBgColor;
        b bVar = d.f31109a;
        if (bVar != null) {
            num = Integer.valueOf(bVar.c().f31127a);
        } else {
            num = null;
        }
        a aVar = this.f31161a;
        if (!(aVar == null || (statusBgColor = aVar.getStatusBgColor()) == null)) {
            num = Integer.valueOf(statusBgColor.getColor(this.f31162b));
        }
        this.f31162b.f31203d = num;
    }

    public n(a aVar, SparkActivity sparkActivity, e eVar) {
        l.c(sparkActivity, "");
        this.f31161a = aVar;
        this.f31162b = sparkActivity;
        this.f31163c = eVar;
    }
}
