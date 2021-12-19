package com.ss.android.ugc.aweme.app.accountsdk;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.Callable;

final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final User f66544a;

    /* renamed from: b  reason: collision with root package name */
    private final User f66545b;

    static {
        Covode.recordClassIndex(40903);
    }

    d(User user, User user2) {
        this.f66544a = user;
        this.f66545b = user2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return c.a(this.f66544a, this.f66545b);
    }
}
