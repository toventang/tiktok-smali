package com.d.a.a.a.b;

import com.bytedance.covode.number.Covode;
import com.d.a.a.a.c.e;
import com.d.a.a.a.e.d;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final l f46324a;

    static {
        Covode.recordClassIndex(28294);
    }

    private a(l lVar) {
        this.f46324a = lVar;
    }

    public static a a(b bVar) {
        l lVar = (l) bVar;
        d.a(bVar, "AdSession is null");
        if (lVar.f46358c.f46403b == null) {
            d.a(lVar);
            a aVar = new a(lVar);
            lVar.f46358c.f46403b = aVar;
            return aVar;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    public final void a() {
        d.a(this.f46324a);
        d.c(this.f46324a);
        if (!this.f46324a.d()) {
            try {
                this.f46324a.a();
            } catch (Exception unused) {
            }
        }
        if (this.f46324a.d()) {
            l lVar = this.f46324a;
            if (!lVar.f46362g) {
                e.f46383a.a(lVar.f46358c.c(), "publishImpressionEvent", new Object[0]);
                lVar.f46362g = true;
                return;
            }
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    public final void a(com.d.a.a.a.b.a.d dVar) {
        d.b(this.f46324a);
        d.c(this.f46324a);
        l lVar = this.f46324a;
        JSONObject a2 = dVar.a();
        if (!lVar.f46363h) {
            com.d.a.a.a.g.a aVar = lVar.f46358c;
            e.f46383a.a(aVar.c(), "publishLoadedEvent", a2);
            lVar.f46363h = true;
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }
}
