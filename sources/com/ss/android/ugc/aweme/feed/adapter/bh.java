package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bh implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91707a;

    static {
        Covode.recordClassIndex(57737);
    }

    bh(VideoViewCell videoViewCell) {
        this.f91707a = videoViewCell;
    }

    public final void run() {
        this.f91707a.aD();
    }
}
