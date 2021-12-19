package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.b;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends b {
    static {
        Covode.recordClassIndex(6832);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.b
    public final int a() {
        return 8;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.b
    public final a c() {
        k kVar = new k(this.f12439b.f12200d);
        String a2 = y.a((int) R.string.ea8);
        l.b(a2, "");
        kVar.a(a2);
        kVar.f12457i = -1;
        kVar.f12453e = b.a(kVar.f12437d, (int) R.attr.alp);
        kVar.f12454f = y.a(2.0f);
        kVar.f12455g = y.a(6.0f);
        kVar.f12459k = 8;
        kVar.f12460l = 600;
        return kVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(g gVar) {
        super(gVar);
        l.d(gVar, "");
    }
}
