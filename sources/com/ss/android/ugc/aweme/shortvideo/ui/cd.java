package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.bz;

final /* synthetic */ class cd implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoPublishActivity f131587a;

    static {
        Covode.recordClassIndex(86179);
    }

    cd(VideoPublishActivity videoPublishActivity) {
        this.f131587a = videoPublishActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        VideoPublishActivity videoPublishActivity = this.f131587a;
        bz.a(videoPublishActivity.f131215e, false);
        videoPublishActivity.i();
        videoPublishActivity.a("short_video_draft_music_legality");
        r.a("click_audio_clear_popup", videoPublishActivity.g().a("click_type", "select").f149193a);
    }
}
