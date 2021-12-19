package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.bz;

final /* synthetic */ class cc implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoPublishActivity f131586a;

    static {
        Covode.recordClassIndex(86178);
    }

    cc(VideoPublishActivity videoPublishActivity) {
        this.f131586a = videoPublishActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        VideoPublishActivity videoPublishActivity = this.f131586a;
        bz.a(videoPublishActivity.f131215e, true);
        r.a("click_audio_clear_popup", videoPublishActivity.g().a("click_type", "not_now").f149193a);
    }
}
