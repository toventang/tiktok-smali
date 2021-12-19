package com.ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.i.d;
import com.ss.android.ugc.aweme.discover.mixfeed.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import h.f.b.l;
import java.util.List;

public final class b<T extends a<?>> extends d<T, Aweme> {
    static {
        Covode.recordClassIndex(50731);
    }

    @Override // com.ss.android.ugc.aweme.detail.i.d
    public final List<Aweme> d() {
        return ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).getItems();
    }

    @Override // com.ss.android.ugc.aweme.detail.i.d
    public final List<Aweme> e() {
        return ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).getItems();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.detail.i.d
    public final /* synthetic */ String b(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (aweme2 == null) {
            return "";
        }
        String e2 = ac.e(aweme2);
        l.b(e2, "");
        return e2;
    }
}
