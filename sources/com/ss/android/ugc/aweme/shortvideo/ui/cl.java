package com.ss.android.ugc.aweme.shortvideo.ui;

import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.commercialize.b.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import java.util.List;

final /* synthetic */ class cl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131638a;

    static {
        Covode.recordClassIndex(86204);
    }

    cl(cj cjVar) {
        this.f131638a = cjVar;
    }

    public final void run() {
        cj cjVar = this.f131638a;
        VideoPublishEditModel videoPublishEditModel = cjVar.K;
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.autoAttachedAnchor != null) {
            c.a(new a(videoPublishEditModel.autoAttachedAnchor));
            r.a("choose_anchor", new d().a("shoot_way", "share_video").a("enter_from", "video_post_page").a("anchor_type", "game").a("anchor_entry", videoPublishEditModel.autoAttachedAnchor.getTitle()).f66730a);
        }
        List<CreateAnchorInfo> a2 = com.ss.android.ugc.aweme.shortvideo.c.a.a(cjVar.K);
        for (e<Class<?>, IAVPublishExtension<?>> eVar : cjVar.S) {
            eVar.f2398b.callbackAnchors(a2);
        }
    }
}
