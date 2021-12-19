package com.ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.publish.h;
import com.ss.android.ugc.aweme.shortvideo.publish.q;
import com.ss.android.ugc.aweme.shortvideo.x;
import h.f.a.b;
import java.util.List;
import org.json.JSONObject;

public interface IAVPublishService {

    public interface LiveThumCallback {
        static {
            Covode.recordClassIndex(79846);
        }

        void onCallback(String str, String str2);

        void publishSuccess(String str);
    }

    public interface OnPublishCallback {
        static {
            Covode.recordClassIndex(79847);
        }

        void onStartPublish(h hVar);

        void onStopPublish();
    }

    public interface onLivePublishCallback {
        static {
            Covode.recordClassIndex(79848);
        }

        void onLivePublishCallback(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(79845);
    }

    void addChallenge(Challenge challenge);

    void addMusic(MusicModel musicModel);

    void addMyVideoChain(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3);

    void addPublishCallback(x<ai> xVar, String str);

    void cancelRestoreOnMain();

    void cancelRestoreOnMain(Activity activity);

    void cancelSynthesis(Context context, String str);

    boolean checkIsAlreadyPublished(Context context);

    boolean containEmoji(String str);

    boolean enableShowPrePublishUserSwitch();

    boolean endWithHashTag(String str);

    int getAddVideosExperiConsuSideCode();

    List<q> getAllPublishModel();

    Bitmap getCover(q qVar);

    AVChallenge getCurChallenge();

    c getCurMusic();

    String getCurrentPublishTaskId();

    Boolean getHasOpenCommercialSoundPage();

    boolean getKitManageRegister();

    onLivePublishCallback getLivePublishCallback();

    LiveThumCallback getLiveThumCallback();

    int getParallelPublishTaskSize();

    ViewGroup getPublishAddVideoContainer(Activity activity);

    q getPublishModel(String str);

    String getShootWay();

    void hideUploadRecoverWindow(Context context, boolean z);

    boolean inPublishPage(Context context);

    Boolean isFromCommercialSoundPage();

    boolean isInShoutout();

    boolean isParallelPublishEnabled();

    boolean isParallelPublishTaskFinished();

    boolean isPhotoMvModeMusic();

    boolean isPublishServiceRunning(Context context);

    boolean isPublishable();

    boolean isPublishing();

    boolean needRestore();

    boolean processPublish(e eVar, Intent intent);

    void publishFromDraft(e eVar, com.ss.android.ugc.aweme.draft.model.c cVar);

    void removePublishCallback(x<ai> xVar);

    void resetNewCreateWay();

    boolean restoreWorkExperimentDisableCover();

    void setCurMusic(MusicModel musicModel);

    void setCurMusic(MusicModel musicModel, Boolean bool, Boolean bool2);

    void setDestroyFlag(Activity activity);

    void setFakeMusic(MusicModel musicModel);

    void setFromCommercialSoundPage(boolean z);

    void setHasOpenCommercialSoundPage(boolean z);

    void setHashTagRegex(String str);

    void setKitManageRegister(boolean z);

    void setMusicChooseType(int i2);

    void setPublishStatus(int i2);

    void showLighteningPublishSuccessPopWindow(e eVar, Aweme aweme);

    void showLivePublishFailedPopwindow(e eVar, String str);

    void showLivePublishSuccessPopwindow(e eVar, String str, String str2);

    void showRestoreWorkDialog(Activity activity, String str);

    void showUploadRecoverIfNeed(boolean z, e eVar, String str, String str2, String str3);

    void showUploadingDialog();

    void startPublish(e eVar, Bundle bundle);

    void tryRestorePublish(e eVar, b<Boolean, Void> bVar);

    void uploadRecoverPopViewSetVisibility(boolean z);

    boolean usedBusiSticker();
}
