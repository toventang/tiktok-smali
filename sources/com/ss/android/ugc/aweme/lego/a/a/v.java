package com.ss.android.ugc.aweme.lego.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.e.d;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.w;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public abstract class v implements com.ss.android.ugc.e.a {

    /* renamed from: b  reason: collision with root package name */
    public final ThreadLocal<List<w>> f107369b = new a();

    static {
        Covode.recordClassIndex(68723);
    }

    @Override // com.ss.android.ugc.e.a
    public void a() {
    }

    @Override // com.ss.android.ugc.e.a
    public final void a(n nVar) {
        l.d(nVar, "");
    }

    @Override // com.ss.android.ugc.e.a
    public final n b(n nVar) {
        l.d(nVar, "");
        return nVar;
    }

    @Override // com.ss.android.ugc.e.a
    public void b() {
    }

    public abstract ae c();

    public static final class a extends ThreadLocal<List<w>> {
        static {
            Covode.recordClassIndex(68724);
        }

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ List<w> initialValue() {
            return new ArrayList();
        }
    }

    @Override // com.ss.android.ugc.e.a
    public void a(List<? extends n> list) {
        l.d(list, "");
        d dVar = f.f107537b;
        ae c2 = c();
        l.d(c2, "");
        l.d(list, "");
        synchronized (dVar.f107528a) {
            List<n> list2 = dVar.f107528a.get(c2);
            if (list2 == null) {
                l.b();
            }
            list2.addAll(list);
        }
    }
}
