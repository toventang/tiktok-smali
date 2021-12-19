package com.d.a.a.a.b.a;

import com.bytedance.covode.number.Covode;
import com.d.a.a.a.b.i;
import com.d.a.a.a.b.l;
import com.d.a.a.a.c.f;
import com.d.a.a.a.e.d;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final l f46326a;

    static {
        Covode.recordClassIndex(28296);
    }

    private b(l lVar) {
        this.f46326a = lVar;
    }

    public static b a(com.d.a.a.a.b.b bVar) {
        l lVar = (l) bVar;
        d.a(bVar, "AdSession is null");
        if (i.NATIVE != lVar.f46356a.f46333b) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        } else if (!lVar.f46359d) {
            d.a(lVar);
            if (lVar.f46358c.f46404c == null) {
                b bVar2 = new b(lVar);
                lVar.f46358c.f46404c = bVar2;
                return bVar2;
            }
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        } else {
            throw new IllegalStateException("AdSession is started");
        }
    }

    public final void a(float f2, float f3) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        } else if (f3 < 0.0f || f3 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        } else {
            d.b(this.f46326a);
            JSONObject jSONObject = new JSONObject();
            com.d.a.a.a.e.b.a(jSONObject, "duration", Float.valueOf(f2));
            com.d.a.a.a.e.b.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f3));
            com.d.a.a.a.e.b.a(jSONObject, "deviceVolume", Float.valueOf(f.a().f46388a));
            this.f46326a.f46358c.a("start", jSONObject);
        }
    }

    public final void a() {
        d.b(this.f46326a);
        this.f46326a.f46358c.a("firstQuartile");
    }

    public final void b() {
        d.b(this.f46326a);
        this.f46326a.f46358c.a("midpoint");
    }

    public final void c() {
        d.b(this.f46326a);
        this.f46326a.f46358c.a("thirdQuartile");
    }

    public final void d() {
        d.b(this.f46326a);
        this.f46326a.f46358c.a("complete");
    }

    public final void e() {
        d.b(this.f46326a);
        this.f46326a.f46358c.a("pause");
    }

    public final void f() {
        d.b(this.f46326a);
        this.f46326a.f46358c.a("resume");
    }

    public final void g() {
        d.b(this.f46326a);
        this.f46326a.f46358c.a("skipped");
    }

    public final void a(a aVar) {
        d.a(aVar, "InteractionType is null");
        d.b(this.f46326a);
        JSONObject jSONObject = new JSONObject();
        com.d.a.a.a.e.b.a(jSONObject, "interactionType", aVar);
        this.f46326a.f46358c.a("adUserInteraction", jSONObject);
    }
}
