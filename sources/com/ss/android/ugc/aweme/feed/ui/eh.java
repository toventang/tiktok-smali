package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import java.util.Map;

final /* synthetic */ class eh implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final eg f94717a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f94718b;

    static {
        Covode.recordClassIndex(60101);
    }

    eh(eg egVar, Map map) {
        this.f94717a = egVar;
        this.f94718b = map;
    }

    public final void run() {
        this.f94717a.a(this.f94718b);
    }
}
