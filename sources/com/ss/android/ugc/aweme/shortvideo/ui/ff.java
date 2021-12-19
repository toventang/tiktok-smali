package com.ss.android.ugc.aweme.shortvideo.ui;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ff implements u {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordNewActivity f131754a;

    static {
        Covode.recordClassIndex(86295);
    }

    ff(VideoRecordNewActivity videoRecordNewActivity) {
        this.f131754a = videoRecordNewActivity;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        VideoRecordNewActivity videoRecordNewActivity = this.f131754a;
        if (((Boolean) obj).booleanValue()) {
            videoRecordNewActivity.q();
        } else if (videoRecordNewActivity.f131233l != null && videoRecordNewActivity.f131233l.isShowing()) {
            videoRecordNewActivity.f131233l.dismiss();
            videoRecordNewActivity.f131233l = null;
        }
    }
}
