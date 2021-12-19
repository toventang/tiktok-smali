package com.ss.ttvideoengine.h;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttvideoengine.h.o;
import com.ss.ttvideoengine.s.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public o f152712a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap f152713b;

    /* renamed from: c  reason: collision with root package name */
    public b f152714c;

    /* renamed from: d  reason: collision with root package name */
    public long f152715d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f152716e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public long f152717f = -2147483648L;

    /* renamed from: g  reason: collision with root package name */
    private x f152718g;

    static {
        Covode.recordClassIndex(101632);
    }

    private void d() {
        this.f152712a.a();
        j.a("VideoEventOneEvent", "report async");
        com.ss.ttvideoengine.s.b.a(new a(this.f152712a.ac, this, this.f152712a, this.f152714c));
    }

    public final void a() {
        MethodCollector.i(13705);
        synchronized (this.f152713b) {
            try {
                this.f152713b = new HashMap();
            } catch (Throwable th) {
                MethodCollector.o(13705);
                throw th;
            }
        }
        this.f152715d = 0;
        this.f152716e = new ArrayList<>();
        this.f152717f = -2147483648L;
        MethodCollector.o(13705);
    }

    public final long b() {
        MethodCollector.i(13711);
        if (this.f152714c.f152732f > 0) {
            MethodCollector.o(13711);
            return 0;
        }
        synchronized (this.f152713b) {
            try {
                if (this.f152713b.containsKey("block_net")) {
                    return ((Long) this.f152713b.get("block_net")).longValue();
                }
                MethodCollector.o(13711);
                return -1;
            } finally {
                MethodCollector.o(13711);
            }
        }
    }

    private void c() {
        o oVar = this.f152712a;
        if (oVar != null && oVar.f152649a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cost_time", Long.valueOf(this.f152714c.f152728b));
            hashMap.put("exit_type", this.f152714c.f152729c);
            JSONObject b2 = this.f152712a.b();
            if (b2 == null) {
                hashMap.put("cur_url", this.f152712a.v);
                hashMap.put("cur_ip", this.f152712a.x);
                try {
                    hashMap.put("cur_host", Uri.parse(this.f152712a.v).getHost());
                } catch (Exception e2) {
                    j.a("VideoEventOneEvent", "_triggerBufferEndCb:" + e2.toString());
                }
            } else if (!b2.isNull("video")) {
                try {
                    o.a a2 = this.f152712a.a(b2.getJSONObject("video"));
                    hashMap.put("cur_url", a2.f152666g);
                    hashMap.put("cur_ip", a2.f152664e);
                    hashMap.put("cur_host", Uri.parse(a2.f152666g).getHost());
                } catch (Exception unused) {
                }
            }
            this.f152712a.f152649a.a(1, hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private u f152719a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f152720b = new Handler(Looper.getMainLooper());

        /* renamed from: c  reason: collision with root package name */
        private o f152721c;

        /* renamed from: d  reason: collision with root package name */
        private Context f152722d;

        /* renamed from: e  reason: collision with root package name */
        private b f152723e;

        static {
            Covode.recordClassIndex(101633);
        }

        public final void run() {
            final boolean z;
            long j2;
            long j3;
            MethodCollector.i(10542);
            if (this.f152719a == null) {
                MethodCollector.o(10542);
                return;
            }
            o oVar = this.f152721c;
            if (oVar == null || !oVar.as) {
                z = false;
            } else {
                z = true;
            }
            u uVar = this.f152719a;
            b bVar = this.f152723e;
            o oVar2 = this.f152721c;
            HashMap hashMap = new HashMap();
            if (oVar2 != null) {
                l.a(hashMap, "player_sessionid", oVar2.r);
                if (oVar2.v == null || oVar2.v.isEmpty()) {
                    l.a(hashMap, "cdn_url", oVar2.s);
                } else {
                    l.a(hashMap, "cdn_url", oVar2.v);
                }
                if (oVar2.x == null || oVar2.x.isEmpty()) {
                    l.a(hashMap, "cdn_ip", oVar2.u);
                } else {
                    l.a(hashMap, "cdn_ip", oVar2.x);
                }
                l.a(hashMap, "resolution", oVar2.Q);
                l.a(hashMap, "source_type", oVar2.D);
                l.a(hashMap, "v", oVar2.C);
                l.a(hashMap, "pv", oVar2.f152653h);
                l.a(hashMap, "pc", oVar2.f152654i);
                l.a(hashMap, "sv", oVar2.f152655j);
                l.a(hashMap, "sdk_version", oVar2.f152656k);
                l.a(hashMap, "vtype", oVar2.N);
                l.a(hashMap, "tag", oVar2.T);
                l.a(hashMap, "subtag", oVar2.U);
                l.a((Map) hashMap, "p2p_cdn_type", oVar2.S);
                l.a(hashMap, "codec", oVar2.J);
                l.a((Map) hashMap, "video_codec_nameid", oVar2.L);
                l.a((Map) hashMap, "audio_codec_nameid", oVar2.K);
                l.a((Map) hashMap, "format_type", oVar2.M);
                l.a((Map) hashMap, "drm_type", oVar2.W);
                l.a((Map) hashMap, "play_speed", oVar2.Y);
                l.a(hashMap, "nt", oVar2.ab);
                l.a(hashMap, "mdl_version", oVar2.ad);
                l.a((Map) hashMap, "enable_mdl", oVar2.ar);
                l.a((Map) hashMap, "video_hw", oVar2.E);
                l.a((Map) hashMap, "user_hw", oVar2.F);
                l.a((Map) hashMap, "cur_task_num", oVar2.ak);
                l.a(hashMap, "cur_req_pos", oVar2.ai.f152660a);
                l.a(hashMap, "cur_end_pos", oVar2.ai.f152661b);
                l.a(hashMap, "cur_cache_pos", oVar2.ai.f152662c);
                l.a((Map) hashMap, "cache_type", oVar2.ai.f152663d);
                l.a(hashMap, "cur_ip", oVar2.ai.f152664e);
                l.a(hashMap, "cur_host", oVar2.ai.f152665f);
                l.a(hashMap, "reply_size", oVar2.ai.f152667h);
                l.a(hashMap, "down_pos", oVar2.ai.f152668i);
                l.a(hashMap, "player_wait_time", oVar2.ai.f152669j);
                l.a((Map) hashMap, "player_wait_num", oVar2.ai.f152670k);
                l.a((Map) hashMap, "mdl_stage", oVar2.ai.f152671l);
                l.a((Map) hashMap, "mdl_ec", oVar2.ai.f152672m);
                l.a((Map) hashMap, "mdl_speed", oVar2.ai.n);
                l.a(hashMap, "mdl_file_key", oVar2.ai.o);
                l.a((Map) hashMap, "mdl_is_socrf", oVar2.ai.p);
                l.a((Map) hashMap, "mdl_req_num", oVar2.ai.Q);
                l.a((Map) hashMap, "mdl_url_index", oVar2.ai.q);
                l.a(hashMap, "mdl_re_url", oVar2.ai.r);
                l.a((Map) hashMap, "mdl_cur_source", oVar2.ai.s);
                l.a(hashMap, "mdl_extra_info", oVar2.ai.t);
                l.a(hashMap, "mdl_fs", oVar2.ai.D);
                l.a((Map) hashMap, "mdl_p2p_sp", oVar2.ai.E);
                l.a(hashMap, "mdl_tbs", oVar2.ai.F);
                l.a(hashMap, "mdl_lbs", oVar2.ai.G);
                l.a(hashMap, "mdl_response_cache", uVar.f152712a.ai.R);
                l.a(hashMap, "mdl_response_cinfo", uVar.f152712a.ai.S);
                l.a(hashMap, "a_cur_req_pos", oVar2.aj.f152660a);
                l.a(hashMap, "a_cur_end_pos", oVar2.aj.f152661b);
                l.a(hashMap, "a_cur_cache_pos", oVar2.aj.f152662c);
                l.a((Map) hashMap, "a_cache_type", oVar2.aj.f152663d);
                l.a(hashMap, "a_cur_ip", oVar2.aj.f152664e);
                l.a(hashMap, "a_cur_host", oVar2.aj.f152665f);
                l.a(hashMap, "a_reply_size", oVar2.aj.f152667h);
                l.a(hashMap, "a_down_pos", oVar2.aj.f152668i);
                l.a(hashMap, "a_player_wait_time", oVar2.aj.f152669j);
                l.a((Map) hashMap, "a_player_wait_num", oVar2.aj.f152670k);
                l.a((Map) hashMap, "a_mdl_stage", oVar2.aj.f152671l);
                l.a((Map) hashMap, "a_mdl_ec", oVar2.aj.f152672m);
                l.a((Map) hashMap, "a_mdl_speed", oVar2.aj.n);
                l.a(hashMap, "a_mdl_file_key", oVar2.aj.o);
                l.a((Map) hashMap, "a_mdl_is_socrf", oVar2.aj.p);
                l.a((Map) hashMap, "a_mdl_req_num", oVar2.aj.Q);
                l.a((Map) hashMap, "a_mdl_url_index", oVar2.aj.q);
                l.a(hashMap, "a_mdl_re_url", oVar2.aj.r);
                l.a((Map) hashMap, "a_mdl_cur_source", oVar2.aj.s);
                l.a(hashMap, "a_mdl_extra_info", oVar2.aj.t);
                l.a(hashMap, "a_mdl_fs", oVar2.aj.D);
                l.a((Map) hashMap, "a_mdl_p2p_sp", oVar2.aj.E);
                l.a(hashMap, "a_mdl_tbs", oVar2.aj.F);
                l.a(hashMap, "a_mdl_lbs", oVar2.aj.G);
                l.a(hashMap, "a_mdl_response_cache", uVar.f152712a.aj.R);
                l.a(hashMap, "a_mdl_response_cinfo", uVar.f152712a.aj.S);
            }
            l.a(hashMap, "event_type", bVar.f152727a);
            l.a(hashMap, "cost_time", bVar.f152728b);
            l.a(hashMap, "end_type", bVar.f152729c);
            l.a((Map) hashMap, "index", bVar.p);
            long j4 = -1;
            if (uVar.f152717f > 0) {
                j2 = bVar.f152732f - uVar.f152717f;
            } else {
                j2 = -1;
            }
            l.a(hashMap, "first_frame_interval", j2);
            if (bVar.f152734h > 0) {
                j3 = bVar.f152732f - bVar.f152734h;
            } else {
                j3 = -1;
            }
            l.a(hashMap, "last_seek_interval", j3);
            if (uVar.f152713b.containsKey(bVar.f152727a)) {
                long longValue = ((Long) uVar.f152713b.get(bVar.f152727a)).longValue();
                if (longValue > 0) {
                    j4 = bVar.f152732f - longValue;
                }
            }
            l.a(hashMap, "last_event_interval", j4);
            l.a((Map) hashMap, "last_switch_interval", -1);
            l.a((Map) hashMap, "video_pos", bVar.f152735i);
            l.a((Map) hashMap, "retry_count", bVar.f152736j);
            l.a((Map) hashMap, "reuse_socket", oVar2.V);
            l.a(hashMap, "read_count_mdl", bVar.o);
            l.a(hashMap, "audio_len_before", bVar.f152738l);
            l.a(hashMap, "video_len_before", bVar.f152737k);
            l.a(hashMap, "audio_len_after", bVar.n);
            l.a(hashMap, "video_len_after", bVar.f152739m);
            l.a(hashMap, "vlen_dec_before", bVar.q);
            l.a(hashMap, "vlen_base_before", bVar.u);
            l.a(hashMap, "alen_dec_before", bVar.s);
            l.a(hashMap, "alen_base_before", bVar.w);
            l.a(hashMap, "vlen_dec_after", bVar.r);
            l.a(hashMap, "vlen_base_after", bVar.v);
            l.a(hashMap, "alen_dec_after", bVar.t);
            l.a(hashMap, "alen_base_after", bVar.x);
            l.a(hashMap, "av_gap", bVar.y);
            l.a((Map) hashMap, "buffer_reason", bVar.f152731e);
            l.a(hashMap, "pst", bVar.f152730d);
            l.a(hashMap, "st", bVar.f152732f);
            l.a(hashMap, "et", bVar.f152733g);
            l.a(hashMap, "resolution_before", bVar.z);
            l.a(hashMap, "resolution_after", bVar.A);
            l.a((Map) hashMap, "bitrate_before", bVar.B);
            l.a((Map) hashMap, "bitrate_after", bVar.C);
            l.a((Map) hashMap, "is_abr", bVar.D);
            l.a(hashMap, "quality_desc_before", bVar.E);
            l.a(hashMap, "quality_desc_after", bVar.F);
            l.a((Map) hashMap, "bad_interlaced", bVar.G);
            j.b("VideoEventOneEvent", "OneEvent:" + hashMap.toString());
            final JSONObject jSONObject = new JSONObject(hashMap);
            Handler handler = this.f152720b;
            if (handler == null || handler.getLooper() == null) {
                t.instance.addEventV2(z, jSONObject, "videoplayer_oneevent");
                MethodCollector.o(10542);
                return;
            }
            this.f152720b.post(new Runnable() {
                /* class com.ss.ttvideoengine.h.u.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101634);
                }

                public final void run() {
                    t.instance.addEventV2(z, jSONObject, "videoplayer_oneevent");
                }
            });
            synchronized (this.f152719a.f152713b) {
                try {
                    this.f152719a.f152713b.remove(this.f152723e.f152727a);
                    this.f152719a.f152713b.put(this.f152723e.f152727a, Long.valueOf(this.f152723e.f152733g));
                } finally {
                    MethodCollector.o(10542);
                }
            }
        }

        public a(Context context, u uVar, o oVar, b bVar) {
            this.f152719a = uVar;
            this.f152721c = oVar;
            this.f152722d = context;
            this.f152723e = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    public class b {
        public String A;
        public int B;
        public int C;
        public int D;
        public String E;
        public String F;
        public int G;

        /* renamed from: a  reason: collision with root package name */
        public String f152727a;

        /* renamed from: b  reason: collision with root package name */
        public long f152728b;

        /* renamed from: c  reason: collision with root package name */
        public String f152729c;

        /* renamed from: d  reason: collision with root package name */
        public long f152730d;

        /* renamed from: e  reason: collision with root package name */
        public int f152731e;

        /* renamed from: f  reason: collision with root package name */
        public long f152732f;

        /* renamed from: g  reason: collision with root package name */
        public long f152733g;

        /* renamed from: h  reason: collision with root package name */
        public long f152734h;

        /* renamed from: i  reason: collision with root package name */
        public int f152735i;

        /* renamed from: j  reason: collision with root package name */
        public int f152736j;

        /* renamed from: k  reason: collision with root package name */
        public long f152737k;

        /* renamed from: l  reason: collision with root package name */
        public long f152738l;

        /* renamed from: m  reason: collision with root package name */
        public long f152739m;
        public long n;
        public long o;
        public int p;
        public long q;
        public long r;
        public long s;
        public long t;
        public long u;
        public long v;
        public long w;
        public long x;
        public long y;
        public String z;

        static {
            Covode.recordClassIndex(101635);
        }

        private b() {
            this.f152727a = "";
            this.f152728b = -2147483648L;
            this.f152729c = "";
            this.f152730d = -2147483648L;
            this.f152731e = -1;
            this.f152732f = -2147483648L;
            this.f152733g = -2147483648L;
            this.f152734h = -2147483648L;
            this.f152735i = Integer.MIN_VALUE;
            this.f152737k = -1;
            this.f152738l = -1;
            this.z = "";
            this.A = "";
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = Integer.MIN_VALUE;
            this.E = "";
            this.F = "";
        }

        /* synthetic */ b(u uVar, byte b2) {
            this();
        }
    }

    public final void a(String str) {
        if (this.f152714c.f152732f <= 0 || this.f152714c.f152727a.isEmpty()) {
            j.b("VideoEventOneEvent", "movieStallEnd without movieStalled, return.");
            this.f152714c.f152730d = -2147483648L;
            this.f152714c.f152731e = -1;
            return;
        }
        this.f152714c.f152733g = System.currentTimeMillis();
        j.b("VideoEventOneEvent", "movieStallEnd");
        b bVar = this.f152714c;
        bVar.f152728b = bVar.f152733g - this.f152714c.f152732f;
        if (this.f152714c.f152728b > 0) {
            this.f152715d += this.f152714c.f152728b;
        }
        this.f152714c.f152729c = str;
        this.f152714c.f152734h = this.f152718g.b();
        if (this.f152714c.f152734h == 0) {
            b bVar2 = this.f152714c;
            bVar2.f152734h = bVar2.f152732f;
        }
        o oVar = this.f152712a;
        if (!(oVar == null || oVar.f152649a == null)) {
            this.f152714c.A = this.f152712a.Q;
            this.f152714c.C = this.f152712a.R;
            this.f152714c.F = this.f152712a.af;
            Map<String, Long> b2 = this.f152712a.f152649a.b();
            if (b2 != null) {
                this.f152714c.f152739m = b2.get("vlen").longValue();
                this.f152714c.n = b2.get("alen").longValue();
                this.f152714c.r = b2.get("vDecLen").longValue();
                this.f152714c.v = b2.get("vBaseLen").longValue();
                this.f152714c.t = b2.get("aDecLen").longValue();
                this.f152714c.x = b2.get("aBaseLen").longValue();
                this.f152714c.y = b2.get("avGap").longValue();
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("p", Integer.valueOf(this.f152714c.f152735i));
        hashMap.put("t", Long.valueOf(this.f152714c.f152733g));
        hashMap.put("c", Long.valueOf(this.f152714c.f152728b));
        this.f152716e.add(new JSONObject(hashMap).toString());
        this.f152712a.e();
        d();
        c();
        this.f152714c = new b(this, (byte) 0);
    }

    u(o oVar, x xVar) {
        this.f152712a = oVar;
        this.f152718g = xVar;
        this.f152713b = new HashMap();
        this.f152714c = new b(this, (byte) 0);
    }
}
