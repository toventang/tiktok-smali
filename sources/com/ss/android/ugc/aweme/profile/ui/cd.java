package com.ss.android.ugc.aweme.profile.ui;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class cd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bm f117059a;

    /* renamed from: b  reason: collision with root package name */
    private final String f117060b;

    static {
        Covode.recordClassIndex(75585);
    }

    cd(bm bmVar, String str) {
        this.f117059a = bmVar;
        this.f117060b = str;
    }

    public final void run() {
        this.f117059a.i(this.f117060b);
    }
}
