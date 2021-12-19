package com.ss.android.ugc.aweme.translation.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.a.b;
import com.ss.android.ugc.aweme.common.o;

public final class a extends b<com.ss.android.ugc.aweme.translation.a.b, com.ss.android.ugc.aweme.translation.ui.a> implements o {
    static {
        Covode.recordClassIndex(92062);
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void c() {
        T t = ((com.ss.android.ugc.aweme.bw.a.a) this.f69566b).mData;
        if (t == null) {
            new Exception();
            ((com.ss.android.ugc.aweme.translation.ui.a) this.f69567c).a();
            return;
        }
        ((com.ss.android.ugc.aweme.translation.ui.a) this.f69567c).a(t);
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        ((com.ss.android.ugc.aweme.translation.ui.a) this.f69567c).a();
    }

    public a(com.ss.android.ugc.aweme.translation.a.b bVar, com.ss.android.ugc.aweme.translation.ui.a aVar) {
        super(bVar, aVar);
        ((com.ss.android.ugc.aweme.bw.a.a) this.f69566b).addNotifyListener(this);
    }

    public final void a(String str, String str2, String str3, String str4) {
        ((com.ss.android.ugc.aweme.translation.a.b) this.f69566b).a(str, str2, str3, str4);
    }
}
