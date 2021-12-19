package com.ss.android.ugc.aweme.legoImp;

import android.os.Looper;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.a.d;
import com.ss.android.ugc.aweme.lego.component.e;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.q;
import h.f.b.l;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public ThreadLocal<com.ss.android.ugc.aweme.lego.component.d> f107673a = new C2769a();

    /* renamed from: b  reason: collision with root package name */
    public final e<com.ss.android.ugc.aweme.lego.component.d> f107674b;

    static {
        Covode.recordClassIndex(68882);
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.a$a  reason: collision with other inner class name */
    public static final class C2769a extends ThreadLocal<com.ss.android.ugc.aweme.lego.component.d> {
        static {
            Covode.recordClassIndex(68883);
        }

        C2769a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ com.ss.android.ugc.aweme.lego.component.d initialValue() {
            com.ss.android.ugc.aweme.lego.component.d dVar = new com.ss.android.ugc.aweme.lego.component.d();
            Thread currentThread = Thread.currentThread();
            l.b(currentThread, "");
            dVar.f107473b = currentThread.getId();
            String name = currentThread.getName();
            l.b(name, "");
            l.d(name, "");
            dVar.f107472a = name;
            return dVar;
        }
    }

    public a(e<com.ss.android.ugc.aweme.lego.component.d> eVar) {
        this.f107674b = eVar;
    }

    @Override // com.ss.android.ugc.aweme.lego.a.d
    public final void b(n nVar) {
        l.d(nVar, "");
        com.ss.android.ugc.aweme.lego.component.d dVar = this.f107673a.get();
        if (dVar == null) {
            l.b();
        }
        e<com.ss.android.ugc.aweme.lego.component.d> eVar = this.f107674b;
        if (eVar != null) {
            eVar.b(dVar);
        }
        if ((nVar instanceof q) && com.ss.android.ugc.aweme.ca.a.a()) {
            com.ss.android.ugc.aweme.ca.a.b(Process.myTid());
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.a.d
    public final void a(n nVar) {
        l.d(nVar, "");
        com.ss.android.ugc.aweme.lego.component.d dVar = this.f107673a.get();
        if (dVar == null) {
            l.b();
        }
        com.ss.android.ugc.aweme.lego.component.d dVar2 = dVar;
        String str = nVar.g() + nVar.h();
        if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
            str = "main_".concat(String.valueOf(str));
        }
        l.d(str, "");
        dVar2.f107474c = str;
        e<com.ss.android.ugc.aweme.lego.component.d> eVar = this.f107674b;
        if (eVar != null) {
            eVar.a(dVar2);
        }
        if ((nVar instanceof q) && com.ss.android.ugc.aweme.ca.a.a()) {
            com.ss.android.ugc.aweme.ca.a.a(Process.myTid());
        }
    }
}
