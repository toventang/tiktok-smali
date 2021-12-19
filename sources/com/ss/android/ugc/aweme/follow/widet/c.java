package com.ss.android.ugc.aweme.follow.widet;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f96299a;

    /* renamed from: b  reason: collision with root package name */
    private final User f96300b;

    /* renamed from: c  reason: collision with root package name */
    private final int f96301c;

    static {
        Covode.recordClassIndex(60984);
    }

    c(a aVar, User user, int i2) {
        this.f96299a = aVar;
        this.f96300b = user;
        this.f96301c = i2;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        a aVar = this.f96299a;
        User user = this.f96300b;
        a.AbstractC2320a aVar2 = aVar.f96290g;
        user.getFollowStatus();
        aVar2.c();
        aVar.c(user);
        return z.f158842a;
    }
}
