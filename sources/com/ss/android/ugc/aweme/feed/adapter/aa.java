package com.ss.android.ugc.aweme.feed.adapter;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;

final /* synthetic */ class aa implements g {

    /* renamed from: a  reason: collision with root package name */
    private final FullFeedVideoViewHolder f91587a;

    /* renamed from: b  reason: collision with root package name */
    private final ISpecialPlusService f91588b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f91589c;

    static {
        Covode.recordClassIndex(57672);
    }

    aa(FullFeedVideoViewHolder fullFeedVideoViewHolder, ISpecialPlusService iSpecialPlusService, Aweme aweme) {
        this.f91587a = fullFeedVideoViewHolder;
        this.f91588b = iSpecialPlusService;
        this.f91589c = aweme;
    }

    @Override // b.g
    public final Object then(i iVar) {
        return this.f91587a.a(this.f91588b, this.f91589c);
    }
}
