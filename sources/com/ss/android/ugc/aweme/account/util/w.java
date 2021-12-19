package com.ss.android.ugc.aweme.account.util;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f65509a;

    static {
        Covode.recordClassIndex(40290);
    }

    w(Bundle bundle) {
        this.f65509a = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return u.d(this.f65509a);
    }
}
