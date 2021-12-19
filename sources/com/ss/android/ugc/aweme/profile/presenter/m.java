package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class m implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f116589a;

    static {
        Covode.recordClassIndex(75321);
    }

    m(Throwable th) {
        this.f116589a = th;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Throwable th = this.f116589a;
        if (th instanceof Exception) {
            throw th;
        }
        throw new IllegalStateException("AwemeModel.fetchListRx: " + th.getMessage());
    }
}
