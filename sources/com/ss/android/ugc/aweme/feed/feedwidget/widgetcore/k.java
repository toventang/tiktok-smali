package com.ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f93142a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f93143b;

    static {
        Covode.recordClassIndex(59088);
    }

    k(a aVar, Map map) {
        this.f93142a = aVar;
        this.f93143b = map;
    }

    public final void run() {
        this.f93142a.b(this.f93143b);
    }
}
