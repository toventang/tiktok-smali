package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class gf implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordPermissionActivity f131813a;

    static {
        Covode.recordClassIndex(86359);
    }

    gf(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        this.f131813a = videoRecordPermissionActivity;
    }

    public final void run() {
        this.f131813a.a(true);
    }
}
