package com.ss.android.ugc.aweme.share.k.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.a.b;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.share.k.a.a;

public final class c extends b<a, a> implements o {
    static {
        Covode.recordClassIndex(81458);
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (((com.ss.android.ugc.aweme.bw.a.a) this.f69566b).mData.f122326a == 0 && ((com.ss.android.ugc.aweme.bw.a.a) this.f69566b).mData.f122328c) {
            if (this.f69567c != null) {
                ((a) this.f69567c).h();
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.setting.d.c());
        } else if (this.f69567c != null) {
            com.ss.android.ugc.aweme.base.api.a.b.a aVar = new com.ss.android.ugc.aweme.base.api.a.b.a(((com.ss.android.ugc.aweme.bw.a.a) this.f69566b).mData.f122326a);
            aVar.setErrorMsg(((com.ss.android.ugc.aweme.bw.a.a) this.f69566b).mData.f122327b);
            ((a) this.f69567c).a(aVar);
        }
    }

    public final void a(String str) {
        ((a) this.f69566b).a(str);
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f69567c != null) {
            ((a) this.f69567c).a(exc);
        }
    }

    public c(a aVar, a aVar2) {
        super(aVar, aVar2);
        ((com.ss.android.ugc.aweme.bw.a.a) this.f69566b).addNotifyListener(this);
    }
}
