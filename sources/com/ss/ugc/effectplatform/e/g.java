package com.ss.ugc.effectplatform.e;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.a.b;
import com.ss.ugc.effectplatform.b.d;
import com.ss.ugc.effectplatform.b.e;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.util.k;
import h.f.b.l;
import java.util.HashMap;

public final class g implements i {

    /* renamed from: a  reason: collision with root package name */
    public b f153594a;

    /* renamed from: b  reason: collision with root package name */
    public final a f153595b;

    /* renamed from: c  reason: collision with root package name */
    private final Effect f153596c;

    static {
        Covode.recordClassIndex(102390);
    }

    @Override // com.ss.ugc.effectplatform.e.i
    public final boolean a(String str) {
        boolean z;
        V v;
        String str2 = "";
        l.c(str, str2);
        String b2 = k.b(str);
        if (b2 == null) {
            return false;
        }
        String str3 = this.f153594a.f153429c;
        if (!(str3 == null || !(!l.a((Object) str3, (Object) b2)) || (v = this.f153595b.s.f156544a) == null)) {
            HashMap hashMap = new HashMap();
            String str4 = this.f153595b.f153411k;
            if (str4 == null) {
                str4 = str2;
            }
            hashMap.put("app_id", str4);
            String str5 = this.f153595b.f153402b;
            if (str5 != null) {
                str2 = str5;
            }
            hashMap.put("access_key", str2);
            hashMap.put("effect_id", this.f153596c.getEffect_id());
            hashMap.put("EffectDir", str3);
            hashMap.put("zippath", b2);
            v.monitorStatusRate("effect_download_error", 1, hashMap);
        }
        f a2 = d.a(b2);
        if (a2 instanceof e) {
            d.a.e.b.a("EffectUnZipper", "fetchEffect " + this.f153596c.getEffect_id() + ", name: " + this.f153596c.getName() + " unzip in EffectDiskLruCache");
            return ((e) a2).a(str, this.f153596c);
        }
        d.a.e.b.a("EffectUnZipper", "fetchEffect " + this.f153596c.getEffect_id() + ", name: " + this.f153596c.getName() + " unzip in old cache");
        String unzipPath = this.f153596c.getUnzipPath();
        String a3 = k.a(this.f153596c.getUnzipPath(), "_tmp");
        if (a3 == null) {
            return false;
        }
        try {
            d.a.d.a.d.g(a3);
            V v2 = this.f153595b.t.f156544a;
            if (v2 == null) {
                d.a.d.a.d.b(str, a3);
                z = k.a(a3, unzipPath, true);
            } else if (v2.a() != 0 || !k.a(a3, unzipPath, true)) {
                z = false;
            } else {
                z = true;
            }
            d.a.d.a.d.g(str);
            if (!z) {
                d.a.d.a.d.g(a3);
                d.a.d.a.d.g(unzipPath);
                V v3 = this.f153595b.s.f156544a;
                if (v3 != null) {
                    com.ss.ugc.effectplatform.i.b.a((com.ss.ugc.effectplatform.i.a) v3, false, this.f153595b, this.f153596c, "unzip failed!");
                }
            } else {
                V v4 = this.f153595b.s.f156544a;
                if (v4 != null) {
                    com.ss.ugc.effectplatform.i.b.a(v4, this.f153595b, this.f153596c);
                }
            }
            return z;
        } catch (Exception e2) {
            d.a.e.b.a("EffectUnZipper", "fetch effect: " + this.f153596c.getEffect_id() + ", name: " + this.f153596c.getName() + " unzip failed!", e2);
            d.a.d.a.d.g(a3);
            d.a.d.a.d.g(unzipPath);
            V v5 = this.f153595b.s.f156544a;
            if (v5 != null) {
                com.ss.ugc.effectplatform.i.b.a((com.ss.ugc.effectplatform.i.a) v5, false, this.f153595b, this.f153596c, e2.getMessage());
            }
            throw e2;
        }
    }

    public g(b bVar, a aVar) {
        l.c(bVar, "");
        l.c(aVar, "");
        this.f153594a = bVar;
        this.f153595b = aVar;
        this.f153596c = bVar.f153427a;
    }
}
