package com.ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.a.c;
import com.bytedance.ies.ugc.aweme.plugin.a.d;
import h.a.z;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class n {
    public static final a p = new a((byte) 0);

    /* renamed from: a */
    public boolean f62507a;

    /* renamed from: b */
    public com.bytedance.ies.ugc.aweme.plugin.a.a f62508b;

    /* renamed from: c */
    public d f62509c;

    /* renamed from: d */
    public int f62510d;

    /* renamed from: e */
    public b f62511e = b.UNKNOWN;

    /* renamed from: f */
    public long f62512f;

    /* renamed from: g */
    public long f62513g;

    /* renamed from: h */
    public long f62514h;

    /* renamed from: i */
    long f62515i;

    /* renamed from: j */
    public final long f62516j;

    /* renamed from: k */
    public com.bytedance.ies.ugc.aweme.plugin.c.b f62517k;

    /* renamed from: l */
    public final String f62518l;

    /* renamed from: m */
    public final String f62519m;
    public final boolean n;
    p o;

    static {
        Covode.recordClassIndex(38464);
    }

    /* access modifiers changed from: protected */
    public abstract void a(Map<String, String> map);

    public final void d() {
        a(this, 1);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38465);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.n$a$a */
        public static final class C1368a implements p {

            /* renamed from: a */
            final /* synthetic */ c f62520a;

            /* renamed from: b */
            final /* synthetic */ boolean f62521b;

            static {
                Covode.recordClassIndex(38466);
            }

            @Override // com.ss.android.ugc.aweme.aabplugin.core.base.p
            public final void a(String str) {
                com.bytedance.ies.ugc.aweme.plugin.c.a aVar = this.f62520a.f35084d;
                if (aVar != null) {
                    aVar.a(str, this.f62521b);
                }
            }

            public C1368a(c cVar, boolean z) {
                this.f62520a = cVar;
                this.f62521b = z;
            }

            @Override // com.ss.android.ugc.aweme.aabplugin.core.base.p
            public final void a(String str, int i2) {
                com.bytedance.ies.ugc.aweme.plugin.c.a aVar = this.f62520a.f35084d;
                if (aVar != null) {
                    aVar.a(str, i2);
                }
            }
        }
    }

    public final void a() {
        this.f62507a = true;
        this.f62508b.f35053a = false;
        this.f62510d = 0;
    }

    public enum b {
        UNKNOWN,
        TIMEOUT,
        PENDING,
        RUNNING,
        DOWNLOADED,
        SUCCEEDED,
        FAILED,
        CANCELED;

        static {
            Covode.recordClassIndex(38467);
        }

        public final boolean isFinished() {
            if (this == SUCCEEDED || this == FAILED || this == CANCELED || this == DOWNLOADED || this == UNKNOWN) {
                return true;
            }
            return false;
        }
    }

    public final Map<String, String> c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("task_type", String.valueOf(this.f62510d));
        a(linkedHashMap);
        return linkedHashMap;
    }

    public int hashCode() {
        return ((this.f62519m.hashCode() + 527) * 31) + this.f62518l.hashCode();
    }

    public boolean b() {
        List<String> list = this.f62508b.f35060h;
        if (list == null) {
            list = z.INSTANCE;
        }
        for (String str : list) {
            if (!o.a(str)) {
                return false;
            }
        }
        return true;
    }

    public final void a(long j2) {
        this.f62514h = j2;
        this.f62515i = j2 + System.currentTimeMillis();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return super.equals(obj);
        }
        n nVar = (n) obj;
        if (!l.a((Object) this.f62519m, (Object) nVar.f62519m) || !l.a((Object) this.f62518l, (Object) nVar.f62518l)) {
            return false;
        }
        return true;
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        this.f62511e = bVar;
    }

    public static /* synthetic */ void a(n nVar, int i2) {
        nVar.b(i2, nVar.f62507a);
    }

    public final void a(int i2, boolean z) {
        p pVar;
        com.ss.android.ugc.aweme.aabplugin.core.base.a.d.a(this, i2);
        if ((!z || this.f62508b.f35064l) && (pVar = this.o) != null) {
            pVar.a(this.f62519m, i2);
        }
    }

    private void b(int i2, boolean z) {
        p pVar;
        l.d(this, "");
        long currentTimeMillis = System.currentTimeMillis() - this.f62516j;
        try {
            JSONObject jSONObject = new JSONObject(c());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("reason", i2);
            jSONObject2.put("duration", currentTimeMillis);
            com.bytedance.apm.b.a("df_install_success", jSONObject, jSONObject2, (JSONObject) null);
        } catch (Exception unused) {
        }
        if ((!z || this.f62508b.f35064l) && (pVar = this.o) != null) {
            pVar.a(this.f62519m);
        }
    }

    public final void a(long j2, long j3) {
        this.f62513g = j2;
        this.f62512f = j3;
    }

    public n(String str, String str2, boolean z, boolean z2, p pVar, com.bytedance.ies.ugc.aweme.plugin.a.a aVar) {
        int i2;
        l.d(str, "");
        l.d(str2, "");
        l.d(aVar, "");
        this.f62518l = str;
        this.f62519m = str2;
        this.n = z2;
        this.o = pVar;
        this.f62507a = z;
        this.f62508b = aVar;
        if (z2) {
            i2 = 0;
        } else if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f62510d = i2;
        this.f62516j = System.currentTimeMillis();
    }
}
