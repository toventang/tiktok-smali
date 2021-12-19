package com.ss.android.ugc.aweme.im.sdk.chat.ui.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c.AnonymousClass1 f101136a;

    /* renamed from: b  reason: collision with root package name */
    private final ai f101137b;

    static {
        Covode.recordClassIndex(64700);
    }

    f(c.AnonymousClass1 r1, ai aiVar) {
        this.f101136a = r1;
        this.f101137b = aiVar;
    }

    public final void run() {
        this.f101136a.a(this.f101137b);
    }
}
