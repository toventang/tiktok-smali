package com.ss.android.ugc.aweme.deeplink.d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f79469a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f79470b;

    static {
        Covode.recordClassIndex(49374);
    }

    b(a aVar, Uri uri) {
        this.f79469a = aVar;
        this.f79470b = uri;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f79469a.c(this.f79470b);
    }
}
