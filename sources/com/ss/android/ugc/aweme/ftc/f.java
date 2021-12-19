package com.ss.android.ugc.aweme.ftc;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f98455a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(62614);
    }

    public static void a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        b a2 = new b().a("creation_id", videoPublishEditModel.creationId).a("group_id", dv.a());
        if (videoPublishEditModel.draftId != 0) {
            a2.a("draft_id", videoPublishEditModel.draftId);
        }
        r.a("click_text_entrance", a2.f149193a);
    }
}
