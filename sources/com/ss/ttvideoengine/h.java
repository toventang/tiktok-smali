package com.ss.ttvideoengine;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.f.a.b;
import com.ss.ttvideoengine.j.p;
import com.ss.ttvideoengine.s.c;
import com.ss.ttvideoengine.s.j;
import com.ss.ttvideoengine.s.l;
import java.lang.ref.WeakReference;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<aj> f152560a;

    static {
        Covode.recordClassIndex(101587);
    }

    @Override // com.ss.ttvideoengine.f.a.b
    public final String a() {
        aj ajVar = this.f152560a.get();
        if (ajVar == null) {
            return null;
        }
        return ajVar.cA;
    }

    @Override // com.ss.ttvideoengine.f.a.b
    public final Context c() {
        aj ajVar = this.f152560a.get();
        if (ajVar == null) {
            return null;
        }
        return ajVar.aa;
    }

    @Override // com.ss.ttvideoengine.f.a.b
    public final String b() {
        aj ajVar = this.f152560a.get();
        if (ajVar == null) {
            return null;
        }
        return l.a(ajVar.A());
    }

    public h(aj ajVar) {
        this.f152560a = new WeakReference<>(ajVar);
    }

    @Override // com.ss.ttvideoengine.f.a.b
    public final void a(String str) {
        j.a("EngineMDLFetcherListener", "fetcher cancelled");
        aj ajVar = this.f152560a.get();
        if (ajVar != null && ajVar.ae != null) {
            ajVar.ae.x(str);
        }
    }

    @Override // com.ss.ttvideoengine.f.a.b
    public final void a(c cVar) {
        aj ajVar = this.f152560a.get();
        if (cVar != null && ajVar != null && ajVar.ae != null) {
            j.e("EngineMDLFetcherListener", "fetcher should retry error " + cVar.toString());
            ajVar.ae.a(cVar, ajVar.n);
        }
    }

    @Override // com.ss.ttvideoengine.f.a.b
    public final void a(c cVar, String str) {
        com.ss.ttvideoengine.h.j jVar;
        j.a("EngineMDLFetcherListener", "videoEngine mdl fetch failed " + cVar.toString());
        aj ajVar = this.f152560a.get();
        if (ajVar != null && (jVar = ajVar.ae) != null) {
            jVar.a(0, str, cVar);
        }
    }

    @Override // com.ss.ttvideoengine.f.a.b
    public final void a(p pVar, boolean z, String str) {
        int i2;
        aj ajVar = this.f152560a.get();
        if (ajVar != null) {
            j.a("EngineMDLFetcherListener", "fetch info success");
            com.ss.ttvideoengine.h.j jVar = ajVar.ae;
            if (jVar != null) {
                if (z) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                jVar.a(i2, str, (c) null);
                if (z) {
                    jVar.a(pVar);
                }
            }
        }
    }
}
