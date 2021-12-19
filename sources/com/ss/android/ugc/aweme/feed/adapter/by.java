package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class by implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91727a;

    static {
        Covode.recordClassIndex(57754);
    }

    by(VideoViewCell videoViewCell) {
        this.f91727a = videoViewCell;
    }

    public final void run() {
        this.f91727a.aG();
    }
}
