package com.ss.android.ugc.aweme.favorites.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import java.util.concurrent.Callable;

final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final int f90616a;

    /* renamed from: b  reason: collision with root package name */
    private final int f90617b;

    static {
        Covode.recordClassIndex(56921);
    }

    h(int i2, int i3) {
        this.f90616a = i2;
        this.f90617b = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return UserFavoritesApi.d(this.f90616a, this.f90617b);
    }
}
