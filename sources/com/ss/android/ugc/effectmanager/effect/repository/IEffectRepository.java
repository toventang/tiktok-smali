package com.ss.android.ugc.effectmanager.effect.repository;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectListResponseListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchHotEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchResourceListener;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.util.List;
import java.util.Map;

public interface IEffectRepository {
    static {
        Covode.recordClassIndex(95465);
    }

    String checkResourceList(Map<String, String> map, IFetchResourceListener iFetchResourceListener);

    String downloadProviderEffectList(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener);

    String fetchEffect(Effect effect, IFetchEffectListener iFetchEffectListener);

    String fetchEffectFromCache(Effect effect, IFetchEffectListener iFetchEffectListener);

    String fetchEffectList(List<? extends Effect> list, DownloadEffectExtra downloadEffectExtra, IFetchEffectListListener iFetchEffectListListener);

    String fetchEffectListById(List<String> list, Map<String, String> map, IFetchEffectListListener iFetchEffectListListener);

    String fetchEffectListById2(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    String fetchEffectListByResourceId(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    String fetchHotEffect(int i2, int i3, Map<String, String> map, boolean z, IFetchHotEffectListener iFetchHotEffectListener);

    String fetchResourceList(Map<String, String> map, IFetchResourceListener iFetchResourceListener);

    Handler getHandler();

    String queryVideoUsedStickers(Map<String, String> map, IEffectListResponseListener iEffectListResponseListener);

    String searchEffect(String str, String str2, int i2, int i3, Map<String, String> map, ISearchEffectListener iSearchEffectListener);
}
