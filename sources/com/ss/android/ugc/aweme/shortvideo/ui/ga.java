package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.tools.i;
import com.ss.android.ugc.tools.f.b;

final /* synthetic */ class ga implements m {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordNewActivity f131782a;

    static {
        Covode.recordClassIndex(86320);
    }

    ga(VideoRecordNewActivity videoRecordNewActivity) {
        this.f131782a = videoRecordNewActivity;
    }

    @Override // androidx.lifecycle.u, com.bytedance.als.m
    public final void onChanged(Object obj) {
        VideoRecordNewActivity videoRecordNewActivity = this.f131782a;
        i K = videoRecordNewActivity.F.K();
        if (videoRecordNewActivity.f131228g != null) {
            r.a("choose_speed_mode", new b().a("creation_id", videoRecordNewActivity.f131228g.q).a("shoot_way", videoRecordNewActivity.f131228g.r).a("draft_id", videoRecordNewActivity.f131228g.C).a("speed_mode", K.description()).a("shoot_page", "video_shoot_page").a("shoot_tab_name", videoRecordNewActivity.f131228g.r()).f149193a);
        }
    }
}
