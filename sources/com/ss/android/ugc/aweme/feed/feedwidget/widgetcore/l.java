package com.ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f93144a;

    /* renamed from: b  reason: collision with root package name */
    private final b f93145b;

    static {
        Covode.recordClassIndex(59089);
    }

    l(a aVar, b bVar) {
        this.f93144a = aVar;
        this.f93145b = bVar;
    }

    public final void run() {
        this.f93144a.h(this.f93145b);
    }
}
