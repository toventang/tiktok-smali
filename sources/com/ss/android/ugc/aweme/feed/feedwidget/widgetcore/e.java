package com.ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f93134a;

    /* renamed from: b  reason: collision with root package name */
    private final int f93135b;

    /* renamed from: c  reason: collision with root package name */
    private final b f93136c;

    static {
        Covode.recordClassIndex(59082);
    }

    e(a aVar, int i2, b bVar) {
        this.f93134a = aVar;
        this.f93135b = i2;
        this.f93136c = bVar;
    }

    public final void run() {
        this.f93134a.b(this.f93136c);
    }
}
