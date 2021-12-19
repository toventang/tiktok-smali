package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class gv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordPermissionActivity f131836a;

    static {
        Covode.recordClassIndex(86375);
    }

    gv(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        this.f131836a = videoRecordPermissionActivity;
    }

    public final void run() {
        this.f131836a.a(true);
    }
}
