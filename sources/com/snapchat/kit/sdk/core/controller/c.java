package com.snapchat.kit.sdk.core.controller;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import javax.a.a;

public final class c implements dagger.a.c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Handler> f57124a;

    static {
        Covode.recordClassIndex(35597);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new b(this.f57124a.get());
    }

    public c(a<Handler> aVar) {
        this.f57124a = aVar;
    }
}
