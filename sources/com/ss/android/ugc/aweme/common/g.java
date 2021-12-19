package com.ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.i;
import f.a.ab;
import f.a.ae;
import f.a.t;
import f.a.x;
import h.f.b.l;
import h.z;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f76424a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(47182);
    }

    public static final class b implements ae<DATA> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f76427a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f76428b;

        static {
            Covode.recordClassIndex(47184);
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        @Override // f.a.ae
        public final void onSuccess(DATA data) {
            this.f76427a.invoke(data);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            l.d(th, "");
            h.f.a.b bVar = this.f76428b;
            if (bVar != null) {
                bVar.invoke(th);
            }
        }

        b(h.f.a.b bVar, h.f.a.b bVar2) {
            this.f76427a = bVar;
            this.f76428b = bVar2;
        }
    }

    public static final class a implements ae<DATA> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f76425a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f76426b;

        static {
            Covode.recordClassIndex(47183);
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        @Override // f.a.ae
        public final void onSuccess(DATA data) {
            h.f.a.b<DATA, z> bVar;
            h hVar = this.f76425a;
            if (!(hVar == null || (bVar = hVar.f76429a) == null)) {
                bVar.invoke(data);
            }
            this.f76426b.f76446a.setValue(new j<>(data));
            this.f76426b.b();
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            h.f.a.b<Throwable, z> bVar;
            l.d(th, "");
            h hVar = this.f76425a;
            if (!(hVar == null || (bVar = hVar.f76430b) == null)) {
                bVar.invoke(th);
            }
            i iVar = this.f76426b;
            l.d(th, "");
            iVar.f76446a.setValue(new j<>(null, th));
            this.f76426b.b();
        }

        a(h hVar, i iVar) {
            this.f76425a = hVar;
            this.f76426b = iVar;
        }
    }

    public static <DATA> void a(t<DATA> tVar, h.f.a.b<? super DATA, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
        l.d(tVar, "");
        l.d(bVar, "");
        ab.a((x) tVar).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new b(bVar, bVar2));
    }

    public static <DATA> void a(t<DATA> tVar, k<DATA> kVar, h<DATA> hVar) {
        l.d(tVar, "");
        l.d(kVar, "");
        i iVar = new i();
        l.d(kVar, "");
        if (!iVar.a().containsKey(kVar)) {
            i.b bVar = new i.b(kVar);
            iVar.a().put(kVar, bVar);
            iVar.f76446a.observe(kVar.f76453a, bVar);
        }
        ab.a((x) tVar).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new a(hVar, iVar));
    }
}
