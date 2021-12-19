package com.ss.android.ugc.aweme.qasticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ShortVideoContext f119161a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoPublishEditModel f119162b;

    static {
        Covode.recordClassIndex(77387);
    }

    public a() {
        this(null, 3);
    }

    public final b a() {
        VideoPublishEditModel videoPublishEditModel = this.f119162b;
        if (videoPublishEditModel != null) {
            b a2 = new b().a("creation_id", videoPublishEditModel.creationId).a("enter_from", "video_edit_page").a("shoot_way", videoPublishEditModel.mShootWay).a("shoot_entrance", videoPublishEditModel.mShootWay).a("user_id", g.a().A().c());
            l.b(a2, "");
            return a2;
        }
        b bVar = new b();
        l.b(bVar, "");
        return bVar;
    }

    private a(VideoPublishEditModel videoPublishEditModel) {
        this.f119161a = null;
        this.f119162b = videoPublishEditModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(VideoPublishEditModel videoPublishEditModel, int i2) {
        this((i2 & 2) != 0 ? null : videoPublishEditModel);
    }
}
