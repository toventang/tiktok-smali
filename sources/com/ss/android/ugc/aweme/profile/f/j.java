package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final int f116424a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116425b;

    static {
        Covode.recordClassIndex(75159);
    }

    public j(int i2, String str) {
        this.f116424a = i2;
        this.f116425b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return e.a(this.f116424a, this.f116425b);
    }
}
