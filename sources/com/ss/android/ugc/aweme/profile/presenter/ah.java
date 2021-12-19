package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.concurrent.Callable;

final /* synthetic */ class ah implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final UserResponse f116539a;

    static {
        Covode.recordClassIndex(75307);
    }

    ah(UserResponse userResponse) {
        this.f116539a = userResponse;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a.a(4, "aweme/v1/user", GsonHolder.c().b().b(this.f116539a));
        return null;
    }
}
