package com.ss.android.ugc.aweme.profile.ui;

import com.bytedance.covode.number.Covode;
import java.util.List;

final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f117142a;

    /* renamed from: b  reason: collision with root package name */
    private final List f117143b;

    static {
        Covode.recordClassIndex(75658);
    }

    k(c cVar, List list) {
        this.f117142a = cVar;
        this.f117143b = list;
    }

    public final void run() {
        this.f117142a.a(this.f117143b);
    }
}
