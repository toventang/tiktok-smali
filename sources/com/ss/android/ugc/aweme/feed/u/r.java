package com.ss.android.ugc.aweme.feed.u;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class r extends b<FollowingFeedListModel> {

    /* renamed from: a  reason: collision with root package name */
    private final List<Aweme> f94070a = new ArrayList();

    static {
        Covode.recordClassIndex(59793);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f7, code lost:
        if (((com.ss.android.ugc.aweme.common.e.a) r0).isNewDataEmpty() == false) goto L_0x00f9;
     */
    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 410
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.u.r.c():void");
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public final void a_(Exception exc) {
        l.d(exc, "");
        if (this.f76396h != null && this.f76397i != null) {
            com.ss.android.ugc.aweme.common.b bVar = this.f76396h;
            l.b(bVar, "");
            if (((a) bVar).mListQueryType != 2 || !(exc instanceof com.ss.android.ugc.aweme.feed.j.b)) {
                super.a_(exc);
            } else {
                ((c) this.f76397i).c(this.f94070a, false);
            }
        }
    }
}
