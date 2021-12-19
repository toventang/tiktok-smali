package com.ss.android.ugc.aweme.question.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.b;

public final class a extends com.ss.android.ugc.aweme.detail.operators.a<com.ss.android.ugc.aweme.question.e.a, b<com.ss.android.ugc.aweme.question.e.a>> {

    /* renamed from: a  reason: collision with root package name */
    private String f119951a;

    static {
        Covode.recordClassIndex(77923);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final int getPageType(int i2) {
        return i2 + 19000;
    }

    public a(com.ss.android.ugc.aweme.common.e.a aVar, String str) {
        this.mModel = !(aVar instanceof com.ss.android.ugc.aweme.question.e.a) ? new com.ss.android.ugc.aweme.question.e.a() : aVar;
        this.mPresenter = new b();
        this.f119951a = str;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        this.mPresenter.a(Integer.valueOf(i2), bVar.getQuestionId(), Integer.valueOf(bVar.getVideoType()), Boolean.valueOf(z), bVar.getIds(), false);
    }
}
