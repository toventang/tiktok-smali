package com.ss.android.ugc.aweme.lego.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.lego.q;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class k implements com.ss.android.ugc.e.a {

    /* renamed from: a  reason: collision with root package name */
    private b f107344a = new b();

    static {
        Covode.recordClassIndex(68698);
    }

    @Override // com.ss.android.ugc.e.a
    public final void a() {
    }

    @Override // com.ss.android.ugc.e.a
    public final void b() {
    }

    public static final class b extends ThreadLocal<List<String>> {
        static {
            Covode.recordClassIndex(68700);
        }

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ List<String> initialValue() {
            return new ArrayList();
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f107345a;

        static {
            Covode.recordClassIndex(68699);
        }

        a(String str) {
            this.f107345a = str;
        }

        public final void run() {
            com.ss.android.ugc.aweme.lego.e.a aVar = f.f107540e;
            String str = this.f107345a;
            l.b(str, "");
            aVar.b(str);
        }
    }

    @Override // com.ss.android.ugc.e.a
    public final n b(n nVar) {
        l.d(nVar, "");
        com.ss.android.ugc.aweme.lego.e.a aVar = f.f107540e;
        String h2 = nVar.h();
        l.b(h2, "");
        return (n) aVar.a(h2);
    }

    @Override // com.ss.android.ugc.e.a
    public final void a(n nVar) {
        l.d(nVar, "");
        String h2 = nVar.h();
        com.ss.android.ugc.aweme.lego.e.a aVar = f.f107540e;
        l.b(h2, "");
        l.d(h2, "");
        if (!aVar.f107515b.containsKey(h2)) {
            f.f107540e.a(h2, (q) nVar);
            List list = (List) this.f107344a.get();
            if (list != null) {
                list.add(h2);
            }
        }
    }

    @Override // com.ss.android.ugc.e.a
    public final void a(List<? extends n> list) {
        l.d(list, "");
        Object obj = this.f107344a.get();
        if (obj == null) {
            l.b();
        }
        ArrayList arrayList = new ArrayList((Collection) obj);
        List list2 = (List) this.f107344a.get();
        if (list2 != null) {
            list2.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p.f107614a.post(new a((String) it.next()));
        }
    }
}
