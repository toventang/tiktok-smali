package com.ss.ttvideoengine.h;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttvideoengine.s.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public o f152762a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap f152763b;

    /* renamed from: c  reason: collision with root package name */
    public b f152764c;

    /* renamed from: d  reason: collision with root package name */
    public long f152765d = -2147483648L;

    /* renamed from: e  reason: collision with root package name */
    public long f152766e = -2147483648L;

    /* renamed from: f  reason: collision with root package name */
    public int f152767f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<String> f152768g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public int f152769h = 0;

    static {
        Covode.recordClassIndex(101640);
    }

    private void c() {
        this.f152762a.a();
        if ((this.f152769h & 1) != 0) {
            j.a("VideoEventOneOpera", "report async");
            com.ss.ttvideoengine.s.b.a(new a(this.f152762a.ac, this, this.f152762a, this.f152764c));
        }
    }

    public final void a() {
        MethodCollector.i(13577);
        synchronized (this.f152763b) {
            try {
                this.f152763b = new HashMap();
            } catch (Throwable th) {
                MethodCollector.o(13577);
                throw th;
            }
        }
        this.f152767f = 0;
        this.f152768g = new ArrayList<>();
        MethodCollector.o(13577);
    }

    public final long b() {
        MethodCollector.i(13578);
        if (this.f152764c.f152783f > 0) {
            MethodCollector.o(13578);
            return 0;
        }
        synchronized (this.f152763b) {
            try {
                if (this.f152763b.containsKey("seek")) {
                    return ((Long) this.f152763b.get("seek")).longValue();
                }
                MethodCollector.o(13578);
                return -1;
            } finally {
                MethodCollector.o(13578);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private x f152770a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f152771b = new Handler(Looper.getMainLooper());

        /* renamed from: c  reason: collision with root package name */
        private o f152772c;

        /* renamed from: d  reason: collision with root package name */
        private Context f152773d;

        /* renamed from: e  reason: collision with root package name */
        private b f152774e;

        static {
            Covode.recordClassIndex(101641);
        }

        public final void run() {
            final boolean z;
            MethodCollector.i(13889);
            if (this.f152770a == null) {
                MethodCollector.o(13889);
                return;
            }
            o oVar = this.f152772c;
            if (oVar != null) {
                oVar.c();
                this.f152772c.ab = o.d();
            }
            o oVar2 = this.f152772c;
            if (oVar2 == null || !oVar2.as) {
                z = false;
            } else {
                z = true;
            }
            x xVar = this.f152770a;
            b bVar = this.f152774e;
            o oVar3 = this.f152772c;
            HashMap hashMap = new HashMap();
            if (oVar3 != null) {
                l.a(hashMap, "player_sessionid", oVar3.r);
                if (oVar3.v == null || oVar3.v.isEmpty()) {
                    l.a(hashMap, "cdn_url", oVar3.s);
                } else {
                    l.a(hashMap, "cdn_url", oVar3.v);
                }
                if (oVar3.x == null || oVar3.x.isEmpty()) {
                    l.a(hashMap, "cdn_ip", oVar3.u);
                } else {
                    l.a(hashMap, "cdn_ip", oVar3.x);
                }
                l.a(hashMap, "source_type", oVar3.D);
                l.a(hashMap, "v", oVar3.C);
                l.a(hashMap, "pv", oVar3.f152653h);
                l.a(hashMap, "pc", oVar3.f152654i);
                l.a(hashMap, "sv", oVar3.f152655j);
                l.a(hashMap, "sdk_version", oVar3.f152656k);
                l.a(hashMap, "vtype", oVar3.N);
                l.a(hashMap, "tag", oVar3.T);
                l.a(hashMap, "subtag", oVar3.U);
                l.a((Map) hashMap, "p2p_cdn_type", oVar3.S);
                l.a(hashMap, "codec", oVar3.J);
                l.a((Map) hashMap, "video_codec_nameid", oVar3.L);
                l.a((Map) hashMap, "audio_codec_nameid", oVar3.K);
                l.a((Map) hashMap, "format_type", oVar3.M);
                l.a((Map) hashMap, "drm_type", oVar3.W);
                l.a((Map) hashMap, "mdl_speed", oVar3.ai.n);
                l.a(hashMap, "nt", oVar3.ab);
                l.a((Map) hashMap, "reuse_socket", oVar3.V);
                l.a(hashMap, "mdl_version", oVar3.ad);
                l.a((Map) hashMap, "enable_mdl", oVar3.ar);
                l.a(hashMap, "mdl_req_t", oVar3.ai.v);
                l.a(hashMap, "mdl_end_t", oVar3.ai.w);
                l.a(hashMap, "mdl_dns_t", oVar3.ai.x);
                l.a(hashMap, "mdl_tcp_start_t", oVar3.ai.y);
                l.a(hashMap, "mdl_tcp_end_t", oVar3.ai.z);
                l.a(hashMap, "mdl_ttfp", oVar3.ai.A);
                l.a(hashMap, "mdl_httpfb", oVar3.ai.B);
                l.a(hashMap, "mdl_cur_ip", oVar3.ai.f152664e);
                l.a(hashMap, "mdl_cur_req_pos", oVar3.ai.f152660a);
                l.a(hashMap, "mdl_cur_end_pos", oVar3.ai.f152661b);
                l.a(hashMap, "mdl_cur_cache_pos", oVar3.ai.f152662c);
                l.a((Map) hashMap, "mdl_cache_type", oVar3.ai.f152663d);
                l.a(hashMap, "mdl_reply_size", oVar3.ai.f152667h);
                l.a(hashMap, "mdl_down_pos", oVar3.ai.f152668i);
                l.a((Map) hashMap, "mdl_error_code", oVar3.ai.f152672m);
                l.a((Map) hashMap, "mdl_http_code", oVar3.ai.u);
                l.a(hashMap, "mdl_ip_list", oVar3.ai.O);
                l.a(hashMap, "mdl_blocked_ips", oVar3.ai.P);
                l.a(hashMap, "a_mdl_req_t", oVar3.aj.v);
                l.a(hashMap, "a_mdl_end_t", oVar3.aj.w);
                l.a(hashMap, "a_mdl_dns_t", oVar3.aj.x);
                l.a(hashMap, "a_mdl_tcp_start_t", oVar3.aj.y);
                l.a(hashMap, "a_mdl_tcp_end_t", oVar3.aj.z);
                l.a(hashMap, "a_mdl_ttfp", oVar3.aj.A);
                l.a(hashMap, "a_mdl_httpfb", oVar3.aj.B);
                l.a(hashMap, "a_mdl_cur_ip", oVar3.aj.f152664e);
                l.a(hashMap, "a_mdl_cur_req_pos", oVar3.aj.f152660a);
                l.a(hashMap, "a_mdl_cur_end_pos", oVar3.aj.f152661b);
                l.a(hashMap, "a_mdl_cur_cache_pos", oVar3.aj.f152662c);
                l.a((Map) hashMap, "a_mdl_cache_type", oVar3.aj.f152663d);
                l.a(hashMap, "a_mdl_reply_size", oVar3.aj.f152667h);
                l.a(hashMap, "a_mdl_down_pos", oVar3.aj.f152668i);
                l.a((Map) hashMap, "a_mdl_error_code", oVar3.aj.f152672m);
                l.a((Map) hashMap, "a_mdl_http_code", oVar3.aj.u);
                l.a(hashMap, "a_mdl_ip_list", oVar3.aj.O);
                l.a(hashMap, "a_mdl_blocked_ips", oVar3.aj.P);
            }
            l.a(hashMap, "opera_type", bVar.f152778a);
            l.a(hashMap, "state_before", bVar.f152779b);
            l.a(hashMap, "state_after", bVar.f152780c);
            l.a(hashMap, "cost_time", bVar.f152781d);
            l.a(hashMap, "end_type", bVar.f152782e);
            l.a((Map) hashMap, "index", bVar.f152789l);
            long j2 = -1;
            if (xVar.f152763b.containsKey(bVar.f152778a)) {
                long longValue = ((Long) xVar.f152763b.get(bVar.f152778a)).longValue();
                if (longValue > 0) {
                    j2 = bVar.f152783f - longValue;
                }
            }
            l.a(hashMap, "last_interval", j2);
            l.a((Map) hashMap, "retry_count", bVar.f152785h);
            l.a((Map) hashMap, "is_seek_in_buffer", bVar.f152786i);
            l.a(hashMap, "video_len_after", bVar.f152787j);
            l.a(hashMap, "audio_len_after", bVar.f152788k);
            l.a(hashMap, "st", bVar.f152783f);
            l.a(hashMap, "et", bVar.f152784g);
            l.a(hashMap, "resolution_before", bVar.f152790m);
            l.a(hashMap, "resolution_after", bVar.n);
            l.a((Map) hashMap, "bitrate_before", bVar.o);
            l.a((Map) hashMap, "bitrate_after", bVar.p);
            l.a(hashMap, "last_buf_start_t", xVar.f152765d);
            l.a(hashMap, "last_buf_end_t", xVar.f152766e);
            final JSONObject jSONObject = new JSONObject(hashMap);
            Handler handler = this.f152771b;
            if (handler == null) {
                t.instance.addEventV2(z, jSONObject, "videoplayer_oneopera");
                MethodCollector.o(13889);
                return;
            }
            handler.post(new Runnable() {
                /* class com.ss.ttvideoengine.h.x.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101642);
                }

                public final void run() {
                    t.instance.addEventV2(z, jSONObject, "videoplayer_oneopera");
                }
            });
            synchronized (this.f152770a.f152763b) {
                try {
                    this.f152770a.f152763b.remove(this.f152774e.f152778a);
                    this.f152770a.f152763b.put(this.f152774e.f152778a, Long.valueOf(this.f152774e.f152784g));
                } catch (Throwable th) {
                    MethodCollector.o(13889);
                    throw th;
                }
            }
            this.f152770a.f152765d = -2147483648L;
            this.f152770a.f152766e = -2147483648L;
            MethodCollector.o(13889);
        }

        public a(Context context, x xVar, o oVar, b bVar) {
            this.f152770a = xVar;
            this.f152772c = oVar;
            this.f152773d = context;
            this.f152774e = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public String f152778a;

        /* renamed from: b  reason: collision with root package name */
        public String f152779b;

        /* renamed from: c  reason: collision with root package name */
        public String f152780c;

        /* renamed from: d  reason: collision with root package name */
        public long f152781d;

        /* renamed from: e  reason: collision with root package name */
        public String f152782e;

        /* renamed from: f  reason: collision with root package name */
        public long f152783f;

        /* renamed from: g  reason: collision with root package name */
        public long f152784g;

        /* renamed from: h  reason: collision with root package name */
        public int f152785h;

        /* renamed from: i  reason: collision with root package name */
        public int f152786i;

        /* renamed from: j  reason: collision with root package name */
        public long f152787j;

        /* renamed from: k  reason: collision with root package name */
        public long f152788k;

        /* renamed from: l  reason: collision with root package name */
        public int f152789l;

        /* renamed from: m  reason: collision with root package name */
        public String f152790m;
        public String n;
        public int o;
        public int p;

        static {
            Covode.recordClassIndex(101643);
        }

        private b() {
            this.f152778a = "";
            this.f152779b = "";
            this.f152780c = "";
            this.f152781d = -2147483648L;
            this.f152782e = "";
            this.f152783f = -2147483648L;
            this.f152784g = -2147483648L;
            this.f152790m = "";
            this.n = "";
            this.o = Integer.MIN_VALUE;
            this.p = Integer.MIN_VALUE;
        }

        /* synthetic */ b(x xVar, byte b2) {
            this();
        }
    }

    x(o oVar) {
        this.f152762a = oVar;
        this.f152763b = new HashMap();
        this.f152764c = new b(this, (byte) 0);
    }

    public final void a(String str, int i2) {
        if (this.f152764c.f152783f <= 0 || this.f152764c.f152778a.isEmpty()) {
            j.b("VideoEventOneOpera", "endSeek without beginSeek, return.");
            return;
        }
        j.b("VideoEventOneOpera", "endSeek, from " + this.f152764c.f152779b + " to " + this.f152764c.f152780c);
        this.f152764c.f152784g = System.currentTimeMillis();
        b bVar = this.f152764c;
        bVar.f152781d = bVar.f152784g - this.f152764c.f152783f;
        if (this.f152764c.f152781d > 0) {
            this.f152767f = (int) (((long) this.f152767f) + this.f152764c.f152781d);
        }
        this.f152764c.f152782e = str;
        this.f152764c.f152786i = i2;
        o oVar = this.f152762a;
        if (!(oVar == null || oVar.f152649a == null)) {
            this.f152764c.n = this.f152762a.Q;
            this.f152764c.p = this.f152762a.R;
            Map<String, Long> b2 = this.f152762a.f152649a.b();
            if (b2 != null) {
                this.f152764c.f152787j = b2.get("vlen").longValue();
                this.f152764c.f152788k = b2.get("alen").longValue();
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("fr", this.f152764c.f152779b);
        hashMap.put("to", this.f152764c.f152780c);
        hashMap.put("t", Long.valueOf(this.f152764c.f152784g));
        hashMap.put("c", Long.valueOf(this.f152764c.f152781d));
        this.f152768g.add(new JSONObject(hashMap).toString());
        this.f152762a.e();
        c();
        this.f152764c = new b(this, (byte) 0);
    }
}
