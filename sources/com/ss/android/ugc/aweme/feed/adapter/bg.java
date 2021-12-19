package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bg implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91705a;

    /* renamed from: b  reason: collision with root package name */
    private final cf f91706b;

    static {
        Covode.recordClassIndex(57736);
    }

    bg(VideoViewCell videoViewCell, cf cfVar) {
        this.f91705a = videoViewCell;
        this.f91706b = cfVar;
    }

    public final void run() {
        this.f91705a.b(this.f91706b);
    }
}
