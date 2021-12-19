package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class av implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoPublishEditActivity f126934a;

    static {
        Covode.recordClassIndex(83274);
    }

    av(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f126934a = vEVideoPublishEditActivity;
    }

    public final void run() {
        this.f126934a.f126708m = true;
    }
}
