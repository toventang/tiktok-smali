package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.net.EffectNetListResponse;
import com.ss.ugc.effectplatform.util.i;
import com.ss.ugc.effectplatform.util.p;
import h.a.ag;
import h.f.b.g;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;
import java.util.HashMap;
import java.util.Map;

public final class FetchPanelEffectListTask extends a<EffectChannelModel, EffectNetListResponse> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f153678f = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    private static final String f153679i = f153679i;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153680c;

    /* renamed from: d  reason: collision with root package name */
    public final String f153681d;

    /* renamed from: g  reason: collision with root package name */
    private final String f153682g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, String> f153683h = null;

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final int e() {
        return 10002;
    }

    public static final class Version {
        private String version;

        static {
            Covode.recordClassIndex(102527);
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
            Covode.recordClassIndex(102528);
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
        return this.f153680c.n;
    }

    static {
        Covode.recordClassIndex(102526);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ EffectChannelResponse $channelResponse;
        final /* synthetic */ FetchPanelEffectListTask this$0;

        static {
            Covode.recordClassIndex(102529);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FetchPanelEffectListTask fetchPanelEffectListTask, EffectChannelResponse effectChannelResponse) {
            super(0);
            this.this$0 = fetchPanelEffectListTask;
            this.$channelResponse = effectChannelResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            e a2 = this.this$0.f153680c.K.a(this.this$0.f153681d);
            if (a2 != null) {
                a2.onSuccess(this.$channelResponse);
            }
            this.this$0.f153680c.K.b(this.this$0.f153681d);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final com.ss.ugc.effectplatform.a.c.e c() {
        HashMap<String, String> a2 = i.a(this.f153680c, true);
        a2.put("panel", this.f153682g);
        Map<String, String> map = this.f153683h;
        if (map != null) {
            a2.putAll(map);
        }
        return new com.ss.ugc.effectplatform.a.c.e(p.a(a2, this.f153680c.A + this.f153680c.f153401a + "/v3/effects"), c.GET, null, null, false, 60);
    }

    private final long a(EffectChannelModel effectChannelModel) {
        String convertObjToJson;
        f fVar;
        String convertObjToJson2;
        long j2;
        long j3 = 0;
        if (effectChannelModel == null) {
            return 0;
        }
        String a2 = com.ss.ugc.effectplatform.util.g.a(this.f153680c.f153406f, this.f153682g);
        try {
            com.ss.ugc.effectplatform.a.b.b bVar = this.f153680c.q;
            if (!(bVar == null || (convertObjToJson2 = bVar.f153430a.convertObjToJson(effectChannelModel)) == null)) {
                f fVar2 = (f) d.a.b.b.a(this.f153680c.w);
                if (fVar2 != null) {
                    j2 = fVar2.a(a2, convertObjToJson2);
                } else {
                    j2 = 0;
                }
                j3 = j2 / ((long) com.ss.ugc.effectplatform.c.a.f153563a);
            }
        } catch (Exception e2) {
            d.a.e.b.a(f153679i, "Exception: ".concat(String.valueOf(e2)), null);
        }
        try {
            Version version = new Version(effectChannelModel.getVersion());
            com.ss.ugc.effectplatform.a.b.b bVar2 = this.f153680c.q;
            if (!(bVar2 == null || (convertObjToJson = bVar2.f153430a.convertObjToJson(version)) == null || (fVar = (f) d.a.b.b.a(this.f153680c.w)) == null)) {
                fVar.a("effect_version" + this.f153682g, convertObjToJson);
            }
        } catch (Exception e3) {
            d.a.e.b.a("FetchPanelInfoTask", "Json Exception: ".concat(String.valueOf(e3)), null);
        }
        return j3;
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ EffectNetListResponse a(com.ss.ugc.effectplatform.a.b.b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (EffectNetListResponse) bVar.f153430a.convertJsonToObj(str, EffectNetListResponse.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final void a(String str, String str2, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        eVar.a(str, this.f153680c.A, str2);
        super.a(str, str2, eVar);
        V v = this.f153680c.s.f156544a;
        if (v != null) {
            com.ss.ugc.effectplatform.a aVar = this.f153680c;
            String str3 = this.f153682g;
            h.p[] pVarArr = new h.p[2];
            pVarArr[0] = v.a("error_code", Integer.valueOf(eVar.f153651a));
            if (str2 == null) {
                str2 = "";
            }
            pVarArr[1] = v.a("host_ip", str2);
            com.ss.ugc.effectplatform.i.b.b(v, false, aVar, str3, ag.a(pVarArr), eVar.f153652b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchPanelEffectListTask(com.ss.ugc.effectplatform.a aVar, String str, Map<String, String> map, String str2) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str2);
        l.c(aVar, "");
        l.c(str, "");
        l.c(str2, "");
        this.f153680c = aVar;
        this.f153682g = str;
        this.f153681d = str2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ void a(long j2, long j3, long j4, EffectNetListResponse effectNetListResponse) {
        EffectNetListResponse effectNetListResponse2 = effectNetListResponse;
        l.c(effectNetListResponse2, "");
        EffectChannelModel data = effectNetListResponse2.getData();
        if (data != null) {
            EffectChannelResponse a2 = new com.ss.ugc.effectplatform.model.a.a(this.f153682g, this.f153680c.f153409i, false).a(data);
            long a3 = a(data);
            a(new b(this, a2));
            long currentTimeMillis = System.currentTimeMillis();
            V v = this.f153680c.s.f156544a;
            if (v != null) {
                com.ss.ugc.effectplatform.i.b.b(v, true, this.f153680c, this.f153682g, ag.a(v.a("duration", Long.valueOf(currentTimeMillis - j2)), v.a("network_time", Long.valueOf(j3 - j2)), v.a("json_time", Long.valueOf(j4 - j3)), v.a("io_time", Long.valueOf(currentTimeMillis - j4)), v.a("size", Long.valueOf(a3))), "");
            }
        }
    }
}
