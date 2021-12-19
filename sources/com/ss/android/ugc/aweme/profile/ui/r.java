package com.ss.android.ugc.aweme.profile.ui;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f117161a;

    /* renamed from: b  reason: collision with root package name */
    private final long f117162b;

    static {
        Covode.recordClassIndex(75671);
    }

    r(String str, long j2) {
        this.f117161a = str;
        this.f117162b = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return c.a(this.f117161a, this.f117162b);
    }
}
