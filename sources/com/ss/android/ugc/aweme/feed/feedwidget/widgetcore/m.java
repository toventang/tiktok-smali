package com.ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f93146a;

    /* renamed from: b  reason: collision with root package name */
    private final View f93147b;

    static {
        Covode.recordClassIndex(59090);
    }

    m(a aVar, View view) {
        this.f93146a = aVar;
        this.f93147b = view;
    }

    public final void run() {
        this.f93146a.b(this.f93147b);
    }
}
