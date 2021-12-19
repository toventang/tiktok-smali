package com.ss.android.ugc.aweme.setting.k;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.a.a;
import com.ss.android.ugc.aweme.bw.a.b;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.setting.model.l;

public final class e extends b<l, d> implements o {
    static {
        Covode.recordClassIndex(80154);
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (this.f69567c != null) {
            ((d) this.f69567c).a(((a) this.f69566b).mData);
        }
    }

    public final void a(String str) {
        ((l) this.f69566b).a(str);
    }

    public e(l lVar, d dVar) {
        super(lVar, dVar);
        ((a) this.f69566b).addNotifyListener(this);
    }
}
