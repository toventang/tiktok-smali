package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.detail.operators.a;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.feed.u.x;
import h.f.b.g;
import h.f.b.l;

public final class FriendVideoMoreOperator extends a<com.ss.android.ugc.aweme.common.e.a<?, ?>, b<com.ss.android.ugc.aweme.common.e.a<?, ?>>> implements aa.b {
    public static final Companion Companion = new Companion(null);

    static {
        Covode.recordClassIndex(59389);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa.b
    public final void bindPreLoadView(x xVar) {
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa.b
    public final void setPreLoad(boolean z) {
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(59390);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public FriendVideoMoreOperator(com.ss.android.ugc.aweme.common.e.a<?, ?> aVar) {
    }
}
