package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.comment.a.c;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.commercialize.utils.bh;
import com.ss.android.ugc.aweme.utils.ai;
import java.util.Collection;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements c {

    /* renamed from: a  reason: collision with root package name */
    private final k f72798a;

    static {
        Covode.recordClassIndex(44843);
    }

    l(k kVar) {
        this.f72798a = kVar;
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.a.c
    public final void a() {
        k kVar = this.f72798a;
        if (b.ae(kVar.f72764c)) {
            if (!com.bytedance.common.utility.collection.b.a((Collection) kVar.v.e())) {
                kVar.v.e().remove(0);
                kVar.v.notifyItemRemoved(0);
            }
            ac a2 = bh.a(kVar.f72764c);
            if (a2 != null) {
                a2.setHasDislike(true);
            }
            ai.a(new ay(kVar), "BoltsUtils");
        }
    }
}
