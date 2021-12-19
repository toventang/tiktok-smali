package com.ss.android.ugc.aweme.lego.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.d.b;
import com.ss.android.ugc.aweme.lego.e.c;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.u;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class s implements com.ss.android.ugc.e.a {

    /* renamed from: b  reason: collision with root package name */
    public final ThreadLocal<List<String>> f107362b = new a();

    static {
        Covode.recordClassIndex(68717);
    }

    @Override // com.ss.android.ugc.e.a
    public void a() {
    }

    @Override // com.ss.android.ugc.e.a
    public void b() {
    }

    public static final class a extends ThreadLocal<List<String>> {
        static {
            Covode.recordClassIndex(68718);
        }

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ List<String> initialValue() {
            return new ArrayList();
        }
    }

    @Override // com.ss.android.ugc.e.a
    public final void a(n nVar) {
        l.d(nVar, "");
        if (b.f107492a || b.a(nVar)) {
            String h2 = nVar.h();
            c cVar = f.f107539d;
            l.b(h2, "");
            l.d(h2, "");
            l.d(nVar, "");
            if (!cVar.f107524b.containsKey(h2)) {
                cVar.f107524b.put(h2, nVar);
            }
            List<String> list = this.f107362b.get();
            if (list != null) {
                list.add(h2);
            }
        }
    }

    @Override // com.ss.android.ugc.e.a
    public final n b(n nVar) {
        l.d(nVar, "");
        c cVar = f.f107539d;
        String h2 = nVar.h();
        l.b(h2, "");
        l.d(h2, "");
        u uVar = cVar.f107523a.get(h2);
        if (uVar == null) {
            uVar = cVar.a(h2);
        }
        return uVar;
    }

    @Override // com.ss.android.ugc.e.a
    public void a(List<? extends n> list) {
        l.d(list, "");
        List<String> list2 = this.f107362b.get();
        if (list2 == null) {
            l.b();
        }
        ArrayList arrayList = new ArrayList(list2);
        List<String> list3 = this.f107362b.get();
        if (list3 != null) {
            list3.clear();
        }
        c cVar = f.f107539d;
        Object obj = list.get(0);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoService");
        ae b2 = ((u) obj).b();
        l.b(b2, "");
        l.d(b2, "");
        l.d(arrayList, "");
        synchronized (cVar.f107525c) {
            List<String> list4 = cVar.f107525c.get(b2);
            if (list4 == null) {
                l.b();
            }
            list4.addAll(arrayList);
        }
    }
}
