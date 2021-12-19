package com.ss.android.ugc.aweme.video.local;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f143471a;

    /* renamed from: b  reason: collision with root package name */
    private final String f143472b;

    static {
        Covode.recordClassIndex(93881);
    }

    c(String str, String str2) {
        this.f143471a = str;
        this.f143472b = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return LocalVideoPlayerManager.a(this.f143471a, this.f143472b);
    }
}
