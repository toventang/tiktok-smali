package com.bytedance.hybrid.spark.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.hybrid.spark.a.i;
import com.bytedance.lynx.a.a.b.a;

public final class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f31153a;

    /* renamed from: b  reason: collision with root package name */
    private final i f31154b;

    static {
        Covode.recordClassIndex(18091);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        String str;
        a aVar = this.f31153a;
        if (aVar == null || (str = aVar.getTitle()) == null) {
            str = "";
        }
        i iVar = this.f31154b;
        if (iVar != null) {
            iVar.a(str);
        }
    }

    public k(a aVar, i iVar) {
        this.f31153a = aVar;
        this.f31154b = iVar;
    }
}
