package com.ss.ttvideoengine.h;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ttvideoengine.ag;
import com.ss.ttvideoengine.ah;
import com.ss.ttvideoengine.h.aa;
import com.ss.ttvideoengine.j.e;
import com.ss.ttvideoengine.s.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static volatile String f152646b = "unknown";

    /* renamed from: c  reason: collision with root package name */
    public static volatile String f152647c = "unknown";

    /* renamed from: d  reason: collision with root package name */
    static ag f152648d;
    public String A;
    public int B;
    public String C = "";
    public String D = "";
    public int E;
    public int F;
    public int G;
    public int H = Integer.MIN_VALUE;
    public int I = Integer.MIN_VALUE;
    public String J = "";
    public int K = Integer.MIN_VALUE;
    public int L = Integer.MIN_VALUE;
    public int M = Integer.MIN_VALUE;
    public String N = "";
    public String O = "";
    public String P = "";
    public String Q = "";
    public int R = Integer.MIN_VALUE;
    public int S = Integer.MIN_VALUE;
    public String T = "default";
    public String U = "default";
    public int V;
    public int W;
    public String X = "";
    public float Y = 1.0f;
    public String Z = "";

    /* renamed from: a  reason: collision with root package name */
    public f f152649a;
    public Map aa;
    public String ab = "";
    public Context ac;
    public String ad = "";
    public String ae = "";
    public String af = "";
    public boolean ag;
    public String ah;
    public a ai = new a();
    public a aj = new a();
    public int ak = Integer.MIN_VALUE;
    public Map al = null;
    public int am;
    public int an = 0;
    public int ao;
    public int ap;
    public Map<String, Object> aq = null;
    public int ar = -1;
    public boolean as;

    /* renamed from: e  reason: collision with root package name */
    ah f152650e;

    /* renamed from: f  reason: collision with root package name */
    WeakReference<ah> f152651f;

    /* renamed from: g  reason: collision with root package name */
    public String f152652g;

    /* renamed from: h  reason: collision with root package name */
    public String f152653h = "";

    /* renamed from: i  reason: collision with root package name */
    public String f152654i = "";

    /* renamed from: j  reason: collision with root package name */
    public String f152655j = "";

    /* renamed from: k  reason: collision with root package name */
    public String f152656k = "";

    /* renamed from: l  reason: collision with root package name */
    public String f152657l = "";

    /* renamed from: m  reason: collision with root package name */
    public String f152658m = "";
    public String n = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y = "";
    public String z;

    static String a(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "unknown" : "5G" : "3G" : "2G" : "4G" : "WIFI";
    }

    static String b(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "unknown" : "excellent" : "good" : "medium" : "weak";
    }

    static {
        Covode.recordClassIndex(101619);
    }

    public static String d() {
        ag agVar;
        if (f152646b.equals("unknown") && (agVar = f152648d) != null) {
            f152646b = a(agVar.f152179a);
        }
        return f152646b;
    }

    public final JSONObject b() {
        String c2;
        MethodCollector.i(10898);
        JSONObject jSONObject = null;
        if (this.f152649a != null) {
            synchronized (this) {
                try {
                    c2 = this.f152649a.c();
                } finally {
                    MethodCollector.o(10898);
                }
            }
            j.b("VideoEventBase", "update mdl info: ".concat(String.valueOf(c2)));
            if (!TextUtils.isEmpty(c2)) {
                try {
                    jSONObject = new JSONObject(c2);
                } catch (JSONException e2) {
                    j.e("VideoEventBase", e2.toString());
                }
            }
        }
        return jSONObject;
    }

    public final void e() {
        String str;
        if (this.ag) {
            aa aaVar = aa.b.f152568a;
            String str2 = this.ah;
            if (TextUtils.isEmpty(str2)) {
                j.a("VideoEventOneStorage", "getSessionId return");
                str = null;
            } else {
                aa.a b2 = aaVar.b(str2);
                j.a("VideoEventOneStorage", "getSessionId, session id:" + b2.f152565a);
                str = b2.f152565a;
            }
            j.b("VideoEventBase", "degradeModeChangeSession, stored sessionid:" + str + ", current sessionid:" + this.r);
            if (str != null && !str.equals(this.r)) {
                j.a("VideoEventBase", com.a.a("degrade mode, change sessionId, before:%s, after:%s", new Object[]{this.r, str}));
                this.r = str;
                this.Z = str;
            }
        }
    }

    public final void c() {
        JSONObject b2 = b();
        if (b2 != null) {
            boolean z2 = false;
            try {
                if (!b2.isNull(DataType.AUDIO)) {
                    this.aj.a(b2.getJSONObject(DataType.AUDIO));
                    z2 = true;
                }
                if (!b2.isNull("video")) {
                    j.b("VideoEventBase", "found video: " + b2.getJSONObject("video").toString());
                    this.ai.a(b2.getJSONObject("video"));
                } else if (!z2) {
                    this.ai.a(b2);
                }
                if (!b2.isNull("cur_task_num")) {
                    this.ak = ((Integer) b2.get("cur_task_num")).intValue();
                }
                if (!b2.isNull("dns_type")) {
                    int intValue = ((Integer) b2.get("dns_type")).intValue();
                    if (intValue == 0) {
                        this.y = "localDNS";
                    } else if (intValue == 2 || intValue == 3) {
                        this.y = "httpDNS";
                    } else if (intValue == 4) {
                        f fVar = this.f152649a;
                        if (fVar == null || fVar.c(85) != 1) {
                            this.y = "customDNS";
                        } else {
                            this.y = "customDNSInnerByteDanceHTTPDNS";
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final void a() {
        Map<String, String> a2;
        Object obj;
        Map map = this.aa;
        if (map != null) {
            if (this.H <= 0) {
                this.H = ((Integer) map.get("duration")).intValue() * 1000;
            }
            Object obj2 = ((Map) this.aa.get("size")).get(this.Q);
            int i2 = -1;
            if (obj2 != null) {
                i2 = ((Long) obj2).intValue();
            }
            this.I = i2;
            Map map2 = (Map) this.aa.get("codec");
            if (map2.get(this.Q) != null) {
                obj = map2.get(this.Q);
            } else {
                obj = "";
            }
            this.J = (String) obj;
        }
        if (this.f152649a != null) {
            String str = this.f152653h;
            if ((str == null || str.isEmpty()) && (a2 = this.f152649a.a()) != null) {
                this.f152653h = a2.get("pv");
                this.f152654i = a2.get("pc");
                this.f152655j = a2.get("sv");
                this.f152656k = a2.get("sdk_version");
                this.f152657l = a2.get("ffv");
                this.f152658m = a2.get("vcnv");
                this.n = a2.get("trv");
                this.p = a2.get("abrv");
                this.q = a2.get("prdtv");
                this.o = a2.get("prldv");
            }
            if (TextUtils.isEmpty(this.J)) {
                String a3 = this.f152649a.a(0);
                if (!TextUtils.isEmpty(a3)) {
                    this.J = a3;
                }
            }
            String a4 = this.f152649a.a(37);
            if (!TextUtils.isEmpty(a4)) {
                this.ad = a4;
            }
            j.a("VideoEventBase", "video_type:" + this.N);
            if (TextUtils.isEmpty(this.N)) {
                String a5 = this.f152649a.a(65);
                j.a("VideoEventBase", "get video_type from player:".concat(String.valueOf(a5)));
                if (!TextUtils.isEmpty(a5)) {
                    if (a5.indexOf("mp4") > 0) {
                        this.N = "mp4";
                    } else {
                        int indexOf = a5.indexOf(",");
                        if (indexOf < 0) {
                            this.N = a5;
                        } else {
                            this.N = a5.substring(0, indexOf);
                        }
                    }
                }
            }
            j.a("VideoEventBase", "video_size :" + this.I);
            if (this.I <= 0) {
                this.I = (int) this.f152649a.b(66);
                j.a("VideoEventBase", "get video_size from player:" + this.I);
            }
            this.L = this.f152649a.c(24);
            this.K = this.f152649a.c(25);
            switch (this.L) {
                case 2:
                    this.E = 1;
                    break;
                case 3:
                case 4:
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    this.E = 0;
                    break;
            }
            this.M = this.f152649a.c(49);
        }
    }

    public final a a(JSONObject jSONObject) {
        a aVar = new a();
        aVar.a(jSONObject);
        return aVar;
    }

    public class a {
        public long A = -2147483648L;
        public long B = -2147483648L;
        public long C = -2147483648L;
        public long D = -2147483648L;
        public int E = Integer.MIN_VALUE;
        public long F = -2147483648L;
        public long G = -2147483648L;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public String K = "";
        public String L = "";
        public int M = -1;
        public int N = 1;
        public String O = "";
        public String P = "";
        public int Q = Integer.MIN_VALUE;
        public String R = "";
        public String S = "";
        public int T = -1;

        /* renamed from: a  reason: collision with root package name */
        public long f152660a = -2147483648L;

        /* renamed from: b  reason: collision with root package name */
        public long f152661b = -2147483648L;

        /* renamed from: c  reason: collision with root package name */
        public long f152662c = -2147483648L;

        /* renamed from: d  reason: collision with root package name */
        public int f152663d;

        /* renamed from: e  reason: collision with root package name */
        public String f152664e = "";

        /* renamed from: f  reason: collision with root package name */
        public String f152665f = "";

        /* renamed from: g  reason: collision with root package name */
        public String f152666g = "";

        /* renamed from: h  reason: collision with root package name */
        public long f152667h = -2147483648L;

        /* renamed from: i  reason: collision with root package name */
        public long f152668i = -2147483648L;

        /* renamed from: j  reason: collision with root package name */
        public long f152669j = -2147483648L;

        /* renamed from: k  reason: collision with root package name */
        public int f152670k = Integer.MIN_VALUE;

        /* renamed from: l  reason: collision with root package name */
        public int f152671l = Integer.MIN_VALUE;

        /* renamed from: m  reason: collision with root package name */
        public int f152672m;
        public int n = Integer.MIN_VALUE;
        public String o = "";
        public int p = -1;
        public int q = -1;
        public String r = "";
        public int s = -1;
        public String t = "";
        public int u = -1;
        public long v = -2147483648L;
        public long w = -2147483648L;
        public long x = -2147483648L;
        public long y = -2147483648L;
        public long z = -2147483648L;

        static {
            Covode.recordClassIndex(101621);
        }

        public a() {
        }

        public final void a(JSONObject jSONObject) {
            if (jSONObject != null) {
                if (!jSONObject.isNull("cur_req_pos")) {
                    this.f152660a = ((Number) jSONObject.get("cur_req_pos")).longValue();
                }
                if (!jSONObject.isNull("cur_end_pos")) {
                    this.f152661b = ((Number) jSONObject.get("cur_end_pos")).longValue();
                }
                if (!jSONObject.isNull("cur_cache_pos")) {
                    this.f152662c = ((Number) jSONObject.get("cur_cache_pos")).longValue();
                }
                if (!jSONObject.isNull("cache_type")) {
                    this.f152663d = ((Number) jSONObject.get("cache_type")).intValue();
                }
                if (!jSONObject.isNull("down_pos")) {
                    this.f152668i = ((Number) jSONObject.get("down_pos")).longValue();
                }
                if (!jSONObject.isNull("err_code")) {
                    this.f152672m = ((Integer) jSONObject.get("err_code")).intValue();
                }
                if (!jSONObject.isNull("player_wait_num")) {
                    this.f152670k = ((Integer) jSONObject.get("player_wait_num")).intValue();
                }
                if (!jSONObject.isNull("player_wait_time")) {
                    this.f152669j = ((Number) jSONObject.get("player_wait_time")).longValue();
                }
                if (!jSONObject.isNull("reply_size")) {
                    this.f152667h = ((Number) jSONObject.get("reply_size")).longValue();
                }
                if (!jSONObject.isNull("stage")) {
                    this.f152671l = ((Integer) jSONObject.get("stage")).intValue();
                }
                if (!jSONObject.isNull("cur_host")) {
                    this.f152665f = jSONObject.get("cur_host").toString();
                }
                if (!jSONObject.isNull("cur_ip")) {
                    this.f152664e = jSONObject.get("cur_ip").toString();
                }
                if (!jSONObject.isNull("speed")) {
                    this.n = ((Integer) jSONObject.get("speed")).intValue();
                }
                if (!jSONObject.isNull("url")) {
                    this.f152666g = jSONObject.get("url").toString();
                }
                if (!jSONObject.isNull("file_key")) {
                    this.o = jSONObject.get("file_key").toString();
                }
                if (!jSONObject.isNull("is_socrf")) {
                    this.p = ((Integer) jSONObject.get("is_socrf")).intValue();
                }
                if (!jSONObject.isNull("url_index")) {
                    this.q = ((Integer) jSONObject.get("url_index")).intValue();
                }
                if (!jSONObject.isNull("re_url")) {
                    this.r = jSONObject.get("re_url").toString();
                }
                if (!jSONObject.isNull("cur_source")) {
                    this.s = ((Integer) jSONObject.get("cur_source")).intValue();
                }
                if (!jSONObject.isNull("extra_info")) {
                    this.t = jSONObject.get("extra_info").toString();
                }
                if (!jSONObject.isNull("status_code")) {
                    this.u = ((Integer) jSONObject.get("status_code")).intValue();
                }
                if (!jSONObject.isNull("req_t")) {
                    this.v = ((Number) jSONObject.get("req_t")).longValue();
                }
                if (!jSONObject.isNull("end_t")) {
                    this.w = ((Number) jSONObject.get("end_t")).longValue();
                }
                if (!jSONObject.isNull("dns_t")) {
                    this.x = ((Number) jSONObject.get("dns_t")).longValue();
                }
                if (!jSONObject.isNull("tcp_con_start_t")) {
                    this.y = ((Number) jSONObject.get("tcp_con_start_t")).longValue();
                }
                if (!jSONObject.isNull("tcp_con_t")) {
                    this.z = ((Number) jSONObject.get("tcp_con_t")).longValue();
                }
                if (!jSONObject.isNull("tcp_first_pack_t")) {
                    this.A = ((Number) jSONObject.get("tcp_first_pack_t")).longValue();
                }
                if (!jSONObject.isNull("http_first_body_t")) {
                    this.B = ((Number) jSONObject.get("http_first_body_t")).longValue();
                }
                if (!jSONObject.isNull("http_open_end_t")) {
                    this.C = ((Number) jSONObject.get("http_open_end_t")).longValue();
                }
                if (!jSONObject.isNull("fs")) {
                    this.D = ((Number) jSONObject.get("fs")).longValue();
                }
                if (!jSONObject.isNull("full_speed")) {
                    this.E = ((Integer) jSONObject.get("full_speed")).intValue();
                }
                if (!jSONObject.isNull("tbs")) {
                    this.F = ((Number) jSONObject.get("tbs")).longValue();
                }
                if (!jSONObject.isNull("lbs")) {
                    this.G = ((Number) jSONObject.get("lbs")).longValue();
                }
                if (!jSONObject.isNull("req_err")) {
                    this.H = ((Integer) jSONObject.get("req_err")).intValue();
                }
                if (!jSONObject.isNull("read_src")) {
                    this.I = ((Integer) jSONObject.get("read_src")).intValue();
                }
                if (!jSONObject.isNull("seek_times")) {
                    this.J = ((Integer) jSONObject.get("seek_times")).intValue();
                }
                if (!jSONObject.isNull("last_msg")) {
                    this.K = jSONObject.get("last_msg").toString();
                }
                if (!jSONObject.isNull("server_timing")) {
                    this.L = jSONObject.get("server_timing").toString();
                }
                if (!jSONObject.isNull("v_lt")) {
                    this.M = ((Integer) jSONObject.get("v_lt")).intValue();
                }
                if (!jSONObject.isNull("v_p2p_ier")) {
                    this.N = ((Integer) jSONObject.get("v_p2p_ier")).intValue();
                }
                if (!jSONObject.isNull("req_num")) {
                    this.Q = ((Integer) jSONObject.get("req_num")).intValue();
                }
                if (!jSONObject.isNull("ip_list")) {
                    this.O = jSONObject.get("ip_list").toString();
                }
                if (!jSONObject.isNull("blocked_ip")) {
                    this.P = jSONObject.get("blocked_ip").toString();
                }
                if (!jSONObject.isNull("cdn_cache")) {
                    this.R = jSONObject.get("cdn_cache").toString();
                }
                if (!jSONObject.isNull("client_info")) {
                    this.S = jSONObject.get("client_info").toString();
                }
                if (!jSONObject.isNull("disable_seek")) {
                    this.T = ((Integer) jSONObject.get("disable_seek")).intValue();
                }
            }
        }
    }

    public final void a(e eVar) {
        Object obj;
        List<com.ss.ttvideoengine.j.o> b2;
        if (eVar != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (eVar.a() && (b2 = eVar.b()) != null && b2.size() > 0) {
                int i2 = 0;
                for (com.ss.ttvideoengine.j.o oVar : b2) {
                    int a2 = oVar.a();
                    String wVar = oVar.c().toString(a2);
                    hashMap.put(wVar, Long.valueOf(oVar.c(12)));
                    hashMap2.put(wVar, oVar.b(8));
                    hashMap3.put(wVar, Integer.valueOf(oVar.a(3)));
                    hashMap4.put(Integer.valueOf(oVar.a(3)), oVar.b(15));
                    hashMap5.put(Integer.valueOf(oVar.a(3)), Integer.valueOf(i2));
                    if (a2 == 1) {
                        arrayList.add(Integer.valueOf(oVar.a(3)));
                    } else {
                        arrayList2.add(Integer.valueOf(oVar.a(3)));
                    }
                    i2++;
                }
            }
            HashMap hashMap6 = new HashMap();
            String g2 = eVar.g();
            String h2 = eVar.h();
            hashMap6.put("duration", Integer.valueOf(eVar.a(3)));
            hashMap6.put("size", hashMap);
            hashMap6.put("codec", hashMap2);
            hashMap6.put("vtype", g2);
            hashMap6.put("dynamic_type", h2);
            hashMap6.put("bitrate", hashMap3);
            hashMap6.put("fileKey", hashMap4);
            hashMap6.put("bitrateMapTable", hashMap5);
            hashMap6.put("audio_bitrate", arrayList);
            hashMap6.put("video_bitrate", arrayList2);
            this.aa = hashMap6;
            if (!TextUtils.isEmpty(this.Q) && (obj = hashMap3.get(this.Q)) != null) {
                this.R = ((Integer) obj).intValue();
            }
            this.N = g2;
            this.O = h2;
        }
    }

    public final void a(String str, String str2) {
        Object obj;
        this.P = str2;
        this.Q = str;
        Map map = this.aa;
        if (map != null && (obj = ((Map) map.get("bitrate")).get(this.Q)) != null) {
            this.R = ((Integer) obj).intValue();
        }
    }

    o(f fVar, boolean z2, Context context) {
        this.f152649a = fVar;
        this.r = Base64.encodeToString(((new String() + new Random().nextInt()) + System.currentTimeMillis()).getBytes(), 2);
        this.as = z2;
        this.ac = context;
    }
}
