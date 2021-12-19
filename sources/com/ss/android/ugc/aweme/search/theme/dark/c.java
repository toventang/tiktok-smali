package com.ss.android.ugc.aweme.search.theme.dark;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.r;
import h.h.e;
import h.k.i;

public final class c extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f121737a = {new r(c.class, "isVisible", "isVisible()Z", 0)};

    /* renamed from: g  reason: collision with root package name */
    private static final b f121738g = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    Integer f121739b;

    /* renamed from: c  reason: collision with root package name */
    final RecyclerView f121740c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC3151c f121741d;

    /* renamed from: e  reason: collision with root package name */
    private final e f121742e = new a(true, true, this);

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.flowfeed.a.a f121743f;

    /* renamed from: com.ss.android.ugc.aweme.search.theme.dark.c$c  reason: collision with other inner class name */
    public interface AbstractC3151c {
        static {
            Covode.recordClassIndex(79292);
        }

        void e();

        void f();
    }

    static {
        Covode.recordClassIndex(79289);
    }

    private final void a(boolean z) {
        this.f121742e.a(f121737a[0], Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return ((Boolean) this.f121742e.a(this, f121737a[0])).booleanValue();
    }

    static final class b {
        static {
            Covode.recordClassIndex(79291);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final void b() {
        a(true);
        this.f121739b = null;
        this.f121740c.b(this);
    }

    public static final class a extends h.h.c<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f121744a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f121745b;

        static {
            Covode.recordClassIndex(79290);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, c cVar) {
            super(obj2);
            this.f121744a = obj;
            this.f121745b = cVar;
        }

        @Override // h.h.c
        public final void a(i<?> iVar, Boolean bool, Boolean bool2) {
            l.d(iVar, "");
            boolean booleanValue = bool2.booleanValue();
            if (bool.booleanValue() == booleanValue) {
                return;
            }
            if (booleanValue) {
                this.f121745b.f121741d.f();
            } else {
                this.f121745b.f121741d.e();
            }
        }
    }

    public c(RecyclerView recyclerView, com.ss.android.ugc.aweme.flowfeed.a.a aVar, AbstractC3151c cVar) {
        l.d(recyclerView, "");
        l.d(aVar, "");
        l.d(cVar, "");
        this.f121740c = recyclerView;
        this.f121743f = aVar;
        this.f121741d = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r2 != null) goto L_0x0056;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.recyclerview.widget.RecyclerView r7, int r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r7, r0)
            java.lang.Integer r0 = r6.f121739b
            if (r0 == 0) goto L_0x0059
            int r5 = r0.intValue()
            com.ss.android.ugc.aweme.flowfeed.a.a r0 = r6.f121743f
            androidx.fragment.app.Fragment r0 = r0.g()
            r1 = 0
            if (r0 == 0) goto L_0x001e
            int r0 = r0.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x001e:
            java.util.concurrent.ConcurrentHashMap r0 = com.ss.android.ugc.aweme.search.theme.dark.b.a()
            java.lang.Object r0 = r0.get(r1)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            if (r0 == 0) goto L_0x0030
            java.util.Collection r0 = r0.values()
            if (r0 != 0) goto L_0x0032
        L_0x0030:
            h.a.z r0 = h.a.z.INSTANCE
        L_0x0032:
            java.util.Iterator r4 = r0.iterator()
        L_0x0036:
            boolean r1 = r4.hasNext()
            r3 = 1
            r0 = 0
            if (r1 == 0) goto L_0x005a
            java.lang.Object r2 = r4.next()
            r0 = r2
            com.ss.android.ugc.aweme.search.j.a r0 = (com.ss.android.ugc.aweme.search.j.a) r0
            int r1 = r0.k()
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0036
            if (r1 >= 0) goto L_0x0052
            goto L_0x0036
        L_0x0052:
            if (r5 < r1) goto L_0x0036
            if (r2 == 0) goto L_0x005a
        L_0x0056:
            r6.a(r3)
        L_0x0059:
            return
        L_0x005a:
            r3 = 0
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.theme.dark.c.a(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
