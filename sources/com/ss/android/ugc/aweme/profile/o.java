package com.ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final k f116503a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f116504b;

    /* renamed from: c  reason: collision with root package name */
    private final int f116505c;

    static {
        Covode.recordClassIndex(75292);
    }

    o(k kVar, Aweme aweme, int i2) {
        this.f116503a = kVar;
        this.f116504b = aweme;
        this.f116505c = i2;
    }

    public final void run() {
        k kVar = this.f116503a;
        kVar.f116480a.a(this.f116504b.getAuthor());
        kVar.n = true;
    }
}
