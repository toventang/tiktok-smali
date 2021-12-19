package com.ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final k f117500a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f117501b;

    static {
        Covode.recordClassIndex(75920);
    }

    w(k kVar, Aweme aweme) {
        this.f117500a = kVar;
        this.f117501b = aweme;
    }

    public final void run() {
        k kVar = this.f117500a;
        kVar.f116480a.a(this.f117501b);
        kVar.f116480a.a(true);
    }
}
