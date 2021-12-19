package com.ss.android.ugc.aweme.profile.widgets.follow.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import dagger.a.c;
import dagger.a.f;

public final class b implements c<IUserService> {
    static {
        Covode.recordClassIndex(76273);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return a();
    }

    public static IUserService a() {
        return (IUserService) f.a(a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
