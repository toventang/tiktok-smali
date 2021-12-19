package com.ss.android.ugc.tools.infosticker.a.b.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.infosticker.a.b.d;
import com.ss.android.ugc.tools.infosticker.a.b.e;
import com.ss.android.ugc.tools.infosticker.a.b.f;
import h.f.b.l;
import h.z;

public final class a extends com.ss.android.ugc.tools.h.b.a.a<ProviderEffect, String, z> implements d {

    /* renamed from: e  reason: collision with root package name */
    private final f f149412e;

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.a<e> f149413f;

    static {
        Covode.recordClassIndex(98387);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.tools.h.b.a.a
    public final /* synthetic */ String a(ProviderEffect providerEffect) {
        ProviderEffect providerEffect2 = providerEffect;
        l.d(providerEffect2, "");
        String id = providerEffect2.getId();
        if (id == null) {
            return "";
        }
        return id;
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.b.a$a  reason: collision with other inner class name */
    public static final class C4036a implements com.ss.android.ugc.tools.h.a.f<ProviderEffect, String, z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tools.h.a.f f149414a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f149415b;

        static {
            Covode.recordClassIndex(98388);
        }

        C4036a(com.ss.android.ugc.tools.h.a.f fVar, String str) {
            this.f149414a = fVar;
            this.f149415b = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.ss.android.ugc.tools.h.a.f
        public final /* synthetic */ void a(ProviderEffect providerEffect, int i2) {
            l.d(providerEffect, "");
            this.f149414a.a(providerEffect, i2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.ss.android.ugc.tools.h.a.f
        public final /* synthetic */ void a(ProviderEffect providerEffect, String str) {
            l.d(providerEffect, "");
            com.ss.android.ugc.tools.h.a.f fVar = this.f149414a;
            if (str == null) {
                str = this.f149415b;
            }
            fVar.a(providerEffect, str);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Exception, java.lang.Object, long] */
        @Override // com.ss.android.ugc.tools.h.a.f
        public final /* synthetic */ void a(ProviderEffect providerEffect, Exception exc, z zVar, long j2) {
            l.d(providerEffect, "");
            l.d(zVar, "");
            this.f149414a.a((Object) providerEffect, exc, (Object) zVar, j2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, long] */
        @Override // com.ss.android.ugc.tools.h.a.f
        public final /* synthetic */ void a(ProviderEffect providerEffect, String str, z zVar, long j2) {
            String str2 = str;
            l.d(providerEffect, "");
            l.d(zVar, "");
            com.ss.android.ugc.tools.h.a.f fVar = this.f149414a;
            if (str2 == null) {
                str2 = this.f149415b;
            }
            fVar.a(providerEffect, str2, zVar, j2);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.ss.android.ugc.tools.h.b.a.a
    public final /* synthetic */ void a(ProviderEffect providerEffect, com.ss.android.ugc.tools.h.a.f<ProviderEffect, String, z> fVar) {
        ProviderEffect providerEffect2 = providerEffect;
        l.d(providerEffect2, "");
        l.d(fVar, "");
        String a2 = this.f149412e.a(providerEffect2);
        if (this.f149412e.b(providerEffect2)) {
            fVar.a(providerEffect2, a2);
        } else {
            this.f149413f.invoke().a(providerEffect2, new C4036a(fVar, a2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.infosticker.a.b.e> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(f fVar, h.f.a.a<? extends e> aVar, int i2) {
        super(i2);
        l.d(fVar, "");
        l.d(aVar, "");
        this.f149412e = fVar;
        this.f149413f = aVar;
    }
}
