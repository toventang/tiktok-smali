package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoPublishEditActivity f126966a;

    static {
        Covode.recordClassIndex(83291);
    }

    bc(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f126966a = vEVideoPublishEditActivity;
    }

    public final void run() {
        this.f126966a.f126704i = true;
    }
}
