package com.ss.android.ugc.playerkit.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class v {
    public static final int U = 20;
    public static final int V = 15;
    public static final List<String> W = com.ss.android.ugc.playerkit.simapicommon.a.a().redirectHosts();
    public static final a X = new a((byte) 0);
    public int A;
    public String B;
    public int C;
    public int D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public long M;
    public long N;
    public Map<String, String> O;
    public int P;
    public int Q;
    public int R;
    public long S;
    public int T;

    /* renamed from: a  reason: collision with root package name */
    public int f148833a;

    /* renamed from: b  reason: collision with root package name */
    public String f148834b;

    /* renamed from: c  reason: collision with root package name */
    public String f148835c;

    /* renamed from: d  reason: collision with root package name */
    public String f148836d;

    /* renamed from: e  reason: collision with root package name */
    public int f148837e;

    /* renamed from: f  reason: collision with root package name */
    public Long f148838f;

    /* renamed from: g  reason: collision with root package name */
    public Long f148839g;

    /* renamed from: h  reason: collision with root package name */
    public Long f148840h;

    /* renamed from: i  reason: collision with root package name */
    public Long f148841i;

    /* renamed from: j  reason: collision with root package name */
    public Long f148842j;

    /* renamed from: k  reason: collision with root package name */
    public Integer f148843k;

    /* renamed from: l  reason: collision with root package name */
    public Integer f148844l;

    /* renamed from: m  reason: collision with root package name */
    public String f148845m;
    public String n;
    public int o;
    public int p;
    public int q;
    public Long r;
    public Long s;
    public Long t;
    public Long u;
    public Long v;
    public Long w;
    public Long x;
    public Long y;
    public int z;

    public static final class a {
        static {
            Covode.recordClassIndex(98018);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(98017);
    }

    public v() {
        this.f148833a = 1;
        this.f148837e = -1;
        this.f148838f = -1L;
        this.f148839g = -1L;
        this.f148840h = -1L;
        this.f148841i = -1L;
        this.f148842j = -1L;
        this.f148843k = -1;
        this.f148844l = -1;
        this.o = -1;
        this.p = -1;
        this.q = -100;
        this.r = -1L;
        this.s = -1L;
        this.t = -1L;
        this.u = -1L;
        this.v = -1L;
        this.w = -1L;
        this.x = -1L;
        this.y = -1L;
        this.z = -1;
        this.A = -1;
        this.C = -1;
        this.D = -1;
        this.Q = -1;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ip", w.a(this.f148835c, V));
            jSONObject.put("host", w.a(this.f148836d, U));
            jSONObject.put("key", this.f148834b);
            jSONObject.put("is_https", this.f148837e);
            jSONObject.put("dl_size", this.f148838f);
            jSONObject.put("dl_offset", this.f148839g);
            jSONObject.put("fbb_time", this.f148840h);
            jSONObject.put("rsp_time", this.f148841i);
            jSONObject.put("file_len", this.f148842j);
            jSONObject.put("hit_code", this.f148843k);
            jSONObject.put("hit_code_l2", this.f148844l);
            jSONObject.put("cdn_hit_str", this.f148845m);
            jSONObject.put("http_code", this.o);
            jSONObject.put("err_code", this.p);
            jSONObject.put("err_stage", this.q);
            jSONObject.put("req_st", this.r);
            Long l2 = this.s;
            if (!(l2 == null || l2.longValue() == -1)) {
                Long l3 = this.s;
                if (l3 == null) {
                    l.a();
                }
                jSONObject.put("dns_st", l3.longValue());
            }
            Long l4 = this.t;
            if (!(l4 == null || l4.longValue() == -1)) {
                Long l5 = this.t;
                if (l5 == null) {
                    l.a();
                }
                jSONObject.put("dns_et", l5.longValue());
            }
            Long l6 = this.u;
            if (!(l6 == null || l6.longValue() == -1)) {
                Long l7 = this.u;
                if (l7 == null) {
                    l.a();
                }
                jSONObject.put("tcp_st", l7.longValue());
            }
            Long l8 = this.v;
            if (!(l8 == null || l8.longValue() == -1)) {
                Long l9 = this.v;
                if (l9 == null) {
                    l.a();
                }
                jSONObject.put("tcp_et", l9.longValue());
            }
            Long l10 = this.w;
            if (!(l10 == null || l10.longValue() == -1)) {
                Long l11 = this.w;
                if (l11 == null) {
                    l.a();
                }
                jSONObject.put("tls_st", l11.longValue());
            }
            Long l12 = this.x;
            if (!(l12 == null || l12.longValue() == -1)) {
                Long l13 = this.x;
                if (l13 == null) {
                    l.a();
                }
                jSONObject.put("tls_et", l13.longValue());
            }
            jSONObject.put("cdn_hit", this.n);
            jSONObject.put("tls_ver", this.B);
            jSONObject.put("fb_t", this.y);
            jSONObject.put("socket_reuse", this.z);
            jSONObject.put("tls_resume", this.A);
            jSONObject.put("url_idx", this.C);
            jSONObject.put("task_type", this.D);
            jSONObject.put("server_timing", this.E);
            jSONObject.put("isRedirect", this.T);
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    public final String toString() {
        return "RequestInfo(type=" + this.f148833a + ", key=" + this.f148834b + ", ip=" + this.f148835c + ", host=" + this.f148836d + ", is_https=" + this.f148837e + ", dl_size=" + this.f148838f + ", dl_offset=" + this.f148839g + ", fbb_time=" + this.f148840h + ", rsp_time=" + this.f148841i + ", file_len=" + this.f148842j + ", hit_code=" + this.f148843k + ", hit_code_l2=" + this.f148844l + ", cdn_hit_str=" + this.f148845m + ", cdn_hit=" + this.n + ", http_code=" + this.o + ", err_code=" + this.p + ", err_stage=" + this.q + ", req_st=" + this.r + ", dns_st=" + this.s + ", dns_et=" + this.t + ", tcp_st=" + this.u + ", tcp_et=" + this.v + ", tls_st=" + this.w + ", tls_et=" + this.x + ", fb_t=" + this.y + ", socket_reuse=" + this.z + ", tls_resume=" + this.A + ", tls_ver=" + this.B + ", url_idx=" + this.C + ", task_type=" + this.D + ", server_timing=" + this.E + ", dnsAddr=" + this.F + ", hostName=" + this.G + ", originUrl=" + this.H + ", finalUrl=" + this.I + ", localIp=" + this.J + ", remoteIp=" + this.K + ',' + " userAgent=" + this.L + ", duration=" + this.M + ", size=" + this.N + ", headers=" + this.O + ", statusCode=" + this.P + ", urlIndex=" + this.Q + ", urlCount=" + this.R + ", ttfb=" + this.S + ", isRedirect=" + this.T + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public v(b bVar) {
        this();
        int i2;
        String str = "";
        l.c(bVar, str);
        int i3 = 0;
        if (bVar.f148689a == 1) {
            this.f148833a = 1;
            this.f148834b = bVar.f148696h;
            this.f148835c = bVar.n;
            this.f148836d = bVar.C;
            this.f148837e = bVar.f148698j;
            this.f148838f = Long.valueOf(bVar.f148691c);
            this.f148839g = Long.valueOf(bVar.G);
            this.f148840h = Long.valueOf(bVar.f148697i - bVar.f148700l);
            this.f148841i = Long.valueOf(bVar.f148701m - bVar.f148700l);
            this.f148842j = Long.valueOf(bVar.f148690b);
            String str2 = bVar.z;
            String str3 = bVar.A;
            if (!TextUtils.isEmpty(str2)) {
                i2 = w.a(str2);
            } else if (!TextUtils.isEmpty(str3)) {
                i2 = w.a(str3);
            } else {
                i2 = 0;
            }
            this.f148843k = Integer.valueOf(i2);
            String str4 = bVar.B;
            this.f148844l = Integer.valueOf(TextUtils.isEmpty(str4) ? w.a(str4) : i3);
            String str5 = bVar.z;
            String str6 = bVar.A;
            if (!TextUtils.isEmpty(str5)) {
                if (str5 == null) {
                    l.a();
                }
                if (str5.length() >= 50) {
                    String substring = str5.substring(50);
                    l.a((Object) substring, str);
                    str = substring.toString();
                }
            } else if (!TextUtils.isEmpty(str6)) {
                if (str6 == null) {
                    l.a();
                }
                if (str6.length() >= 50) {
                    String substring2 = str6.substring(50);
                    l.a((Object) substring2, str);
                    str = substring2.toString();
                }
            }
            this.f148845m = str;
            this.n = bVar.F;
            this.B = bVar.E;
            this.o = bVar.q;
            this.p = bVar.f148694f;
            this.q = bVar.f148695g;
            this.r = Long.valueOf(bVar.f148700l);
            this.s = Long.valueOf(bVar.f148692d);
            this.t = Long.valueOf(bVar.f148693e);
            this.u = Long.valueOf(bVar.t);
            this.v = Long.valueOf(bVar.s);
            this.w = Long.valueOf(bVar.v);
            this.x = Long.valueOf(bVar.u);
            this.y = Long.valueOf(bVar.w);
            this.z = bVar.p;
            this.A = bVar.D;
            this.C = bVar.y;
            this.D = bVar.r;
            this.E = bVar.o;
            this.T = bVar.f148699k;
        } else if (bVar.f148689a == 2) {
            this.f148833a = 2;
            this.f148834b = bVar.f148696h;
            this.G = bVar.C;
            this.F = bVar.H;
            this.H = bVar.I;
            this.I = bVar.J;
            this.J = bVar.K;
            this.K = bVar.n;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.q;
            this.Q = bVar.P;
            this.R = bVar.Q;
            if (!TextUtils.equals(bVar.I, bVar.J)) {
                String str7 = bVar.I;
                if (!TextUtils.isEmpty(str7)) {
                    for (String str8 : W) {
                        if (str7 == null) {
                            l.a();
                        }
                        l.a((Object) str8, str);
                        if (p.a((CharSequence) str7, (CharSequence) str8, false)) {
                            this.T = 1;
                            return;
                        }
                    }
                }
            }
        }
    }
}
