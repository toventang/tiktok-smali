package com.ss.android.ugc.aweme.services;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.filter.IFilterService;
import com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.services.video.IVideoCoverService;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;

public interface IFoundationAVService {

    public interface IFetchResourcesListener {
        static {
            Covode.recordClassIndex(79464);
        }

        void onFailed(Exception exc);

        void onSuccess(String[] strArr);
    }

    static {
        Covode.recordClassIndex(79463);
    }

    IAVSettingsService avSettingsService();

    VideoExposureData convertToExposureData(Object obj);

    IDraftService draftService();

    IEffectService effectService();

    void fetchResourcesNeededByRequirements(String[] strArr, IFetchResourcesListener iFetchResourcesListener);

    IFilterService getFilterService();

    ISDKService getSDKService();

    IVideoLegalCheckerAndToastService getVideoLegalCheckerAndToastService(Context context);

    void loadLibrary(String str, Application application);

    void setLastStickerId(Context context, String str, int i2);

    String shortVideoDir();

    void tryCopyDuetDefaultLayout();

    IVideoCoverService videoCoverService();
}
