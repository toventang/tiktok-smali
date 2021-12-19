package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

final /* synthetic */ class cn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cc f94497a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f94498b;

    /* renamed from: c  reason: collision with root package name */
    private final String f94499c;

    /* renamed from: d  reason: collision with root package name */
    private final int f94500d;

    static {
        Covode.recordClassIndex(60002);
    }

    cn(cc ccVar, Aweme aweme, String str, int i2) {
        this.f94497a = ccVar;
        this.f94498b = aweme;
        this.f94499c = str;
        this.f94500d = i2;
    }

    public final void run() {
        this.f94497a.b(this.f94498b);
    }
}
