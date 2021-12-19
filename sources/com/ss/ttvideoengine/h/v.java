package com.ss.ttvideoengine.h;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.s.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public o f152740a;

    /* renamed from: b  reason: collision with root package name */
    b f152741b = new b((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public boolean f152742c;

    /* renamed from: d  reason: collision with root package name */
    int f152743d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f152744e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<String> f152745f;

    static {
        Covode.recordClassIndex(101636);
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        int f152750a;

        /* renamed from: b  reason: collision with root package name */
        long f152751b;

        /* renamed from: c  reason: collision with root package name */
        long f152752c;

        /* renamed from: d  reason: collision with root package name */
        long f152753d;

        /* renamed from: e  reason: collision with root package name */
        long f152754e;

        /* renamed from: f  reason: collision with root package name */
        long f152755f;

        /* renamed from: g  reason: collision with root package name */
        long f152756g;

        /* renamed from: h  reason: collision with root package name */
        long f152757h;

        /* renamed from: i  reason: collision with root package name */
        long f152758i;

        /* renamed from: j  reason: collision with root package name */
        String f152759j;

        static {
            Covode.recordClassIndex(101638);
        }

        private b() {
            this.f152750a = Integer.MIN_VALUE;
            this.f152751b = -2147483648L;
            this.f152752c = -2147483648L;
            this.f152753d = -2147483648L;
            this.f152754e = -2147483648L;
            this.f152755f = -2147483648L;
            this.f152756g = -2147483648L;
            this.f152757h = -2147483648L;
            this.f152758i = -2147483648L;
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    private void b() {
        String a2 = a(this.f152741b);
        if (!TextUtils.isEmpty(a2)) {
            if (this.f152741b.f152750a == 0) {
                if (this.f152745f == null) {
                    this.f152745f = new ArrayList<>();
                }
                this.f152745f.add(a2);
            } else if (this.f152741b.f152750a == 1) {
                if (this.f152744e == null) {
                    this.f152744e = new ArrayList<>();
                }
                this.f152744e.add(a2);
            }
        }
    }

    private void c() {
        if (this.f152741b.f152758i < 1000) {
            j.b("VideoEventOneNoRender", "duration less than threshold, abort event");
            return;
        }
        this.f152743d++;
        this.f152740a.a();
        com.ss.ttvideoengine.s.b.a(new a(this, this.f152740a, this.f152741b));
    }

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final v f152746a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f152747b = new Handler(Looper.getMainLooper());

        /* renamed from: c  reason: collision with root package name */
        private final o f152748c;

        /* renamed from: d  reason: collision with root package name */
        private final b f152749d;

        static {
            Covode.recordClassIndex(101637);
        }

        public final void run() {
            boolean z;
            if (this.f152746a != null) {
                o oVar = this.f152748c;
                if (oVar == null || !oVar.as) {
                    z = false;
                } else {
                    z = true;
                }
                v vVar = this.f152746a;
                o oVar2 = this.f152748c;
                b bVar = this.f152749d;
                HashMap hashMap = new HashMap();
                l.a(hashMap, "event_type", "av_norender");
                if (oVar2 != null) {
                    l.a(hashMap, "player_sessionid", oVar2.r);
                    l.a(hashMap, "sdk_version", oVar2.f152656k);
                }
                l.a(hashMap, "r_stage_errcs", bVar.f152759j);
                l.a(hashMap, "video_len_before", bVar.f152751b);
                l.a(hashMap, "audio_len_before", bVar.f152752c);
                l.a(hashMap, "vlen_dec_before", bVar.f152753d);
                l.a(hashMap, "alen_dec_before", bVar.f152754e);
                l.a(hashMap, "vlen_base_before", bVar.f152755f);
                l.a(hashMap, "alen_base_before", bVar.f152756g);
                l.a(hashMap, "cost_time", bVar.f152758i);
                l.a((Map) hashMap, "index", vVar.f152743d);
                l.a((Map) hashMap, "norender_type", bVar.f152750a);
                this.f152747b.post(new w(z, new JSONObject(hashMap)));
            }
        }

        public a(v vVar, o oVar, b bVar) {
            this.f152746a = vVar;
            this.f152748c = oVar;
            this.f152749d = bVar;
        }
    }

    public final void a() {
        if (this.f152742c) {
            this.f152742c = false;
            if (this.f152741b.f152757h > 0) {
                this.f152741b.f152758i = System.currentTimeMillis() - this.f152741b.f152757h;
            }
            b();
            c();
            this.f152741b = new b((byte) 0);
        }
    }

    public v(o oVar) {
        this.f152740a = oVar;
    }

    private static String a(b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("st", Long.valueOf(bVar.f152757h));
        hashMap.put("c", Long.valueOf(bVar.f152758i));
        try {
            return new JSONObject(hashMap).toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String[] split = str.split(";|=");
        if (split == null || split.length == 0) {
            return null;
        }
        for (int i2 = 0; i2 < split.length - 1; i2 += 2) {
            try {
                hashMap.put(split[i2], Integer.valueOf(Integer.parseInt(split[i2 + 1])));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return new JSONObject(hashMap).toString();
    }
}
