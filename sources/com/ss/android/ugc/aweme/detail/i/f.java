package com.ss.android.ugc.aweme.detail.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.discover.mixfeed.h;
import com.ss.android.ugc.aweme.discover.mixfeed.u;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import h.f.b.l;
import java.util.List;

public final class f extends d<u, h> {
    static {
        Covode.recordClassIndex(49580);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.i.d
    public final List<h> d() {
        a aVar = (a) this.f76396h;
        if (aVar != null) {
            return aVar.getItems();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.i.d
    public final List<Aweme> e() {
        List list;
        a aVar = (a) this.f76396h;
        if (aVar != null) {
            list = aVar.getItems();
        } else {
            list = null;
        }
        List<Aweme> a2 = u.a(list);
        l.b(a2, "");
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.detail.i.d
    public final /* synthetic */ String b(h hVar) {
        Aweme aweme;
        h hVar2 = hVar;
        if (hVar2 == null || (aweme = hVar2.getAweme()) == null) {
            return "";
        }
        String e2 = ac.e(aweme);
        l.b(e2, "");
        return e2;
    }
}
