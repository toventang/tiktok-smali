package com.ss.android.ugc.aweme.search.l;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.discover.mixfeed.m;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import h.a.n;
import h.h;
import h.i;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f121387a = com.ss.android.ugc.aweme.cw.g.a(l.a(o.SERIAL).a());

    /* renamed from: b  reason: collision with root package name */
    static final f f121388b = GsonHolder.a().b();

    /* renamed from: c  reason: collision with root package name */
    public static final g f121389c = new g();

    /* renamed from: d  reason: collision with root package name */
    private static final h f121390d = i.a((h.f.a.a) a.f121391a);

    public static boolean a() {
        return ((Boolean) f121390d.getValue()).booleanValue();
    }

    private g() {
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f121392a = new b();

        static {
            Covode.recordClassIndex(79092);
        }

        b() {
        }

        public final void run() {
            g.f121388b.a(m.class);
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f121391a = new a();

        static {
            Covode.recordClassIndex(79091);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.bytedance.ies.abmock.b.a().a(true, "search_json_lazy_parse", true));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f121393a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f121394b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f121395c;

        static {
            Covode.recordClassIndex(79093);
        }

        c(String str, int i2, m mVar) {
            this.f121393a = str;
            this.f121394b = i2;
            this.f121395c = mVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            m mVar = (m) g.f121388b.a(this.f121393a, m.class);
            if (mVar == null) {
                return null;
            }
            List<com.ss.android.ugc.aweme.discover.mixfeed.h> list = mVar.f81826c;
            if (list.size() <= this.f121394b) {
                return null;
            }
            mVar.setRequestId(this.f121395c.getRequestId());
            mVar.f81826c = list.subList(this.f121394b, list.size());
            return mVar;
        }
    }

    static {
        Covode.recordClassIndex(79090);
    }

    public static void a(m mVar) {
        h.f.b.l.d(mVar, "");
        if (a()) {
            List<com.ss.android.ugc.aweme.discover.mixfeed.h> list = mVar.f81826c;
            int size = list.size();
            String str = mVar.f81828f;
            h.f.b.l.b(list, "");
            if ((!list.isEmpty()) && str != null && ((com.ss.android.ugc.aweme.discover.mixfeed.h) n.i((List) list)).r) {
                mVar.f81829g = b.i.b(new c(str, size, mVar), f121387a);
            }
        }
    }
}
