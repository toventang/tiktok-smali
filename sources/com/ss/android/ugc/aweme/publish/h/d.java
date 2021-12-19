package com.ss.android.ugc.aweme.publish.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.publish.e;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.shortvideo.ab.m;
import com.ss.android.ugc.aweme.shortvideo.ab.n;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.b.l;

final class d implements e {
    static {
        Covode.recordClassIndex(77162);
    }

    @Override // com.ss.android.ugc.aweme.publish.e
    public final void a(c cVar, VideoPublishEditModel videoPublishEditModel, IDraftService.DraftSaveListener draftSaveListener) {
        l.d(cVar, "");
        l.d(videoPublishEditModel, "");
        l.d(draftSaveListener, "");
        n.a(new m.c(cVar, 3, videoPublishEditModel, draftSaveListener));
    }
}
