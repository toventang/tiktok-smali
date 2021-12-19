package com.ss.android.ugc.aweme.services.effect;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface IEffectService {

    public interface OnVideoCoverCallback {
        static {
            Covode.recordClassIndex(79617);
        }

        void onGetVideoCoverFailed(int i2);

        void onGetVideoCoverSuccess(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(79616);
    }

    f createEffectPlatform(Context context, String str);

    f createFontEffectPlatform(Context context);

    f createMvEffectPlatform(Context context);

    f createMvEffectPlatform(Context context, String str);

    void fetchEffectWithMusicBind(f fVar, String str, String str2, IFetchEffectListener iFetchEffectListener);

    void fetchEffectWithMusicBind(f fVar, String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener);

    String getCacheDir();

    ArrayList<String> getDraftEffectList();

    String getLiveStickerPannel();

    String getModelCacheDir();

    void getVideoCoverByCallback(List<EffectPointModel> list, FilterBean filterBean, float f2, int i2, boolean z, c cVar, OnVideoCoverCallback onVideoCoverCallback);

    void getVideoCoverByCallback(List<EffectPointModel> list, String str, float f2, int i2, boolean z, EditPreviewInfo editPreviewInfo, OnVideoCoverCallback onVideoCoverCallback);
}
