package com.ss.android.ugc.aweme.commercialize.views;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f76181a;

    /* renamed from: b  reason: collision with root package name */
    private final View f76182b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f76183c;

    static {
        Covode.recordClassIndex(46979);
    }

    h(d dVar, View view, Runnable runnable) {
        this.f76181a = dVar;
        this.f76182b = view;
        this.f76183c = runnable;
    }

    public final void run() {
        this.f76181a.b(this.f76182b, this.f76183c);
    }
}
