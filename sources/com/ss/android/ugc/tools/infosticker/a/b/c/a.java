package com.ss.android.ugc.tools.infosticker.a.b.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.h.a.f;
import com.ss.android.ugc.tools.infosticker.a.b.i;
import com.ss.android.ugc.tools.infosticker.a.b.j;
import com.ss.android.ugc.tools.infosticker.a.b.k;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import h.f.b.l;
import h.z;

public final class a extends com.ss.android.ugc.tools.h.b.a.a<InfoStickerEffect, String, z> implements i {

    /* renamed from: e  reason: collision with root package name */
    private final k f149447e;

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.a<j> f149448f;

    static {
        Covode.recordClassIndex(98402);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.tools.h.b.a.a
    public final /* synthetic */ String a(InfoStickerEffect infoStickerEffect) {
        InfoStickerEffect infoStickerEffect2 = infoStickerEffect;
        l.d(infoStickerEffect2, "");
        return infoStickerEffect2.getId();
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.c.a$a  reason: collision with other inner class name */
    public static final class C4037a implements f<InfoStickerEffect, String, z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f149449a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f149450b;

        static {
            Covode.recordClassIndex(98403);
        }

        C4037a(f fVar, String str) {
            this.f149449a = fVar;
            this.f149450b = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.ss.android.ugc.tools.h.a.f
        public final /* synthetic */ void a(InfoStickerEffect infoStickerEffect, int i2) {
            l.d(infoStickerEffect, "");
            this.f149449a.a(infoStickerEffect, i2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.ss.android.ugc.tools.h.a.f
        public final /* synthetic */ void a(InfoStickerEffect infoStickerEffect, String str) {
            l.d(infoStickerEffect, "");
            f fVar = this.f149449a;
            if (str == null) {
                str = this.f149450b;
            }
            fVar.a(infoStickerEffect, str);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Exception, java.lang.Object, long] */
        @Override // com.ss.android.ugc.tools.h.a.f
        public final /* synthetic */ void a(InfoStickerEffect infoStickerEffect, Exception exc, z zVar, long j2) {
            l.d(infoStickerEffect, "");
            l.d(zVar, "");
            this.f149449a.a((Object) infoStickerEffect, exc, (Object) zVar, j2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, long] */
        @Override // com.ss.android.ugc.tools.h.a.f
        public final /* synthetic */ void a(InfoStickerEffect infoStickerEffect, String str, z zVar, long j2) {
            String str2 = str;
            l.d(infoStickerEffect, "");
            l.d(zVar, "");
            f fVar = this.f149449a;
            if (str2 == null) {
                str2 = this.f149450b;
            }
            fVar.a(infoStickerEffect, str2, zVar, j2);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.ss.android.ugc.tools.h.b.a.a
    public final /* synthetic */ void a(InfoStickerEffect infoStickerEffect, f<InfoStickerEffect, String, z> fVar) {
        InfoStickerEffect infoStickerEffect2 = infoStickerEffect;
        l.d(infoStickerEffect2, "");
        l.d(fVar, "");
        String a2 = this.f149447e.a(infoStickerEffect2);
        if (this.f149447e.b(infoStickerEffect2)) {
            fVar.a(infoStickerEffect2, a2);
        } else {
            this.f149448f.invoke().a(infoStickerEffect2, new C4037a(fVar, a2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.infosticker.a.b.j> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(k kVar, h.f.a.a<? extends j> aVar, int i2) {
        super(i2);
        l.d(kVar, "");
        l.d(aVar, "");
        this.f149447e = kVar;
        this.f149448f = aVar;
    }
}
