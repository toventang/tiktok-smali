package com.ss.ttvideoengine.k;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.k.f;
import com.ss.ttvideoengine.s.j;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c extends a implements b {

    /* renamed from: f  reason: collision with root package name */
    public int f153013f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f153014g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f153015h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f153016i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f153017j;

    /* renamed from: k  reason: collision with root package name */
    public int f153018k = 120;

    /* renamed from: l  reason: collision with root package name */
    public boolean f153019l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f153020m;
    private int n;
    private a o;
    private Context p;
    private boolean q;
    private f r;
    private JSONObject s;
    private long t;
    private long u;

    static {
        Covode.recordClassIndex(101687);
    }

    @Override // com.ss.ttvideoengine.k.b
    public final void a() {
    }

    @Override // com.ss.ttvideoengine.k.b
    public final void a(com.ss.ttvideoengine.s.c cVar) {
    }

    @Override // com.ss.ttvideoengine.k.a
    public final void c() {
        if (!this.f153008b) {
            this.f153008b = true;
            a aVar = this.o;
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    private void f() {
        int i2 = this.f153014g[this.f153013f];
        if (i2 == 0) {
            this.o = new g(this.f153009c);
        } else if (i2 == 1) {
            this.o = new e(this.f153009c, this.f153011e, 1);
        } else if (i2 == 2) {
            this.o = new e(this.f153009c, this.f153011e, 2);
        }
        a aVar = this.o;
        if (aVar != null) {
            aVar.f153010d = this;
            this.o.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b3, code lost:
        if (r0 > 0) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b6, code lost:
        if (r12 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b8, code lost:
        r1 = r13.r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bc, code lost:
        if (r1.f153030c == null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00be, code lost:
        r1.f153030c.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c3, code lost:
        com.ss.ttvideoengine.k.f.f153028b = r8;
        com.ss.ttvideoengine.k.f.f153027a = r9;
        f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ca, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    @Override // com.ss.ttvideoengine.k.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.k.c.b():void");
    }

    public final void a(JSONObject jSONObject, Long l2) {
        this.s = jSONObject;
        this.t = l2.longValue();
    }

    private void a(JSONObject jSONObject, long j2) {
        if (this.r != null) {
            f.a aVar = new f.a();
            aVar.f153031a = jSONObject;
            aVar.f153032b = SystemClock.elapsedRealtime() + (j2 * 1000);
            this.r.a(this.f153009c, aVar);
        }
    }

    @Override // com.ss.ttvideoengine.k.b
    public final void a(JSONObject jSONObject, com.ss.ttvideoengine.s.c cVar) {
        if (this.f153008b) {
            if (!this.q || this.f153015h) {
                e();
            }
        } else if (cVar == null) {
            JSONArray jSONArray = null;
            if (jSONObject != null) {
                jSONArray = jSONObject.optJSONArray("ips");
            }
            if (jSONArray == null || jSONArray.length() == 0) {
                if (this.f153014g[this.f153013f] == 0) {
                    c(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainLocalDNS", -9997, "dns result empty,type:" + this.f153014g[this.f153013f]));
                } else {
                    c(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainHTTPDNS", -9997, "dns result empty,type:" + this.f153014g[this.f153013f]));
                }
                j.b("DNSParser", "ips empty");
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("ip", jSONArray.optString(0));
            } catch (Exception unused) {
            }
            long optLong = jSONObject.optLong("ttl");
            if (optLong == 0) {
                optLong = (long) this.f153018k;
            }
            a(jSONObject2, optLong);
            if (!this.q || this.f153015h) {
                try {
                    jSONObject2.put("time", jSONObject.optLong("time"));
                    jSONObject2.put("dns_type", jSONObject.optString("dns_type"));
                } catch (Exception e2) {
                    j.b("DNSParser", e2.toString());
                }
                a(jSONObject2);
            }
        } else if (this.f153013f != this.n - 1) {
            if (!this.q || this.f153015h) {
                b(cVar);
            }
            this.f153013f++;
            b();
        } else if (!this.q || this.f153015h) {
            c(cVar);
        }
    }

    public c(Context context, String str, k kVar) {
        super(str, kVar);
        int[] iArr = {0, 2};
        this.f153014g = iArr;
        this.p = context;
        this.n = iArr.length;
        int[] iArr2 = aj.f152206j;
        if (iArr2 != null && iArr2.length > 0) {
            for (int i2 = 0; i2 < iArr2.length; i2++) {
                int i3 = iArr2[i2];
                if (i3 != 0) {
                    if (i3 == 1) {
                        this.f153014g[i2] = 2;
                    } else if (i3 != 2) {
                    }
                }
                this.f153014g[i2] = iArr2[i2];
            }
        } else if (aj.f152205i) {
            int[] iArr3 = this.f153014g;
            iArr3[0] = 2;
            iArr3[1] = 0;
        }
        j.a("DNSParser", "DNSType:" + Arrays.toString(this.f153014g));
        this.r = f.a();
    }
}
