package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class gm implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordPermissionActivity f131823a;

    static {
        Covode.recordClassIndex(86366);
    }

    gm(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        this.f131823a = videoRecordPermissionActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f131823a;
        VideoRecordPermissionActivity.a();
        videoRecordPermissionActivity.finish();
    }
}
