package com.bytedance.ies.bullet.c.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.c.a.n;
import com.bytedance.ies.bullet.c.c.a.q;
import com.bytedance.ies.bullet.c.c.a.r;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class i implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32032a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private h.f.a.b<? super q, z> f32033b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32034c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, n> f32035d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, q> f32036e;

    static {
        Covode.recordClassIndex(18742);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18743);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static n a(o oVar, com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.c(oVar, "");
            l.c(bVar, "");
            String a2 = oVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : oVar.b().invoke(bVar)) {
                linkedHashMap.put(t.a(), a(t, bVar));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (T t2 : oVar.c().invoke(bVar)) {
                linkedHashMap2.put(t2.d(), t2);
            }
            return new i(a2, linkedHashMap, linkedHashMap2, (byte) 0);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.n
    public final String b() {
        return this.f32034c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.n
    public final Map<String, n> c() {
        return this.f32035d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.n
    public final Map<String, q> d() {
        return this.f32036e;
    }

    @Override // com.bytedance.ies.bullet.c.e.a
    public final void a() {
        for (Map.Entry<String, n> entry : this.f32035d.entrySet()) {
            entry.getValue().a();
        }
        for (Map.Entry<String, q> entry2 : this.f32036e.entrySet()) {
            entry2.getValue().a();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.n
    public final void a(m<? super List<? extends n>, ? super q, z> mVar) {
        l.c(mVar, "");
        for (Map.Entry<String, n> entry : this.f32035d.entrySet()) {
            entry.getValue().a(new b(this, mVar));
        }
        for (Map.Entry<String, q> entry2 : this.f32036e.entrySet()) {
            mVar.invoke(n.a(this), entry2.getValue());
        }
    }

    static final class b extends h.f.b.m implements m<List<? extends n>, q, z> {
        final /* synthetic */ m $handler$inlined;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(18744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, m mVar) {
            super(2);
            this.this$0 = iVar;
            this.$handler$inlined = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(List<? extends n> list, q qVar) {
            List<? extends n> list2 = list;
            l.c(list2, "");
            l.c(qVar, "");
            m mVar = this.$handler$inlined;
            List c2 = n.c(this.this$0);
            c2.addAll(list2);
            mVar.invoke(c2, qVar);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.n
    public final void a(n nVar, boolean z) {
        l.c(nVar, "");
        for (Map.Entry<String, q> entry : nVar.d().entrySet()) {
            if (!this.f32036e.containsKey(entry.getKey())) {
                this.f32036e.put(entry.getKey(), entry.getValue());
            } else if (z) {
                q qVar = this.f32036e.get(entry.getKey());
                if (qVar != null) {
                    qVar.a();
                }
                this.f32036e.put(entry.getKey(), entry.getValue());
            } else {
                entry.getValue().a();
            }
        }
        for (Map.Entry<String, n> entry2 : nVar.c().entrySet()) {
            if (this.f32035d.containsKey(entry2.getKey())) {
                n nVar2 = this.f32035d.get(entry2.getKey());
                if (nVar2 != null) {
                    nVar2.a(entry2.getValue(), z);
                }
            } else {
                this.f32035d.put(entry2.getKey(), entry2.getValue());
            }
        }
    }

    private i(String str, Map<String, n> map, Map<String, q> map2) {
        this.f32034c = str;
        this.f32035d = map;
        this.f32036e = map2;
    }

    public /* synthetic */ i(String str, Map map, Map map2, byte b2) {
        this(str, map, map2);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.n
    public final void a(List<String> list, Object obj, q.a aVar, h.f.a.b<? super Throwable, z> bVar) {
        l.c(list, "");
        l.c(obj, "");
        l.c(aVar, "");
        l.c(bVar, "");
        int size = list.size();
        if (size == 0) {
            bVar.invoke(new n.a("[unknown]"));
        } else if (size != 1) {
            String str = (String) h.a.n.g((List) list);
            n nVar = this.f32035d.get(str);
            if (nVar == null) {
                bVar.invoke(new n.a(str));
                return;
            }
            this.f32033b = this.f32033b;
            nVar.a(list.subList(1, list.size()), obj, aVar, bVar);
        } else {
            String str2 = (String) h.a.n.g((List) list);
            q qVar = this.f32036e.get(str2);
            if (qVar == null) {
                bVar.invoke(new n.a(str2));
            } else if (qVar instanceof k) {
                h.f.a.b<? super q, z> bVar2 = this.f32033b;
                if (bVar2 != null) {
                    bVar2.invoke(qVar);
                }
                ((k) qVar).a((JSONObject) obj, (k.b) aVar);
            } else if (qVar instanceof r) {
                h.f.a.b<? super q, z> bVar3 = this.f32033b;
                if (bVar3 != null) {
                    bVar3.invoke(qVar);
                }
                r rVar = (r) qVar;
                if (rVar != null) {
                    f.a(rVar, obj, (r.a) aVar);
                }
            }
        }
    }
}
