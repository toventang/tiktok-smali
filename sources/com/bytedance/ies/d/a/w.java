package com.bytedance.ies.d.a;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.l.k;
import h.p;
import h.z;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

public final class w implements j {

    /* renamed from: a  reason: collision with root package name */
    public final o f33259a;

    /* renamed from: b  reason: collision with root package name */
    private final e f33260b;

    /* renamed from: c  reason: collision with root package name */
    private final h f33261c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, h.f.a.a<Boolean>> f33262d;

    /* renamed from: e  reason: collision with root package name */
    private final List<p> f33263e;

    static {
        Covode.recordClassIndex(19873);
    }

    static final class a extends m implements b<p, Boolean> {
        final /* synthetic */ String $scheme;

        static {
            Covode.recordClassIndex(19876);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.$scheme = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(p pVar) {
            p pVar2 = pVar;
            l.c(pVar2, "");
            return Boolean.valueOf(pVar2.b());
        }
    }

    @Override // com.bytedance.ies.d.a.j
    public final List<y> b(String str) {
        l.c(str, "");
        System.currentTimeMillis();
        return this.f33259a.a(str, this.f33261c);
    }

    @Override // com.bytedance.ies.d.a.j
    public final void a(String str) {
        l.c(str, "");
        l.c(str, "");
        q.a("Start prefetch, page scheme: ".concat(String.valueOf(str)));
        List<p> list = this.f33263e;
        if (list != null) {
            Iterator a2 = k.a(n.t(list), (b) new a(str)).a();
            String str2 = str;
            while (a2.hasNext()) {
                str2 = ((p) a2.next()).a();
                q.b("Scheme convert to [schema:" + str2 + "], origin_scheme:" + str);
            }
            str = str2;
        }
        aj ajVar = new aj(str);
        p<Collection<ad>, SortedMap<String, String>> a3 = this.f33260b.a(ajVar);
        if (a3 == null) {
            q.a("No config found for page " + str + ", skipping...", null);
        } else {
            a(str, a3.getFirst(), a3.getSecond(), ajVar.c());
        }
    }

    @Override // com.bytedance.ies.d.a.j
    public final y a(z zVar, aa aaVar) {
        l.c(zVar, "");
        l.c(aaVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        y a2 = this.f33259a.a(zVar);
        a2.f33272d = currentTimeMillis;
        a2.f33270b = this.f33261c;
        return a2;
    }

    @Override // com.bytedance.ies.d.a.j
    public final y b(z zVar, aa aaVar) {
        l.c(zVar, "");
        l.c(aaVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        y b2 = this.f33259a.b(zVar);
        b2.f33272d = currentTimeMillis;
        b2.f33270b = this.f33261c;
        return b2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f A[EDGE_INSN: B:23:0x005f->B:15:0x005f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.lang.String r12, java.util.Collection<com.bytedance.ies.d.a.ad> r13, java.util.SortedMap<java.lang.String, java.lang.String> r14, java.util.SortedMap<java.lang.String, java.lang.String> r15) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.d.a.w.a(java.lang.String, java.util.Collection, java.util.SortedMap, java.util.SortedMap):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<java.lang.String, ? extends h.f.a.a<java.lang.Boolean>> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.bytedance.ies.d.a.p> */
    /* JADX WARN: Multi-variable type inference failed */
    public w(o oVar, e eVar, h hVar, Map<String, ? extends h.f.a.a<Boolean>> map, List<? extends p> list, final WeakReference<h.f.a.a<z>> weakReference) {
        l.c(oVar, "");
        l.c(eVar, "");
        this.f33259a = oVar;
        this.f33260b = eVar;
        this.f33261c = hVar;
        this.f33262d = map;
        this.f33263e = list;
        eVar.a(new h.f.a.a<z>(this) {
            /* class com.bytedance.ies.d.a.w.AnonymousClass1 */
            final /* synthetic */ w this$0;

            static {
                Covode.recordClassIndex(19874);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f33259a.a(new h.f.a.a<z>(this) {
                    /* class com.bytedance.ies.d.a.w.AnonymousClass1.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f33264a;

                    static {
                        Covode.recordClassIndex(19875);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        h.f.a.a aVar;
                        WeakReference weakReference = weakReference;
                        if (!(weakReference == null || (aVar = (h.f.a.a) weakReference.get()) == null)) {
                            aVar.invoke();
                        }
                        return z.f158842a;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f33264a = r1;
                    }
                });
                return z.f158842a;
            }
        });
    }
}
