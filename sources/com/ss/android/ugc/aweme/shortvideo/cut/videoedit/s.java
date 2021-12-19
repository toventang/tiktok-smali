package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoEditView f126191a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f126192b;

    static {
        Covode.recordClassIndex(82847);
    }

    s(VideoEditView videoEditView, boolean z) {
        this.f126191a = videoEditView;
        this.f126192b = z;
    }

    public final void run() {
        this.f126191a.d(this.f126192b);
    }
}
