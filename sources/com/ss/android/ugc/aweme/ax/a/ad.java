package com.ss.android.ugc.aweme.ax.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class ad extends a implements u {

    /* renamed from: d  reason: collision with root package name */
    public final Uri f67693d;

    /* renamed from: e  reason: collision with root package name */
    public final g f67694e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f67695f;

    /* renamed from: g  reason: collision with root package name */
    private final h f67696g = i.a(m.SYNCHRONIZED, new b(this));

    /* renamed from: h  reason: collision with root package name */
    private final h f67697h = i.a(m.SYNCHRONIZED, new a(this));

    /* renamed from: i  reason: collision with root package name */
    private String f67698i;

    /* renamed from: j  reason: collision with root package name */
    private String f67699j;

    static {
        Covode.recordClassIndex(41667);
    }

    @Override // com.ss.android.ugc.aweme.ax.a.u
    public final v a() {
        return (v) this.f67696g.getValue();
    }

    public abstract void a(String str, t tVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    public final w q() {
        return (w) this.f67697h.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ax.a.u
    public final String l() {
        return this.f67698i;
    }

    @Override // com.ss.android.ugc.aweme.ax.a.u
    public final String m() {
        return this.f67699j;
    }

    static final class b extends h.f.b.m implements h.f.a.a<v> {
        final /* synthetic */ ad this$0;

        static {
            Covode.recordClassIndex(41669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ad adVar) {
            super(0);
            this.this$0 = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ v invoke() {
            return new v(this.this$0.f67693d, null, this.this$0.f67695f, 2);
        }
    }

    public final o n() {
        return (o) this.f67694e.a(o.class);
    }

    public final n o() {
        return (n) this.f67694e.a(n.class);
    }

    public final u p() {
        return (u) this.f67694e.a(u.class);
    }

    static final class a extends h.f.b.m implements h.f.a.a<w> {
        final /* synthetic */ ad this$0;

        static {
            Covode.recordClassIndex(41668);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ad adVar) {
            super(0);
            this.this$0 = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ w invoke() {
            return new w(this.this$0.f67693d, this.this$0.f67693d, this.this$0.f67695f);
        }
    }

    public final v r() {
        u p = p();
        if (p != null) {
            return new v(p.a().f67750a, "original_", null, 4);
        }
        return null;
    }

    public ad(Uri uri, g gVar, Map<String, String> map) {
        l.d(uri, "");
        l.d(gVar, "");
        l.d(map, "");
        this.f67693d = uri;
        this.f67694e = gVar;
        this.f67695f = map;
    }

    public final void a(Exception exc, String str, String str2) {
        l.d(exc, "");
        l.d(str, "");
        l.d(str2, "");
        exc.printStackTrace();
        n o = o();
        if (o != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("url", str);
            linkedHashMap.put(StringSet.type, str2);
            o.a(exc, "hybrid " + str2 + " report failed", linkedHashMap);
        }
    }

    public void a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
        n o = o();
        if (o != null) {
            o.a(str, num, jSONObject, jSONObject2);
        }
    }

    public static /* synthetic */ void a(ad adVar, String str, t tVar, JSONObject jSONObject, JSONObject jSONObject2, int i2) {
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = null;
        if ((i2 & 4) != 0) {
            jSONObject3 = null;
        }
        if ((i2 & 8) == 0) {
            jSONObject4 = jSONObject2;
        }
        adVar.a(str, tVar, jSONObject3, jSONObject4, null);
    }
}
