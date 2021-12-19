package com.ss.android.ugc.aweme.sticker.repository.internals.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.c.d;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.z;

public final class b extends com.bytedance.jedi.a.f.a<z, PanelInfoModel, d, PanelInfoModel> {

    /* renamed from: a  reason: collision with root package name */
    public final String f135507a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.tools.b.a.d f135508b;

    static {
        Covode.recordClassIndex(88566);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return z.f158842a;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<PanelInfoModel> a(d dVar) {
        d dVar2 = dVar;
        l.d(dVar2, "");
        t a2 = t.a(new a(this, dVar2));
        l.b(a2, "");
        return a2;
    }

    static final class a<T> implements w<PanelInfoModel> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f135509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f135510b;

        static {
            Covode.recordClassIndex(88567);
        }

        a(b bVar, d dVar) {
            this.f135509a = bVar;
            this.f135510b = dVar;
        }

        @Override // f.a.w
        public final void subscribe(final v<PanelInfoModel> vVar) {
            l.d(vVar, "");
            com.ss.android.ugc.tools.b.a.a.a.a(this.f135509a.f135508b, this.f135509a.f135507a, this.f135510b.f135495d, this.f135510b.f135492a, this.f135510b.f135493b, this.f135510b.f135494c, new IFetchPanelInfoListener() {
                /* class com.ss.android.ugc.aweme.sticker.repository.internals.a.b.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(88568);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
                public final void onFail(ExceptionResult exceptionResult) {
                    l.d(exceptionResult, "");
                    v vVar = vVar;
                    l.b(vVar, "");
                    if (!vVar.isDisposed()) {
                        vVar.a((Throwable) exceptionResult.getException());
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(PanelInfoModel panelInfoModel) {
                    v vVar = vVar;
                    l.b(vVar, "");
                    if (vVar.isDisposed()) {
                        return;
                    }
                    if (panelInfoModel != null) {
                        vVar.a(panelInfoModel);
                        vVar.a();
                        return;
                    }
                    vVar.a((Throwable) new IllegalArgumentException("sticker panel fetching failed"));
                }
            });
        }
    }

    public b(String str, com.ss.android.ugc.tools.b.a.d dVar) {
        l.d(str, "");
        l.d(dVar, "");
        this.f135507a = str;
        this.f135508b = dVar;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        return obj2;
    }
}
