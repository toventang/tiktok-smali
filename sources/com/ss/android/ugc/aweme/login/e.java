package com.ss.android.ugc.aweme.login;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f109023a;

    static {
        Covode.recordClassIndex(69814);
    }

    public e(Bundle bundle) {
        this.f109023a = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return d.c(this.f109023a);
    }
}
