package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class eo implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final eg f94731a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f94732b;

    static {
        Covode.recordClassIndex(60108);
    }

    eo(eg egVar, Map map) {
        this.f94731a = egVar;
        this.f94732b = map;
    }

    public final void run() {
        this.f94731a.e(this.f94732b);
    }
}
