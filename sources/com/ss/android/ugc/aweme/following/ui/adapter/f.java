package com.ss.android.ugc.aweme.following.ui.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.following.ui.adapter.e;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

final /* synthetic */ class f implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private final e.a f96455a;

    /* renamed from: b  reason: collision with root package name */
    private final IMUser f96456b;

    static {
        Covode.recordClassIndex(61086);
    }

    f(e.a aVar, IMUser iMUser) {
        this.f96455a = aVar;
        this.f96456b = iMUser;
    }

    @Override // com.ss.android.ugc.aweme.follow.widet.a.b
    public final void a(FollowStatus followStatus) {
        this.f96455a.a(this.f96456b, followStatus);
    }
}
