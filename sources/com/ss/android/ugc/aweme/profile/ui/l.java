package com.ss.android.ugc.aweme.profile.ui;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f117144a;

    /* renamed from: b  reason: collision with root package name */
    private final List f117145b;

    static {
        Covode.recordClassIndex(75659);
    }

    l(c cVar, List list) {
        this.f117144a = cVar;
        this.f117145b = list;
    }

    public final void run() {
        this.f117144a.b(this.f117145b);
    }
}
