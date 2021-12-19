package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91709a;

    static {
        Covode.recordClassIndex(57739);
    }

    bj(VideoViewCell videoViewCell) {
        this.f91709a = videoViewCell;
    }

    public final void run() {
        this.f91709a.aB();
    }
}
