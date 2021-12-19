package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.bz;

final /* synthetic */ class cb implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoPublishActivity f131585a;

    static {
        Covode.recordClassIndex(86177);
    }

    cb(VideoPublishActivity videoPublishActivity) {
        this.f131585a = videoPublishActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        VideoPublishActivity videoPublishActivity = this.f131585a;
        bz.a(videoPublishActivity.f131215e, false);
        videoPublishActivity.i();
        videoPublishActivity.a("long_video_draft_music_legality");
        r.a("click_audio_clear_popup", videoPublishActivity.g().a("click_type", "select").f149193a);
    }
}
