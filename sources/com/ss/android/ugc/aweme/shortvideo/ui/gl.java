package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class gl implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordPermissionActivity f131822a;

    static {
        Covode.recordClassIndex(86365);
    }

    gl(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        this.f131822a = videoRecordPermissionActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f131822a;
        c.D.c().d(videoRecordPermissionActivity);
        videoRecordPermissionActivity.finish();
    }
}
