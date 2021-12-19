package com.ss.android.ugc.aweme.ttep;

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
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.ugc.effectplatform.h.b;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class a {
    static {
        Covode.recordClassIndex(92208);
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.a$a  reason: collision with other inner class name */
    public static final class C3741a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f141221a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ d f141222b;

        static {
            Covode.recordClassIndex(92209);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(int i2, String str, String str2, Integer num, Integer num2, e<InfoStickerListResponse> eVar) {
            l.d(str, "");
            l.d(str2, "");
            l.d(eVar, "");
            this.f141222b.a(i2, str, str2, num, num2, eVar);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
            l.d(providerEffect, "");
            l.d(iDownloadProviderEffectListener, "");
            this.f141222b.a(providerEffect, iDownloadProviderEffectListener);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(e<RecommendSearchWordsResponse> eVar) {
            l.d(eVar, "");
            this.f141222b.a(eVar);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(InfoStickerEffect infoStickerEffect, b bVar) {
            l.d(infoStickerEffect, "");
            this.f141222b.a(infoStickerEffect, bVar);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, IFetchFavoriteList iFetchFavoriteList) {
            l.d(str, "");
            l.d(iFetchFavoriteList, "");
            this.f141222b.a(str, iFetchFavoriteList);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, int i2, int i3, int i4, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
            l.d(str, "");
            l.d(iFetchCategoryEffectListener, "");
            this.f141222b.a(str, str2, i2, i3, i4, str3, z, iFetchCategoryEffectListener);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, int i2, int i3, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2) {
            l.d(str, "");
            l.d(str2, "");
            l.d(map, "");
            l.d(iSearchEffectListenerV2, "");
            this.f141222b.a(str, str2, i2, i3, map, iSearchEffectListenerV2);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, int i2, ICheckChannelListener iCheckChannelListener, Map<String, String> map) {
            l.d(iCheckChannelListener, "");
            this.f141222b.a(str, str2, i2, iCheckChannelListener, map);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, IUpdateTagListener iUpdateTagListener) {
            l.d(iUpdateTagListener, "");
            this.f141222b.a(str, str2, iUpdateTagListener);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, String str3, int i2, int i3, IFetchProviderEffect iFetchProviderEffect, boolean z) {
            l.d(str, "");
            l.d(iFetchProviderEffect, "");
            this.f141222b.a(str, str2, str3, i2, i3, iFetchProviderEffect, z);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, String str3, Integer num, Integer num2, e<InfoStickerListResponse> eVar) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(eVar, "");
            this.f141222b.a(str, str2, str3, num, num2, eVar);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, String str3, String str4, int i2, int i3, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(str4, "");
            l.d(map, "");
            l.d(iSearchEffectListenerV2, "");
            this.f141222b.a(str, str2, str3, str4, i2, i3, map, iSearchEffectListenerV2);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, boolean z, int i2, int i3, IFetchProviderEffect iFetchProviderEffect) {
            l.d(iFetchProviderEffect, "");
            this.f141222b.a(str, str2, z, i2, i3, iFetchProviderEffect);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
            l.d(iIsTagNeedUpdatedListener, "");
            this.f141222b.a(str, list, str2, iIsTagNeedUpdatedListener);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList) {
            l.d(str, "");
            l.d(list, "");
            l.d(iModFavoriteList, "");
            this.f141222b.a(str, list, z, iModFavoriteList);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, boolean z, boolean z2, IFetchEffectChannelListener iFetchEffectChannelListener) {
            l.d(str, "");
            l.d(iFetchEffectChannelListener, "");
            this.f141222b.a(str, z, z2, iFetchEffectChannelListener);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
            l.d(list, "");
            this.f141222b.a(list, map, iFetchEffectListByIdsListener);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(List<String> list, Map<String, String> map, boolean z, IFetchEffectListListener iFetchEffectListListener) {
            this.f141222b.a(list, map, z, iFetchEffectListListener);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void b(Effect effect, IFetchEffectListener iFetchEffectListener) {
            l.d(effect, "");
            l.d(iFetchEffectListener, "");
            this.f141222b.b(effect, iFetchEffectListener);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final EffectManager c() {
            return this.f141222b.c();
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final boolean c(Effect effect) {
            l.d(effect, "");
            return this.f141222b.c(effect);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void destroy() {
            this.f141222b.destroy();
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, boolean z, String str2, int i2, int i3, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener) {
            l.d(str, "");
            l.d(iFetchPanelInfoListener, "");
            if (l.a((Object) str, (Object) "default")) {
                iFetchPanelInfoListener.onSuccess(new PanelInfoModel(null, 1, null));
            } else {
                this.f141221a.a(str, z, str2, i2, i3, z2, iFetchPanelInfoListener);
            }
        }

        C3741a(d dVar) {
            this.f141221a = dVar;
            this.f141222b = dVar;
        }
    }
}
