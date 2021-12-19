package com.ss.android.ugc.tools.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
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
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import java.util.List;
import java.util.Map;

public interface d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f149141e = a.f149145d;

    public static final class b {
        static {
            Covode.recordClassIndex(98220);
        }
    }

    static {
        Covode.recordClassIndex(98218);
    }

    void a(int i2, String str, String str2, Integer num, Integer num2, e<InfoStickerListResponse> eVar);

    void a(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener);

    void a(e<RecommendSearchWordsResponse> eVar);

    void a(InfoStickerEffect infoStickerEffect, com.ss.ugc.effectplatform.h.b bVar);

    void a(String str, IFetchFavoriteList iFetchFavoriteList);

    void a(String str, String str2, int i2, int i3, int i4, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener);

    void a(String str, String str2, int i2, int i3, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2);

    void a(String str, String str2, int i2, ICheckChannelListener iCheckChannelListener, Map<String, String> map);

    void a(String str, String str2, IUpdateTagListener iUpdateTagListener);

    void a(String str, String str2, String str3, int i2, int i3, IFetchProviderEffect iFetchProviderEffect, boolean z);

    void a(String str, String str2, String str3, Integer num, Integer num2, e<InfoStickerListResponse> eVar);

    void a(String str, String str2, String str3, String str4, int i2, int i3, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2);

    void a(String str, String str2, boolean z, int i2, int i3, IFetchProviderEffect iFetchProviderEffect);

    void a(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener);

    void a(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList);

    void a(String str, boolean z, String str2, int i2, int i3, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener);

    void a(String str, boolean z, boolean z2, IFetchEffectChannelListener iFetchEffectChannelListener);

    void a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    void a(List<String> list, Map<String, String> map, boolean z, IFetchEffectListListener iFetchEffectListListener);

    void b(Effect effect, IFetchEffectListener iFetchEffectListener);

    EffectManager c();

    boolean c(Effect effect);

    void destroy();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f149142a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final int f149143b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static final int f149144c = 2;

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ a f149145d = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(98219);
        }
    }
}
