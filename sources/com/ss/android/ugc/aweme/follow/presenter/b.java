package com.ss.android.ugc.aweme.follow.presenter;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f96256a;

    /* renamed from: b  reason: collision with root package name */
    private final Message f96257b;

    static {
        Covode.recordClassIndex(60966);
    }

    b(a aVar, Message message) {
        this.f96256a = aVar;
        this.f96257b = message;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f96256a.a(this.f96257b);
    }
}
