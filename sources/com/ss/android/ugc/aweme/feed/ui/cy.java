package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

final /* synthetic */ class cy implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cv f94531a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f94532b;

    /* renamed from: c  reason: collision with root package name */
    private final long f94533c;

    /* renamed from: d  reason: collision with root package name */
    private final Aweme f94534d;

    static {
        Covode.recordClassIndex(60016);
    }

    cy(cv cvVar, boolean z, long j2, Aweme aweme) {
        this.f94531a = cvVar;
        this.f94532b = z;
        this.f94533c = j2;
        this.f94534d = aweme;
    }

    public final void run() {
        cv cvVar = this.f94531a;
        boolean z = this.f94532b;
        long j2 = this.f94533c;
        Aweme aweme = this.f94534d;
        cvVar.f94511a.setSelected(z);
        cvVar.f94512b.setText(cv.a(j2, aweme));
    }
}
