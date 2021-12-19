package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.b.c;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.e.d;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.UrlModel;
import com.ss.ugc.effectplatform.model.e;
import com.ss.ugc.effectplatform.util.EffectUtilKt;
import com.ss.ugc.effectplatform.util.j;
import com.ss.ugc.effectplatform.util.o;
import com.ss.ugc.effectplatform.util.u;
import h.a.ag;
import h.f.b.l;
import h.f.b.z;
import h.p;
import h.v;
import java.util.List;
import java.util.Map;

public final class k extends aj<com.ss.ugc.effectplatform.task.c.a> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f153851e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public d.a.b.a<Long> f153852a = new d.a.b.a<>(0L);

    /* renamed from: b  reason: collision with root package name */
    public d.a.b.a<Long> f153853b = new d.a.b.a<>(0L);

    /* renamed from: c  reason: collision with root package name */
    public d.a.b.a<Long> f153854c = new d.a.b.a<>(0L);

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a.b f153855d;

    /* renamed from: g  reason: collision with root package name */
    private d.a.b.a<String> f153856g = new d.a.b.a<>(null);

    /* renamed from: h  reason: collision with root package name */
    private final Effect f153857h;

    /* renamed from: i  reason: collision with root package name */
    private final d f153858i;

    /* renamed from: j  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a f153859j;

    static {
        Covode.recordClassIndex(102615);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102616);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.ugc.effectplatform.task.aj
    public final void a() {
        Long valueOf;
        if (u.a(this.f153857h.getZipPath()) || u.a(this.f153857h.getUnzipPath())) {
            this.f153857h.setZipPath(this.f153855d.f153429c + d.a.d.a.d.f156619a + this.f153857h.getId() + ".zip");
            this.f153857h.setUnzipPath(this.f153855d.f153429c + d.a.d.a.d.f156619a + this.f153857h.getId());
        }
        UrlModel trans_file_url = this.f153857h.getTrans_file_url();
        if (trans_file_url == null || trans_file_url.getUri() == null) {
            com.ss.ugc.effectplatform.l.a.a(this.f153859j.f153409i, this.f153857h);
        } else {
            try {
                new j(this.f153859j, this.f153855d.f153429c, this.f153857h).a();
                d.a.e.b.a("EffectFetcherTask", "fetchEffect: " + this.f153857h.getEffect_id() + " name: " + this.f153857h.getName() + " download trans res success, " + this.f153857h.getTransResPath());
            } catch (Exception e2) {
                d.a.e.b.a("EffectFetcherTask", "fetchEffect: " + this.f153857h.getEffect_id() + " name: " + this.f153857h.getName() + " download trans res failed, " + this.f153857h.getTransResPath(), null);
                a((aj) this, new e(10019, e2));
                return;
            }
        }
        if (!d.a.d.a.d.f(this.f153857h.getUnzipPath()) || !EffectUtilKt.a(this.f153857h.getUnzipPath())) {
            a(this);
            d.a.e.b.a("EffectFetcherTask", "download effect: " + this.f153857h.getEffect_id() + ", name: " + this.f153857h.getName() + ", uri: " + this.f153857h.getFile_url().getUri() + " start");
            z.e eVar = new z.e();
            eVar.element = null;
            if (!o.a(this.f153859j.C)) {
                a((aj) this, new e(10011));
                return;
            }
            List<String> list = this.f153855d.f153428b;
            int i2 = 0;
            if (list == null || list.isEmpty() || j.a(this.f153857h.getFile_url())) {
                a((aj) this, new e(10003));
                return;
            }
            int size = list.size();
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (this.f153774f) {
                    a((aj) this, new e(10001));
                    return;
                } else {
                    try {
                        this.f153856g.f156544a = (V) list.get(i2);
                        V v = this.f153856g.f156544a;
                        if (v == null) {
                            break;
                        }
                        d dVar = this.f153858i;
                        if (!(dVar == null || (valueOf = Long.valueOf(dVar.a(v, new b(this, eVar)))) == null || valueOf.longValue() <= 0)) {
                            a((aj<com.ss.ugc.effectplatform.task.c.a>) this, new com.ss.ugc.effectplatform.task.c.a(this.f153857h));
                            return;
                        }
                        i2++;
                    } catch (Exception e3) {
                        d.a.e.b.a("EffectFetcherTask", "download: " + this.f153857h.getEffect_id() + ", name: " + this.f153857h.getName() + " failed, count: " + i2, e3);
                        if (i2 == list.size() - 1) {
                            e eVar2 = new e(e3);
                            eVar2.a(this.f153856g.f156544a, "", "");
                            if (!(e3 instanceof com.ss.ugc.effectplatform.f.a)) {
                                String b2 = com.ss.ugc.effectplatform.util.k.b(this.f153857h.getZipPath());
                                if (b2 != null) {
                                    f a2 = com.ss.ugc.effectplatform.b.d.a(b2);
                                    if (a2 instanceof com.ss.ugc.effectplatform.b.e) {
                                        c cVar = (c) a2;
                                        Effect effect = this.f153857h;
                                        l.c(effect, "");
                                        cVar.d(effect.getId() + ".zip");
                                        String unzipPath = effect.getUnzipPath();
                                        if (unzipPath != null) {
                                            try {
                                                String d2 = d.a.d.a.d.d(unzipPath);
                                                if (d2 != null) {
                                                    cVar.d(d2);
                                                }
                                                d.a.d.a.d.g(unzipPath);
                                            } catch (Exception e4) {
                                                d.a.e.b.a("EffectDiskLruCache", "remove effect failed! " + e4.getMessage(), null);
                                            }
                                        }
                                    } else {
                                        d.a.d.a.d.g(this.f153857h.getUnzipPath());
                                        d.a.d.a.d.g(this.f153857h.getZipPath());
                                    }
                                }
                            } else {
                                eVar2.f153652b = "editor in currently editing!";
                            }
                            a((aj) this, eVar2);
                            return;
                        }
                    }
                }
            }
            a((aj) this, new e(eVar.element));
            return;
        }
        d.a.e.b.a("EffectFetcherTask", "fetchEffect: " + this.f153857h.getEffect_id() + " name: " + this.f153857h.getName() + " already exists!");
        a((aj<com.ss.ugc.effectplatform.task.c.a>) this, new com.ss.ugc.effectplatform.task.c.a(this.f153857h));
    }

    public static final class b implements com.ss.ugc.effectplatform.e.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f153860a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f153861b;

        static {
            Covode.recordClassIndex(102617);
        }

        @Override // com.ss.ugc.effectplatform.e.c
        public final void a(com.ss.ugc.effectplatform.e.e eVar) {
            l.c(eVar, "");
            if (eVar.a()) {
                this.f153860a.f153853b.f156544a = (V) Long.valueOf(eVar.f153590d);
                this.f153860a.f153852a.f156544a = (V) Long.valueOf(eVar.f153587a);
                this.f153860a.f153854c.f156544a = (V) Long.valueOf(eVar.f153591e);
                return;
            }
            this.f153861b.element = (T) eVar.f153592f;
        }

        b(k kVar, z.e eVar) {
            this.f153860a = kVar;
            this.f153861b = eVar;
        }

        @Override // com.ss.ugc.effectplatform.e.c
        public final void a(int i2, long j2) {
            k kVar = this.f153860a;
            kVar.a(kVar, i2, j2);
        }
    }

    private static boolean a(Effect effect, e eVar) {
        if (eVar.f153651a == 10001) {
            return false;
        }
        if (effect != null && eVar.f153651a == 10003 && effect.getEffect_type() == 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void a(aj<com.ss.ugc.effectplatform.task.c.a> ajVar, com.ss.ugc.effectplatform.task.c.a aVar) {
        String str = "";
        l.c(ajVar, str);
        l.c(aVar, str);
        super.a((aj) ajVar, (Object) aVar);
        d.a.e.b.a("EffectFetcherTask", "download effect: " + this.f153857h.getEffect_id() + ", name: " + this.f153857h.getName() + " success");
        V v = this.f153859j.s.f156544a;
        if (v != null) {
            com.ss.ugc.effectplatform.a aVar2 = this.f153859j;
            String effect_id = this.f153857h.getEffect_id();
            p[] pVarArr = new p[4];
            pVarArr[0] = v.a("duration", this.f153852a.f156544a);
            pVarArr[1] = v.a("unzip_time", this.f153853b.f156544a);
            pVarArr[2] = v.a("size", this.f153854c.f156544a);
            V v2 = this.f153856g.f156544a;
            if (v2 != null) {
                str = v2;
            }
            pVarArr[3] = v.a("download_url", str);
            com.ss.ugc.effectplatform.i.b.b(v, aVar2, effect_id, ag.a(pVarArr));
        }
    }

    @Override // com.ss.ugc.effectplatform.task.aj
    public final void a(aj<com.ss.ugc.effectplatform.task.c.a> ajVar, e eVar) {
        V v;
        String str = "";
        l.c(ajVar, str);
        l.c(eVar, str);
        d.a.e.b.a("EffectFetcherTask", "download effect: " + this.f153857h.getEffect_id() + ", name: " + this.f153857h.getName() + " failed!, error msg: " + eVar.f153652b + ", error code: " + eVar.f153651a, null);
        super.a((aj) ajVar, eVar);
        if (a(this.f153857h, eVar) && (v = this.f153859j.s.f156544a) != null) {
            com.ss.ugc.effectplatform.a aVar = this.f153859j;
            String effect_id = this.f153857h.getEffect_id();
            p[] pVarArr = new p[2];
            pVarArr[0] = v.a("error_code", Integer.valueOf(eVar.f153651a));
            String str2 = this.f153856g.f156544a;
            if (str2 == null) {
                str2 = str;
            }
            pVarArr[1] = v.a("download_url", str2);
            Map a2 = ag.a(pVarArr);
            String str3 = eVar.f153652b;
            if (str3 != null) {
                str = str3;
            }
            com.ss.ugc.effectplatform.i.b.c(v, false, aVar, effect_id, a2, str);
        }
    }

    public k(com.ss.ugc.effectplatform.a.b bVar, d dVar, com.ss.ugc.effectplatform.a aVar) {
        l.c(bVar, "");
        l.c(aVar, "");
        this.f153855d = bVar;
        this.f153858i = dVar;
        this.f153859j = aVar;
        this.f153857h = bVar.f153427a;
    }
}
