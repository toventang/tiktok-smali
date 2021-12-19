package com.ss.android.ugc.aweme.request_combine.common;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final ServerPortraitCollections f120625a;

    static {
        Covode.recordClassIndex(78540);
    }

    a(ServerPortraitCollections serverPortraitCollections) {
        this.f120625a = serverPortraitCollections;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f120625a.c();
    }
}
