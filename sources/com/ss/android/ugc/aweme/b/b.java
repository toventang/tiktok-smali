package com.ss.android.ugc.aweme.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.bl;
import com.ss.android.ugc.aweme.q.b.a;
import h.f.b.l;
import j.a.a.f;

public final class b extends c {
    static {
        Covode.recordClassIndex(41766);
    }

    public b(bl blVar) {
        super(blVar);
    }

    @Override // com.ss.android.ugc.aweme.b.c
    public final void a(f fVar, bl blVar, String str) {
        l.d(fVar, "");
        l.d(str, "");
        fVar.a(AnchorCell.class, new a(blVar, str));
    }
}
