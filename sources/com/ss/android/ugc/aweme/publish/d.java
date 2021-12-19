package com.ss.android.ugc.aweme.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.a.b;
import h.z;

public interface d {
    static {
        Covode.recordClassIndex(77127);
    }

    c a();

    void a(VideoPublishEditModel videoPublishEditModel);

    void a(VideoPublishEditModel videoPublishEditModel, b<? super c, z> bVar, b<? super DraftSaveResult, z> bVar2);
}
