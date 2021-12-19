package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.model.CheckUpdateVersionModel;
import com.ss.ugc.effectplatform.model.net.EffectCheckUpdateResponse;
import com.ss.ugc.effectplatform.util.g;
import com.ss.ugc.effectplatform.util.i;
import com.ss.ugc.effectplatform.util.m;
import com.ss.ugc.effectplatform.util.p;
import com.ss.ugc.effectplatform.util.u;
import d.a.b.b;
import d.a.d.a.d;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class c extends a<Boolean, EffectCheckUpdateResponse> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f153802c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private d.a.b.a<String> f153803d = new d.a.b.a<>(null);

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a f153804f;

    /* renamed from: g  reason: collision with root package name */
    private final String f153805g;

    /* renamed from: h  reason: collision with root package name */
    private final String f153806h;

    /* renamed from: i  reason: collision with root package name */
    private final int f153807i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, String> f153808j;

    static {
        Covode.recordClassIndex(102584);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102585);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final boolean g() {
        String str;
        String str2;
        int i2 = this.f153807i;
        if (i2 == 0) {
            str = "effect_version" + this.f153805g;
        } else if (i2 == 1) {
            str = g.b(this.f153805g, this.f153806h);
        } else if (i2 == 2) {
            str = g.a(this.f153805g);
        } else if (i2 != 3) {
            str = "effect_version" + this.f153805g;
        } else {
            str = this.f153805g + d.f156619a + "info_sticker_version";
        }
        f fVar = (f) b.a(this.f153804f.w);
        if (fVar != null) {
            str2 = fVar.b(str);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return false;
        }
        try {
            com.ss.ugc.effectplatform.a.b.b bVar = this.f153804f.q;
            if (bVar != null) {
                CheckUpdateVersionModel checkUpdateVersionModel = (CheckUpdateVersionModel) bVar.f153430a.convertJsonToObj(str2, CheckUpdateVersionModel.class);
                if (checkUpdateVersionModel != null) {
                    b.a(this.f153803d, checkUpdateVersionModel.getVersion());
                    return true;
                }
            }
        } catch (Exception e2) {
            d.a.e.b.a("CheckUpdateTask", "Json Parse Exception: ".concat(String.valueOf(e2)), null);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a, com.ss.ugc.effectplatform.task.b
    public final void a() {
        com.ss.ugc.effectplatform.a.c.f fetchFromNetwork;
        if (!g()) {
            a(0, 0, 0, new EffectCheckUpdateResponse(true, null, 0, 6, null));
        } else if (!this.f153790e) {
            try {
                e c2 = c();
                V v = this.f153804f.r.f156544a;
                if (!(v == null || (fetchFromNetwork = v.fetchFromNetwork(c2)) == null)) {
                    String a2 = com.ss.ugc.effectplatform.g.c.a(fetchFromNetwork.f153441b);
                    if (!u.a(a2) && this.f153804f.q != null) {
                        com.ss.ugc.effectplatform.a.b.b bVar = this.f153804f.q;
                        if (bVar != null) {
                            EffectCheckUpdateResponse b2 = b(bVar, a2);
                            if (b2 != null) {
                                a(0, 0, 0, b2);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                a(null, null, new com.ss.ugc.effectplatform.model.e(10002));
            } catch (Exception e2) {
                a(null, null, new com.ss.ugc.effectplatform.model.e(e2));
                d.a.e.b.a("CheckUpdateTask", "checkUpdate Failed: ".concat(String.valueOf(e2)), null);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final e c() {
        String str;
        if (u.a(m.a(this.f153804f))) {
            str = "version";
        } else {
            str = m.a(this.f153804f) + d.f156619a + "version";
        }
        com.ss.ugc.effectplatform.k.c a2 = com.ss.ugc.effectplatform.k.b.a(str, this.f153804f.C);
        String str2 = "";
        boolean z = !l.a((Object) a2.b("app_version", str2), (Object) this.f153804f.f153404d);
        if (z) {
            String str3 = this.f153804f.f153404d;
            if (str3 == null) {
                str3 = str2;
            }
            a2.a("app_version", str3);
        }
        HashMap a3 = i.a(this.f153804f);
        String str4 = this.f153805g;
        if (str4 == null) {
            str4 = str2;
        }
        a3.put("panel", str4);
        int i2 = this.f153807i;
        String str5 = "/panel/check";
        if (i2 != 0) {
            if (i2 == 1) {
                String str6 = this.f153806h;
                if (str6 == null) {
                    str6 = str2;
                }
                a3.put("category", str6);
                str5 = "/category/check";
            } else if (i2 != 2 && i2 == 3) {
                str5 = "/sticker/checkUpdate";
            }
        }
        if (z) {
            a3.put("version", str2);
        } else {
            V v = this.f153803d.f156544a;
            if (v != null) {
                str2 = v;
            }
            a3.put("version", str2);
        }
        Map<String, String> map = this.f153808j;
        if (map != null) {
            a3.putAll(map);
        }
        String str7 = this.f153804f.y;
        if (str7 != null) {
            a3.put("test_status", str7);
        }
        return new e(p.a(a3, this.f153804f.A + this.f153804f.f153401a + str5), com.ss.ugc.effectplatform.a.c.c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ EffectCheckUpdateResponse a(com.ss.ugc.effectplatform.a.b.b bVar, String str) {
        return b(bVar, str);
    }

    private static EffectCheckUpdateResponse b(com.ss.ugc.effectplatform.a.b.b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (EffectCheckUpdateResponse) bVar.f153430a.convertJsonToObj(str, EffectCheckUpdateResponse.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.ss.ugc.effectplatform.a aVar, String str, String str2, String str3, int i2, Map<String, String> map) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str);
        l.c(aVar, "");
        l.c(str, "");
        this.f153804f = aVar;
        this.f153805g = str2;
        this.f153806h = str3;
        this.f153807i = i2;
        this.f153808j = map;
    }
}
