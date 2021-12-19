package com.ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class g extends b {

    /* renamed from: a  reason: collision with root package name */
    private final c f124039a;

    static {
        Covode.recordClassIndex(81440);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.b, com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_broken_heart;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(c cVar) {
        super(cVar);
        l.d(cVar, "");
        this.f124039a = cVar;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.b, com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        c.b bVar = this.f124039a.Q;
        if (bVar != null) {
            bVar.a();
        } else {
            super.a(context, sharePackage);
        }
    }
}
