package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class gq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordPermissionActivity f131828a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f131829b;

    /* renamed from: c  reason: collision with root package name */
    private final d f131830c;

    static {
        Covode.recordClassIndex(86370);
    }

    gq(VideoRecordPermissionActivity videoRecordPermissionActivity, String[] strArr, d dVar) {
        this.f131828a = videoRecordPermissionActivity;
        this.f131829b = strArr;
        this.f131830c = dVar;
    }

    public final void run() {
        this.f131828a.a(this.f131829b, this.f131830c);
    }
}
