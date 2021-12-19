package com.ss.android.ugc.aweme.cs.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.h.c;
import com.ss.android.ugc.aweme.draft.m;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shoutouts.d;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class b extends a {
    static {
        Covode.recordClassIndex(49058);
    }

    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String f() {
        return "av-draft";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String g() {
        return "draft";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final boolean j() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final com.ss.android.ugc.aweme.cs.b.b h() {
        return com.ss.android.ugc.aweme.cs.b.b.DRAFT;
    }

    @Override // com.bytedance.u.a
    public final File c() {
        c c2 = g.a().g().c();
        String str = dj.f126463f;
        l.b(str, "");
        return c2.g(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final long k() {
        List<String> list;
        ArrayList<com.ss.android.ugc.aweme.draft.model.c> arrayList = new ArrayList();
        cr a2 = cr.a();
        l.b(a2, "");
        String f2 = a2.f();
        l.b(f2, "");
        boolean c2 = g.a().o().c();
        if (c2) {
            list = g.a().o().f();
        } else {
            list = z.INSTANCE;
        }
        List<com.ss.android.ugc.aweme.draft.model.c> queryListWithFilter = AVServiceImpl.a().draftService().queryListWithFilter(true, new a(c2, list, arrayList, f2));
        l.b(queryListWithFilter, "");
        long j2 = 0;
        com.ss.android.ugc.aweme.cs.d.a.a aVar = new com.ss.android.ugc.aweme.cs.d.a.a();
        for (com.ss.android.ugc.aweme.draft.model.c cVar : n.g((Iterable) queryListWithFilter)) {
            aVar.a(cVar);
            j2 += aVar.a();
        }
        for (com.ss.android.ugc.aweme.draft.model.c cVar2 : arrayList) {
            AVServiceImpl.a().draftService().delete(cVar2);
        }
        return j2;
    }

    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f79032a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f79033b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f79034c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f79035d;

        static {
            Covode.recordClassIndex(49059);
        }

        @Override // com.ss.android.ugc.aweme.draft.m
        public final boolean a(com.ss.android.ugc.aweme.draft.model.c cVar) {
            l.d(cVar, "");
            if (this.f79032a) {
                if (cVar.W.aU != null && !p.a(cVar.W.aU.getShoutOutsMode(), d.MODE_POST, false)) {
                    if (!this.f79033b.contains(cVar.r())) {
                        this.f79034c.add(cVar);
                    }
                    return false;
                } else if (!this.f79033b.contains(cVar.r())) {
                    return true;
                } else {
                    return false;
                }
            } else if (cVar.W.aU == null || p.a(cVar.W.aU.getShoutOutsMode(), d.MODE_POST, false)) {
                return !l.a((Object) cVar.r(), (Object) this.f79035d);
            } else {
                if (!l.a((Object) cVar.r(), (Object) this.f79035d)) {
                    this.f79034c.add(cVar);
                }
                return false;
            }
        }

        a(boolean z, List list, ArrayList arrayList, String str) {
            this.f79032a = z;
            this.f79033b = list;
            this.f79034c = arrayList;
            this.f79035d = str;
        }
    }
}
