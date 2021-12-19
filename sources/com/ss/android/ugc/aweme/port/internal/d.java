package com.ss.android.ugc.aweme.port.internal;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftLoadResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;

public interface d {
    static {
        Covode.recordClassIndex(74625);
    }

    void a(int i2, String str, String str2);

    void a(DraftLoadResult draftLoadResult);

    void a(DraftSaveResult draftSaveResult);
}
