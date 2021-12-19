package com.ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.g.a;
import com.ss.android.ugc.aweme.common.e.b;

public final class h extends a<a, b<a>> {

    /* renamed from: a  reason: collision with root package name */
    private String f79805a;

    static {
        Covode.recordClassIndex(49642);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final int getPageType(int i2) {
        if (TextUtils.equals("from_discovery_challenge", this.f79805a)) {
            return 9000;
        }
        return i2 + 3000;
    }

    public h(com.ss.android.ugc.aweme.common.e.a aVar, String str) {
        this.mModel = !(aVar instanceof a) ? new a() : aVar;
        this.mPresenter = new b();
        this.f79805a = str;
        if (TextUtils.equals("from_discovery_challenge", str) && this.mModel != null) {
            ((a) this.mModel).a("discovery_challenge_video");
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        this.mPresenter.a(Integer.valueOf(i2), bVar.getChallengeId(), Integer.valueOf(bVar.getVideoType()), false);
    }
}
