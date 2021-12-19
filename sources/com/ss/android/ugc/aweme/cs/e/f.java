package com.ss.android.ugc.aweme.cs.e;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.b.b;
import com.ss.android.ugc.aweme.cs.h.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.i.j;
import h.a.n;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class f extends a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f79047b = new a((byte) 0);

    static {
        Covode.recordClassIndex(49065);
    }

    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String f() {
        return "av-filter";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String g() {
        return "filter";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49066);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final b h() {
        return b.RESOURCE;
    }

    @Override // com.bytedance.u.a
    public final File c() {
        c c2 = g.a().g().c();
        String str = dj.p;
        l.b(str, "");
        return c2.g(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final long k() {
        Set<String> a2 = com.ss.android.ugc.aweme.cs.d.b.a();
        c c2 = g.a().g().c();
        Application application = i.f115645a;
        l.b(application, "");
        File filesDir = application.getFilesDir();
        l.b(filesDir, "");
        File a3 = c2.a(filesDir, "filter");
        com.ss.android.ugc.aweme.cs.d.b.a.a aVar = new com.ss.android.ugc.aweme.cs.d.b.a.a(a2, null, 2);
        if (a3.exists()) {
            com.ss.android.ugc.aweme.cs.d.b.a aVar2 = new com.ss.android.ugc.aweme.cs.d.b.a();
            aVar2.a(aVar);
            aVar2.a(a3);
        }
        long j2 = aVar.f79012a + 0;
        c c3 = g.a().g().c();
        String str = dj.p;
        l.b(str, "");
        File g2 = c3.g(str);
        com.ss.android.ugc.aweme.cs.d.b.a.a aVar3 = new com.ss.android.ugc.aweme.cs.d.b.a.a(a2, null, 2);
        if (g2.exists()) {
            com.ss.android.ugc.aweme.cs.d.b.a aVar4 = new com.ss.android.ugc.aweme.cs.d.b.a();
            aVar4.a(aVar3);
            aVar4.a(g2);
        }
        return j2 + aVar3.f79012a + 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final boolean j() {
        String str;
        c c2 = g.a().g().c();
        Application application = i.f115645a;
        l.b(application, "");
        File filesDir = application.getFilesDir();
        l.b(filesDir, "");
        File a2 = c2.a(filesDir, "filter");
        if (a2.exists()) {
            com.ss.android.ugc.aweme.cs.d.b.a.c cVar = new com.ss.android.ugc.aweme.cs.d.b.a.c(com.ss.android.ugc.aweme.cs.d.b.a(), null, 2);
            cVar.f79016a = true;
            com.ss.android.ugc.aweme.cs.d.b.a aVar = new com.ss.android.ugc.aweme.cs.d.b.a();
            aVar.a(cVar);
            aVar.a(a2);
            cVar.a();
        }
        if (c().exists()) {
            com.ss.android.ugc.aweme.cs.d.b.a.c cVar2 = new com.ss.android.ugc.aweme.cs.d.b.a.c(com.ss.android.ugc.aweme.cs.d.b.a(), null, 2);
            cVar2.f79016a = true;
            com.ss.android.ugc.aweme.cs.d.b.a aVar2 = new com.ss.android.ugc.aweme.cs.d.b.a();
            aVar2.a(cVar2);
            aVar2.a(c());
            cVar2.a();
        }
        List<com.ss.android.ugc.aweme.draft.model.c> c3 = g.a().c().c();
        ArrayList arrayList = new ArrayList();
        for (T t : c3) {
            T t2 = t;
            if (t2.f83192m >= 0 && ((str = t2.W.ac) == null || str.length() == 0)) {
                arrayList.add(t);
            }
        }
        ArrayList<com.ss.android.ugc.aweme.draft.model.c> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
        for (com.ss.android.ugc.aweme.draft.model.c cVar3 : arrayList2) {
            cVar3.W.ac = g.a().r().c().a(cVar3.f83192m).getFilterFolder();
            arrayList3.add(g.a().c().a(cVar3));
        }
        com.ss.android.ugc.aweme.shortvideo.i.b a3 = j.a();
        a3.b(-1);
        a3.c(-1);
        g.a().r().d().b();
        g.a().r().b().c();
        g.a().n().a();
        return true;
    }
}
