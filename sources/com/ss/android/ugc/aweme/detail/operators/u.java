package com.ss.android.ugc.aweme.detail.operators;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.x.c.c;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.profile.presenter.b;

public final class u extends a<b, com.ss.android.ugc.aweme.common.e.b<b>> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f79836a;

    /* renamed from: b  reason: collision with root package name */
    private final String f79837b;

    static {
        Covode.recordClassIndex(49670);
    }

    private int a() {
        if (this.f79836a) {
            return 1000;
        }
        return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final int getPageType(int i2) {
        return a() + i2;
    }

    public u(a aVar, boolean z, String str) {
        this.mModel = !(aVar instanceof b) ? new b() : aVar;
        this.mPresenter = new com.ss.android.ugc.aweme.common.e.b();
        this.f79836a = z;
        this.f79837b = str;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        if (c.a(bVar.getSecUid())) {
            this.mPresenter.a(Integer.valueOf(i2), true, this.f79837b, Integer.valueOf(bVar.getVideoType()), Integer.valueOf(a()));
            return;
        }
        this.mPresenter.a(Integer.valueOf(i2), true, this.f79837b, Integer.valueOf(bVar.getVideoType()), Integer.valueOf(a()), bVar.getSecUid());
    }
}
