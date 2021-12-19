package com.ss.android.ugc.aweme.share.k.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.a.a;
import com.ss.android.ugc.aweme.bw.a.b;
import com.ss.android.ugc.aweme.common.o;

public final class d extends b<com.ss.android.ugc.aweme.share.k.a.b, b> implements o {
    static {
        Covode.recordClassIndex(81459);
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (((a) this.f69566b).mData.f122326a != 0 || !((a) this.f69566b).mData.f122328c) {
            if (this.f69567c != null) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = new com.ss.android.ugc.aweme.base.api.a.b.a(((a) this.f69566b).mData.f122326a);
                aVar.setErrorMsg(((a) this.f69566b).mData.f122327b);
                ((b) this.f69567c).a(aVar);
            }
        } else if (this.f69567c == null) {
        }
    }

    public final void a(String str) {
        ((com.ss.android.ugc.aweme.share.k.a.b) this.f69566b).a(str);
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f69567c != null) {
            ((b) this.f69567c).a(exc);
        }
    }

    public d(com.ss.android.ugc.aweme.share.k.a.b bVar, b bVar2) {
        super(bVar, bVar2);
        ((a) this.f69566b).addNotifyListener(this);
    }
}
