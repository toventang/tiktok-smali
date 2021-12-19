package com.ss.android.ugc.tools.h.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.f;
import com.bytedance.jedi.a.c.g;
import com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.net.InfoStickerListModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import f.a.ab;
import f.a.ad;
import f.a.af;
import h.f.b.l;

public class d extends g {

    /* renamed from: f  reason: collision with root package name */
    public final String f149294f;

    /* renamed from: g  reason: collision with root package name */
    public final String f149295g;

    /* renamed from: h  reason: collision with root package name */
    public final String f149296h;

    /* renamed from: m  reason: collision with root package name */
    private final int f149297m = 2;

    static {
        Covode.recordClassIndex(98318);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.tools.h.b.b.g
    public final ab<f<InfoStickerListModel>> a(m mVar) {
        l.d(mVar, "");
        ab<f<InfoStickerListModel>> a2 = ab.a((af) new a(this, mVar));
        l.b(a2, "");
        return a2;
    }

    static final class a<T> implements af<f<? extends InfoStickerListModel>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f149298a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f149299b;

        static {
            Covode.recordClassIndex(98319);
        }

        a(d dVar, m mVar) {
            this.f149298a = dVar;
            this.f149299b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.ad<com.bytedance.jedi.a.c.f<com.ss.ugc.effectplatform.model.net.InfoStickerListModel>>] */
        @Override // f.a.af
        public final void subscribe(final ad<f<? extends InfoStickerListModel>> adVar) {
            l.d(adVar, "");
            this.f149298a.f149314i.invoke().a(this.f149298a.f149294f, this.f149298a.f149295g, this.f149298a.f149296h, (Integer) null, Integer.valueOf(this.f149299b.f149336a), new e<InfoStickerListResponse>() {
                /* class com.ss.android.ugc.tools.h.b.b.d.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(98320);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.ad */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.ugc.effectplatform.h.e
                public final /* synthetic */ void onSuccess(InfoStickerListResponse infoStickerListResponse) {
                    InfoStickerListResponse infoStickerListResponse2 = infoStickerListResponse;
                    l.d(infoStickerListResponse2, "");
                    adVar.a(g.a(infoStickerListResponse2.getData()));
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> aVar, int i2, String str, String str2, String str3, m mVar) {
        super(aVar, 2, str, str2, mVar);
        l.d(aVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(mVar, "");
        this.f149294f = str;
        this.f149295g = str2;
        this.f149296h = str3;
    }
}
