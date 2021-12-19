package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91728a;

    static {
        Covode.recordClassIndex(57755);
    }

    bz(VideoViewCell videoViewCell) {
        this.f91728a = videoViewCell;
    }

    public final void run() {
        this.f91728a.aF();
    }
}
