package com.ss.ttvideoengine.e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.JniUtils;
import com.ss.ttvideoengine.d;
import com.ss.ttvideoengine.f.e;
import com.ss.ttvideoengine.j.o;
import com.ss.ttvideoengine.j.p;
import com.ss.ttvideoengine.j.q;
import com.ss.ttvideoengine.k.k;
import com.ss.ttvideoengine.s.i;
import com.ss.ttvideoengine.s.j;
import com.ss.ttvideoengine.s.l;
import com.ss.ttvideoengine.w;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends a {
    public Map<Integer, String> A;
    public HashMap<String, w> B;
    public w C;
    public String D;
    public String E;
    Context F;
    public k G;
    public e H;
    private String I = "h264";
    private e J;
    private String K;
    private String L;
    private int M;
    public w u;
    public boolean v;
    public boolean w;
    public boolean x;
    public p y;
    public int z;

    static {
        Covode.recordClassIndex(101558);
    }

    private c() {
    }

    static c e() {
        c cVar = new c();
        cVar.b();
        return cVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.e.a
    public final void b() {
        super.b();
        this.M = 0;
        this.f152475c = "vid_task";
        this.z = 0;
        this.u = w.Standard;
    }

    @Override // com.ss.ttvideoengine.e.a
    public final void a() {
        j.b("TTVideoEngine.DownloadVidTask", "[downloader] did call resume, videoId = " + this.f152485m);
        if (this.f152484l) {
            j.b("TTVideoEngine.DownloadVidTask", "[downloader] task did canceled");
        } else if (this.f152478f == 2) {
            j.b("TTVideoEngine.DownloadVidTask", "[downloader] state is running");
        } else {
            super.a();
            if (this.n == null || this.n.a(this)) {
                this.M = 0;
                a(2);
                p pVar = this.y;
                if (pVar != null) {
                    b(pVar);
                } else {
                    f();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.e.a
    public final JSONObject c() {
        HashMap hashMap = new HashMap();
        a(hashMap, "base_json", super.d());
        a(hashMap, "codec_type", this.I);
        a(hashMap, "base_dash", this.v);
        a(hashMap, "https", this.w);
        a(hashMap, "boe", this.x);
        a(hashMap, "resolution", w.toString(this.u));
        a(hashMap, "param", this.A);
        HashMap<String, w> hashMap2 = this.B;
        if (hashMap2 != null && hashMap2.size() > 0) {
            HashMap hashMap3 = new HashMap();
            for (String str : this.B.keySet()) {
                hashMap3.put(str, w.toString(this.B.get(str)));
            }
            a(hashMap, "resolution_map", hashMap3);
        }
        a((Map) hashMap, "api_version", this.z);
        a(hashMap, "curr_resolution", w.toString(this.C));
        JSONObject jSONObject = new JSONObject(hashMap);
        try {
            p pVar = this.y;
            if (pVar != null) {
                jSONObject.putOpt("video_model", pVar.f152970f);
            }
            return jSONObject;
        } catch (JSONException unused) {
            j.e("TTVideoEngine.DownloadVidTask", "[downloader] jsonObject fail.");
        } catch (Throwable unused2) {
        }
        return jSONObject;
    }

    private void f() {
        int i2;
        this.D = null;
        this.E = null;
        this.J = null;
        e eVar = new e(this.F, this.G);
        this.J = eVar;
        eVar.f152547e = new a(this);
        this.J.f152548f = this.B;
        this.J.f152549g = this.f152485m;
        this.J.a(true);
        if (!TextUtils.isEmpty(this.K)) {
            try {
                i2 = JniUtils.b();
            } catch (Exception unused) {
                i2 = 0;
            }
            String a2 = com.a.a("%s&method=%d", new Object[]{this.K, Integer.valueOf(i2)});
            this.D = a2;
            if (this.x) {
                this.D = i.c(a2);
            }
            String a3 = l.a(this.D);
            this.D = a3;
            j.a("TTVideoEngine.DownloadVidTask", com.a.a("[downloader] api string from fallback api:%s ,keySeed = %s", new Object[]{a3, this.L}));
            this.J.a((Boolean) true);
            this.J.a(this.D, null, 0, this.L);
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.I.equals("bytevc2")) {
            hashMap.put("codec_type", "4");
        } else if (this.I.equals("bytevc1")) {
            hashMap.put("codec_type", "3");
        }
        if (this.v) {
            hashMap.put("format_type", "dash");
        }
        if (this.w) {
            hashMap.put("ssl", "1");
        }
        e eVar2 = this.H;
        if (eVar2 != null) {
            this.D = eVar2.a();
            this.E = this.H.b();
            if (this.x) {
                this.D = i.c(this.D);
            } else {
                this.D = this.D;
            }
        }
        String a4 = l.a(this.D);
        this.D = a4;
        this.J.a(a4, this.E, this.z);
        j.a("TTVideoEngine.DownloadVidTask", "[downloader] fetch videoModel, apiString = " + this.D);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.e.a
    public final void a(com.ss.ttvideoengine.s.c cVar) {
        if (b(cVar)) {
            this.M++;
            f();
            return;
        }
        super.a(cVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.e.a
    public final boolean b(com.ss.ttvideoengine.s.c cVar) {
        if (super.b(cVar) && this.M < 10) {
            return true;
        }
        return false;
    }

    public final void b(p pVar) {
        this.f152481i.clear();
        this.f152482j = new HashMap();
        String h2 = pVar.h();
        if (TextUtils.isEmpty(h2) || !h2.equals("segment_base")) {
            o a2 = pVar.a(this.u, this.A, true);
            if (a(a2)) {
                this.C = a2.c();
            } else {
                return;
            }
        } else {
            o a3 = pVar.a(this.u, q.f152977b, this.A, true);
            if (a3 != null) {
                if (a(a3)) {
                    this.C = a3.c();
                } else {
                    return;
                }
            }
            o a4 = pVar.a(this.u, q.f152976a, this.A, true);
            if (a4 != null) {
                if (a(a4)) {
                    this.C = a4.c();
                } else {
                    return;
                }
            }
        }
        if (this.n != null) {
            this.n.b(this);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (super.equals(obj)) {
            return true;
        }
        if (!obj.getClass().equals(c.class)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f152481i != null && this.f152481i.size() > 0 && cVar.f152481i != null) {
            return this.f152481i.equals(cVar.f152481i);
        }
        if (this.f152485m == null || cVar.f152485m == null ? this.f152485m == null && cVar.f152485m == null : this.f152485m.equals(cVar.f152485m)) {
            if (this.v == cVar.v && this.I.equals(cVar.I) && this.u == cVar.u) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean a(o oVar) {
        String[] b2 = oVar.b();
        String b3 = oVar.b(15);
        if (b2 == null || b2.length <= 0 || TextUtils.isEmpty(b3)) {
            a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainFetchingInfo", -9996, 0, "error info  urls or filehash is null: apiString = " + this.D + " authString = " + this.E + " filehash = " + b3));
            return false;
        }
        j.b("TTVideoEngine.DownloadVidTask", "[downloader] download urlinfo videoId = " + this.f152485m + " " + oVar.c().toString() + " filehash = " + b3);
        this.f152481i.add(b3);
        this.f152482j.put(b3, Arrays.asList(b2));
        String a2 = d.h.f152465a.a(b3, this.f152485m, b2, this.t.version);
        if (d.h.f152465a.l(a2)) {
            return true;
        }
        a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainDownload", -9996, 0, "resume download fail. url = " + a2 + " dataloader state is " + d.h.f152465a.c()));
        return false;
    }

    public final void a(p pVar) {
        this.y = pVar;
        String b2 = pVar.b(217);
        String b3 = pVar.b(218);
        if (!TextUtils.isEmpty(b2)) {
            this.K = b2;
            j.a("TTVideoEngine.DownloadVidTask", "[downloader] set fallbackapi ".concat(String.valueOf(b2)));
        }
        if (!TextUtils.isEmpty(b3)) {
            this.L = b3;
            j.a("TTVideoEngine.DownloadVidTask", "[downloader] set keyseed " + this.L);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.e.a
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject.optJSONObject("base_json"));
        this.I = jSONObject.optString("codec_type");
        this.v = jSONObject.optBoolean("base_dash");
        this.w = jSONObject.optBoolean("https");
        this.x = jSONObject.optBoolean("boe");
        w forString = w.forString(jSONObject.optString("resolution"));
        this.u = forString;
        if (forString == w.Undefine) {
            this.u = w.Standard;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("param");
        if (optJSONObject != null && optJSONObject.length() > 0) {
            this.A = new HashMap();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.A.put(Integer.valueOf(next), optJSONObject.optString(next));
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("resolution_map");
        if (optJSONObject2 != null && optJSONObject2.length() > 0) {
            this.B = new HashMap<>();
            Iterator<String> keys2 = optJSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                this.B.put(next2, w.forString(optJSONObject2.optString(next2)));
            }
        }
        this.z = jSONObject.optInt("api_version");
        this.C = w.forString(jSONObject.optString("curr_resolution"));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("video_model");
        if (optJSONObject3 != null && optJSONObject3.length() > 0) {
            p pVar = new p();
            try {
                pVar.a(optJSONObject3);
            } catch (Throwable unused) {
                j.e("TTVideoEngine.DownloadVidTask", "[downloader] ssignWithJson fail.");
                pVar = null;
            } finally {
                a(pVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements e.a {

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<c> f152490b;

        static {
            Covode.recordClassIndex(101559);
        }

        @Override // com.ss.ttvideoengine.f.e.a
        public final void a(com.ss.ttvideoengine.s.c cVar) {
        }

        @Override // com.ss.ttvideoengine.f.e.a
        public final void a(String str) {
        }

        public a(c cVar) {
            this.f152490b = new WeakReference<>(cVar);
        }

        @Override // com.ss.ttvideoengine.f.e.a
        public final void a(int i2, String str) {
            c cVar = this.f152490b.get();
            if (cVar != null) {
                cVar.a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainFetchingInfo", -9996, i2, "error info: apiString = " + c.this.D + " authString = " + c.this.E + " apiVersion = " + c.this.z + " state = " + i2));
            }
        }

        @Override // com.ss.ttvideoengine.f.e.a
        public final void a(p pVar, com.ss.ttvideoengine.s.c cVar) {
            c cVar2 = this.f152490b.get();
            if (cVar2 != null) {
                j.b("TTVideoEngine.DownloadVidTask", "did fetch video modeo, videoId is " + cVar2.f152485m);
                if (cVar2.f152478f == 4 || cVar2.f152478f == 5) {
                    j.b("TTVideoEngine.DownloadVidTask", "but state is canceled. videoId = " + cVar2.f152485m);
                } else if (pVar != null) {
                    cVar2.a(pVar);
                    if (cVar2.f152478f == 3) {
                        j.b("TTVideoEngine.DownloadVidTask", "but state is suspended. videoId = " + cVar2.f152485m);
                    } else {
                        cVar2.b(pVar);
                    }
                } else if (cVar != null) {
                    cVar2.a(cVar);
                }
            }
        }
    }
}
