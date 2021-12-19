package com.ss.android.ugc.aweme.account.login.e;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f63426a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f63427b;

    static {
        Covode.recordClassIndex(39080);
    }

    b(a aVar, Intent intent) {
        this.f63426a = aVar;
        this.f63427b = intent;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f63426a.a(this.f63427b);
    }
}
