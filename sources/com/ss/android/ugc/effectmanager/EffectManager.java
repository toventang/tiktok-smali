package com.ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectListResponseListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchHotEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchResourceListener;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IScanQRCodeListener;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectQRCode;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.ss.ugc.effectplatform.b;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.j.a;
import com.ss.ugc.effectplatform.j.c;
import com.ss.ugc.effectplatform.j.g;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import com.ss.ugc.effectplatform.model.net.GifProviderEffectListResponse;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponse;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import com.ss.ugc.effectplatform.task.ac;
import com.ss.ugc.effectplatform.task.ad;
import com.ss.ugc.effectplatform.task.ae;
import com.ss.ugc.effectplatform.task.ag;
import com.ss.ugc.effectplatform.task.ai;
import com.ss.ugc.effectplatform.task.al;
import com.ss.ugc.effectplatform.task.i;
import com.ss.ugc.effectplatform.task.o;
import com.ss.ugc.effectplatform.task.p;
import com.ss.ugc.effectplatform.task.q;
import com.ss.ugc.effectplatform.task.r;
import com.ss.ugc.effectplatform.task.w;
import com.ss.ugc.effectplatform.task.x;
import com.ss.ugc.effectplatform.task.y;
import com.ss.ugc.effectplatform.util.j;
import com.ss.ugc.effectplatform.util.t;
import com.ss.ugc.effectplatform.util.u;
import d.a.f.d;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EffectManager {
    private b mEffectPlatform;

    static {
        Covode.recordClassIndex(95190);
    }

    public b getEffectPlatform() {
        return this.mEffectPlatform;
    }

    public b getKNEffectPlatform() {
        return this.mEffectPlatform;
    }

    public void removeListener() {
        this.mEffectPlatform.f153475b.K.f153600a.clear();
    }

    public void clearEffects() {
        b bVar = this.mEffectPlatform;
        String a2 = t.a();
        b.c cVar = new b.c(bVar, a2, a2);
        al alVar = bVar.f153475b.z;
        if (alVar != null) {
            alVar.a(cVar);
        }
    }

    public EffectChannelResponse getCurrentEffectChannel() {
        return new EffectChannelResponse(this.mEffectPlatform.d().f153624a.f156544a);
    }

    public void destroy() {
        b bVar = this.mEffectPlatform;
        al alVar = bVar.f153475b.z;
        if (alVar != null) {
            if (alVar.f153777b) {
                alVar.f153778c.shutdown();
            }
            if (!alVar.f153776a.isEmpty()) {
                for (Map.Entry<String, d> entry : alVar.f153776a.entrySet()) {
                    entry.getKey();
                    entry.getValue().cancel();
                }
            }
            alVar.f153776a.clear();
        }
        com.ss.ugc.effectplatform.j.b.f153621b.clear();
        bVar.f153475b.K.f153600a.clear();
    }

    public void clearVersion(String str) {
        this.mEffectPlatform.a(str);
    }

    public boolean isEffectDownloaded(Effect effect) {
        return this.mEffectPlatform.a(effect);
    }

    public boolean init(EffectConfiguration effectConfiguration) {
        this.mEffectPlatform = new b(effectConfiguration.getEffectConfig());
        return true;
    }

    public boolean isEffectDownloading(Effect effect) {
        l.c(effect, "");
        if (!j.a(effect) || !com.ss.ugc.effectplatform.j.b.a(effect.getEffect_id())) {
            return false;
        }
        return true;
    }

    public boolean isEffectReady(Effect effect) {
        b bVar = this.mEffectPlatform;
        l.c(effect, "");
        if (bVar.a(effect)) {
            return ((a) bVar.f153474a.getValue()).a(effect);
        }
        return false;
    }

    public void deleteEffect(Effect effect) {
        b bVar = this.mEffectPlatform;
        if (effect != null) {
            f fVar = (f) d.a.b.b.a(bVar.f153475b.w);
            if (fVar != null) {
                fVar.d(effect.getId());
            }
            f fVar2 = (f) d.a.b.b.a(bVar.f153475b.w);
            if (fVar2 != null) {
                fVar2.d(effect.getId() + ".zip");
            }
        }
    }

    public void recommendSearchWords(e<RecommendSearchWordsResponse> eVar) {
        com.ss.ugc.effectplatform.j.e a2 = this.mEffectPlatform.a();
        String a3 = t.a();
        if (eVar != null) {
            a2.f153625a.K.a(a3, eVar);
        }
        al alVar = a2.f153625a.z;
        if (alVar != null) {
            alVar.a(new ae(a2.f153625a, a3));
        }
    }

    public void clearCache(String str) {
        b bVar = this.mEffectPlatform;
        if (str != null) {
            f fVar = (f) d.a.b.b.a(bVar.f153475b.w);
            if (fVar != null) {
                fVar.f("effectchannel" + str + "(.*)");
            }
            f fVar2 = (f) d.a.b.b.a(bVar.f153475b.w);
            if (fVar2 != null) {
                l.c(str, "");
                fVar2.f(str + d.a.d.a.d.f156619a + "effect_version(.*)");
            }
            f fVar3 = (f) d.a.b.b.a(bVar.f153475b.w);
            if (fVar3 != null) {
                l.c(str, "");
                fVar3.f(str + d.a.d.a.d.f156619a + "effectchannel(.*)");
            }
            f fVar4 = (f) d.a.b.b.a(bVar.f153475b.w);
            if (fVar4 != null) {
                l.c(str, "");
                fVar4.f(str + d.a.d.a.d.f156619a + "category_version(.*)");
            }
            f fVar5 = (f) d.a.b.b.a(bVar.f153475b.w);
            if (fVar5 != null) {
                fVar5.f("effectchannelinfosticker" + str + "(.*)");
            }
            f fVar6 = (f) d.a.b.b.a(bVar.f153475b.w);
            if (fVar6 != null) {
                l.c(str, "");
                fVar6.f(str + d.a.d.a.d.f156619a + "info_sticker_version(.*)");
            }
            bVar.a(str);
        }
    }

    public void downloadEffectList(List<Effect> list, IFetchEffectListListener iFetchEffectListListener) {
        downloadEffectList(list, iFetchEffectListListener, null);
    }

    public void fetchEffect(String str, IFetchEffectListener iFetchEffectListener) {
        fetchEffectWithDownload(str, null, iFetchEffectListener);
    }

    public void fetchEffectList(List<String> list, IFetchEffectListListener iFetchEffectListListener) {
        fetchEffectList(list, true, null, iFetchEffectListListener);
    }

    public void checkPanelIsUpdate(String str, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 2, null, iCheckChannelListener);
    }

    public void checkedEffectListUpdate(String str, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 0, null, iCheckChannelListener);
    }

    public void fetchEffect(Effect effect, IFetchEffectListener iFetchEffectListener) {
        this.mEffectPlatform.a(effect, ListenerAdaptExtKt.toKNListener(iFetchEffectListener));
    }

    public void downloadProviderEffect(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        b bVar = this.mEffectPlatform;
        com.ss.ugc.effectplatform.h.d kNListener = ListenerAdaptExtKt.toKNListener(iDownloadProviderEffectListener);
        l.c(providerEffect, "");
        com.ss.ugc.effectplatform.j.e a2 = bVar.a();
        l.c(providerEffect, "");
        String a3 = t.a();
        if (kNListener != null) {
            a2.f153625a.K.a(a3, kNListener);
        }
        i iVar = new i(a2.f153625a, providerEffect, a3);
        al alVar = a2.f153625a.z;
        if (alVar != null) {
            alVar.a(iVar);
        }
    }

    public void fetchEffect(EffectQRCode effectQRCode, IScanQRCodeListener iScanQRCodeListener) {
        b bVar = this.mEffectPlatform;
        e<com.ss.ugc.effectplatform.model.Effect> kNListener = ListenerAdaptExtKt.toKNListener(iScanQRCodeListener);
        l.c(effectQRCode, "");
        b.h hVar = new b.h(bVar, kNListener);
        c b2 = bVar.b();
        l.c(effectQRCode, "");
        String a2 = t.a();
        b2.f153623a.K.a(a2, hVar);
        o oVar = new o(b2.f153623a, effectQRCode, a2);
        al alVar = b2.f153623a.z;
        if (alVar != null) {
            alVar.a(oVar);
        }
    }

    public void fetchEffectListFromCache(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        b bVar = this.mEffectPlatform;
        e<com.ss.ugc.effectplatform.model.EffectChannelResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, bVar.f153475b.z);
        l.c(str, "");
        b.k kVar = new b.k(bVar, kNListener);
        if (!u.a(str)) {
            bVar.b().a(str, true, kVar);
        } else {
            bVar.b().a("default", true, kVar);
        }
    }

    public void fetchExistEffectList(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        b bVar = this.mEffectPlatform;
        e<com.ss.ugc.effectplatform.model.EffectChannelResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, bVar.f153475b.z);
        if (!u.a(str)) {
            bVar.b().a(str, kNListener);
        } else {
            bVar.b().a("default", kNListener);
        }
    }

    public void fetchFavoriteList(String str, IFetchFavoriteList iFetchFavoriteList) {
        b bVar = this.mEffectPlatform;
        e<FetchFavoriteListResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchFavoriteList);
        g c2 = bVar.c();
        String a2 = t.a();
        if (kNListener != null) {
            c2.f153628b.K.a(a2, kNListener);
        }
        q qVar = new q(c2.f153628b, str, a2);
        al alVar = c2.f153628b.z;
        if (alVar != null) {
            alVar.a(qVar);
        }
    }

    public void fetchResourceList(Map<String, String> map, IFetchResourceListener iFetchResourceListener) {
        b bVar = this.mEffectPlatform;
        e<ResourceListModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchResourceListener);
        com.ss.ugc.effectplatform.j.e a2 = bVar.a();
        String a3 = t.a();
        if (kNListener != null) {
            a2.f153625a.K.a(a3, kNListener);
        }
        al alVar = a2.f153625a.z;
        if (alVar != null) {
            alVar.a(new y(a2.f153625a, a3, map));
        }
    }

    public void queryVideoUsedStickers(Map<String, String> map, IEffectListResponseListener iEffectListResponseListener) {
        b bVar = this.mEffectPlatform;
        e<EffectListResponse> kNListener = ListenerAdaptExtKt.toKNListener(iEffectListResponseListener);
        c b2 = bVar.b();
        String a2 = t.a();
        if (kNListener != null) {
            b2.f153623a.K.a(a2, kNListener);
        }
        ac acVar = new ac(b2.f153623a, map, a2);
        al alVar = b2.f153623a.z;
        if (alVar != null) {
            alVar.a(acVar);
        }
    }

    public void checkCategoryIsUpdate(String str, String str2, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, str2, 1, null, iCheckChannelListener);
    }

    public void downloadEffectList(List<Effect> list, IFetchEffectListListener iFetchEffectListListener, DownloadEffectExtra downloadEffectExtra) {
        this.mEffectPlatform.a(list, ListenerAdaptExtKt.toKNListener(iFetchEffectListListener), downloadEffectExtra);
    }

    public void fetchEffectList(List<String> list, boolean z, IFetchEffectListListener iFetchEffectListListener) {
        fetchEffectList(list, z, null, iFetchEffectListListener);
    }

    public void checkPanelIsUpdate(String str, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 2, map, iCheckChannelListener);
    }

    public void checkedEffectListUpdate(String str, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 0, map, iCheckChannelListener);
    }

    public void fetchEffectWithDownload(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        b bVar = this.mEffectPlatform;
        com.ss.ugc.effectplatform.h.g kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectListener);
        l.c(str, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        bVar.a((List<String>) arrayList, true, map, (e<List<com.ss.ugc.effectplatform.model.Effect>>) new b.g(kNListener));
    }

    public void fetchEffectList(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        b bVar = this.mEffectPlatform;
        e<com.ss.ugc.effectplatform.model.EffectChannelResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, bVar.f153475b.z);
        l.c(str, "");
        b.j jVar = new b.j(bVar, z, kNListener);
        if (!u.a(str)) {
            bVar.b().a(str, false, jVar);
        } else {
            bVar.b().a("default", false, jVar);
        }
    }

    public void fetchEffectList2(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        ArrayList arrayList = new ArrayList(list);
        b bVar = this.mEffectPlatform;
        e<EffectListResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectListByIdsListener);
        com.ss.ugc.effectplatform.j.e a2 = bVar.a();
        String a3 = t.a();
        if (kNListener != null) {
            a2.f153625a.K.a(a3, kNListener);
        }
        al alVar = a2.f153625a.z;
        if (alVar != null) {
            alVar.a(new p(a2.f153625a, arrayList, a3, map, true));
        }
    }

    public void fetchEffectList(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        b bVar = this.mEffectPlatform;
        e<EffectListResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectListByIdsListener);
        com.ss.ugc.effectplatform.j.e a2 = bVar.a();
        String a3 = t.a();
        if (kNListener != null) {
            a2.f153625a.K.a(a3, kNListener);
        }
        al alVar = a2.f153625a.z;
        if (alVar != null) {
            alVar.a(new p(a2.f153625a, list, a3, map, false));
        }
    }

    public void isTagUpdated(String str, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        b bVar = this.mEffectPlatform;
        e<Boolean> kNListener = ListenerAdaptExtKt.toKNListener(iIsTagNeedUpdatedListener);
        l.c(str, "");
        l.c(str2, "");
        g c2 = bVar.c();
        l.c(str, "");
        l.c(str2, "");
        String a2 = t.a();
        if (c2.f153627a.f156544a == null) {
            c2.f153628b.K.a(a2, new g.b(c2, str, str2, kNListener));
            ad adVar = new ad(c2.f153628b, a2);
            al alVar = c2.f153628b.z;
            if (alVar != null) {
                alVar.a(adVar);
                return;
            }
            return;
        }
        c2.a(str, str2, kNListener);
    }

    public void updateTag(String str, String str2, IUpdateTagListener iUpdateTagListener) {
        b bVar = this.mEffectPlatform;
        com.ss.ugc.effectplatform.h.i kNListener = ListenerAdaptExtKt.toKNListener(iUpdateTagListener);
        l.c(str, "");
        l.c(str2, "");
        g c2 = bVar.c();
        l.c(str, "");
        l.c(str2, "");
        String a2 = t.a();
        if (c2.f153627a.f156544a == null) {
            c2.f153628b.K.a(a2, new g.d(c2, a2, str, str2, kNListener));
            ad adVar = new ad(c2.f153628b, a2);
            al alVar = c2.f153628b.z;
            if (alVar != null) {
                alVar.a(adVar);
                return;
            }
            return;
        }
        c2.a(a2, str, str2, kNListener);
    }

    public void modifyFavoriteList(String str, List<String> list, Boolean bool, IModFavoriteList iModFavoriteList) {
        this.mEffectPlatform.a(str, list, bool.booleanValue(), ListenerAdaptExtKt.toKNListener(iModFavoriteList));
    }

    public void checkCategoryIsUpdate(String str, String str2, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, str2, 1, map, iCheckChannelListener);
    }

    public void fetchEffectList(List<String> list, boolean z, Map<String, String> map, IFetchEffectListListener iFetchEffectListListener) {
        this.mEffectPlatform.a(list, z, map, ListenerAdaptExtKt.toKNListener(iFetchEffectListListener));
    }

    public void modifyFavoriteList(String str, String str2, Boolean bool, IModFavoriteList iModFavoriteList) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        this.mEffectPlatform.a(str, arrayList, bool.booleanValue(), ListenerAdaptExtKt.toKNListener(iModFavoriteList));
    }

    public void fetchProviderEffect(String str, boolean z, int i2, int i3, IFetchProviderEffect iFetchProviderEffect) {
        fetchProviderEffect(str, z, i2, i3, null, iFetchProviderEffect);
    }

    private void checkUpdate(String str, String str2, int i2, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        b bVar = this.mEffectPlatform;
        e<Boolean> kNListener = ListenerAdaptExtKt.toKNListener(iCheckChannelListener);
        l.c(str, "");
        c b2 = bVar.b();
        String a2 = t.a();
        if (kNListener != null) {
            b2.f153623a.K.a(a2, kNListener);
        }
        com.ss.ugc.effectplatform.task.c cVar = new com.ss.ugc.effectplatform.task.c(b2.f153623a, a2, str, str2, i2, map);
        al alVar = b2.f153623a.z;
        if (alVar != null) {
            alVar.a(cVar);
        }
    }

    public void fetchHotEffect(int i2, int i3, Map<String, String> map, boolean z, IFetchHotEffectListener iFetchHotEffectListener) {
        b bVar = this.mEffectPlatform;
        e<FetchHotEffectResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchHotEffectListener);
        c b2 = bVar.b();
        String a2 = t.a();
        if (kNListener != null) {
            b2.f153623a.K.a(a2, kNListener);
        }
        r rVar = new r(b2.f153623a, i2, i3, a2, map);
        al alVar = b2.f153623a.z;
        if (alVar != null) {
            alVar.a(rVar);
        }
    }

    public void fetchProviderEffectsByGiphyIds(String str, String str2, Map<String, String> map, boolean z, e<GifProviderEffectListResponse> eVar) {
        b bVar = this.mEffectPlatform;
        l.c(str, "");
        com.ss.ugc.effectplatform.j.e a2 = bVar.a();
        l.c(str, "");
        String a3 = t.a();
        if (eVar != null) {
            a2.f153625a.K.a(a3, eVar);
        }
        w wVar = new w(a2.f153625a, a3, str, str2, map, z);
        al alVar = a2.f153625a.z;
        if (alVar != null) {
            alVar.a(wVar);
        }
    }

    public void searchProviderEffect(String str, String str2, int i2, int i3, boolean z, IFetchProviderEffect iFetchProviderEffect) {
        searchProviderEffect(str, str2, i2, i3, z, null, iFetchProviderEffect);
    }

    public void fetchPanelInfo(String str, boolean z, String str2, int i2, int i3, IFetchPanelInfoListener iFetchPanelInfoListener) {
        b bVar = this.mEffectPlatform;
        e<PanelInfoModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, bVar.f153475b.z);
        l.c(str, "");
        bVar.b().a(str, z, str2, i2, i3, false, kNListener);
    }

    public void fetchPanelInfoFromCache(String str, boolean z, String str2, int i2, int i3, IFetchPanelInfoListener iFetchPanelInfoListener) {
        b bVar = this.mEffectPlatform;
        e<PanelInfoModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, bVar.f153475b.z);
        l.c(str, "");
        bVar.b().a(str, z, str2, i2, i3, true, kNListener);
    }

    public void searchEffects(String str, String str2, int i2, int i3, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2) {
        b bVar = this.mEffectPlatform;
        e<SearchEffectResponseV2> kNListener = ListenerAdaptExtKt.toKNListener(iSearchEffectListenerV2);
        l.c(str, "");
        l.c(str2, "");
        bVar.a().a(str, str2, i2, i3, map, kNListener, null);
    }

    public void fetchProviderEffect(String str, boolean z, int i2, int i3, String str2, IFetchProviderEffect iFetchProviderEffect) {
        b bVar = this.mEffectPlatform;
        e<ProviderEffectModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchProviderEffect);
        c b2 = bVar.b();
        String a2 = t.a();
        if (kNListener != null) {
            b2.f153623a.K.a(a2, kNListener);
        }
        x xVar = new x(b2.f153623a, a2, str, i2, i3, str2);
        al alVar = b2.f153623a.z;
        if (alVar != null) {
            alVar.a(xVar);
        }
    }

    public void searchEffect(String str, String str2, int i2, int i3, Map<String, String> map, ISearchEffectListener iSearchEffectListener) {
        b bVar = this.mEffectPlatform;
        e<SearchEffectResponse> kNListener = ListenerAdaptExtKt.toKNListener(iSearchEffectListener);
        l.c(str, "");
        l.c(str2, "");
        com.ss.ugc.effectplatform.j.e a2 = bVar.a();
        l.c(str, "");
        l.c(str2, "");
        String a3 = t.a();
        if (kNListener != null) {
            a2.f153625a.K.a(a3, kNListener);
        }
        al alVar = a2.f153625a.z;
        if (alVar != null) {
            alVar.a(new ag(a2.f153625a, str, str2, i2, i3, map, a3));
        }
    }

    public void fetchCategoryEffect(String str, String str2, int i2, int i3, int i4, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        b bVar = this.mEffectPlatform;
        e<CategoryPageModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchCategoryEffectListener, bVar.f153475b.z);
        l.c(str, "");
        bVar.b().a(str, str2, i2, i3, i4, str3, false, kNListener);
    }

    public void fetchCategoryEffectFromCache(String str, String str2, int i2, int i3, int i4, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        b bVar = this.mEffectPlatform;
        e<CategoryPageModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchCategoryEffectListener, bVar.f153475b.z);
        l.c(str, "");
        bVar.b().a(str, str2, i2, i3, i4, str3, true, kNListener);
    }

    public void searchProviderEffect(String str, String str2, int i2, int i3, boolean z, String str3, IFetchProviderEffect iFetchProviderEffect) {
        b bVar = this.mEffectPlatform;
        e<ProviderEffectModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchProviderEffect);
        l.c(str, "");
        c b2 = bVar.b();
        l.c(str, "");
        String a2 = t.a();
        if (kNListener != null) {
            b2.f153623a.K.a(a2, kNListener);
        }
        ai aiVar = new ai(b2.f153623a, a2, str, str2, i2, i3, str3);
        al alVar = b2.f153623a.z;
        if (alVar != null) {
            alVar.a(aiVar);
        }
    }
}
