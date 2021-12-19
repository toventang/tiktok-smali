package com.ss.android.ugc.aweme.effectplatform;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.ugc.effectplatform.h.c;
import java.util.List;
import java.util.Map;

public interface f extends d {
    static {
        Covode.recordClassIndex(56000);
    }

    void a(m mVar);

    void a(Effect effect, IFetchEffectListener iFetchEffectListener);

    @Override // com.ss.android.ugc.tools.b.a.d
    void a(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener);

    void a(String str);

    void a(String str, IFetchEffectChannelListener iFetchEffectChannelListener);

    @Override // com.ss.android.ugc.tools.b.a.d
    void a(String str, IFetchFavoriteList iFetchFavoriteList);

    @Override // com.ss.android.ugc.tools.b.a.d
    void a(String str, String str2, IUpdateTagListener iUpdateTagListener);

    void a(String str, String str2, Map<String, String> map, boolean z, c cVar);

    void a(String str, String str2, boolean z, int i2, int i3, int i4, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener);

    @Override // com.ss.android.ugc.tools.b.a.d
    void a(String str, String str2, boolean z, int i2, int i3, IFetchProviderEffect iFetchProviderEffect);

    @Override // com.ss.android.ugc.tools.b.a.d
    void a(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener);

    @Override // com.ss.android.ugc.tools.b.a.d
    void a(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList);

    void a(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener);

    void a(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener);

    void a(String str, boolean z, String str2, int i2, int i3, IFetchPanelInfoListener iFetchPanelInfoListener);

    @Override // com.ss.android.ugc.tools.b.a.d
    void a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    @Override // com.ss.android.ugc.tools.b.a.d
    void a(List<String> list, Map<String, String> map, boolean z, IFetchEffectListListener iFetchEffectListListener);

    void a(Map<String, Object> map);

    boolean a(Effect effect);

    boolean b(Effect effect);

    @Override // com.ss.android.ugc.tools.b.a.d
    EffectManager c();

    void d();

    @Override // com.ss.android.ugc.tools.b.a.d
    void destroy();
}
