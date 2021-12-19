package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bi implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91708a;

    static {
        Covode.recordClassIndex(57738);
    }

    bi(VideoViewCell videoViewCell) {
        this.f91708a = videoViewCell;
    }

    public final void run() {
        this.f91708a.aC();
    }
}
