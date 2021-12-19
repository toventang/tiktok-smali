package com.ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.f;
import com.bytedance.android.livesdkapi.service.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class h extends k {

    /* renamed from: a  reason: collision with root package name */
    private final c f124040a;

    static {
        Covode.recordClassIndex(81441);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.k, com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_flag;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Activity activity, c cVar) {
        super(activity, cVar);
        l.d(activity, "");
        l.d(cVar, "");
        this.f124040a = cVar;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.k, com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        c.AbstractC0503c cVar = this.f124040a.P;
        if (cVar != null) {
            cVar.a();
            d a2 = f.a();
            if (a2 != null) {
                a2.a(this.f124040a.H, this.f124040a.z, this.f124040a.A, this.f124040a.N);
                if (z.f158842a != null) {
                    return;
                }
            }
        }
        super.a(context, sharePackage);
    }
}
