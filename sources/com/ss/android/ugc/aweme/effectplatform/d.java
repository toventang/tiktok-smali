package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.r;
import com.ss.android.ugc.aweme.effectplatform.u;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    boolean f89023a;

    /* renamed from: b  reason: collision with root package name */
    public EffectManager f89024b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Object> f89025c;

    static {
        Covode.recordClassIndex(55992);
    }

    static ExceptionResult a() {
        ExceptionResult exceptionResult = new ExceptionResult(new RuntimeException());
        exceptionResult.setErrorCode(-1);
        exceptionResult.setMsg("effect sdk manager init failed");
        return exceptionResult;
    }

    /* access modifiers changed from: package-private */
    public final ICheckChannelListener a(ICheckChannelListener iCheckChannelListener) {
        return new q(iCheckChannelListener) {
            /* class com.ss.android.ugc.aweme.effectplatform.d.AnonymousClass3 */

            static {
                Covode.recordClassIndex(55997);
            }
        };
    }

    public final void a(String str, ICheckChannelListener iCheckChannelListener) {
        if (!this.f89023a) {
            iCheckChannelListener.checkChannelFailed(a());
        } else {
            this.f89024b.checkPanelIsUpdate(str, null, a(iCheckChannelListener));
        }
    }

    public final void a(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        if (!this.f89023a) {
            iFetchEffectChannelListener.onFail(a());
        } else {
            this.f89024b.fetchEffectListFromCache(str, iFetchEffectChannelListener);
        }
    }

    public final void a(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        s a2 = s.a(str, iFetchEffectChannelListener);
        a2.f89079a = this.f89025c;
        if (!this.f89023a) {
            a2.onFail(a());
        } else {
            this.f89024b.fetchEffectList(str, z, a2);
        }
    }

    public final void b(String str, boolean z, String str2, int i2, int i3, IFetchPanelInfoListener iFetchPanelInfoListener) {
        IFetchPanelInfoListener iFetchPanelInfoListener2 = iFetchPanelInfoListener;
        if (!this.f89023a) {
            iFetchPanelInfoListener2.onFail(a());
            return;
        }
        if (!(iFetchPanelInfoListener2 instanceof u)) {
            iFetchPanelInfoListener2 = u.a.a(str, iFetchPanelInfoListener2);
        }
        ((u) iFetchPanelInfoListener2).f89087a = this.f89025c;
        this.f89024b.fetchPanelInfo(str, z, str2, i2, i3, iFetchPanelInfoListener2);
    }

    public final void a(String str, boolean z, String str2, int i2, int i3, IFetchPanelInfoListener iFetchPanelInfoListener) {
        IFetchPanelInfoListener iFetchPanelInfoListener2 = iFetchPanelInfoListener;
        if (!this.f89023a) {
            iFetchPanelInfoListener2.onFail(a());
            return;
        }
        if (!(iFetchPanelInfoListener2 instanceof u)) {
            iFetchPanelInfoListener2 = u.a.a(str, iFetchPanelInfoListener2);
        }
        ((u) iFetchPanelInfoListener2).f89087a = this.f89025c;
        this.f89024b.fetchPanelInfoFromCache(str, z, str2, i2, i3, iFetchPanelInfoListener2);
    }

    public final void a(final String str, final String str2, final int i2, final int i3, final int i4, final String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        final IFetchCategoryEffectListener iFetchCategoryEffectListener2 = iFetchCategoryEffectListener;
        if (!this.f89023a) {
            iFetchCategoryEffectListener2.onFail(a());
            return;
        }
        if (!(iFetchCategoryEffectListener2 instanceof r)) {
            iFetchCategoryEffectListener2 = r.a.a(str, i2, i3, iFetchCategoryEffectListener2);
        }
        ((r) iFetchCategoryEffectListener2).f89073a = this.f89025c;
        if (z) {
            this.f89024b.fetchCategoryEffectFromCache(str, str2, i2, i3, i4, str3, new IFetchCategoryEffectListener() {
                /* class com.ss.android.ugc.aweme.effectplatform.d.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(55998);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* bridge */ /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
                    iFetchCategoryEffectListener2.onSuccess(categoryPageModel);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    d.this.f89024b.fetchCategoryEffect(str, str2, i2, i3, i4, str3, iFetchCategoryEffectListener2);
                }
            });
        } else {
            this.f89024b.fetchCategoryEffect(str, str2, i2, i3, i4, str3, iFetchCategoryEffectListener2);
        }
    }
}
