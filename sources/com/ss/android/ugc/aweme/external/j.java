package com.ss.android.ugc.aweme.external;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.ad;
import com.ss.android.ugc.aweme.effectplatform.b;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.services.external.IInfoService;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.services.sticker.StickerUtilsServiceImpl;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;
import java.util.Map;

public final class j implements IInfoService {

    /* renamed from: a  reason: collision with root package name */
    private final h f90397a = i.a((h.f.a.a) a.f90398a);

    static {
        Covode.recordClassIndex(56750);
    }

    static final class a extends m implements h.f.a.a<StickerUtilsServiceImpl> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90398a = new a();

        static {
            Covode.recordClassIndex(56751);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StickerUtilsServiceImpl invoke() {
            return new StickerUtilsServiceImpl();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final IStickerUtilsService stickerInfo() {
        return (StickerUtilsServiceImpl) this.f90397a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final VideoExposureData convertToExposureData(Object obj) {
        l.d(obj, "");
        VideoExposureData asExposureData = VideoPublishEditModel.asExposureData(obj);
        l.b(asExposureData, "");
        return asExposureData;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final List<MediaModel> getMediaLoaderImages(Context context) {
        l.d(context, "");
        return com.ss.android.ugc.aweme.mediachoose.helper.a.a(context, false, -1, 0);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final Map<Object, Object> getDataMapForEditActivity(Context context) {
        l.d(context, "");
        if (context instanceof VEVideoPublishEditActivity) {
            return ((VEVideoPublishEditActivity) context).m();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final long getDurationSinceAppForeground(String str) {
        l.d(str, "");
        l.d(str, "");
        long currentTimeMillis = System.currentTimeMillis() - ex.f142896b;
        ex.f142897c = currentTimeMillis;
        ex.f142895a = str;
        return currentTimeMillis;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final ad shareContextInfo(BaseShortVideoContext baseShortVideoContext) {
        l.d(baseShortVideoContext, "");
        ad adVar = null;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            String mainBusinessData = VideoPublishEditModel.asExposureData(baseShortVideoContext).getMainBusinessData();
            if (!com.bytedance.common.utility.m.a(mainBusinessData)) {
                if (mainBusinessData == null) {
                    l.b();
                }
                e eVar = (e) c.w.getRetrofitFactoryGson().a(mainBusinessData, e.class);
                if (!(eVar == null || (adVar = eVar.getShareContext()) == null)) {
                    adVar.mIsFromDraft = baseShortVideoContext.mIsFromDraft;
                }
            }
        }
        return adVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final void startDownloadEffectAlog(Effect effect, long j2) {
        b.a(effect, j2);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final void endDownloadEffectAlog(Effect effect, long j2, long j3, int i2, ExceptionResult exceptionResult) {
        b.a(effect, j2, j3, i2, exceptionResult);
    }
}
