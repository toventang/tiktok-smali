package com.ss.android.ugc.aweme.im.sdk.common.controller.h.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.j;
import com.ss.android.ugc.aweme.im.service.g.b;
import com.ss.android.ugc.aweme.im.service.g.c;
import com.ss.android.ugc.aweme.utils.hk;
import h.f.a.r;
import h.f.b.l;
import h.z;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102292a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final C2561a f102293b = new C2561a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<String, j> f102294c;

    /* renamed from: d  reason: collision with root package name */
    private final r<String, JSONObject, JSONObject, JSONObject, z> f102295d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<j> f102296e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.a$a  reason: collision with other inner class name */
    public static final class C2561a {
        static {
            Covode.recordClassIndex(65463);
        }

        private C2561a() {
        }

        public /* synthetic */ C2561a(byte b2) {
            this();
        }
    }

    private /* synthetic */ a() {
        this(AnonymousClass1.f102297a, AnonymousClass2.f102298a);
    }

    static {
        Covode.recordClassIndex(65460);
    }

    private static JSONObject a(Map<String, ? extends Object> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.r<? super java.lang.String, ? super org.json.JSONObject, ? super org.json.JSONObject, ? super org.json.JSONObject, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private a(r<? super String, ? super JSONObject, ? super JSONObject, ? super JSONObject, z> rVar, h.f.a.a<j> aVar) {
        l.d(rVar, "");
        l.d(aVar, "");
        this.f102295d = rVar;
        this.f102296e = aVar;
        this.f102294c = new ConcurrentHashMap<>();
    }

    @Override // com.ss.android.ugc.aweme.im.service.g.c
    public final void a(b bVar, com.ss.android.ugc.aweme.im.service.g.a aVar) {
        l.d(bVar, "");
        l.d(aVar, "");
        String bVar2 = bVar.toString();
        j jVar = this.f102294c.get(bVar2);
        if (jVar != null && jVar.d()) {
            jVar.b();
            JSONObject a2 = a(aVar.f103861f);
            JSONObject a3 = a(aVar.f103862g);
            a3.put("load_time", jVar.c());
            JSONObject a4 = a(aVar.f103863h);
            if (hk.a(bVar.f103865c)) {
                a4.put("extra_id", bVar.f103865c);
            }
            this.f102295d.a(bVar.f103864b, a2, a3, a4);
            com.ss.android.ugc.aweme.im.service.m.a.b("DurationPerfMonImpl", "reported duration for ".concat(String.valueOf(bVar2)));
            this.f102294c.remove(bVar2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.g.c
    public final boolean a(b bVar, boolean z) {
        j jVar;
        l.d(bVar, "");
        String bVar2 = bVar.toString();
        if (!(this.f102294c.get(bVar2) == null || (jVar = this.f102294c.get(bVar2)) == null || !jVar.d())) {
            com.ss.android.ugc.aweme.im.service.m.a.d("DurationPerfMonImpl", "stopwatch " + bVar2 + " has already started.");
            if (!z) {
                return false;
            }
        }
        this.f102294c.put(bVar2, this.f102296e.invoke());
        return true;
    }
}
