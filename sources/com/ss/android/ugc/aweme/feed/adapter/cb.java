package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91757a;

    static {
        Covode.recordClassIndex(57764);
    }

    cb(VideoViewCell videoViewCell) {
        this.f91757a = videoViewCell;
    }

    public final void run() {
        this.f91757a.ag();
    }
}
