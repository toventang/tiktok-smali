package com.ss.android.ugc.tools.h.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.f;
import com.bytedance.jedi.a.c.g;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate;
import com.ss.android.ugc.tools.b.a.a.a;
import com.ss.android.ugc.tools.b.a.d;
import f.a.ab;
import f.a.ad;
import f.a.af;
import f.a.t;
import h.a.z;
import h.f.b.l;
import h.p;
import h.v;
import java.util.List;

public class c extends a<Effect, k, CategoryEffectModel> {

    /* renamed from: f  reason: collision with root package name */
    public final h.f.a.a<d> f149282f;

    /* renamed from: g  reason: collision with root package name */
    public final String f149283g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f149284h;

    static {
        Covode.recordClassIndex(98311);
    }

    static final class a<T> implements af<f<? extends CategoryEffectModel>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f149285a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f149286b;

        static {
            Covode.recordClassIndex(98312);
        }

        a(c cVar, int i2) {
            this.f149285a = cVar;
            this.f149286b = i2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.ad<com.bytedance.jedi.a.c.f<com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel>>] */
        @Override // f.a.af
        public final void subscribe(final ad<f<? extends CategoryEffectModel>> adVar) {
            l.d(adVar, "");
            com.ss.android.ugc.tools.b.a.a.a.a(this.f149285a.f149282f.invoke(), this.f149285a.f149283g, true, "", this.f149286b, 0, new IFetchPanelInfoListener() {
                /* class com.ss.android.ugc.tools.h.b.b.c.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(98313);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
                public final void onFail(ExceptionResult exceptionResult) {
                    adVar.b(com.ss.android.ugc.tools.b.a.a.a.a(exceptionResult));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.ad */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(PanelInfoModel panelInfoModel) {
                    CategoryEffectModel categoryEffectModel;
                    PanelInfoModel panelInfoModel2 = panelInfoModel;
                    ad adVar = adVar;
                    if (panelInfoModel2 != null) {
                        categoryEffectModel = panelInfoModel2.getCategoryEffectModel();
                    } else {
                        categoryEffectModel = null;
                    }
                    adVar.a(g.a(categoryEffectModel));
                }
            });
        }
    }

    static final class b<T> implements af<f<? extends CategoryEffectModel>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f149288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f149289b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f149290c;

        static {
            Covode.recordClassIndex(98314);
        }

        b(c cVar, k kVar, int i2) {
            this.f149288a = cVar;
            this.f149289b = kVar;
            this.f149290c = i2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.ad<com.bytedance.jedi.a.c.f<com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel>>] */
        @Override // f.a.af
        public final void subscribe(final ad<f<? extends CategoryEffectModel>> adVar) {
            l.d(adVar, "");
            if (this.f149288a.f149284h) {
                com.ss.android.ugc.tools.b.a.a.a.a(this.f149288a.f149282f.invoke(), this.f149288a.f149283g, this.f149289b.f149333e, true, this.f149290c, this.f149289b.f149329a, this.f149289b.f149330b, this.f149289b.f149331c, new IFetchCategoryEffectListener() {
                    /* class com.ss.android.ugc.tools.h.b.b.c.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(98315);
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                    public final void onFail(ExceptionResult exceptionResult) {
                        adVar.b(com.ss.android.ugc.tools.b.a.a.a.a(exceptionResult));
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.ad */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
                        CategoryEffectModel categoryEffectModel;
                        CategoryPageModel categoryPageModel2 = categoryPageModel;
                        ad adVar = adVar;
                        if (categoryPageModel2 != null) {
                            categoryEffectModel = categoryPageModel2.getCategoryEffects();
                        } else {
                            categoryEffectModel = null;
                        }
                        adVar.a(g.a(categoryEffectModel));
                    }
                });
                return;
            }
            d invoke = this.f149288a.f149282f.invoke();
            String str = this.f149288a.f149283g;
            String str2 = this.f149289b.f149333e;
            int i2 = this.f149290c;
            int i3 = this.f149289b.f149329a;
            int i4 = this.f149289b.f149330b;
            String str3 = this.f149289b.f149331c;
            AnonymousClass2 r9 = new IFetchCategoryEffectListener() {
                /* class com.ss.android.ugc.tools.h.b.b.c.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(98316);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    adVar.b(com.ss.android.ugc.tools.b.a.a.a.a(exceptionResult));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.ad */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
                    CategoryEffectModel categoryEffectModel;
                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                    ad adVar = adVar;
                    if (categoryPageModel2 != null) {
                        categoryEffectModel = categoryPageModel2.getCategoryEffects();
                    } else {
                        categoryEffectModel = null;
                    }
                    adVar.a(g.a(categoryEffectModel));
                }
            };
            l.d(invoke, "");
            l.d(str, "");
            l.d(r9, "");
            invoke.a(str, str2, d.a.f149143b, new a.C4025a(invoke, str, str2, i2, i3, i4, str3, r9), null);
        }
    }

    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t a(Object obj) {
        ab a2;
        p pVar = (p) obj;
        l.d(pVar, "");
        int intValue = ((Number) pVar.component1()).intValue();
        k kVar = (k) pVar.component2();
        if (kVar.f149333e.length() == 0 && kVar.f149329a == 0) {
            a2 = ab.a((af) new a(this, intValue));
            l.b(a2, "");
        } else {
            a2 = ab.a((af) new b(this, kVar, intValue));
            l.b(a2, "");
        }
        t d2 = a2.c(new C4033c(kVar)).d();
        l.b(d2, "");
        return d2;
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.c$c  reason: collision with other inner class name */
    static final class C4033c<T, R> implements f.a.d.g<f<? extends CategoryEffectModel>, p<? extends k, ? extends p<? extends List<? extends Effect>, ? extends CategoryEffectModel>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f149293a;

        static {
            Covode.recordClassIndex(98317);
        }

        C4033c(k kVar) {
            this.f149293a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ p<? extends k, ? extends p<? extends List<? extends Effect>, ? extends CategoryEffectModel>> apply(f<? extends CategoryEffectModel> fVar) {
            String str;
            f<? extends CategoryEffectModel> fVar2 = fVar;
            l.d(fVar2, "");
            CategoryEffectModelTemplate categoryEffectModelTemplate = (CategoryEffectModelTemplate) fVar2.a();
            if (categoryEffectModelTemplate == null) {
                return v.a(new k(this.f149293a.f149329a, this.f149293a.f149330b, this.f149293a.f149331c, false, this.f149293a.f149333e), v.a(z.INSTANCE, null));
            }
            List<Effect> effects = categoryEffectModelTemplate.getEffects();
            if (effects == null || effects.isEmpty()) {
                return v.a(new k(this.f149293a.f149329a, this.f149293a.f149330b, this.f149293a.f149331c, false, this.f149293a.f149333e), v.a(z.INSTANCE, categoryEffectModelTemplate));
            }
            if (this.f149293a.f149333e.length() == 0 && this.f149293a.f149329a == 0) {
                str = categoryEffectModelTemplate.getCategoryKey();
            } else {
                str = this.f149293a.f149333e;
            }
            return v.a(new k(categoryEffectModelTemplate.getCursor(), categoryEffectModelTemplate.getSortingPosition(), categoryEffectModelTemplate.getVersion(), categoryEffectModelTemplate.hasMore(), str), v.a(categoryEffectModelTemplate.getEffects(), categoryEffectModelTemplate));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.ss.android.ugc.tools.h.b.b.a
    public final /* synthetic */ boolean b(k kVar, k kVar2) {
        k kVar3 = kVar;
        k kVar4 = kVar2;
        l.d(kVar3, "");
        l.d(kVar4, "");
        if (kVar3.f149329a == kVar4.f149329a) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(h.f.a.a<? extends d> aVar, String str, k kVar, boolean z) {
        super(kVar);
        l.d(aVar, "");
        l.d(str, "");
        l.d(kVar, "");
        this.f149282f = aVar;
        this.f149283g = str;
        this.f149284h = z;
    }
}
