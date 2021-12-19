package com.ss.ugc.effectplatform.b;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.b.a.a;
import com.ss.ugc.effectplatform.b.a.d;
import com.ss.ugc.effectplatform.k.c;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.util.k;
import com.ss.ugc.effectplatform.util.m;
import com.ss.ugc.effectplatform.util.s;
import com.ss.ugc.effectplatform.util.u;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final d.a.b.a<c> f153538c = new d.a.b.a<>(null);

    /* renamed from: d  reason: collision with root package name */
    public static d.a.b.a<String> f153539d = new d.a.b.a<>(null);

    /* renamed from: e  reason: collision with root package name */
    public static d.a.b.a<List<String>> f153540e = new d.a.b.a<>(null);

    /* renamed from: f  reason: collision with root package name */
    public static final a f153541f = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    private static final d f153542i = new b();

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a.b.b f153543g;

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a f153544h;

    public static final class a {
        static {
            Covode.recordClassIndex(102369);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(102368);
    }

    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f153545a = n.b("52310", "42494", "22435", "52308", "22428", "29412", "23202", "85256", "51522", "51092", "45973", "40781");

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f153546b = n.b("52352", "42504", "50593", "249501", "22146", "166469", "221655", "234650", "240739", "203226");

        static {
            Covode.recordClassIndex(102370);
        }

        b() {
        }

        private static boolean b(String str) {
            l.c(str, "");
            d.a.e.b.a("EffectDiskLruCache", "cleaneffect: isCountry:" + str + " now:" + e.f153539d);
            if (u.a(str) || !l.a((Object) str, (Object) e.f153539d.f156544a)) {
                return false;
            }
            return true;
        }

        @Override // com.ss.ugc.effectplatform.b.a.d
        public final boolean a(String str) {
            l.c(str, "");
            if (u.a(str)) {
                return false;
            }
            d.a.e.b.a("EffectDiskLruCache", "cleaneffect: allowlist：".concat(String.valueOf(str)));
            V v = e.f153538c.f156544a;
            if (v != null) {
                String b2 = v.b(str, "");
                if (b("BR") && this.f153545a.contains(b2)) {
                    d.a.e.b.a("EffectDiskLruCache", "cleaneffect: allowlist：BR, key: ".concat(String.valueOf(str)));
                    return true;
                } else if (!b("RU") || !this.f153546b.contains(b2)) {
                    V v2 = e.f153540e.f156544a;
                    if (v2 != null && v2.contains(str)) {
                        d.a.e.b.a("EffectDiskLruCache", "cleaneffect: allowlist：draft, key: ".concat(String.valueOf(str)));
                        return true;
                    }
                } else {
                    d.a.e.b.a("EffectDiskLruCache", "cleaneffect: allowlist：RU, key: ".concat(String.valueOf(str)));
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.ss.ugc.effectplatform.b.c, com.ss.ugc.effectplatform.b.f
    public final void e() {
        super.e();
        d.a.b.a<c> aVar = f153538c;
        V v = aVar.f156544a;
        if (v != null) {
            v.a();
        }
        String str = "effectid_map";
        if (!u.a(m.a(this.f153544h))) {
            str = m.a(this.f153544h) + d.a.d.a.d.f156619a + str;
        }
        aVar.f156544a = (V) com.ss.ugc.effectplatform.k.b.a(str, this.f153544h.C);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(com.ss.ugc.effectplatform.a aVar) {
        super(aVar.f153409i, 0, 0, aVar.I, f153542i, 6);
        l.c(aVar, "");
        this.f153544h = aVar;
        String str = "effectid_map";
        f153538c.f156544a = (V) com.ss.ugc.effectplatform.k.b.a(!u.a(m.a(aVar)) ? m.a(aVar) + d.a.d.a.d.f156619a + str : str, aVar.C);
        f153539d.f156544a = (V) aVar.f153410j;
        f153540e.f156544a = (V) aVar.B;
        this.f153543g = aVar.q;
    }

    public final boolean a(String str, Effect effect) {
        String a2;
        boolean z;
        ArrayList arrayList;
        Integer num;
        l.c(str, "");
        l.c(effect, "");
        String unzipPath = effect.getUnzipPath();
        if (unzipPath == null || (a2 = k.a(effect.getUnzipPath(), "_tmp")) == null) {
            return false;
        }
        try {
            d.a.d.a.d.g(a2);
            V v = this.f153544h.t.f156544a;
            if (v == null) {
                z = d.a.d.a.d.b(str, a2);
            } else if (v.a() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                V v2 = this.f153544h.s.f156544a;
                if (v2 != null) {
                    com.ss.ugc.effectplatform.i.b.a((com.ss.ugc.effectplatform.i.a) v2, false, this.f153544h, effect, "unzip failed!");
                }
                k.c(a2);
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = s.a(a2) + "effect_platform_children.tag";
            try {
                List<String> b2 = d.a.d.a.d.b(a2);
                if (b2 != null) {
                    ArrayList arrayList2 = new ArrayList(n.a((Iterable) b2, 10));
                    Iterator<T> it = b2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(p.a((String) it.next(), (CharSequence) a2));
                    }
                    arrayList = arrayList2;
                    if (arrayList != null) {
                        String a3 = n.a(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 63);
                        d.a.d.a.b bVar = d.a.d.a.b.Utf8;
                        l.c(str2, "");
                        l.c(a3, "");
                        l.c(bVar, "");
                        d.a.d.a.d.a(str2, a3, bVar);
                    }
                } else {
                    arrayList = null;
                }
                StringBuilder append = new StringBuilder("write effect: ").append(effect.getEffect_id()).append(" children count: ");
                if (arrayList != null) {
                    num = Integer.valueOf(arrayList.size());
                } else {
                    num = null;
                }
                d.a.e.b.a("writeEffect", append.append(num).append(" time cost: ").append(System.currentTimeMillis() - currentTimeMillis).append(" ms").toString());
            } catch (Exception e2) {
                d.a.e.b.a("writeEffect", "write effect: " + effect.getEffect_id() + " children tag file failed!", e2);
                d.a.d.a.d.g(str2);
            }
            boolean a4 = k.a(a2, unzipPath, true);
            if (!a4) {
                V v3 = this.f153544h.s.f156544a;
                if (v3 != null) {
                    com.ss.ugc.effectplatform.i.b.a((com.ss.ugc.effectplatform.i.a) v3, false, this.f153544h, effect, "unzip failed!");
                }
                k.c(a2);
                return a4;
            }
            String d2 = d.a.d.a.d.d(unzipPath);
            if (d2 != null) {
                com.ss.ugc.effectplatform.b.a.a c2 = c();
                if (c2 != null) {
                    c2.a(a.C4084a.a(d2));
                }
                d(effect.getId() + ".zip");
                V v4 = f153538c.f156544a;
                if (v4 != null) {
                    v4.a(effect.getId(), effect.getEffect_id());
                }
            }
            V v5 = this.f153544h.s.f156544a;
            if (v5 != null) {
                com.ss.ugc.effectplatform.i.b.a(v5, this.f153544h, effect);
            }
            return a4;
        } catch (Exception e3) {
            d.a.e.b.a("EffectDiskLruCache", "fetch effect: " + effect.getEffect_id() + ", name: " + effect.getName() + " unzip failed!", e3);
            k.c(a2);
            String d3 = d.a.d.a.d.d(unzipPath);
            if (d3 != null) {
                d(d3);
            }
            k.c(unzipPath);
            V v6 = this.f153544h.s.f156544a;
            if (v6 != null) {
                com.ss.ugc.effectplatform.i.b.a((com.ss.ugc.effectplatform.i.a) v6, false, this.f153544h, effect, e3.getMessage());
            }
            throw e3;
        }
    }

    public final String a(Effect effect, d.a.d.a.c cVar, String str, long j2, h.f.a.m<? super Integer, ? super Long, z> mVar) {
        V v;
        l.c(effect, "");
        l.c(cVar, "");
        String a2 = a.C4084a.a(effect.getId() + ".zip");
        try {
            h.p<String, Boolean> a3 = a(a2, cVar, str, j2, mVar);
            if (a3.getSecond().booleanValue() && (v = f153538c.f156544a) != null) {
                v.a(effect.getId(), effect.getEffect_id());
            }
            d.a.e.b.a("EffectDiskLruCache", "effect " + effect.getEffect_id() + ", name: " + effect.getName() + ", key: " + a2 + " end in disklrucache, result: " + a3.getSecond().booleanValue());
            return a3.getFirst();
        } catch (Exception e2) {
            d.a.e.b.a("EffectDiskLruCache", "fetch effect: " + effect.getEffect_id() + ", name: " + effect.getName() + " key: " + a2 + " write to disk failed!", e2);
            if (!(e2 instanceof com.ss.ugc.effectplatform.f.a)) {
                d(a2);
            }
            throw e2;
        }
    }
}
