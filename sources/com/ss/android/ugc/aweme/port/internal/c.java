package com.ss.android.ugc.aweme.port.internal;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.draft.n;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

public interface c {
    static {
        Covode.recordClassIndex(74624);
    }

    int a(com.ss.android.ugc.aweme.draft.model.c cVar, String str);

    DraftDBSaveResult a(com.ss.android.ugc.aweme.draft.model.c cVar);

    e a();

    void a(com.ss.android.ugc.aweme.draft.model.c cVar, boolean z);

    void a(n nVar);

    void a(boolean z);

    d b();

    VideoPublishEditModel b(com.ss.android.ugc.aweme.draft.model.c cVar);

    VideoPublishEditModel b(com.ss.android.ugc.aweme.draft.model.c cVar, String str);

    List<com.ss.android.ugc.aweme.draft.model.c> c();

    void c(com.ss.android.ugc.aweme.draft.model.c cVar);

    boolean d();
}
