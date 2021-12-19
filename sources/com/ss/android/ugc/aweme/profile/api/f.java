package com.ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f116013a;

    static {
        Covode.recordClassIndex(74812);
    }

    f(String str) {
        this.f116013a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return c.a(this.f116013a, true, null);
    }
}
