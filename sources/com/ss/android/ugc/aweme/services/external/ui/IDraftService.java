package com.ss.android.ugc.aweme.services.external.ui;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;

public interface IDraftService {

    public interface OnGetRecoverDraftCallback {
        static {
            Covode.recordClassIndex(79694);
        }

        void onFail();

        void onSuccess(c cVar);
    }

    static {
        Covode.recordClassIndex(79693);
    }

    void enterDraftBoxActivity(Context context, Bundle bundle);

    void getRecoverDraftIfHave(Context context, OnGetRecoverDraftCallback onGetRecoverDraftCallback);

    void removeRecoverDraft();
}
