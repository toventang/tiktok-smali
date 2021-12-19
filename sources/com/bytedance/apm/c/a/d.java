package com.bytedance.apm.c.a;

import android.text.TextUtils;
import com.bytedance.apm.n.c;
import com.bytedance.apm.q.m;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends com.bytedance.apm.c.a<com.bytedance.apm.c.b.a> {

    /* renamed from: h  reason: collision with root package name */
    public static long f24707h = 30000;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f24708i;

    /* renamed from: c  reason: collision with root package name */
    public int f24709c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f24710d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f24711e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f24712f;

    /* renamed from: g  reason: collision with root package name */
    public c f24713g;

    /* renamed from: j  reason: collision with root package name */
    private volatile int f24714j;

    /* renamed from: k  reason: collision with root package name */
    private volatile List<String> f24715k;

    /* renamed from: l  reason: collision with root package name */
    private List<Pattern> f24716l;

    /* renamed from: m  reason: collision with root package name */
    private List<String> f24717m;
    private List<Pattern> n;
    private List<String> o;
    private List<String> p;
    private List<String> q;
    private boolean r;
    private double s;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f24718a = new d((byte) 0);

        static {
            Covode.recordClassIndex(14515);
        }
    }

    static {
        Covode.recordClassIndex(14514);
    }

    private d() {
        this.f24710d = true;
        this.f24711e = true;
    }

    public final boolean b() {
        if (!this.f24711e || this.s == 0.0d) {
            return false;
        }
        return true;
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.apm.c.b] */
    @Override // com.bytedance.apm.c.a
    public final /* synthetic */ boolean c(com.bytedance.apm.c.b.a aVar) {
        com.bytedance.apm.c.b.a aVar2 = aVar;
        if (aVar2 == null || TextUtils.isEmpty(aVar2.f24722d)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.apm.c.b] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[Catch:{ JSONException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c A[Catch:{ JSONException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[Catch:{ JSONException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.apm.c.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void d(com.bytedance.apm.c.b.a r7) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.c.a.d.d(com.bytedance.apm.c.b):void");
    }

    private static boolean a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            String optString = jSONObject.optString("cronet_internal_error_code");
            if (!"11".equals(jSONObject.optString("cronet_error_code")) || !"-999".equals(optString)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.apm.c.b] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
        if (r11.f24714j == 1) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    @Override // com.bytedance.apm.c.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void e(com.bytedance.apm.c.b.a r12) {
        /*
        // Method dump skipped, instructions count: 251
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.c.a.d.e(com.bytedance.apm.c.b):void");
    }

    private boolean a(String str, JSONObject jSONObject) {
        int i2;
        int i3;
        if (b() || this.f24709c != 0 || m.a(str, this.f24717m, this.n)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        boolean b2 = c.b("smart_traffic");
        if (b2) {
            i3 = i2 | 4;
        } else {
            i3 = i2;
        }
        try {
            jSONObject.put("hit_rules", i3);
        } catch (JSONException unused) {
        }
        if (i2 != 0 || b2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.services.slardar.config.a, com.bytedance.apm.c.a
    public final void a(JSONObject jSONObject, boolean z) {
        JSONObject a2 = m.a(jSONObject, "network_image_modules");
        if (a2 != null) {
            JSONObject a3 = m.a(a2, "network");
            if (a3 != null) {
                this.f24715k = m.b(a3, "api_block_list");
                this.f24716l = m.d(a3, "api_block_list");
                this.f24717m = m.c(a3, "api_allow_list");
                this.n = m.e(a3, "api_allow_list");
                boolean z2 = false;
                this.f24709c = a3.optInt("enable_api_all_upload", 0);
                this.f24710d = a3.optBoolean("enable_trace_log", true);
                this.f24714j = a3.optInt("enable_api_error_upload", 1);
                if (a3.optInt("enable_cancel_error_report") == 1) {
                    z2 = true;
                }
                this.r = z2;
                this.p = m.c(a3, "request_allow_header");
                this.q = m.c(a3, "response_allow_header");
                this.s = a3.optDouble("enable_base_api_all", 0.0d);
            }
            JSONObject a4 = m.a(a2, "image");
            if (a4 != null) {
                this.o = m.c(a4, "image_allow_list");
            }
        }
    }

    private static void a(List<String> list, JSONObject jSONObject, String str) {
        if (list != null && jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        String optString = jSONObject.optString(str);
                        if (!TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject2 = new JSONObject(optString);
                            JSONObject jSONObject3 = new JSONObject();
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (list.contains(next)) {
                                    jSONObject3.put(next, jSONObject2.opt(next));
                                }
                            }
                            jSONObject.put(str, jSONObject3.toString());
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }
}
