package com.ss.android.ugc.aweme.detail.operators;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.b;
import com.tt.appbrandimpl.a;

public final class o extends a<a, b<a>> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f79817a;

    static {
        Covode.recordClassIndex(49651);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final int getPageType(int i2) {
        int i3;
        if (this.f79817a) {
            i3 = 1000;
        } else {
            i3 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
        return i3 + i2;
    }

    public o(com.ss.android.ugc.aweme.common.e.a aVar) {
        this.mModel = !(aVar instanceof a) ? new a() : aVar;
        this.mPresenter = new b();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        String microAppId = bVar.getMicroAppId();
        String hashTagName = bVar.getHashTagName();
        int cursor = bVar.getCursor();
        int count = bVar.getCount();
        this.mPresenter.a(4, microAppId, hashTagName, Integer.valueOf(count), Integer.valueOf(cursor));
    }
}
