package com.ss.android.ugc.aweme.follow.widet;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f96310a;

    /* renamed from: b  reason: collision with root package name */
    private final User f96311b;

    static {
        Covode.recordClassIndex(60988);
    }

    g(a aVar, User user) {
        this.f96310a = aVar;
        this.f96311b = user;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        a aVar = this.f96310a;
        User user = this.f96311b;
        aVar.f96292i = false;
        a.AbstractC2320a aVar2 = aVar.f96290g;
        user.getFollowStatus();
        aVar2.b();
        return z.f158842a;
    }
}
