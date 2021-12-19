package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aw implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoPublishEditActivity f126935a;

    static {
        Covode.recordClassIndex(83275);
    }

    aw(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f126935a = vEVideoPublishEditActivity;
    }

    public final void run() {
        this.f126935a.f126708m = true;
    }
}
