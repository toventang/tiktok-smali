package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.infra.a.f;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class j {
    public static boolean p = com.ss.android.ugc.aweme.ml.a.a.f110297a;
    public static final ConcurrentHashMap<String, j> q = new ConcurrentHashMap<>();
    public static final a r = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f110646a = p;

    /* renamed from: b  reason: collision with root package name */
    int f110647b;

    /* renamed from: c  reason: collision with root package name */
    String f110648c = "";

    /* renamed from: d  reason: collision with root package name */
    boolean f110649d;

    /* renamed from: e  reason: collision with root package name */
    public c f110650e;

    /* renamed from: f  reason: collision with root package name */
    public int f110651f;

    /* renamed from: g  reason: collision with root package name */
    final b f110652g = new b();

    /* renamed from: h  reason: collision with root package name */
    final b f110653h = new b();

    /* renamed from: i  reason: collision with root package name */
    public int f110654i;

    /* renamed from: j  reason: collision with root package name */
    public int f110655j;

    /* renamed from: k  reason: collision with root package name */
    public String f110656k;

    /* renamed from: l  reason: collision with root package name */
    public Float f110657l;

    /* renamed from: m  reason: collision with root package name */
    public String f110658m;
    public Float n;
    public String o;
    private boolean s;
    private final b t = new b();

    public static final class a {
        static {
            Covode.recordClassIndex(71025);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public long f110659a = -1;

        /* renamed from: b  reason: collision with root package name */
        public long f110660b = -1;

        static {
            Covode.recordClassIndex(71026);
        }

        public final void b() {
            this.f110660b = -1;
            this.f110659a = -1;
        }

        private final boolean c() {
            long j2 = this.f110659a;
            if (j2 < 0) {
                return true;
            }
            long j3 = this.f110660b;
            if (j3 < 0 || j3 < j2 || j3 - j2 > 1000000000) {
                return true;
            }
            return false;
        }

        public final float a() {
            if (c()) {
                return -1.0f;
            }
            return ((float) (this.f110660b - this.f110659a)) * 1.0f;
        }
    }

    static {
        Covode.recordClassIndex(71024);
    }

    public final void a() {
        if (this.f110646a && !this.s) {
            this.t.f110659a = System.currentTimeMillis();
        }
    }

    public final void b() {
        if (this.f110646a && !this.s) {
            this.s = true;
            this.f110651f = 0;
            this.t.f110660b = System.currentTimeMillis();
        }
    }

    public j(String str) {
        this.o = str;
    }

    /* access modifiers changed from: package-private */
    public final JSONObject a(f fVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scene", this.o);
            jSONObject.put("model_name", this.f110648c);
            jSONObject.put("sdk_duration", Float.valueOf(this.t.a()));
            jSONObject.put("sdk_success", this.f110651f);
            if (fVar != null) {
                fVar.a(true, jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public final JSONObject a(k kVar, f fVar) {
        float f2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scene", this.o);
            jSONObject.put("model_name", this.f110648c);
            jSONObject.put("run_count", this.f110647b);
            jSONObject.put("duration", Float.valueOf(this.f110652g.a()));
            jSONObject.put("data_cost", Float.valueOf(this.f110653h.a()));
            jSONObject.put("success", this.f110654i);
            jSONObject.put("sdk_success", this.f110655j);
            if (kVar != null) {
                String str = kVar.f110661a;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("s_result", str);
                Float f3 = kVar.f110663c;
                if (f3 == null) {
                    f3 = kVar.a();
                }
                if (f3 != null) {
                    f2 = f3.floatValue();
                } else {
                    f2 = 0.0f;
                }
                jSONObject.put("f_result", Float.valueOf(f2));
            }
            if (fVar != null) {
                fVar.a(false, jSONObject);
            }
        } catch (JSONException unused) {
        }
        this.f110652g.b();
        this.f110653h.b();
        this.f110656k = null;
        this.f110657l = null;
        this.f110658m = null;
        this.n = null;
        return jSONObject;
    }
}
