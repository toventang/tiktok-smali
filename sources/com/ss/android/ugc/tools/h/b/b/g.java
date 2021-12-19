package com.ss.android.ugc.tools.h.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.f;
import com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import f.a.ab;
import f.a.ad;
import f.a.af;
import f.a.t;
import h.a.z;
import h.f.b.l;
import h.p;
import java.util.List;

public class g extends a<InfoStickerEffect, m, InfoStickerListModel> {

    /* renamed from: i  reason: collision with root package name */
    public final h.f.a.a<d> f149314i;

    /* renamed from: j  reason: collision with root package name */
    public final int f149315j;

    /* renamed from: k  reason: collision with root package name */
    public final String f149316k;

    /* renamed from: l  reason: collision with root package name */
    public final String f149317l;

    static {
        Covode.recordClassIndex(98328);
    }

    /* access modifiers changed from: protected */
    public ab<f<InfoStickerListModel>> a(m mVar) {
        l.d(mVar, "");
        ab<f<InfoStickerListModel>> a2 = ab.a((af) new a(this, mVar));
        l.b(a2, "");
        return a2;
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements af<f<? extends InfoStickerListModel>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f149318a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f149319b;

        static {
            Covode.recordClassIndex(98329);
        }

        a(g gVar, m mVar) {
            this.f149318a = gVar;
            this.f149319b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.ad<com.bytedance.jedi.a.c.f<com.ss.ugc.effectplatform.model.net.InfoStickerListModel>>] */
        @Override // f.a.af
        public final void subscribe(final ad<f<? extends InfoStickerListModel>> adVar) {
            l.d(adVar, "");
            this.f149318a.f149314i.invoke().a(this.f149318a.f149315j, this.f149318a.f149316k, this.f149318a.f149317l, (Integer) null, Integer.valueOf(this.f149319b.f149336a), new e<InfoStickerListResponse>() {
                /* class com.ss.android.ugc.tools.h.b.b.g.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(98330);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.ad */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.ugc.effectplatform.h.e
                public final /* synthetic */ void onSuccess(InfoStickerListResponse infoStickerListResponse) {
                    InfoStickerListResponse infoStickerListResponse2 = infoStickerListResponse;
                    l.d(infoStickerListResponse2, "");
                    adVar.a(com.bytedance.jedi.a.c.g.a(infoStickerListResponse2.getData()));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
                @Override // com.ss.ugc.effectplatform.h.e
                public final /* synthetic */ void onFail(InfoStickerListResponse infoStickerListResponse, com.ss.ugc.effectplatform.model.e eVar) {
                    l.d(eVar, "");
                    adVar.b(com.ss.android.ugc.tools.b.a.a.a.a(ListenerAdaptExtKt.toOldExceptionResult(eVar)));
                }
            });
        }
    }

    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t a(Object obj) {
        p pVar = (p) obj;
        l.d(pVar, "");
        ((Number) pVar.component1()).intValue();
        m mVar = (m) pVar.component2();
        t<R> d2 = a(mVar).c(new b(mVar)).d();
        l.b(d2, "");
        return d2;
    }

    static final class b<T, R> implements f.a.d.g<f<? extends InfoStickerListModel>, p<? extends m, ? extends p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f149321a;

        static {
            Covode.recordClassIndex(98331);
        }

        b(m mVar) {
            this.f149321a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ p<? extends m, ? extends p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>> apply(f<? extends InfoStickerListModel> fVar) {
            int i2;
            f<? extends InfoStickerListModel> fVar2 = fVar;
            l.d(fVar2, "");
            InfoStickerListModel infoStickerListModel = (InfoStickerListModel) fVar2.a();
            boolean z = false;
            if (infoStickerListModel == null) {
                return new p(new m(this.f149321a.f149336a, false), new p(z.INSTANCE, null));
            }
            if (infoStickerListModel.getSticker_list() != null) {
                List<InfoStickerEffect> sticker_list = infoStickerListModel.getSticker_list();
                if (sticker_list == null) {
                    l.b();
                } else if (!sticker_list.isEmpty()) {
                    Integer cursor = infoStickerListModel.getCursor();
                    if (cursor != null) {
                        i2 = cursor.intValue();
                    } else {
                        i2 = 0;
                    }
                    Boolean has_more = infoStickerListModel.getHas_more();
                    if (has_more != null) {
                        z = has_more.booleanValue();
                    }
                    m mVar = new m(i2, z);
                    List<InfoStickerEffect> sticker_list2 = infoStickerListModel.getSticker_list();
                    if (sticker_list2 == null) {
                        sticker_list2 = z.INSTANCE;
                    }
                    return new p(mVar, new p(sticker_list2, infoStickerListModel));
                }
            }
            return new p(new m(this.f149321a.f149336a, false), new p(z.INSTANCE, infoStickerListModel));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.ss.android.ugc.tools.h.b.b.a
    public final /* synthetic */ boolean b(m mVar, m mVar2) {
        m mVar3 = mVar;
        m mVar4 = mVar2;
        l.d(mVar3, "");
        l.d(mVar4, "");
        if (mVar3.f149336a == mVar4.f149336a) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h.f.a.a<? extends d> aVar, int i2, String str, String str2, m mVar) {
        super(mVar);
        l.d(aVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(mVar, "");
        this.f149314i = aVar;
        this.f149315j = i2;
        this.f149316k = str;
        this.f149317l = str2;
    }
}
