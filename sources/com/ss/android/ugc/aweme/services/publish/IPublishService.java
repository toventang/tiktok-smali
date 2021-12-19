package com.ss.android.ugc.aweme.services.publish;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.story.h.a.a.a;

public interface IPublishService {

    public interface OnGetRecoverDraftCallback {
        static {
            Covode.recordClassIndex(79778);
        }

        void onFail();

        void onSuccess(c cVar);
    }

    public interface OnPublishCallback {
        static {
            Covode.recordClassIndex(79779);
        }

        void onStartPublish();

        void onStopPublish();
    }

    public interface profileLivePublishCallback {
        static {
            Covode.recordClassIndex(79780);
        }

        void onPublish(String str);
    }

    static {
        Covode.recordClassIndex(79777);
    }

    void cancelSynthetise(Context context);

    boolean checkIsAlreadyPublished(Context context);

    void getRecoverDraftIfHave(Context context, OnGetRecoverDraftCallback onGetRecoverDraftCallback);

    Class<? extends Service> getShortVideoPublishServiceClass();

    void hideUploadRecoverWindow(Context context, boolean z);

    boolean inPublishPage(Context context);

    boolean isPublishServiceRunning(Context context);

    boolean isVideoPublishPreviewActivity(Context context);

    boolean processPublish(e eVar, Intent intent);

    void publishFromDraft(e eVar, c cVar);

    a queryKnowFriends(int i2, int i3);

    void setUploadRecoverPath(String str);

    void showUploadRecoverIfNeed(boolean z, e eVar);

    void startPublish(e eVar, Bundle bundle);

    void uploadRecoverPopViewSetVisibility(boolean z);
}
