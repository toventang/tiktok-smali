package com.ss.ttvideoengine.h;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.d.u;
import com.ss.ttvideoengine.s.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public o f152791a;

    /* renamed from: b  reason: collision with root package name */
    public b f152792b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<String> f152793c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public int f152794d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f152795e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f152796f = -2147483648L;

    /* renamed from: g  reason: collision with root package name */
    public long f152797g = -2147483648L;

    static {
        Covode.recordClassIndex(101644);
    }

    private void c() {
        j.a("VideoEventOneOutSync", "report oussync event");
        this.f152791a.a();
        com.ss.ttvideoengine.s.b.a(new a(this.f152791a.ac, this, this.f152791a, this.f152792b));
    }

    public final void a() {
        this.f152793c = new ArrayList<>();
        this.f152794d = 0;
        this.f152795e = 0;
        this.f152796f = -2147483648L;
        this.f152797g = -2147483648L;
    }

    private void b() {
        o oVar = this.f152791a;
        if (oVar != null && oVar.f152649a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("begin_pos", Integer.valueOf(this.f152792b.r));
            hashMap.put("end_pos", Integer.valueOf(this.f152792b.s));
            hashMap.put("render_drop_cnt", Integer.valueOf(this.f152792b.f152809d));
            hashMap.put("container_fps", Float.valueOf(this.f152791a.f152649a.d(82)));
            hashMap.put("video_out_fps", Float.valueOf(this.f152791a.f152649a.d(83)));
            hashMap.put("clock_diff", Long.valueOf(this.f152791a.f152649a.b(45)));
            int c2 = this.f152791a.f152649a.c(84);
            long j2 = 0;
            if (c2 > 0) {
                j2 = (long) (1000 / c2);
            }
            hashMap.put("decode_time", Long.valueOf(j2));
            this.f152791a.f152649a.a(4, hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private y f152798a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f152799b = new Handler(Looper.getMainLooper());

        /* renamed from: c  reason: collision with root package name */
        private o f152800c;

        /* renamed from: d  reason: collision with root package name */
        private Context f152801d;

        /* renamed from: e  reason: collision with root package name */
        private b f152802e;

        static {
            Covode.recordClassIndex(101645);
        }

        public final void run() {
            final boolean z;
            long j2;
            if (this.f152798a != null) {
                o oVar = this.f152800c;
                if (oVar == null || !oVar.as) {
                    z = false;
                } else {
                    z = true;
                }
                y yVar = this.f152798a;
                b bVar = this.f152802e;
                o oVar2 = this.f152800c;
                HashMap hashMap = new HashMap();
                if (oVar2 != null) {
                    l.a(hashMap, "player_sessionid", yVar.f152791a.r);
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
                }
                l.a(hashMap, "event_type", "av_outsync");
                l.a(hashMap, "st", bVar.f152806a);
                l.a(hashMap, "et", bVar.f152807b);
                l.a(hashMap, "cost_time", bVar.t);
                l.a(hashMap, "end_type", bVar.u);
                l.a(hashMap, "audio_len_before", bVar.f152810e);
                l.a(hashMap, "video_len_before", bVar.f152811f);
                l.a(hashMap, "alen_dec_before", bVar.f152812g);
                l.a(hashMap, "vlen_dec_before", bVar.f152813h);
                l.a(hashMap, "alen_base_before", bVar.f152814i);
                l.a(hashMap, "vlen_base_before", bVar.f152815j);
                l.a(hashMap, "resolution_before", bVar.f152816k);
                l.a(hashMap, "resolution_after", bVar.f152817l);
                l.a((Map) hashMap, "bitrate_before", bVar.f152818m);
                l.a((Map) hashMap, "bitrate_after", bVar.n);
                l.a((Map) hashMap, "index", yVar.f152795e);
                l.a((Map) hashMap, "radio_mode", bVar.y);
                l.a(hashMap, "last_av_switch_interval", bVar.z);
                l.a(hashMap, "last_res_switch_interval", bVar.A);
                l.a((Map) hashMap, "headset", bVar.B);
                l.a((Map) hashMap, "bt", bVar.C);
                l.a(hashMap, "last_headset_switch_interval", bVar.D);
                l.a((Map) hashMap, "power", bVar.E);
                l.a((Map) hashMap, "is_charging", bVar.F);
                l.a(hashMap, "max_av_diff", bVar.G);
                l.a((Map) hashMap, "is_background", bVar.H);
                l.a(hashMap, "last_foreback_switch_interval", bVar.I);
                long j3 = -1;
                if (yVar.f152796f > 0) {
                    j2 = bVar.f152806a - yVar.f152796f;
                } else {
                    j2 = -1;
                }
                l.a(hashMap, "first_frame_interval", j2);
                if (yVar.f152797g > 0) {
                    j3 = bVar.f152806a - yVar.f152797g;
                }
                l.a(hashMap, "last_event_interval", j3);
                l.a(hashMap, "pts_list", bVar.f152808c);
                l.a((Map) hashMap, "begin_pos", bVar.r);
                l.a((Map) hashMap, "end_pos", bVar.s);
                l.a((Map) hashMap, "drop_cnt", bVar.f152809d);
                l.a(hashMap, "v_dec_fps_list", bVar.o);
                if (bVar.p > 0) {
                    l.a(hashMap, "last_rebuf_interval", bVar.f152806a - bVar.p);
                }
                if (bVar.q > 0) {
                    l.a(hashMap, "last_seek_interval", bVar.f152806a - bVar.q);
                }
                l.a((Map) hashMap, "is_abr", bVar.v);
                l.a(hashMap, "quality_desc_before", bVar.w);
                l.a(hashMap, "quality_desc_after", bVar.x);
                l.a(hashMap, "pause_time_list", bVar.J);
                l.a((Map) hashMap, "bad_interlaced", bVar.K);
                final JSONObject jSONObject = new JSONObject(hashMap);
                Handler handler = this.f152799b;
                if (handler == null || handler.getLooper() == null) {
                    t.instance.addEventV2(z, jSONObject, "videoplayer_oneevent");
                    return;
                }
                this.f152799b.post(new Runnable() {
                    /* class com.ss.ttvideoengine.h.y.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(101646);
                    }

                    public final void run() {
                        t.instance.addEventV2(z, jSONObject, "videoplayer_oneevent");
                    }
                });
                this.f152798a.f152797g = this.f152802e.f152807b;
            }
        }

        public a(Context context, y yVar, o oVar, b bVar) {
            this.f152798a = yVar;
            this.f152800c = oVar;
            this.f152801d = context;
            this.f152802e = bVar;
        }
    }

    public y(o oVar) {
        this.f152791a = oVar;
        this.f152792b = new b(this, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    public class b {
        public long A;
        public int B;
        public int C;
        public long D;
        public int E;
        public int F;
        public long G;
        public int H;
        public long I;
        public ArrayList<Long> J;
        public int K;

        /* renamed from: a  reason: collision with root package name */
        public long f152806a;

        /* renamed from: b  reason: collision with root package name */
        public long f152807b;

        /* renamed from: c  reason: collision with root package name */
        public String f152808c;

        /* renamed from: d  reason: collision with root package name */
        public int f152809d;

        /* renamed from: e  reason: collision with root package name */
        public long f152810e;

        /* renamed from: f  reason: collision with root package name */
        public long f152811f;

        /* renamed from: g  reason: collision with root package name */
        public long f152812g;

        /* renamed from: h  reason: collision with root package name */
        public long f152813h;

        /* renamed from: i  reason: collision with root package name */
        public long f152814i;

        /* renamed from: j  reason: collision with root package name */
        public long f152815j;

        /* renamed from: k  reason: collision with root package name */
        public String f152816k;

        /* renamed from: l  reason: collision with root package name */
        public String f152817l;

        /* renamed from: m  reason: collision with root package name */
        public int f152818m;
        public int n;
        public String o;
        public long p;
        public long q;
        public int r;
        public int s;
        public long t;
        public String u;
        public int v;
        public String w;
        public String x;
        public int y;
        public long z;

        static {
            Covode.recordClassIndex(101647);
        }

        private b() {
            this.f152806a = -2147483648L;
            this.f152807b = -2147483648L;
            this.f152809d = Integer.MIN_VALUE;
            this.f152810e = -2147483648L;
            this.f152811f = -2147483648L;
            this.f152812g = -2147483648L;
            this.f152813h = -2147483648L;
            this.f152814i = -2147483648L;
            this.f152815j = -2147483648L;
            this.f152818m = Integer.MIN_VALUE;
            this.n = Integer.MIN_VALUE;
            this.p = -2147483648L;
            this.q = -2147483648L;
            this.r = Integer.MIN_VALUE;
            this.s = Integer.MIN_VALUE;
            this.t = -2147483648L;
            this.v = Integer.MIN_VALUE;
            this.w = "";
            this.x = "";
            this.y = Integer.MIN_VALUE;
            this.z = -2147483648L;
            this.A = -2147483648L;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = -2147483648L;
            this.E = Integer.MIN_VALUE;
            this.F = Integer.MIN_VALUE;
            this.G = -2147483648L;
            this.H = Integer.MIN_VALUE;
            this.I = -2147483648L;
            this.J = new ArrayList<>();
            this.K = 0;
        }

        /* synthetic */ b(y yVar, byte b2) {
            this();
        }
    }

    public final void a(int i2, String str) {
        if (this.f152792b.f152806a <= 0) {
            j.c("VideoEventOneOutSync", "Invalid start time, return." + this.f152792b.f152806a);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - this.f152792b.f152806a;
        if (j2 <= 200) {
            b();
            this.f152792b = new b(this, (byte) 0);
            return;
        }
        this.f152792b.u = str;
        this.f152792b.s = i2;
        this.f152792b.f152807b = currentTimeMillis;
        this.f152792b.t = j2;
        this.f152795e++;
        this.f152794d++;
        o oVar = this.f152791a;
        if (oVar != null) {
            this.f152792b.f152817l = oVar.Q;
            this.f152792b.n = this.f152791a.R;
            this.f152792b.x = this.f152791a.af;
            if (this.f152791a.f152649a != null) {
                this.f152792b.f152809d = this.f152791a.f152649a.c(79);
                this.f152792b.f152808c = this.f152791a.f152649a.a(78);
                this.f152792b.o = this.f152791a.f152649a.a(80);
                this.f152792b.G = this.f152791a.f152649a.b(96);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put(u.f30929a, Integer.valueOf(this.f152792b.r));
        hashMap.put("pe", Integer.valueOf(this.f152792b.s));
        hashMap.put("st", Long.valueOf(this.f152792b.f152806a));
        hashMap.put("c", Long.valueOf(this.f152792b.t));
        this.f152793c.add(new JSONObject(hashMap).toString());
        this.f152791a.e();
        c();
        b();
        this.f152792b = new b(this, (byte) 0);
    }
}
