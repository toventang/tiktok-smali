package com.ss.android.ugc.aweme.follow.widet;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.profile.model.User;

final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f96312a;

    /* renamed from: b  reason: collision with root package name */
    private final User f96313b;

    static {
        Covode.recordClassIndex(60989);
    }

    h(a aVar, User user) {
        this.f96312a = aVar;
        this.f96313b = user;
    }

    @Override // com.ss.android.ugc.aweme.base.component.f
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.base.component.f
    public final void a() {
        a aVar = this.f96312a;
        User user = this.f96313b;
        if (b.g().isLogin()) {
            aVar.b(user);
        }
    }
}
