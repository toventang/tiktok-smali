package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.controller;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.x.c.c;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.profile.ae;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.detail.operators.a<com.ss.android.ugc.aweme.common.e.a<?, ?>, b<com.ss.android.ugc.aweme.common.e.a<?, ?>>> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f100789a;

    /* renamed from: b  reason: collision with root package name */
    private String f100790b;

    static {
        Covode.recordClassIndex(64486);
    }

    private final int a() {
        if (this.f100789a) {
            return 1000;
        }
        return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final int getPageType(int i2) {
        return a() + i2;
    }

    public a(com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, String str) {
        this.mModel = aVar == null ? ae.f115954a.createAwemeModel() : aVar;
        this.mPresenter = new b();
        this.f100789a = true;
        this.f100790b = str;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        l.d(bVar, "");
        if (c.a(bVar.getSecUid())) {
            this.mPresenter.a(Integer.valueOf(i2), true, this.f100790b, Integer.valueOf(bVar.getVideoType()), Integer.valueOf(a()));
            return;
        }
        this.mPresenter.a(Integer.valueOf(i2), true, this.f100790b, Integer.valueOf(bVar.getVideoType()), Integer.valueOf(a()), bVar.getSecUid());
    }
}
