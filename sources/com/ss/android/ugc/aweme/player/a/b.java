package com.ss.android.ugc.aweme.player.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.j;
import com.ss.android.ugc.playerkit.model.v;
import com.ss.android.ugc.playerkit.model.x;
import h.f.b.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class b {
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 3;
    public static final String R = "X-Cache-Remote";
    public static final String S = "Server-Timing";
    public static final String T = "ttfb";
    public static final String U = "socket_reuse";
    public static final int V = 50;
    public static final int W = 200;
    public static final int X = 300;
    public static final int Y = 5;
    public static final int Z = 20;
    public static final int aa = 15;
    public static int ab;
    public static String ac;
    public static final c ad = new c((byte) 0);
    public long A;
    public long B;
    public long C;
    public long D;
    public com.ss.android.ugc.aweme.video.simplayer.c.b E;
    public boolean F;
    public int G;
    public String H = "";
    public JSONObject I;
    public int J;
    public int K;
    public float L = -1.0f;
    public float M = -1.0f;
    public boolean N;

    /* renamed from: a  reason: collision with root package name */
    public Aweme f114916a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f114917b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f114918c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f114919d;

    /* renamed from: e  reason: collision with root package name */
    public String f114920e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f114921f;

    /* renamed from: g  reason: collision with root package name */
    public List<v> f114922g;

    /* renamed from: h  reason: collision with root package name */
    public List<x> f114923h;

    /* renamed from: i  reason: collision with root package name */
    public int f114924i;

    /* renamed from: j  reason: collision with root package name */
    public float f114925j;

    /* renamed from: k  reason: collision with root package name */
    public long f114926k;

    /* renamed from: l  reason: collision with root package name */
    public long f114927l;

    /* renamed from: m  reason: collision with root package name */
    public int f114928m;
    public long n;
    public ArrayList<Aweme> o;
    public j.f p;
    public int q;
    public long r;
    public int s;
    public long t;
    public HashMap<String, String> u;
    public String v;
    public String w;
    public long x;
    public long y;
    public long z;

    public static final class c {
        static {
            Covode.recordClassIndex(73917);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(73914);
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.b$b  reason: collision with other inner class name */
    public static final class C2941b {

        /* renamed from: a  reason: collision with root package name */
        public String f114930a;

        /* renamed from: b  reason: collision with root package name */
        public String f114931b;

        /* renamed from: c  reason: collision with root package name */
        public int f114932c;

        /* renamed from: d  reason: collision with root package name */
        public int f114933d;

        /* renamed from: e  reason: collision with root package name */
        public String f114934e;

        /* renamed from: f  reason: collision with root package name */
        public long f114935f;

        /* renamed from: g  reason: collision with root package name */
        public long f114936g;

        /* renamed from: h  reason: collision with root package name */
        public int f114937h;

        /* renamed from: i  reason: collision with root package name */
        public int f114938i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f114939j;

        /* renamed from: k  reason: collision with root package name */
        public String f114940k;

        /* renamed from: l  reason: collision with root package name */
        public long f114941l;

        /* renamed from: m  reason: collision with root package name */
        public long f114942m;
        public Integer n = 0;
        public Integer o = 0;

        static {
            Covode.recordClassIndex(73916);
        }

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ip", com.ss.android.ugc.aweme.player.e.a(this.f114930a, b.aa));
            jSONObject.put("host", com.ss.android.ugc.aweme.player.e.a(this.f114931b, b.Z));
            jSONObject.put("hit_code", this.f114932c);
            jSONObject.put("hit_code_l2", this.f114933d);
            if (this.f114932c == 0) {
                jSONObject.put("cdn_hit_str", this.f114934e);
            }
            jSONObject.put("rsp_time", this.f114935f);
            jSONObject.put("cache_size", this.f114936g);
            jSONObject.put("url_idx", this.f114938i);
            jSONObject.put("status_code", this.f114937h);
            jSONObject.put("dl_duration", this.f114942m);
            jSONObject.put("dl_size", this.f114941l);
            return jSONObject;
        }
    }

    public static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f114956a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f114957b;

        static {
            Covode.recordClassIndex(73919);
        }

        public e(b bVar, z.e eVar) {
            this.f114956a = bVar;
            this.f114957b = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:195:0x046c, code lost:
            if (r0.f143866c >= 0) goto L_0x046e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x026e  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x01e7 A[Catch:{ all -> 0x059c }] */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x01ee A[Catch:{ all -> 0x059c }] */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x01f1 A[Catch:{ all -> 0x059c }] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x020b A[Catch:{ all -> 0x059c }] */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 1445
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.a.b.e.call():java.lang.Object");
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public b f114929a = new b();

        static {
            Covode.recordClassIndex(73915);
        }

        public final a a(int i2) {
            this.f114929a.f114924i = i2;
            return this;
        }
    }

    public static int b(Map<String, String> map) {
        if (map != null) {
            String str = R;
            if (map.containsKey(str)) {
                return c.a(map.get(str));
            }
        }
        return 0;
    }

    public static int a(Map<String, String> map) {
        if (map != null) {
            if (map.containsKey("X-Cache")) {
                return c.a(map.get("X-Cache"));
            }
            if (map.containsKey("X-M-Cache")) {
                return c.a(map.get("X-M-Cache"));
            }
        }
        return 0;
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public String f114943a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<C2941b> f114944b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<v> f114945c;

        /* renamed from: d  reason: collision with root package name */
        public String f114946d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f114947e;

        /* renamed from: f  reason: collision with root package name */
        public String f114948f;

        /* renamed from: g  reason: collision with root package name */
        public int f114949g;

        /* renamed from: h  reason: collision with root package name */
        public int f114950h;

        /* renamed from: i  reason: collision with root package name */
        public int f114951i;

        /* renamed from: j  reason: collision with root package name */
        public float f114952j;

        /* renamed from: k  reason: collision with root package name */
        public long f114953k;

        /* renamed from: l  reason: collision with root package name */
        public long f114954l;

        /* renamed from: m  reason: collision with root package name */
        public int f114955m;
        public long n;
        public String o;
        public int p;
        public long q;
        public boolean r;
        public ArrayList<Integer> s;
        public ArrayList<Aweme> t;
        public j.f u;
        public HashMap<String, String> v;

        static {
            Covode.recordClassIndex(73918);
        }

        /* JADX WARNING: Removed duplicated region for block: B:102:0x02aa  */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x02ba  */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x02ca  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x02da  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x02ea  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x02fa  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x030a  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x032b  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x0338  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x037a  */
        /* JADX WARNING: Removed duplicated region for block: B:175:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00e1  */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01a1  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0243  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0266  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0272  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0274  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x029a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(org.json.JSONObject r17) {
            /*
            // Method dump skipped, instructions count: 944
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.a.b.d.a(org.json.JSONObject):void");
        }
    }
}
