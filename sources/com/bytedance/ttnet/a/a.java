package com.bytedance.ttnet.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.a.a.a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.a.c;
import com.bytedance.frameworks.baselib.network.b.f;
import com.bytedance.frameworks.baselib.network.http.a.b;
import com.bytedance.frameworks.baselib.network.http.cronet.b.h;
import com.bytedance.frameworks.baselib.network.http.d.a.b.k;
import com.bytedance.frameworks.baselib.network.http.d.a.g;
import com.bytedance.frameworks.baselib.network.http.d.a.o;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.c;
import com.bytedance.ttnet.f.c;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import com.bytedance.ttnet.utils.a;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lancet.j;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a implements WeakHandler.IHandler, a.AbstractC0617a, c.b, h.a, h.b, e.c, e.AbstractC0626e, e.g, e.h, c.b {
    private static int K = -1;
    private static int L = -1;
    private static ArrayList<String> N;
    private static boolean O = false;
    private static boolean P = false;
    private static boolean Q = false;

    /* renamed from: a  reason: collision with root package name */
    public static String f44430a;

    /* renamed from: k  reason: collision with root package name */
    static boolean f44431k;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f44432l;

    /* renamed from: m  reason: collision with root package name */
    static boolean f44433m = false;
    private static a n;
    private int A = 0;
    private int B = 0;
    private int C = 1;
    private int D = 1;
    private int E = 1;
    private int F = 1;
    private int G = 1;
    private int H = 1;
    private int I = 0;
    private List<String> J = new CopyOnWriteArrayList();
    private volatile int M;

    /* renamed from: b  reason: collision with root package name */
    AtomicBoolean f44434b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public final Context f44435c;

    /* renamed from: d  reason: collision with root package name */
    public int f44436d = 0;

    /* renamed from: e  reason: collision with root package name */
    public String f44437e = "";

    /* renamed from: f  reason: collision with root package name */
    public List<String> f44438f = new CopyOnWriteArrayList();

    /* renamed from: g  reason: collision with root package name */
    public String f44439g = "";

    /* renamed from: h  reason: collision with root package name */
    AtomicInteger f44440h = new AtomicInteger(10800);

    /* renamed from: i  reason: collision with root package name */
    public List<String> f44441i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final WeakHandler f44442j = new WeakHandler(Looper.getMainLooper(), this);
    private final boolean o;
    private AtomicLong p = new AtomicLong(0);
    private final Object q = new Object();
    private volatile boolean r = false;
    private String s = "";
    private int t = 0;
    private int u = 0;
    private long v = 0;
    private int w = 0;
    private int x = 0;
    private int y = 1;
    private int z = 1;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ttnet.a.a$a  reason: collision with other inner class name */
    public static final class C1088a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(27230);
        }

        C1088a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG".equals(intent.getAction())) {
                new com.bytedance.common.utility.b.e() {
                    /* class com.bytedance.ttnet.a.a.C1088a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(27231);
                    }

                    @Override // com.bytedance.common.utility.b.e
                    public final void run() {
                        f.a().h();
                    }
                }.a();
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.a.c.b
    public final void a() {
        Logger.debug();
    }

    public final boolean a(Object obj, c.a aVar, long j2) {
        JSONObject jSONObject;
        boolean z2;
        boolean z3;
        int i2;
        String string;
        MethodCollector.i(9132);
        JSONObject jSONObject2 = new JSONObject();
        if (obj instanceof String) {
            String str = (String) obj;
            if (m.a(str)) {
                a(jSONObject2, "empty response.");
                MethodCollector.o(9132);
                return false;
            }
            jSONObject = new JSONObject(str);
        } else if (!(obj instanceof JSONObject) || (jSONObject = (JSONObject) obj) == null) {
            a(jSONObject2, "object is null.");
            MethodCollector.o(9132);
            return false;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        g a2 = g.a(this.f44435c);
        a2.f44475b = jSONObject3.toString();
        SharedPreferences.Editor edit = d.a(a2.f44474a, "tt_state_config", 4).edit();
        edit.putString("tnc_delay_config", a2.f44475b);
        com.bytedance.common.utility.e.a.a(edit);
        a2.a(jSONObject3);
        g.a(a2.f44474a).a(com.bytedance.frameworks.baselib.network.http.cronet.a.f28996b);
        K = jSONObject3.optInt("use_http_dns", -1);
        L = jSONObject3.optInt("collect_recent_page_info_enable", -1);
        int optInt = jSONObject3.optInt("ok_http_open", 0);
        int optInt2 = jSONObject3.optInt("ok_http3_open", 0);
        int optInt3 = jSONObject3.optInt("cronet_version", 0);
        int optInt4 = jSONObject3.optInt("http_dns_enabled", 0);
        int optInt5 = jSONObject3.optInt("detect_open", 0);
        int optInt6 = jSONObject3.optInt("detect_native_page", 1);
        int optInt7 = jSONObject3.optInt("collect_recent_page_info_enable", 1);
        int optInt8 = jSONObject3.optInt("add_ss_queries_open", 0);
        int optInt9 = jSONObject3.optInt("add_ss_queries_header_open", 0);
        int optInt10 = jSONObject3.optInt("add_ss_queries_plaintext_open", 1);
        int optInt11 = jSONObject3.optInt("add_device_fingerprint_open", 1);
        int optInt12 = jSONObject3.optInt("image_ttnet_enabled", 1);
        int optInt13 = jSONObject3.optInt("sample_band_width_enabled", 1);
        int optInt14 = jSONObject3.optInt("cdn_sample_band_width_enabled", 1);
        int optInt15 = jSONObject3.optInt("dynamic_adjust_threadpool_size_open", 1);
        int optInt16 = jSONObject3.optInt("http_show_hijack", 1);
        int optInt17 = jSONObject3.optInt("http_verify_sign", 1);
        int optInt18 = jSONObject3.optInt("tnc_update_interval", -1);
        if (optInt18 > 0) {
            this.f44440h.set(optInt18);
        }
        JSONArray optJSONArray = jSONObject3.optJSONArray("send_tnc_host_arrays");
        if (optJSONArray != null) {
            this.f44441i.clear();
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                if (!TextUtils.isEmpty(optJSONArray.optString(i3))) {
                    this.f44441i.add(optJSONArray.optString(i3));
                }
            }
        }
        synchronized (this) {
            try {
                this.t = optInt;
                this.u = optInt2;
                this.I = optInt3;
                this.w = optInt4;
                this.x = optInt5;
                this.y = optInt6;
                this.z = optInt7;
                this.A = optInt8;
                this.B = optInt9;
                this.C = optInt10;
                this.G = optInt11;
                this.H = optInt15;
                this.D = optInt12;
                this.E = optInt13;
                this.F = optInt14;
            } finally {
                MethodCollector.o(9132);
            }
        }
        f.a(optInt15 > 0);
        if (jSONObject3.optInt("enable_req_ticket", 1) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.bytedance.ttnet.utils.c.f44657c = z2;
        int optInt19 = jSONObject3.optInt("ttnet_response_verify_enabled", -1);
        JSONArray optJSONArray2 = jSONObject3.optJSONArray("ttnet_response_verify");
        String str2 = "";
        if (optJSONArray2 != null) {
            str2 = optJSONArray2.toString();
        }
        com.bytedance.ttnet.utils.a.a(optInt19, optJSONArray2);
        a.C1091a aVar2 = new a.C1091a();
        aVar2.f44652a = optInt19;
        aVar2.f44653b = str2;
        if (this.A > 0 || this.B > 0) {
            SsInterceptor.f44640a = true;
        }
        com.bytedance.frameworks.baselib.network.http.e.d.f29343a = jSONObject3.optInt("read_response_buff_init_size", 0);
        com.bytedance.frameworks.baselib.network.http.e.d.f29344b = jSONObject3.optInt("read_response_buff_increase_size", 0);
        h.f29077e = jSONObject3.optInt("cronet_inputstream_buff_size", 0);
        String optString = jSONObject3.optString("frontier_urls", "");
        String optString2 = jSONObject3.optString("share_cookie_host_list", "");
        TTNetInit.getTTNetDepend().a(optString2);
        String optString3 = jSONObject3.optString("api_http_host_list", "");
        String optString4 = jSONObject3.optString("concurrent_request_config", "");
        com.bytedance.frameworks.baselib.network.http.cronet.b.e.a().a(optString4);
        String optString5 = jSONObject3.optString("add_common_params", "");
        com.bytedance.frameworks.baselib.network.http.a.a aVar3 = b.a().f28938a;
        if (aVar3 != null) {
            aVar3.a(optString5);
        }
        String optString6 = jSONObject3.optString("L0_params", "");
        com.bytedance.frameworks.baselib.network.c.c.a().b(optString6);
        int optInt20 = jSONObject3.optInt("query_filter_enabled", Integer.MIN_VALUE);
        String optString7 = jSONObject3.optString("query_filter_actions");
        if (optInt20 != Integer.MIN_VALUE) {
            com.bytedance.frameworks.baselib.network.c.c.a().f28904a = optInt20 > 0;
            com.bytedance.frameworks.baselib.network.c.c.a().a(optString7);
        } else {
            optInt20 = Integer.MIN_VALUE;
        }
        int optInt21 = jSONObject3.optInt("disable_store_region_v2", 0);
        com.bytedance.frameworks.baselib.network.http.f.b a3 = com.bytedance.frameworks.baselib.network.http.f.b.a();
        if (optInt21 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (a3.f29355h == null || !a3.f29356i || a3.f29357j == z3) {
            i2 = 0;
        } else {
            a3.f29357j = z3;
            i2 = 0;
            SharedPreferences.Editor edit2 = d.a(a3.f29355h, "ttnet_store_region", 0).edit();
            edit2.putBoolean("disable_store_region", a3.f29357j);
            edit2.apply();
        }
        this.M = jSONObject3.optInt("disable_encrypt_switch", i2);
        this.f44437e = jSONObject3.optString("cronet_so_path", "");
        if (this.M == 2) {
            SharedPreferences.Editor edit3 = d.a(this.f44435c, "app_log_encrypt_switch_count", i2).edit();
            edit3.putInt("app_log_encrypt_faild_count", i2);
            com.bytedance.common.utility.e.a.a(edit3);
        }
        int optInt22 = jSONObject3.optInt("disable_framed_transport", i2);
        if (optInt22 > 0) {
            try {
                g.a(optInt22);
            } catch (Throwable unused) {
            }
        }
        synchronized (this) {
            try {
                SharedPreferences a4 = d.a(this.f44435c, "ss_app_config", 0);
                string = a4.getString("share_cookie_host_list", "");
                SharedPreferences.Editor edit4 = a4.edit();
                edit4.putString("ttnet_response_verify", aVar2.f44653b);
                edit4.putInt("ttnet_response_verify_enabled", aVar2.f44652a);
                edit4.putInt("read_response_buff_init_size", com.bytedance.frameworks.baselib.network.http.e.d.f29343a);
                edit4.putInt("read_response_buff_increase_size", com.bytedance.frameworks.baselib.network.http.e.d.f29344b);
                edit4.putInt("cronet_inputstream_buff_size", h.f29077e);
                edit4.putInt("ok_http_open", optInt);
                edit4.putInt("ok_http3_open", optInt2);
                edit4.putInt("cronet_version", optInt3);
                edit4.putInt("http_dns_enabled", optInt4);
                edit4.putInt("detect_open", optInt5);
                edit4.putInt("detect_native_page", optInt6);
                edit4.putInt("collect_recent_page_info_enable", optInt7);
                edit4.putInt("add_ss_queries_open", optInt8);
                edit4.putInt("add_ss_queries_header_open", optInt9);
                edit4.putInt("add_ss_queries_plaintext_open", optInt10);
                edit4.putInt("add_device_fingerprint_open", optInt11);
                edit4.putInt("dynamic_adjust_threadpool_size_open", optInt15);
                edit4.putInt("image_ttnet_enabled", optInt12);
                edit4.putInt("use_http_dns", K);
                edit4.putInt("use_http_dns_refetch_on_expire", L);
                edit4.putInt("http_show_hijack", optInt16);
                edit4.putInt("http_verify_sign", optInt17);
                edit4.putString("frontier_urls", optString);
                edit4.putString("cronet_so_path", this.f44437e);
                edit4.putString("share_cookie_host_list", optString2);
                jSONObject2.put("oldShareCookieHosts", string);
                jSONObject2.put("newShareCookieHosts", optString2);
                if (!TextUtils.isEmpty(optString2)) {
                    this.f44438f.clear();
                    com.bytedance.ttnet.utils.d.b(optString2, this.f44438f);
                }
                String d2 = TTNetInit.getTTNetDepend().d();
                if (!m.a(d2) && !com.bytedance.ttnet.utils.d.a(d2, this.f44438f)) {
                    this.f44438f.add(d2);
                }
                edit4.putString("api_http_host_list", optString3);
                edit4.putString("concurrent_request_config", optString4);
                edit4.putString("add_common_params", optString5);
                edit4.putString("query_filter_actions", optString7);
                edit4.putString("L0_params", optString6);
                edit4.putInt("query_filter_enabled", optInt20);
                String[] split = optString3.split(",");
                for (String str3 : split) {
                    if (!m.a(str3) && !com.bytedance.ttnet.utils.d.a(str3, this.J)) {
                        this.J.add(str3.trim());
                    }
                }
                edit4.putInt("android_log_encrypt_switch", this.M);
                edit4.putInt("image_ttnet_enabled", this.D);
                edit4.putInt("sample_band_width_enabled", this.E);
                edit4.putInt("cdn_sample_band_width_enabled", this.F);
                edit4.putInt("disable_framed_transport", optInt22);
                edit4.putInt("tnc_update_interval", this.f44440h.get());
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < this.f44441i.size(); i4++) {
                    sb.append(this.f44441i.get(i4));
                    if (i4 != this.f44441i.size()) {
                        sb.append(',');
                    }
                }
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(sb2)) {
                    edit4.putString("send_tnc_host_arrays", sb2);
                }
                com.bytedance.common.utility.e.a.a(edit4);
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (!m.a(optString) && !optString.equals(this.s)) {
                        this.s = optString;
                        linkedHashMap.put("frontier_urls", optString);
                    }
                    linkedHashMap.put("http_dns_enabled", Integer.valueOf(optInt4));
                    linkedHashMap.put("add_ss_queries_open", Integer.valueOf(optInt8));
                    linkedHashMap.put("add_ss_queries_header_open", Integer.valueOf(optInt9));
                    linkedHashMap.put("add_ss_queries_plaintext_open", Integer.valueOf(optInt10));
                    linkedHashMap.put("share_cookie_host_list", optString2);
                    linkedHashMap.put("disable_framed_transport", Integer.valueOf(optInt22));
                    linkedHashMap.put("query_filter_actions", optString7);
                    linkedHashMap.put("L0_params", optString6);
                    linkedHashMap.put("query_filter_enabled", Integer.valueOf(optInt20));
                    TTNetInit.getTTNetDepend().a(this.f44435c, linkedHashMap);
                    Intent intent = new Intent("com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG");
                    if (!TextUtils.isEmpty(f44430a)) {
                        intent.setPackage(f44430a);
                    }
                    this.f44435c.sendBroadcast(intent);
                } catch (Throwable unused2) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!m.a(optString2)) {
            e a5 = e.a();
            if (!optString2.equals(string)) {
                
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04ee: INVOKE  
                      (wrap: com.bytedance.ttnet.a.e$1 : 0x04eb: CONSTRUCTOR  (r1v30 com.bytedance.ttnet.a.e$1) = (r3v11 'a5' com.bytedance.ttnet.a.e), (r2v11 'string' java.lang.String), (r22v0 'optString2' java.lang.String) call: com.bytedance.ttnet.a.e.1.<init>(com.bytedance.ttnet.a.e, java.lang.String, java.lang.String):void type: CONSTRUCTOR)
                     type: VIRTUAL call: com.bytedance.common.utility.b.e.a():void in method: com.bytedance.ttnet.a.a.a(java.lang.Object, com.bytedance.ttnet.f.c$a, long):boolean, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04eb: CONSTRUCTOR  (r1v30 com.bytedance.ttnet.a.e$1) = (r3v11 'a5' com.bytedance.ttnet.a.e), (r2v11 'string' java.lang.String), (r22v0 'optString2' java.lang.String) call: com.bytedance.ttnet.a.e.1.<init>(com.bytedance.ttnet.a.e, java.lang.String, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.ttnet.a.a.a(java.lang.Object, com.bytedance.ttnet.f.c$a, long):boolean, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ttnet.a.e, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    */
                /*
                // Method dump skipped, instructions count: 1419
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.a.a.a(java.lang.Object, com.bytedance.ttnet.f.c$a, long):boolean");
            }

            public final void a(ArrayList<String> arrayList) {
                if (!arrayList.isEmpty()) {
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (!m.a(next) && !com.bytedance.ttnet.utils.d.a(next, this.f44438f)) {
                            this.f44438f.add(next.trim());
                        }
                    }
                }
            }

            public static boolean j() {
                try {
                    return f.a.f68431a.c();
                } catch (Exception unused) {
                    return false;
                }
            }

            @Override // com.bytedance.frameworks.baselib.network.http.cronet.b.h.b
            public final boolean c() {
                if (!O && this.w > 0) {
                    return true;
                }
                return false;
            }

            @Override // com.bytedance.frameworks.a.a.a.AbstractC0617a
            public final boolean e() {
                if (!P && this.B > 0) {
                    return true;
                }
                return false;
            }

            @Override // com.bytedance.frameworks.a.a.a.AbstractC0617a
            public final boolean f() {
                if (!P && this.C <= 0) {
                    return false;
                }
                return true;
            }

            public static String[] k() {
                String[] b2 = TTNetInit.getTTNetDepend().b();
                if (b2 == null || b2.length <= 0) {
                    return new String[0];
                }
                return b2;
            }

            @Override // com.bytedance.frameworks.a.a.a.AbstractC0617a
            public final boolean d() {
                if (!P && this.A <= 0) {
                    return false;
                }
                return true;
            }

            static {
                Covode.recordClassIndex(27226);
                ArrayList<String> arrayList = new ArrayList<>();
                N = arrayList;
                arrayList.add("MI PAD 2");
                N.add("YT3-X90L");
                N.add("YT3-X90F");
                N.add("GT-810");
            }

            @Override // com.bytedance.ttnet.c.b
            public final boolean g() {
                if (f44432l) {
                    o.f29274b = 0;
                    return false;
                } else if (f44433m) {
                    o.f29274b = 8;
                    return false;
                } else if (f44431k || this.f44436d <= 5) {
                    TTNetInit.getTTNetDepend();
                    return true;
                } else {
                    o.f29274b = 3;
                    return false;
                }
            }

            @Override // com.bytedance.frameworks.baselib.network.http.cronet.b.h.a
            public final boolean b() {
                Logger.debug();
                SharedPreferences a2 = d.a(this.f44435c, "ss_app_config", 0);
                this.f44436d = a2.getInt("chromium_boot_failures", 0);
                this.v = a2.getLong("chromium_boot_failures_timestamp", 0);
                if (this.f44436d > 5 && System.currentTimeMillis() - this.v > TimeUnit.HOURS.toMillis(1)) {
                    this.f44436d = 5;
                }
                if (!g()) {
                    return false;
                }
                SharedPreferences.Editor edit = a2.edit();
                edit.putInt("chromium_boot_failures", this.f44436d + 1);
                edit.putLong("chromium_boot_failures_timestamp", System.currentTimeMillis());
                Logger.debug();
                com.bytedance.common.utility.e.a.a(edit);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("chromium_boot_failures", Integer.valueOf(this.f44436d + 1));
                TTNetInit.getTTNetDepend().a(this.f44435c, linkedHashMap);
                return true;
            }

            /* access modifiers changed from: package-private */
            public final synchronized void h() {
                String str;
                MethodCollector.i(8277);
                if (System.currentTimeMillis() - this.p.get() > ((long) this.f44440h.get()) * 1000) {
                    this.p.set(System.currentTimeMillis());
                    try {
                        int a2 = TTNetInit.getTTNetDepend().a(this.f44435c, "disable_framed_transport", 0);
                        if (a2 > 0) {
                            try {
                                g.a(a2);
                            } catch (Throwable unused) {
                            }
                        }
                        if (com.bytedance.ttnet.f.c.a().f44626b != null) {
                            com.bytedance.ttnet.f.b bVar = com.bytedance.ttnet.f.c.a().f44626b;
                            long j2 = this.p.get();
                            try {
                                String a3 = com.bytedance.ttnet.utils.b.a(bVar.f44617a, 4);
                                if (TextUtils.isEmpty(a3)) {
                                    a3 = com.bytedance.ttnet.f.b.a();
                                    if (TextUtils.isEmpty(a3)) {
                                        MethodCollector.o(8277);
                                        return;
                                    }
                                }
                                JSONObject jSONObject = new JSONObject(a3);
                                com.bytedance.ttnet.f.a a4 = com.bytedance.ttnet.f.b.a(jSONObject);
                                k.a().a(jSONObject, c.a.TTCACHE.mValue, com.bytedance.ttnet.utils.b.a(bVar.f44617a, 5), com.bytedance.ttnet.utils.b.a(bVar.f44617a, 6), j2);
                                com.bytedance.frameworks.baselib.network.http.d.a.a.e.a().a(jSONObject);
                                com.bytedance.frameworks.baselib.network.a.a(jSONObject);
                                if (Logger.debug()) {
                                    StringBuilder sb = new StringBuilder("loadLocalConfigForOtherProcess, config: ");
                                    if (a4 == null) {
                                        str = "null";
                                    } else {
                                        str = a4.toString();
                                    }
                                    Logger.d("TNCConfigHandler", sb.append(str).toString());
                                }
                                if (a4 != null) {
                                    bVar.f44618b = a4;
                                }
                                MethodCollector.o(8277);
                                return;
                            } catch (Throwable unused2) {
                                Logger.debug();
                            }
                        }
                        MethodCollector.o(8277);
                        return;
                    } catch (Exception unused3) {
                    }
                }
                MethodCollector.o(8277);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
                com.bytedance.ttnet.a.g.a(r9.f44435c).c();
                r4 = com.ss.android.ugc.aweme.bf.d.a(r9.f44435c, "ss_app_config", 0);
                r9.t = r4.getInt("ok_http_open", 0);
                r9.u = r4.getInt("ok_http3_open", 0);
                r9.I = r4.getInt("cronet_version", 0);
                r9.w = r4.getInt("http_dns_enabled", 0);
                r9.x = r4.getInt("detect_open", 0);
                r9.y = r4.getInt("detect_native_page", 1);
                r9.z = r4.getInt("collect_recent_page_info_enable", 1);
                r9.A = r4.getInt("add_ss_queries_open", 0);
                r9.B = r4.getInt("add_ss_queries_header_open", 0);
                r9.C = r4.getInt("add_ss_queries_plaintext_open", 1);
                r9.G = r4.getInt("add_device_fingerprint_open", 1);
                r9.H = r4.getInt("dynamic_adjust_threadpool_size_open", 1);
                r9.f44436d = r4.getInt("chromium_boot_failures", 0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0091, code lost:
                if (r9.H <= 0) goto L_0x0113;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0093, code lost:
                r0 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0094, code lost:
                com.bytedance.frameworks.baselib.network.b.f.a(r0);
                r9.D = r4.getInt("image_ttnet_enabled", 1);
                r9.E = r4.getInt("sample_band_width_enabled", 1);
                r9.F = r4.getInt("cdn_sample_band_width_enabled", 1);
                com.bytedance.ttnet.a.a.K = r4.getInt("use_http_dns", -1);
                com.bytedance.ttnet.a.a.L = r4.getInt("use_http_dns_refetch_on_expire", -1);
                com.bytedance.frameworks.baselib.network.http.e.d.a(r4);
                com.bytedance.frameworks.baselib.network.http.cronet.b.h.a(r4);
                com.bytedance.ttnet.utils.a.a(r4);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x00cb, code lost:
                if (r9.A > 0) goto L_0x00d1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x00cf, code lost:
                if (r9.B <= 0) goto L_0x00d3;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d1, code lost:
                com.bytedance.ttnet.retrofit.SsInterceptor.f44640a = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d3, code lost:
                r9.s = r4.getString("frontier_urls", "");
                r9.f44437e = r4.getString("cronet_so_path", "");
                r1 = r4.getString("api_http_host_list", "");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x00f3, code lost:
                if (com.bytedance.common.utility.m.a(r1) != false) goto L_0x0115;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x00f5, code lost:
                r7 = r1.split(",");
                r3 = r7.length;
                r2 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x00fd, code lost:
                if (r2 >= r3) goto L_0x0115;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ff, code lost:
                r1 = r7[r2];
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0105, code lost:
                if (com.bytedance.common.utility.m.a(r1) != false) goto L_0x0110;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0107, code lost:
                r9.J.add(r1.trim());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x0110, code lost:
                r2 = r2 + 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:0x0113, code lost:
                r0 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x0115, code lost:
                com.bytedance.frameworks.baselib.network.http.cronet.b.e.a().a(r4.getString("concurrent_request_config", ""));
                r1 = r4.getString("add_common_params", "");
                r0 = com.bytedance.frameworks.baselib.network.http.a.b.a().f28938a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x0132, code lost:
                if (r0 == null) goto L_0x0137;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x0134, code lost:
                r0.a(r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x0137, code lost:
                com.bytedance.frameworks.baselib.network.c.c.a().b(r4.getString("L0_params", ""));
                r2 = r4.getInt("query_filter_enabled", Integer.MIN_VALUE);
                r1 = r4.getString("query_filter_actions", "");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x0156, code lost:
                if (r2 == Integer.MIN_VALUE) goto L_0x0167;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0158, code lost:
                r0 = com.bytedance.frameworks.baselib.network.c.c.a();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x015c, code lost:
                if (r2 <= 0) goto L_0x01de;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x015e, code lost:
                r0.f28904a = r6;
                com.bytedance.frameworks.baselib.network.c.c.a().a(r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x0167, code lost:
                r3 = r4.getString("share_cookie_host_list", "");
                com.bytedance.ttnet.utils.d.b(r3, r9.f44438f);
                r1 = com.bytedance.ttnet.TTNetInit.getTTNetDepend().d();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x0180, code lost:
                if (com.bytedance.common.utility.m.a(r1) != false) goto L_0x018f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x0188, code lost:
                if (com.bytedance.ttnet.utils.d.a(r1, r9.f44438f) != false) goto L_0x018f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x018a, code lost:
                r9.f44438f.add(r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x018f, code lost:
                r9.f44440h.set(r4.getInt("tnc_update_interval", 10800));
                r1 = r4.getString("send_tnc_host_arrays", "");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x01a8, code lost:
                if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x01be;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x01aa, code lost:
                r2 = r1.split(",");
                r9.f44441i.clear();
                r9.f44441i.addAll(java.util.Arrays.asList(r2));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x01c4, code lost:
                if (com.bytedance.ttnet.f.c.a().f44626b == null) goto L_0x01d5;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x01c6, code lost:
                com.bytedance.ttnet.f.c.a().f44626b.a(r9.p.get());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x01d5, code lost:
                r4 = r4.getInt("disable_framed_transport", 0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:47:0x01db, code lost:
                if (r4 <= 0) goto L_0x01e4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x01de, code lost:
                r6 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
                com.bytedance.frameworks.baselib.network.http.d.a.g.a(r4);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void i() {
                /*
                // Method dump skipped, instructions count: 599
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.a.a.i():void");
            }

            @Override // com.bytedance.frameworks.baselib.network.http.e.h
            public final List<String> d(String str) {
                if (com.bytedance.ttnet.utils.d.a(str, this.f44438f)) {
                    return this.f44438f;
                }
                return null;
            }

            public static String e(String str) {
                if (m.a(str)) {
                    return str;
                }
                try {
                    com.bytedance.ttnet.f.c.a();
                    return k.a().a(str);
                } catch (Throwable unused) {
                    return str;
                }
            }

            public final boolean b(final c.a aVar) {
                if (!this.f44434b.compareAndSet(false, true)) {
                    return false;
                }
                new com.bytedance.common.utility.b.e() {
                    /* class com.bytedance.ttnet.a.a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(27228);
                    }

                    @Override // com.bytedance.common.utility.b.e
                    public final void run() {
                        a aVar = a.this;
                        c.a aVar2 = aVar;
                        Logger.debug();
                        if (!j.f107226e || !j.b() || j.c()) {
                            j.f107226e = a.j();
                        }
                        if (j.f107226e) {
                            aVar.i();
                            if (aVar.g()) {
                                aVar.f44434b.set(false);
                                return;
                            }
                            int i2 = 102;
                            if (com.bytedance.ttnet.f.c.a(aVar.f44435c, true, aVar2) || com.bytedance.ttnet.f.c.a(aVar.f44435c, false, c.a.PORTRETRY)) {
                                i2 = 101;
                            }
                            aVar.f44442j.sendEmptyMessage(i2);
                            aVar.f44442j.removeMessages(103);
                            aVar.f44442j.sendEmptyMessageDelayed(103, (long) (aVar.f44440h.get() * 1000));
                        }
                    }
                }.a();
                return true;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.e.g
            public final boolean c(String str) {
                if (m.a(str) || this.E <= 0) {
                    return false;
                }
                try {
                    URI a2 = com.bytedance.frameworks.baselib.network.http.g.g.a(str);
                    if (a2 == null) {
                        return false;
                    }
                    String host = a2.getHost();
                    if (!m.a(host) && host.endsWith(com.bytedance.ttnet.b.a())) {
                        return true;
                    }
                    return false;
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
            public void handleMsg(Message message) {
                switch (message.what) {
                    case 101:
                        this.p.set(System.currentTimeMillis());
                        Logger.debug();
                        this.f44434b.set(false);
                        return;
                    case 102:
                        Logger.debug();
                        this.f44434b.set(false);
                        return;
                    case 103:
                        Logger.debug();
                        a(c.a.TTPOLL);
                        return;
                    default:
                        return;
                }
            }

            @Override // com.bytedance.frameworks.baselib.network.http.e.c
            public final String a(String str) {
                if (m.a(str)) {
                    return str;
                }
                try {
                    if (this.o) {
                        i();
                    } else {
                        h();
                    }
                } catch (Throwable unused) {
                }
                return str;
            }

            public static a a(Context context) {
                a aVar;
                MethodCollector.i(8174);
                synchronized (a.class) {
                    try {
                        if (n == null) {
                            boolean a2 = com.bytedance.frameworks.baselib.network.http.g.f.a(context);
                            Context applicationContext = context.getApplicationContext();
                            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                                if (applicationContext == null) {
                                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                                }
                            }
                            n = new a(applicationContext, a2);
                            if (N.contains(Build.MODEL)) {
                                f44433m = true;
                            }
                            f44430a = context.getPackageName();
                            if (a2) {
                                com.bytedance.frameworks.a.a.a.f28815a = n;
                                h.f29079g = n;
                                h.f29078f = n;
                                com.bytedance.ttnet.c.f44544a = n;
                                com.bytedance.frameworks.baselib.network.a.c cVar = c.a.f28835a;
                                a aVar2 = n;
                                if (aVar2 != null) {
                                    cVar.f28830b.add(aVar2);
                                }
                                cVar.f28829a.get();
                                e.f29329a = n;
                                e.f29330b = n;
                                if (e.f29337i == null) {
                                    e.f29337i = n;
                                }
                            } else {
                                IntentFilter intentFilter = new IntentFilter();
                                intentFilter.addAction("com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG");
                                try {
                                    b(context, new C1088a(), intentFilter);
                                } catch (Throwable unused) {
                                }
                                f a3 = f.a();
                                com.bytedance.frameworks.a.a.a.f28815a = a3;
                                h.f29079g = a3;
                                h.f29078f = a3;
                                com.bytedance.ttnet.c.f44544a = a3;
                                if (e.f29337i == null) {
                                    e.f29337i = a3;
                                }
                            }
                            e.f29336h = n;
                            c.a(context);
                        }
                        aVar = n;
                    } finally {
                        MethodCollector.o(8174);
                    }
                }
                return aVar;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.e.AbstractC0626e
            public final boolean b(String str) {
                if (m.a(str) || this.F <= 0) {
                    return false;
                }
                try {
                    URI a2 = com.bytedance.frameworks.baselib.network.http.g.g.a(str);
                    if (a2 == null || m.a(a2.getHost())) {
                        return false;
                    }
                    TTNetInit.getTTNetDepend();
                    throw new IllegalArgumentException("cdnHostSuffix is not init !!!");
                } catch (Throwable unused) {
                    return false;
                }
            }

            public final void a(c.a aVar) {
                if (this.o) {
                    b(aVar);
                } else if (this.p.get() <= 0) {
                    try {
                        new com.bytedance.common.utility.b.e() {
                            /* class com.bytedance.ttnet.a.a.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(27227);
                            }

                            @Override // com.bytedance.common.utility.b.e
                            public final void run() {
                                a.this.h();
                            }
                        }.a();
                    } catch (Throwable unused) {
                    }
                }
            }

            private void a(JSONObject jSONObject, String str) {
                try {
                    jSONObject.put("return", str);
                    jSONObject.put("CurrentShareCookieHostList", this.f44438f.toString());
                } catch (JSONException unused) {
                }
                TTNetInit.getTTNetDepend();
                TTNetInit.getTTNetDepend().a();
            }

            private a(Context context, boolean z2) {
                this.f44435c = context;
                this.o = z2;
            }

            private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
                try {
                    return context.registerReceiver(broadcastReceiver, intentFilter);
                } catch (Exception e2) {
                    if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                        return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                    }
                    throw e2;
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
                r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
                r2 = r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
                if (r0 != false) goto L_0x0025;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
                throw r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
                r2 = move-exception;
                r2 = r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
                com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
                return null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
                return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
                r2 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
                r0 = r2.getMessage();
                r2 = r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
                if (r0 != null) goto L_0x0018;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
                /*
                    android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
                    com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
                    android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
                    return r0
                L_0x000c:
                    android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
                    return r0
                L_0x0011:
                    r2 = move-exception
                    java.lang.String r0 = r2.getMessage()
                    if (r0 == 0) goto L_0x0027
                    java.lang.String r1 = r2.getMessage()
                    java.lang.String r0 = "regist too many Broadcast Receivers"
                    boolean r0 = r1.contains(r0)
                    if (r0 != 0) goto L_0x0025
                    goto L_0x0027
                L_0x0025:
                    throw r2
                L_0x0026:
                    r2 = move-exception
                L_0x0027:
                    java.lang.String r0 = "Register Receiver Exception"
                    com.bytedance.c.a.a.a.b.a(r2, r0)
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.a.a.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
            }

            @Override // com.bytedance.frameworks.baselib.network.http.e.h
            public final List<String> a(CookieManager cookieManager, com.bytedance.frameworks.baselib.network.http.c.a aVar, URI uri) {
                String str;
                if (uri == null) {
                    return null;
                }
                if (cookieManager == null && aVar == null) {
                    return null;
                }
                try {
                    str = uri.getHost();
                } catch (Exception unused) {
                    str = null;
                }
                if (m.a(str) || !com.bytedance.ttnet.utils.d.a(str, this.f44438f) || m.a(TTNetInit.getTTNetDepend().d())) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                if (cookieManager != null) {
                    String cookie = cookieManager.getCookie(uri.getScheme() + "://" + TTNetInit.getTTNetDepend().d());
                    if (!m.a(cookie)) {
                        arrayList.add(cookie);
                        return arrayList;
                    }
                }
                if (!com.bytedance.common.utility.h.a(arrayList) || aVar == null) {
                    return arrayList;
                }
                try {
                    Map<String, List<String>> map = aVar.get(URI.create(uri.getScheme() + "://" + TTNetInit.getTTNetDepend().d()), new LinkedHashMap());
                    if (map == null || map.isEmpty()) {
                        return arrayList;
                    }
                    return map.get("Cookie");
                } catch (Throwable unused2) {
                    return arrayList;
                }
            }

            @Override // com.bytedance.frameworks.baselib.network.http.e.c
            public final void a(String str, String str2, boolean z2) {
                if (!this.J.isEmpty()) {
                    for (String str3 : this.J) {
                        if (!m.a(str3) && str.endsWith(str3)) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("url", str + str2);
                                jSONObject.put("replace", z2);
                                TTNetInit.monitorLogSend("api_http", jSONObject);
                            } catch (Throwable unused) {
                            }
                            if (TTNetInit.apiHttpInterceptEnabled() && !z2) {
                                throw new com.bytedance.frameworks.baselib.network.http.b.f("Api http request is not allowed to be executed");
                            }
                            return;
                        }
                    }
                }
            }
        }
