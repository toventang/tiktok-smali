package com.ss.android.ugc.aweme.sticker.original;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.sticker.panel.c.d;
import com.ss.android.ugc.aweme.sticker.panel.c.e;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class OriginalStickerViewModel extends StickerListViewModel implements au {

    /* renamed from: a  reason: collision with root package name */
    public List<Effect> f134982a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final e f134983b;

    /* renamed from: c  reason: collision with root package name */
    public final Effect f134984c;

    static {
        Covode.recordClassIndex(88260);
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b implements IFetchEffectListByIdsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OriginalStickerViewModel f134986a;

        static {
            Covode.recordClassIndex(88263);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(OriginalStickerViewModel originalStickerViewModel) {
            this.f134986a = originalStickerViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            EffectListResponse effectListResponse2 = effectListResponse;
            if (effectListResponse2 == null) {
                l.b();
            }
            List<Effect> data = effectListResponse2.getData();
            if (data.size() > 10) {
                data = data.subList(0, 10);
            }
            this.f134986a.f136625m.setValue(com.ss.android.ugc.tools.view.widget.b.a.NONE);
            this.f134986a.f134982a.addAll(this.f134986a.a((List<? extends Effect>) data, false));
            OriginalStickerViewModel originalStickerViewModel = this.f134986a;
            originalStickerViewModel.a((List<? extends Effect>) originalStickerViewModel.f134982a);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel
    public final void a(String str) {
        l.d(str, "");
        z.e eVar = new z.e();
        eVar.element = null;
        this.f134983b.a(com.ss.android.ugc.aweme.sticker.panel.c.b.P, 0, new a(this, eVar));
    }

    static final class a extends h.f.b.m implements h.f.a.b<d, h.z> {
        final /* synthetic */ z.e $effectInfo;
        final /* synthetic */ OriginalStickerViewModel this$0;

        static {
            Covode.recordClassIndex(88261);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(OriginalStickerViewModel originalStickerViewModel, z.e eVar) {
            super(1);
            this.this$0 = originalStickerViewModel;
            this.$effectInfo = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(d dVar) {
            d dVar2 = dVar;
            l.d(dVar2, "");
            com.ss.android.ugc.aweme.sticker.panel.c.b.O = dVar2.b();
            this.$effectInfo.element = (T) dVar2.a();
            if (this.$effectInfo.element != null) {
                T t = this.$effectInfo.element;
                if (t == null) {
                    l.b();
                }
                if (t.size() > 10) {
                    z.e eVar = this.$effectInfo;
                    T t2 = eVar.element;
                    if (t2 == null) {
                        l.b();
                    }
                    eVar.element = (T) t2.subList(0, 10);
                }
                o oVar = this.this$0.o;
                T t3 = this.$effectInfo.element;
                if (t3 == null) {
                    l.b();
                }
                oVar.a(t3, (Map<String, String>) null, new IFetchEffectListByIdsListener(this) {
                    /* class com.ss.android.ugc.aweme.sticker.original.OriginalStickerViewModel.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f134985a;

                    static {
                        Covode.recordClassIndex(88262);
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                    public final void onFail(ExceptionResult exceptionResult) {
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f134985a = r1;
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
                        EffectListResponse effectListResponse2 = effectListResponse;
                        if (effectListResponse2 == null) {
                            l.b();
                        }
                        List<Effect> data = effectListResponse2.getData();
                        this.f134985a.this$0.f136625m.setValue(com.ss.android.ugc.tools.view.widget.b.a.NONE);
                        this.f134985a.this$0.f134982a.clear();
                        this.f134985a.this$0.f134982a.addAll(this.f134985a.this$0.a((List<? extends Effect>) data, true));
                        this.f134985a.this$0.a((List<? extends Effect>) this.f134985a.this$0.a((List<? extends Effect>) data, true));
                    }
                });
            }
            return h.z.f158842a;
        }
    }

    public final List<Effect> a(List<? extends Effect> list, boolean z) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(this.f134984c);
        }
        for (T t : list) {
            if (!l.a((Object) t.getEffect_id(), (Object) this.f134984c.getEffect_id())) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OriginalStickerViewModel(m mVar, o oVar, com.ss.android.ugc.aweme.sticker.d.d dVar, g gVar, e eVar, Effect effect) {
        super(mVar, oVar, dVar, gVar);
        l.d(mVar, "");
        l.d(oVar, "");
        l.d(dVar, "");
        l.d(gVar, "");
        l.d(eVar, "");
        l.d(effect, "");
        this.f134983b = eVar;
        this.f134984c = effect;
    }
}
