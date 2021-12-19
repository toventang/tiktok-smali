package com.ss.android.ugc.aweme.fe.method.feeds.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends com.ss.android.ugc.aweme.detail.operators.a<com.ss.android.ugc.aweme.fe.method.feeds.b, com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.fe.method.feeds.b>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91288a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57456);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57457);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b(com.ss.android.ugc.aweme.common.e.a<?, ?> aVar) {
        this.mModel = (com.ss.android.ugc.aweme.fe.method.feeds.b) (!(aVar instanceof com.ss.android.ugc.aweme.fe.method.feeds.b) ? null : aVar);
        this.mPresenter = new com.ss.android.ugc.aweme.common.e.b();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        l.d(bVar, "");
        this.mPresenter.a(Integer.valueOf(i2));
    }
}
