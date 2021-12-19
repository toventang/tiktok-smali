package com.ss.ttvideoengine.h;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public int f152569a = 200;

    /* renamed from: b  reason: collision with root package name */
    public float f152570b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f152571c;

    /* renamed from: d  reason: collision with root package name */
    public int f152572d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    b f152573e = new b(this, (byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public o f152574f;

    /* renamed from: g  reason: collision with root package name */
    private final ReentrantLock f152575g = new ReentrantLock();

    static {
        Covode.recordClassIndex(101594);
    }

    public final void a() {
        if (Math.random() > ((double) this.f152570b)) {
            this.f152571c = false;
        } else {
            this.f152571c = true;
        }
    }

    public final void b() {
        this.f152575g.lock();
        try {
            if (this.f152571c) {
                this.f152571c = false;
                a(1);
            }
        } finally {
            this.f152575g.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private ab f152576a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f152577b = new Handler(Looper.getMainLooper());

        /* renamed from: c  reason: collision with root package name */
        private o f152578c;

        /* renamed from: d  reason: collision with root package name */
        private Context f152579d;

        /* renamed from: e  reason: collision with root package name */
        private b f152580e;

        static {
            Covode.recordClassIndex(101595);
        }

        public final void run() {
            if (this.f152576a != null) {
                final JSONObject a2 = ab.a(this.f152580e);
                Handler handler = this.f152577b;
                if (handler == null || handler.getLooper() == null) {
                    t.instance.addEventV2(true, a2, "videoplayer_sample");
                } else {
                    this.f152577b.post(new Runnable() {
                        /* class com.ss.ttvideoengine.h.ab.a.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(101596);
                        }

                        public final void run() {
                            t.instance.addEventV2(true, a2, "videoplayer_sample");
                        }
                    });
                }
            }
        }

        public a(Context context, ab abVar, o oVar, b bVar) {
            this.f152576a = abVar;
            this.f152578c = oVar;
            this.f152579d = context;
            this.f152580e = bVar;
        }
    }

    private boolean e() {
        Map map = this.f152574f.aa;
        if (map == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : ((Map) map.get("fileKey")).values()) {
            if (str.equals("") || str.equals("0")) {
                return false;
            }
            arrayList.add(str);
        }
        int i2 = 0;
        while (i2 < arrayList.size()) {
            String str2 = (String) arrayList.get(i2);
            i2++;
            int i3 = i2;
            while (true) {
                if (i3 < arrayList.size()) {
                    if (str2.equals(arrayList.get(i3))) {
                        return false;
                    }
                    i3++;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        o oVar = this.f152574f;
        if (oVar != null) {
            if (oVar.f152649a != null) {
                this.f152573e.F.add(Integer.valueOf(this.f152574f.f152649a.c(67)));
                this.f152573e.D.add(Long.valueOf(this.f152574f.f152649a.b(68)));
                Map map = this.f152574f.aa;
                if (map != null) {
                    Map map2 = (Map) map.get("bitrate");
                    if (map2 != null) {
                        Integer num = (Integer) map2.get(this.f152574f.Q);
                        if (num == null) {
                            this.f152573e.f152592j.add(-1);
                        } else if (num.intValue() == 0) {
                            this.f152573e.f152592j.add(-1);
                        } else {
                            this.f152573e.f152592j.add(a(num));
                        }
                    }
                    ArrayList arrayList = (ArrayList) map.get("audio_bitrate");
                    if (arrayList != null && !arrayList.isEmpty()) {
                        if (arrayList.get(0) == null) {
                            this.f152573e.w.add(-1);
                        } else if (((Integer) arrayList.get(0)).intValue() == 0) {
                            this.f152573e.w.add(-1);
                        } else {
                            this.f152573e.w.add(a((Integer) arrayList.get(0)));
                        }
                    }
                }
            }
            this.f152573e.E.add(Float.valueOf(this.f152574f.Y));
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (this.f152573e.f152586d > this.f152569a || this.f152573e.q > this.f152569a) {
            if (!this.f152573e.F.isEmpty()) {
                this.f152573e.F.remove(0);
            }
            if (!this.f152573e.D.isEmpty()) {
                this.f152573e.D.remove(0);
            }
            if (!this.f152573e.E.isEmpty()) {
                this.f152573e.E.remove(0);
            }
            if (!this.f152573e.f152587e.isEmpty()) {
                this.f152573e.f152587e.remove(0);
            }
            if (!this.f152573e.f152588f.isEmpty()) {
                this.f152573e.f152588f.remove(0);
            }
            if (!this.f152573e.f152589g.isEmpty()) {
                this.f152573e.f152589g.remove(0);
            }
            if (!this.f152573e.f152590h.isEmpty()) {
                this.f152573e.f152590h.remove(0);
            }
            if (!this.f152573e.f152591i.isEmpty()) {
                this.f152573e.f152591i.remove(0);
            }
            if (!this.f152573e.f152593k.isEmpty()) {
                this.f152573e.f152593k.remove(0);
            }
            if (!this.f152573e.f152592j.isEmpty()) {
                this.f152573e.f152592j.remove(0);
            }
            if (!this.f152573e.f152594l.isEmpty()) {
                this.f152573e.f152594l.remove(0);
            }
            if (!this.f152573e.f152595m.isEmpty()) {
                this.f152573e.f152595m.remove(0);
            }
            if (!this.f152573e.n.isEmpty()) {
                this.f152573e.n.remove(0);
            }
            if (!this.f152573e.o.isEmpty()) {
                this.f152573e.o.remove(0);
            }
            if (!this.f152573e.p.isEmpty()) {
                this.f152573e.p.remove(0);
            }
            b bVar = this.f152573e;
            bVar.f152586d--;
            if (!this.f152573e.r.isEmpty()) {
                this.f152573e.r.remove(0);
            }
            if (!this.f152573e.s.isEmpty()) {
                this.f152573e.s.remove(0);
            }
            if (!this.f152573e.t.isEmpty()) {
                this.f152573e.t.remove(0);
            }
            if (!this.f152573e.u.isEmpty()) {
                this.f152573e.u.remove(0);
            }
            if (!this.f152573e.v.isEmpty()) {
                this.f152573e.v.remove(0);
            }
            if (!this.f152573e.w.isEmpty()) {
                this.f152573e.w.remove(0);
            }
            if (!this.f152573e.x.isEmpty()) {
                this.f152573e.x.remove(0);
            }
            if (!this.f152573e.y.isEmpty()) {
                this.f152573e.y.remove(0);
            }
            if (!this.f152573e.z.isEmpty()) {
                this.f152573e.z.remove(0);
            }
            if (!this.f152573e.A.isEmpty()) {
                this.f152573e.A.remove(0);
            }
            if (!this.f152573e.B.isEmpty()) {
                this.f152573e.B.remove(0);
            }
            if (!this.f152573e.C.isEmpty()) {
                this.f152573e.C.remove(0);
            }
            b bVar2 = this.f152573e;
            bVar2.q--;
        }
    }

    ab(o oVar) {
        this.f152574f = oVar;
    }

    /* access modifiers changed from: package-private */
    public final Integer a(Integer num) {
        Map map;
        Map map2;
        o oVar = this.f152574f;
        if (oVar == null || (map = oVar.aa) == null || (map2 = (Map) map.get("bitrateMapTable")) == null) {
            return num;
        }
        if (map2.get(num) == null) {
            return -1;
        }
        return (Integer) map2.get(num);
    }

    /* access modifiers changed from: package-private */
    public class b {
        public ArrayList<Long> A;
        public ArrayList<Long> B;
        public ArrayList<String> C;
        public ArrayList<Long> D;
        public ArrayList<Float> E;
        public ArrayList<Integer> F;
        public int G;
        public String H;
        public String I;
        public String J;
        public ArrayList<Integer> K;
        public ArrayList<Integer> L;
        public JSONObject M;
        public String N;
        public int O;
        public int P;

        /* renamed from: a  reason: collision with root package name */
        public long f152583a;

        /* renamed from: b  reason: collision with root package name */
        public int f152584b;

        /* renamed from: c  reason: collision with root package name */
        public int f152585c;

        /* renamed from: d  reason: collision with root package name */
        public int f152586d;

        /* renamed from: e  reason: collision with root package name */
        public ArrayList<Integer> f152587e;

        /* renamed from: f  reason: collision with root package name */
        public ArrayList<Float> f152588f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<String> f152589g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<Float> f152590h;

        /* renamed from: i  reason: collision with root package name */
        public ArrayList<String> f152591i;

        /* renamed from: j  reason: collision with root package name */
        public ArrayList<Integer> f152592j;

        /* renamed from: k  reason: collision with root package name */
        public ArrayList<Integer> f152593k;

        /* renamed from: l  reason: collision with root package name */
        public ArrayList<Float> f152594l;

        /* renamed from: m  reason: collision with root package name */
        public ArrayList<Long> f152595m;
        public ArrayList<Long> n;
        public ArrayList<Long> o;
        public ArrayList<String> p;
        public int q;
        public ArrayList<Integer> r;
        public ArrayList<Float> s;
        public ArrayList<String> t;
        public ArrayList<Float> u;
        public ArrayList<String> v;
        public ArrayList<Integer> w;
        public ArrayList<Integer> x;
        public ArrayList<Float> y;
        public ArrayList<Long> z;

        static {
            Covode.recordClassIndex(101597);
        }

        private b() {
            this.f152583a = -2147483648L;
            this.f152584b = -1;
            this.f152585c = Integer.MIN_VALUE;
            this.f152587e = new ArrayList<>();
            this.f152588f = new ArrayList<>();
            this.f152589g = new ArrayList<>();
            this.f152590h = new ArrayList<>();
            this.f152591i = new ArrayList<>();
            this.f152592j = new ArrayList<>();
            this.f152593k = new ArrayList<>();
            this.f152594l = new ArrayList<>();
            this.f152595m = new ArrayList<>();
            this.n = new ArrayList<>();
            this.o = new ArrayList<>();
            this.p = new ArrayList<>();
            this.q = 0;
            this.r = new ArrayList<>();
            this.s = new ArrayList<>();
            this.t = new ArrayList<>();
            this.u = new ArrayList<>();
            this.v = new ArrayList<>();
            this.w = new ArrayList<>();
            this.x = new ArrayList<>();
            this.y = new ArrayList<>();
            this.z = new ArrayList<>();
            this.A = new ArrayList<>();
            this.B = new ArrayList<>();
            this.C = new ArrayList<>();
            this.D = new ArrayList<>();
            this.E = new ArrayList<>();
            this.F = new ArrayList<>();
            this.G = 0;
            this.H = "";
            this.I = "";
            this.J = "";
            this.K = new ArrayList<>();
            this.L = new ArrayList<>();
            this.N = "";
            this.O = -1;
            this.P = -1;
        }

        /* synthetic */ b(ab abVar, byte b2) {
            this();
        }
    }

    public static JSONObject a(b bVar) {
        HashMap hashMap = new HashMap();
        l.a(hashMap, "local_time_ms", bVar.f152583a);
        l.a((Map) hashMap, "is_abr", bVar.f152584b);
        l.a(hashMap, "vtype", bVar.N);
        l.a((Map) hashMap, "sample_interval", bVar.f152585c);
        l.a((Map) hashMap, "video_sample_count", bVar.f152586d);
        l.a(hashMap, "video_sample_interval", bVar.f152587e);
        l.a(hashMap, "video_network_speed_sampling_set", bVar.f152588f);
        l.a(hashMap, "video_network_speed_sampling_load_types", bVar.f152589g);
        l.a(hashMap, "video_network_speed_predict_set", bVar.f152590h);
        l.a(hashMap, "video_network_speed_predict_load_types", bVar.f152591i);
        l.a(hashMap, "video_play_bitrate_set", bVar.f152592j);
        l.a(hashMap, "video_download_bitrate_set", bVar.f152593k);
        l.a(hashMap, "video_download_size_set", bVar.f152594l);
        l.a(hashMap, "video_download_costtime_set", bVar.f152595m);
        l.a(hashMap, "video_tcpInfo_rtt_set", bVar.n);
        l.a(hashMap, "video_tcpInfo_lastRecvDate", bVar.o);
        l.a(hashMap, "video_mdl_loader_type", bVar.p);
        l.a((Map) hashMap, "audio_sample_count", bVar.q);
        l.a(hashMap, "audio_sample_interval", bVar.r);
        l.a(hashMap, "audio_network_speed_sampling_set", bVar.s);
        l.a(hashMap, "audio_network_speed_sampling_load_types", bVar.t);
        l.a(hashMap, "audio_network_speed_predict_set", bVar.u);
        l.a(hashMap, "audio_network_speed_predict_load_types", bVar.v);
        l.a(hashMap, "audio_play_bitrate_set", bVar.w);
        l.a(hashMap, "audio_download_bitrate_set", bVar.x);
        l.a(hashMap, "audio_download_size_set", bVar.y);
        l.a(hashMap, "audio_download_costtime_set", bVar.z);
        l.a(hashMap, "audio_tcpInfo_rtt_set", bVar.A);
        l.a(hashMap, "audio_tcpInfo_lastRecvDate", bVar.B);
        l.a(hashMap, "audio_mdl_loader_type", bVar.C);
        l.a(hashMap, "buffer_len_set", bVar.D);
        l.a(hashMap, "play_speed_set", bVar.E);
        l.a(hashMap, "play_pos_set", bVar.F);
        l.a((Map) hashMap, "index", bVar.G);
        l.a(hashMap, "player_sessionid", bVar.H);
        l.a(hashMap, "video_id", bVar.I);
        l.a(hashMap, "video_bitrate_set", bVar.K);
        l.a(hashMap, "audio_bitrate_set", bVar.L);
        l.a((Map) hashMap, "is_multi_dimensions", bVar.O);
        l.a((Map) hashMap, "is_multi_dimensions_input", bVar.P);
        JSONObject jSONObject = new JSONObject(hashMap);
        try {
            jSONObject.put("bitrate_map_table", bVar.M);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: java.util.ArrayList<java.lang.Integer> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v35, resolved type: java.util.ArrayList<java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (!(this.f152573e.f152586d == 0 && this.f152573e.q == 0 && !e())) {
            this.f152573e.f152583a = System.currentTimeMillis();
            this.f152573e.f152585c = this.f152572d;
            o oVar = this.f152574f;
            if (oVar != null) {
                this.f152573e.f152584b = oVar.an;
                this.f152573e.O = this.f152574f.ao;
                this.f152573e.P = this.f152574f.ap;
                this.f152573e.H = this.f152574f.r;
                this.f152573e.I = this.f152574f.C;
                this.f152573e.J = this.f152574f.v;
                this.f152573e.N = this.f152574f.N;
                Map map = this.f152574f.aa;
                if (map != null) {
                    if (map.get("bitrateMapTable") != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : ((Map) map.get("bitrateMapTable")).entrySet()) {
                                jSONObject.put(((Integer) entry.getKey()).toString(), entry.getValue());
                            }
                            this.f152573e.M = jSONObject;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (map.get("video_bitrate") != null) {
                        Iterator it = ((ArrayList) map.get("video_bitrate")).iterator();
                        while (it.hasNext()) {
                            this.f152573e.K.add(it.next());
                        }
                    }
                    if (map.get("audio_bitrate") != null) {
                        Iterator it2 = ((ArrayList) map.get("audio_bitrate")).iterator();
                        while (it2.hasNext()) {
                            this.f152573e.L.add(it2.next());
                        }
                    }
                }
            }
            com.ss.ttvideoengine.s.b.a(new a(this.f152574f.ac, this, this.f152574f, this.f152573e));
            b bVar = new b(this, (byte) 0);
            this.f152573e = bVar;
            if (i2 == 0) {
                bVar.G = 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Map<String, String> map, int i2) {
        if (map != null && map.size() > 0 && i2 <= 1) {
            if (i2 == 0) {
                String str = map.get("download_size");
                String str2 = map.get("download_time");
                String str3 = map.get("rtt");
                String str4 = map.get("last_data_recv");
                String str5 = map.get("mdl_loader_type");
                if (str != null) {
                    this.f152573e.f152594l.add(Float.valueOf(Float.parseFloat(str)));
                }
                if (str2 != null) {
                    this.f152573e.f152595m.add(Long.valueOf(Long.parseLong(str2)));
                }
                if (str3 != null) {
                    this.f152573e.n.add(Long.valueOf(Long.parseLong(str3)));
                }
                if (str4 != null) {
                    this.f152573e.o.add(Long.valueOf(Long.parseLong(str4)));
                }
                if (str5 != null) {
                    this.f152573e.p.add(str5);
                }
            } else if (i2 == 1) {
                String str6 = map.get("download_size");
                String str7 = map.get("download_time");
                String str8 = map.get("rtt");
                String str9 = map.get("last_data_recv");
                String str10 = map.get("mdl_loader_type");
                if (str6 != null) {
                    this.f152573e.y.add(Float.valueOf(Float.parseFloat(str6)));
                }
                if (str7 != null) {
                    this.f152573e.z.add(Long.valueOf(Long.parseLong(str7)));
                }
                if (str8 != null) {
                    this.f152573e.A.add(Long.valueOf(Long.parseLong(str8)));
                }
                if (str9 != null) {
                    this.f152573e.B.add(Long.valueOf(Long.parseLong(str9)));
                }
                if (str10 != null) {
                    this.f152573e.C.add(str10);
                }
            }
        }
    }
}
