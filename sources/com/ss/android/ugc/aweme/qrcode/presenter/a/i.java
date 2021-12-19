package com.ss.android.ugc.aweme.qrcode.presenter.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.a.a;
import com.ss.android.ugc.aweme.bw.a.b;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.qrcode.d.c;
import com.ss.android.ugc.aweme.qrcode.d.d;

public final class i extends b<d, a> implements o {
    static {
        Covode.recordClassIndex(77832);
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (this.f69567c != null) {
            ((a) this.f69567c).a((c) ((a) this.f69566b).mData);
        }
    }

    public final void a(String str) {
        ((d) this.f69566b).a(str);
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f69567c != null) {
            ((a) this.f69567c).a(exc);
        }
    }

    public i(d dVar, a aVar) {
        super(dVar, aVar);
        dVar.addNotifyListener(this);
    }
}
