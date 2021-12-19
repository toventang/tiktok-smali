package com.ss.android.ugc.aweme.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

public interface e {
    static {
        Covode.recordClassIndex(77129);
    }

    void a(c cVar, VideoPublishEditModel videoPublishEditModel, IDraftService.DraftSaveListener draftSaveListener);
}
