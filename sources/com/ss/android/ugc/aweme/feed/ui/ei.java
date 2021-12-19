package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ei implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final eg f94719a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f94720b;

    static {
        Covode.recordClassIndex(60102);
    }

    ei(eg egVar, Map map) {
        this.f94719a = egVar;
        this.f94720b = map;
    }

    public final void run() {
        this.f94719a.g(this.f94720b);
    }
}
