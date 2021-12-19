package com.ss.android.ugc.aweme.services.external;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.ad;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;

public interface IInfoService {
    static {
        Covode.recordClassIndex(79636);
    }

    VideoExposureData convertToExposureData(Object obj);

    void endDownloadEffectAlog(Effect effect, long j2, long j3, int i2, ExceptionResult exceptionResult);

    Map<Object, Object> getDataMapForEditActivity(Context context);

    long getDurationSinceAppForeground(String str);

    List<MediaModel> getMediaLoaderImages(Context context);

    ad shareContextInfo(BaseShortVideoContext baseShortVideoContext);

    void startDownloadEffectAlog(Effect effect, long j2);

    IStickerUtilsService stickerInfo();
}
