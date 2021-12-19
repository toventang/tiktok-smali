package com.ss.android.ugc.tools.h.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.ss.android.ugc.tools.h.a.f;
import com.ss.android.ugc.tools.h.a.g;
import com.ss.ugc.effectplatform.h.b;
import com.ss.ugc.effectplatform.model.e;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import h.f.b.l;

public abstract class d<RESULT, INFO> implements g<InfoStickerEffect, RESULT, INFO> {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.a<com.ss.android.ugc.tools.b.a.d> f149243a;

    static {
        Covode.recordClassIndex(98291);
    }

    public abstract Exception a(InfoStickerEffect infoStickerEffect, ExceptionResult exceptionResult);

    public abstract RESULT a(InfoStickerEffect infoStickerEffect);

    public abstract INFO b(InfoStickerEffect infoStickerEffect);

    public abstract INFO c(InfoStickerEffect infoStickerEffect);

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> aVar) {
        l.d(aVar, "");
        this.f149243a = aVar;
    }

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public long f149244a = System.currentTimeMillis();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f149245b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f149246c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ InfoStickerEffect f149247d;

        static {
            Covode.recordClassIndex(98292);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.h.a.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onSuccess(InfoStickerEffect infoStickerEffect) {
            l.d(infoStickerEffect, "");
            long currentTimeMillis = System.currentTimeMillis() - this.f149244a;
            f fVar = this.f149246c;
            InfoStickerEffect infoStickerEffect2 = this.f149247d;
            fVar.a(infoStickerEffect2, this.f149245b.a(infoStickerEffect2), this.f149245b.b(this.f149247d), currentTimeMillis);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.h.a.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onFail(InfoStickerEffect infoStickerEffect, e eVar) {
            l.d(eVar, "");
            long currentTimeMillis = System.currentTimeMillis() - this.f149244a;
            f fVar = this.f149246c;
            InfoStickerEffect infoStickerEffect2 = this.f149247d;
            Exception a2 = this.f149245b.a(infoStickerEffect2, ListenerAdaptExtKt.toOldExceptionResult(eVar));
            d dVar = this.f149245b;
            InfoStickerEffect infoStickerEffect3 = this.f149247d;
            ListenerAdaptExtKt.toOldExceptionResult(eVar);
            fVar.a((Object) infoStickerEffect2, a2, dVar.c(infoStickerEffect3), currentTimeMillis);
        }

        a(d dVar, f fVar, InfoStickerEffect infoStickerEffect) {
            this.f149245b = dVar;
            this.f149246c = fVar;
            this.f149247d = infoStickerEffect;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.ss.android.ugc.tools.h.a.g
    public final /* synthetic */ void a(InfoStickerEffect infoStickerEffect, f fVar) {
        InfoStickerEffect infoStickerEffect2 = infoStickerEffect;
        l.d(infoStickerEffect2, "");
        l.d(fVar, "");
        this.f149243a.invoke().a(infoStickerEffect2, new a(this, fVar, infoStickerEffect2));
    }
}
