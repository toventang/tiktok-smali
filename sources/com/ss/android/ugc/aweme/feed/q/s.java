package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.q.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a.AnonymousClass14 f93808a;

    /* renamed from: b  reason: collision with root package name */
    private final int f93809b;

    static {
        Covode.recordClassIndex(59685);
    }

    s(a.AnonymousClass14 r1, int i2) {
        this.f93808a = r1;
        this.f93809b = i2;
    }

    public final void run() {
        this.f93808a.a(this.f93809b);
    }
}
