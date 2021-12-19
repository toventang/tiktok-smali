package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
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
import com.ss.ugc.effectplatform.h.d;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.h.g;
import com.ss.ugc.effectplatform.h.i;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponse;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import com.ss.ugc.effectplatform.task.al;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.List;

public final class ListenerAdaptExtKt {
    static {
        Covode.recordClassIndex(95555);
    }

    public static final g toKNListener(IFetchEffectListener iFetchEffectListener) {
        if (iFetchEffectListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$1(iFetchEffectListener);
    }

    public static final e<SearchEffectResponse> toKNListener(ISearchEffectListener iSearchEffectListener) {
        if (iSearchEffectListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$6(iSearchEffectListener);
    }

    public static final e<SearchEffectResponseV2> toKNListener(ISearchEffectListenerV2 iSearchEffectListenerV2) {
        if (iSearchEffectListenerV2 == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$7(iSearchEffectListenerV2);
    }

    public static final i toKNListener(IUpdateTagListener iUpdateTagListener) {
        if (iUpdateTagListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$8(iUpdateTagListener);
    }

    public static final e<Boolean> toKNListener(IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        if (iIsTagNeedUpdatedListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$9(iIsTagNeedUpdatedListener);
    }

    public static final e<ProviderEffectModel> toKNListener(IFetchProviderEffect iFetchProviderEffect) {
        if (iFetchProviderEffect == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$10(iFetchProviderEffect);
    }

    public static final e<PanelInfoModel> toKNListener(IFetchPanelInfoListener iFetchPanelInfoListener, al alVar) {
        if (iFetchPanelInfoListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$13(alVar, iFetchPanelInfoListener);
    }

    public static final e<List<String>> toKNListener(IModFavoriteList iModFavoriteList) {
        if (iModFavoriteList == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$14(iModFavoriteList);
    }

    public static final e<ResourceListModel> toKNListener(IFetchResourceListener iFetchResourceListener) {
        if (iFetchResourceListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$18(iFetchResourceListener);
    }

    public static final e<Effect> toKNListener(IScanQRCodeListener iScanQRCodeListener) {
        if (iScanQRCodeListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$19(iScanQRCodeListener);
    }

    public static final d toKNListener(IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        if (iDownloadProviderEffectListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$11(iDownloadProviderEffectListener);
    }

    public static final e<Boolean> toKNListener(ICheckChannelListener iCheckChannelListener) {
        if (iCheckChannelListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$5(iCheckChannelListener);
    }

    public static final ExceptionResult toOldExceptionResult(com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        ExceptionResult exceptionResult = new ExceptionResult(eVar.f153651a, eVar.f153653c);
        exceptionResult.setMsg(eVar.f153652b);
        return exceptionResult;
    }

    public static final e<EffectListResponse> toKNListener(IEffectListResponseListener iEffectListResponseListener) {
        if (iEffectListResponseListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$16(iEffectListResponseListener);
    }

    public static final void preProcess(List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> list) {
        l.c(list, "");
        for (T t : list) {
            t.getRequirements();
            t.getModel_names();
        }
    }

    public static final e<EffectListResponse> toKNListener(IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        if (iFetchEffectListByIdsListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$4(iFetchEffectListByIdsListener);
    }

    public static final e<List<Effect>> toKNListener(IFetchEffectListListener iFetchEffectListListener) {
        if (iFetchEffectListListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$3(iFetchEffectListListener);
    }

    public static final e<FetchFavoriteListResponse> toKNListener(IFetchFavoriteList iFetchFavoriteList) {
        if (iFetchFavoriteList == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$15(iFetchFavoriteList);
    }

    public static final e<FetchHotEffectResponse> toKNListener(IFetchHotEffectListener iFetchHotEffectListener) {
        if (iFetchHotEffectListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$17(iFetchHotEffectListener);
    }

    public static final e<CategoryPageModel> toKNListener(IFetchCategoryEffectListener iFetchCategoryEffectListener, al alVar) {
        if (iFetchCategoryEffectListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$12(alVar, iFetchCategoryEffectListener);
    }

    public static final e<EffectChannelResponse> toKNListener(IFetchEffectChannelListener iFetchEffectChannelListener, al alVar) {
        if (iFetchEffectChannelListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$2(alVar, iFetchEffectChannelListener);
    }

    public static final void preProcess(CategoryPageModel categoryPageModel, al alVar, b<? super com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel, z> bVar) {
        l.c(categoryPageModel, "");
        l.c(bVar, "");
        if (alVar != null) {
            commit(alVar, categoryPageModel, ListenerAdaptExtKt$preProcess$2.INSTANCE, bVar);
        }
    }

    public static final void preProcess(EffectChannelResponse effectChannelResponse, al alVar, b<? super com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse, z> bVar) {
        l.c(effectChannelResponse, "");
        l.c(bVar, "");
        if (alVar != null) {
            commit(alVar, effectChannelResponse, ListenerAdaptExtKt$preProcess$1.INSTANCE, bVar);
        }
    }

    public static final void preProcess(PanelInfoModel panelInfoModel, al alVar, b<? super com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel, z> bVar) {
        l.c(panelInfoModel, "");
        l.c(bVar, "");
        if (alVar != null) {
            commit(alVar, panelInfoModel, ListenerAdaptExtKt$preProcess$3.INSTANCE, bVar);
        }
    }

    public static final <T, R> void commit(al alVar, T t, b<? super T, ? extends R> bVar, b<? super R, z> bVar2) {
        l.c(alVar, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        alVar.a(new ListenerAdaptExtKt$commit$1(bVar, t, bVar2));
    }
}
