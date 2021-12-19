package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class en implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final eg f94729a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f94730b;

    static {
        Covode.recordClassIndex(60107);
    }

    en(eg egVar, Map map) {
        this.f94729a = egVar;
        this.f94730b = map;
    }

    public final void run() {
        this.f94729a.f(this.f94730b);
    }
}
