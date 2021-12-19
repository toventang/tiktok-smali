package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.net.PanelInfoResponse;
import com.ss.ugc.effectplatform.util.i;
import com.ss.ugc.effectplatform.util.j;
import com.ss.ugc.effectplatform.util.p;
import h.a.ag;
import h.f.b.g;
import h.f.b.l;
import h.v;
import java.util.HashMap;
import java.util.Map;

public final class FetchPanelInfoTask extends a<PanelInfoModel, PanelInfoResponse> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f153684c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private d.a.b.a<Long> f153685d = new d.a.b.a<>(0L);

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a f153686f;

    /* renamed from: g  reason: collision with root package name */
    private final String f153687g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f153688h;

    /* renamed from: i  reason: collision with root package name */
    private final String f153689i;

    /* renamed from: j  reason: collision with root package name */
    private final int f153690j;

    /* renamed from: k  reason: collision with root package name */
    private final int f153691k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, String> f153692l = null;

    static {
        Covode.recordClassIndex(102530);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final int e() {
        return 10002;
    }

    public static final class Version {
        private String version;

        static {
            Covode.recordClassIndex(102531);
        }

        public Version() {
            this(null, 1, null);
        }

        public static /* synthetic */ Version copy$default(Version version2, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = version2.version;
            }
            return version2.copy(str);
        }

        public final String component1() {
            return this.version;
        }

        public final Version copy(String str) {
            return new Version(str);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Version) && l.a(this.version, ((Version) obj).version);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.version;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Version(version=" + this.version + ")";
        }

        public final String getVersion() {
            return this.version;
        }

        public final void setVersion(String str) {
            this.version = str;
        }

        public Version(String str) {
            this.version = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Version(String str, int i2, g gVar) {
            this((i2 & 1) != 0 ? "0" : str);
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102532);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final int d() {
        return this.f153686f.n;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final e c() {
        String str;
        HashMap<String, String> a2 = i.a(this.f153686f, true);
        a2.put("panel", this.f153687g);
        if (this.f153688h) {
            a2.put("has_category_effects", "true");
            String str2 = this.f153689i;
            if (str2 == null) {
                str2 = "default";
            }
            a2.put("category", str2);
            a2.put("cursor", String.valueOf(this.f153691k));
            a2.put("count", String.valueOf(this.f153690j));
        }
        String str3 = this.f153686f.y;
        if (str3 != null) {
            a2.put("test_status", str3);
        }
        Map<String, String> map = this.f153692l;
        if (map != null) {
            a2.putAll(map);
        }
        c cVar = c.GET;
        StringBuilder append = new StringBuilder().append(this.f153686f.A).append(this.f153686f.f153401a);
        if (this.f153686f.p == 2) {
            str = "/panel/info/v2";
        } else {
            str = "/panel/info";
        }
        return new e(p.a(a2, append.append(str).toString()), cVar, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ PanelInfoResponse a(b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (PanelInfoResponse) bVar.f153430a.convertJsonToObj(str, PanelInfoResponse.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final void a(String str, String str2, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        d.a.e.b.a("FetchPanelInfoTask", "Failed: ".concat(String.valueOf(eVar)), null);
        eVar.a(str, this.f153686f.A, str2);
        super.a(str, str2, eVar);
        V v = this.f153686f.s.f156544a;
        if (v != null) {
            com.ss.ugc.effectplatform.a aVar = this.f153686f;
            String str3 = this.f153687g;
            h.p[] pVarArr = new h.p[3];
            pVarArr[0] = v.a("error_code", Integer.valueOf(eVar.f153651a));
            if (str2 == null) {
                str2 = "";
            }
            pVarArr[1] = v.a("host_ip", str2);
            if (str == null) {
                str = "";
            }
            pVarArr[2] = v.a("download_url", str);
            com.ss.ugc.effectplatform.i.b.a(v, false, aVar, str3, ag.a(pVarArr), eVar.f153652b);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ void a(long j2, long j3, long j4, PanelInfoResponse panelInfoResponse) {
        String str;
        String convertObjToJson;
        f fVar;
        String convertObjToJson2;
        long j5;
        PanelInfoResponse panelInfoResponse2 = panelInfoResponse;
        l.c(panelInfoResponse2, "");
        PanelInfoModel data = panelInfoResponse2.getData();
        if (data != null) {
            CategoryEffectModel category_effects = data.getCategory_effects();
            if (category_effects != null) {
                j.a(this.f153686f.f153409i, this.f153687g, category_effects.getCategory_effects());
                j.a(this.f153686f.f153409i, this.f153687g, category_effects.getCollection());
                j.a(this.f153686f.f153409i, this.f153687g, category_effects.getBind_effects());
                if (this.f153686f.p == 2) {
                    j.a(data.getUrl_prefix(), category_effects.getCategory_effects());
                    j.a(data.getUrl_prefix(), category_effects.getCollection());
                    j.a(data.getUrl_prefix(), category_effects.getBind_effects());
                }
            }
            String a2 = com.ss.ugc.effectplatform.util.g.a(this.f153686f.f153406f, this.f153687g, this.f153688h, this.f153689i, this.f153691k, this.f153690j);
            try {
                b bVar = this.f153686f.q;
                if (!(bVar == null || (convertObjToJson2 = bVar.f153430a.convertObjToJson(panelInfoResponse2)) == null)) {
                    d.a.b.a<Long> aVar = this.f153685d;
                    f fVar2 = (f) d.a.b.b.a(this.f153686f.w);
                    if (fVar2 != null) {
                        j5 = fVar2.a(a2, convertObjToJson2);
                    } else {
                        j5 = 0;
                    }
                    d.a.b.b.a(aVar, Long.valueOf(j5 / ((long) com.ss.ugc.effectplatform.c.a.f153563a)));
                }
            } catch (Exception e2) {
                d.a.e.b.a("NewFetchPanelInfoTask", "Exception: ".concat(String.valueOf(e2)), null);
            }
            try {
                PanelInfoModel responseData = panelInfoResponse2.getResponseData();
                if (responseData != null) {
                    str = responseData.getVersion();
                } else {
                    str = null;
                }
                Version version = new Version(str);
                b bVar2 = this.f153686f.q;
                if (!(bVar2 == null || (convertObjToJson = bVar2.f153430a.convertObjToJson(version)) == null || (fVar = (f) d.a.b.b.a(this.f153686f.w)) == null)) {
                    fVar.a(com.ss.ugc.effectplatform.util.g.a(this.f153687g), convertObjToJson);
                }
            } catch (Exception e3) {
                d.a.e.b.a("FetchPanelInfoTask", "Json Exception: ".concat(String.valueOf(e3)), null);
            }
            super.a(j2, j3, j4, panelInfoResponse2);
            long currentTimeMillis = System.currentTimeMillis();
            V v = this.f153686f.s.f156544a;
            if (v != null) {
                com.ss.ugc.effectplatform.i.b.a(v, true, this.f153686f, this.f153687g, ag.a(v.a("duration", Long.valueOf(currentTimeMillis - j2)), v.a("network_time", Long.valueOf(j3 - j2)), v.a("json_time", Long.valueOf(j4 - j3)), v.a("io_time", Long.valueOf(currentTimeMillis - j4)), v.a("size", this.f153685d.f156544a)), "");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchPanelInfoTask(com.ss.ugc.effectplatform.a aVar, String str, String str2, boolean z, String str3, int i2, int i3, Map<String, String> map) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str2);
        l.c(aVar, "");
        l.c(str, "");
        l.c(str2, "");
        this.f153686f = aVar;
        this.f153687g = str;
        this.f153688h = z;
        this.f153689i = str3;
        this.f153690j = i2;
        this.f153691k = i3;
    }
}
