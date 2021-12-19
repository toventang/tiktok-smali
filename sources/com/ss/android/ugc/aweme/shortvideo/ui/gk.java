package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class gk implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordPermissionActivity f131821a;

    static {
        Covode.recordClassIndex(86364);
    }

    gk(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        this.f131821a = videoRecordPermissionActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f131821a;
        VideoRecordPermissionActivity.a();
        videoRecordPermissionActivity.finish();
    }
}
