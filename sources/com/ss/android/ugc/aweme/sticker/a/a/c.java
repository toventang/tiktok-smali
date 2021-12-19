package com.ss.android.ugc.aweme.sticker.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.utils.cs;
import com.ss.android.ugc.tools.utils.u;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c extends com.ss.android.ugc.aweme.sticker.a.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f134700b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private String f134701c = "download";

    /* renamed from: d  reason: collision with root package name */
    private boolean f134702d = true;

    static {
        Covode.recordClassIndex(88039);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88040);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.a.c$c  reason: collision with other inner class name */
    public static final class C3503c extends com.google.gson.b.a<List<? extends a>> {
        static {
            Covode.recordClassIndex(88042);
        }

        C3503c() {
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.a.a
    public final String a() {
        return this.f134701c;
    }

    @Override // com.ss.android.ugc.aweme.sticker.a.a
    public final boolean b() {
        return this.f134702d;
    }

    public static final class b extends com.ss.android.ugc.aweme.common.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f134703a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f134704b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HashMap f134705c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f134706d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f134707e;

        static {
            Covode.recordClassIndex(88041);
        }

        @Override // com.ss.android.ugc.aweme.common.c.a
        public final void a() {
            if (this.f134707e < this.f134704b.f134697b.size() - 1) {
                this.f134703a.a(this.f134706d, this.f134704b, this.f134707e + 1, this.f134705c);
                return;
            }
            this.f134705c.put(this.f134704b, new b("", 0));
            this.f134703a.a(this.f134706d, this.f134705c);
        }

        @Override // com.ss.android.ugc.aweme.common.c.a
        public final void a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            if (this.f134704b.f134696a == 1) {
                HashMap hashMap = this.f134705c;
                a aVar = this.f134704b;
                String str3 = p.f(str2, ".zip") + "_unzip";
                cs.c(str3);
                u.a(new File(str2), new File(str3));
                cs.c(str2);
                hashMap.put(aVar, new b(str3, 1));
            } else {
                this.f134705c.put(this.f134704b, new b(str2, 1));
            }
            this.f134703a.a(this.f134706d, this.f134705c);
        }

        b(c cVar, a aVar, HashMap hashMap, int i2, int i3) {
            this.f134703a = cVar;
            this.f134704b = aVar;
            this.f134705c = hashMap;
            this.f134706d = i2;
            this.f134707e = i3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(dVar);
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.a.a
    public final void a(int i2, String str) {
        JSONArray optJSONArray;
        if (!(str == null || (optJSONArray = new JSONObject(str).optJSONArray("data")) == null)) {
            HashMap<a, b> hashMap = new HashMap<>();
            Object a2 = com.ss.android.ugc.aweme.port.in.c.f115623b.a(optJSONArray.toString(), new C3503c().type);
            l.b(a2, "");
            for (a aVar : (Iterable) a2) {
                hashMap.put(aVar, null);
                a(i2, aVar, 0, hashMap);
            }
        }
    }

    public final void a(int i2, HashMap<a, b> hashMap) {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<a, b> entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                b value = entry.getValue();
                if (value == null) {
                    l.b();
                }
                b bVar = value;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("path", bVar.f134698a);
                jSONObject.put("success", bVar.f134699b);
                jSONArray.put(jSONObject);
            } else {
                return;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("interface", this.f134701c);
        jSONObject2.put("file_paths", jSONArray);
        String jSONObject3 = jSONObject2.toString();
        l.b(jSONObject3, "");
        a((long) i2, jSONObject3);
    }

    public final void a(int i2, a aVar, int i3, HashMap<a, b> hashMap) {
        if (i3 < aVar.f134697b.size()) {
            String str = aVar.f134697b.get(i3);
            g.a().k().downloadFile(str, dj.t + ((int) ((short) str.hashCode())) + File.separator, (String) n.i(p.c(str, new String[]{"/"})), new b(this, aVar, hashMap, i2, i3));
        }
    }
}
