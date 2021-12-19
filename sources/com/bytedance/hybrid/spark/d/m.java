package com.bytedance.hybrid.spark.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.hybrid.spark.a.i;
import com.bytedance.lynx.a.a.b.a;

public final class m implements f {

    /* renamed from: a  reason: collision with root package name */
    public final i f31159a;

    /* renamed from: b  reason: collision with root package name */
    private final a f31160b;

    static {
        Covode.recordClassIndex(18095);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        boolean z;
        a aVar = this.f31160b;
        if (aVar != null) {
            z = aVar.getShowCloseAll();
        } else {
            z = false;
        }
        i iVar = this.f31159a;
        if (iVar != null) {
            iVar.a(z);
        }
    }

    public m(a aVar, i iVar) {
        this.f31160b = aVar;
        this.f31159a = iVar;
    }
}
