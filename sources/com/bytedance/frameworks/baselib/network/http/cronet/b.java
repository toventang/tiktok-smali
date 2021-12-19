package com.bytedance.frameworks.baselib.network.http.cronet;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    public static volatile b H;
    public static final /* synthetic */ boolean I = true;

    /* renamed from: a  reason: collision with root package name */
    public static final String f28999a = b.class.getSimpleName();
    public long A = -1;
    public long B = -1;
    public long C = -1;
    public long D = -1;
    public long E = -1;
    public long F = -1;
    public long G = -1;

    /* renamed from: b  reason: collision with root package name */
    public a f29000b = a.NONE;

    /* renamed from: c  reason: collision with root package name */
    public boolean f29001c = true;

    /* renamed from: d  reason: collision with root package name */
    public int f29002d;

    /* renamed from: e  reason: collision with root package name */
    public long f29003e;

    /* renamed from: f  reason: collision with root package name */
    public long f29004f;

    /* renamed from: g  reason: collision with root package name */
    public long f29005g;

    /* renamed from: h  reason: collision with root package name */
    public long f29006h;

    /* renamed from: i  reason: collision with root package name */
    public long f29007i;

    /* renamed from: j  reason: collision with root package name */
    public long f29008j;

    /* renamed from: k  reason: collision with root package name */
    public long f29009k;

    /* renamed from: l  reason: collision with root package name */
    public long f29010l;

    /* renamed from: m  reason: collision with root package name */
    public long f29011m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t = -1;
    public long u = -1;
    public long v = -1;
    public long w = -1;
    public long x = -1;
    public long y = -1;
    public long z = -1;

    static {
        Covode.recordClassIndex(17012);
    }

    public enum a {
        NONE(0),
        LAZY_INIT(1),
        PRE_INIT(2),
        FORCE_INIT(3);
        
        final int initMode;

        static {
            Covode.recordClassIndex(17013);
        }

        private a(int i2) {
            this.initMode = i2;
        }
    }

    public static b a() {
        MethodCollector.i(3213);
        if (H == null) {
            synchronized (b.class) {
                try {
                    if (H == null) {
                        H = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3213);
                    throw th;
                }
            }
        }
        b bVar = H;
        MethodCollector.o(3213);
        return bVar;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("mode", this.f29000b.initMode);
            jSONObject.put("is_main_process", this.f29001c);
            jSONObject.put("net_thread_priority", this.f29002d);
            jSONObject2.put("ttnet_start", this.f29003e);
            jSONObject2.put("ttnet_end", this.f29004f);
            jSONObject2.put("engine_start", this.f29008j);
            jSONObject2.put("engine_end", this.f29009k);
            jSONObject2.put("init_start", this.f29010l);
            jSONObject2.put("init_end", this.f29011m);
            jSONObject2.put("network_start", this.p);
            jSONObject2.put("network_end", this.q);
            jSONObject2.put("exec_wait_end", this.r);
            jSONObject2.put("preconnect_start", this.s);
            jSONObject3.put("builder_build", this.t);
            jSONObject3.put("load_cronet", this.u);
            jSONObject3.put("init_mssdk", this.f29007i);
            a(jSONObject3, "init_ttnet", this.f29003e, this.f29004f);
            a(jSONObject3, "init_metasec", this.f29005g, this.f29006h);
            a(jSONObject3, "create_engine", this.f29008j, this.f29009k);
            a(jSONObject3, "init_thread", this.f29010l, this.f29011m);
            a(jSONObject3, "native_init_thread", this.n, this.o);
            a(jSONObject3, "network_thread", this.p, this.q);
            a(jSONObject3, "exec_tasks", this.q, this.r);
            a(jSONObject3, "init_total", this.f29003e, this.q);
            a(jSONObject3, "init_preconnect", this.f29003e, this.s);
            jSONObject3.put("nqe_init", this.v);
            jSONObject3.put("prefs_init", this.w);
            jSONObject3.put("channel_init", this.x);
            jSONObject3.put("context_build", this.y);
            jSONObject3.put("tnc_config", this.z);
            jSONObject3.put("update_appinfo", this.A);
            jSONObject3.put("netlog_init", this.B);
            jSONObject3.put("nqe_detect", this.C);
            jSONObject3.put("preconnect", this.D);
            jSONObject3.put("ssl_session", this.E);
            jSONObject3.put("ttnet_config", this.F);
            jSONObject3.put("install_cert", this.G);
            jSONObject.put("ttnet_timestamp", jSONObject2);
            jSONObject.put("ttnet_duration", jSONObject3);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static boolean a(Context context, List<Long> list) {
        Class<?> cls;
        HashMap hashMap = null;
        try {
            cls = Class.forName("com.bytedance.mobsec.metasec.ml.MSB");
            if (cls == null) {
                try {
                    cls = Class.forName("com.bytedance.mobsec.metasec.ov.MSB");
                } catch (ClassNotFoundException unused) {
                }
            }
        } catch (ClassNotFoundException unused2) {
            cls = null;
        }
        if (cls == null) {
            return false;
        }
        if (list != null) {
            try {
                if (list.size() == 2) {
                    hashMap = new HashMap();
                    hashMap.put("http_callback", String.valueOf(list.get(0)));
                    hashMap.put("ws_callback", String.valueOf(list.get(1)));
                }
            } catch (Throwable unused3) {
                return false;
            }
        }
        cls.getMethod("a", Context.class, Integer.TYPE, Map.class).invoke(cls, context, 1, hashMap);
        return true;
    }

    private static void a(JSONObject jSONObject, String str, long j2, long j3) {
        if (j2 > j3) {
            try {
                jSONObject.put(str, -1);
            } catch (JSONException unused) {
            }
        } else {
            jSONObject.put(str, j3 - j2);
        }
    }
}
