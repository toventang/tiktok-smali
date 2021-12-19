package com.ss.android.ugc.aweme.ax.a;

import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.k.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public final class k extends a implements n, o {

    /* renamed from: g  reason: collision with root package name */
    public static final Map<c<? extends s>, aa<? extends s>> f67745g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    public static final a f67746h = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public u f67747d;

    /* renamed from: e  reason: collision with root package name */
    public final z f67748e;

    /* renamed from: f  reason: collision with root package name */
    public final ab f67749f;

    public static final class a {
        static {
            Covode.recordClassIndex(41702);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(aa<? extends s> aaVar) {
            k.f67745g.put(aaVar.f67688a, aaVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.a, com.ss.android.ugc.aweme.ax.a.r
    public final void b() {
        super.b();
        a((u) null);
    }

    @Override // com.ss.android.ugc.aweme.ax.a.o
    public final String c() {
        return this.f67749f.e();
    }

    @Override // com.ss.android.ugc.aweme.ax.a.o
    public final boolean d() {
        return this.f67749f.c();
    }

    @Override // com.ss.android.ugc.aweme.ax.a.o
    public final List<String> e() {
        return this.f67749f.d();
    }

    @Override // com.ss.android.ugc.aweme.ax.a.o
    public final String f() {
        return this.f67749f.a();
    }

    @Override // com.ss.android.ugc.aweme.ax.a.o
    public final boolean g() {
        return this.f67749f.b();
    }

    static {
        Covode.recordClassIndex(41701);
        a.a(i.f67734a);
        a.a(x.f67756a);
    }

    private void a(u uVar) {
        u uVar2 = this.f67747d;
        if (uVar2 != null) {
            uVar2.b();
        }
        if (uVar != null) {
            uVar.a(bz_(), this.f67658b);
        }
        this.f67747d = uVar;
    }

    public final <T extends s> T a(Class<T> cls) {
        l.d(cls, "");
        u uVar = this.f67747d;
        if (uVar == null || !cls.isAssignableFrom(uVar.getClass())) {
            return null;
        }
        Objects.requireNonNull(uVar, "null cannot be cast to non-null type T");
        return (T) ((s) uVar);
    }

    public k(z zVar, ab abVar) {
        l.d(zVar, "");
        l.d(abVar, "");
        this.f67748e = zVar;
        this.f67749f = abVar;
    }

    @Override // com.ss.android.ugc.aweme.ax.a.n
    public final void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        try {
            this.f67748e.a(str, jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final void a(Uri uri, View view, Map<String, String> map) {
        l.d(uri, "");
        l.d(map, "");
        g gVar = new g();
        gVar.a(n.class, new af(this));
        gVar.a(u.class, new f(this.f67747d));
        gVar.a(View.class, new af(view));
        gVar.a(o.class, new af(this));
        Iterator<Map.Entry<c<? extends s>, aa<? extends s>>> it = f67745g.entrySet().iterator();
        T t = null;
        while (true) {
            if (it.hasNext()) {
                t = it.next().getValue().f67689b.invoke(uri, gVar, map);
                if (t != null) {
                    break;
                }
            } else if (t == null) {
                return;
            }
        }
        if (t instanceof u) {
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.hybrid.monitor.IUnitSession");
            a((u) t);
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.n
    public final void a(Exception exc, String str, Map<String, String> map) {
        l.d(exc, "");
        l.d(str, "");
        l.d(map, "");
        try {
            this.f67748e.a(exc, str, map);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.n
    public final void a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            this.f67748e.a(str, num, jSONObject, jSONObject2, false);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
