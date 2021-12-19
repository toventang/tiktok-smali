package com.ss.android.ugc.aweme.feed.ui.masklayer2.a;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.f;
import com.ss.android.ugc.aweme.tcm.api.service.ITcmService;
import com.ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import h.f.b.l;

public final class c extends n {
    static {
        Covode.recordClassIndex(60172);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
    public final void a(View view) {
        l.d(view, "");
        ITcmService j2 = TcmServiceImpl.j();
        if (j2 != null) {
            Context context = view.getContext();
            l.b(context, "");
            j2.b(context, this.f94901f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(a aVar, f fVar) {
        super(aVar, fVar);
        l.d(aVar, "");
        l.d(fVar, "");
    }
}
