package com.ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f74204a;

    static {
        Covode.recordClassIndex(45794);
    }

    e(String str) {
        this.f74204a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return d.a(this.f74204a);
    }
}
