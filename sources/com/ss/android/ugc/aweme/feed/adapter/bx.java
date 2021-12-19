package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bx implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91726a;

    static {
        Covode.recordClassIndex(57753);
    }

    bx(VideoViewCell videoViewCell) {
        this.f91726a = videoViewCell;
    }

    public final void run() {
        this.f91726a.aH();
    }
}
