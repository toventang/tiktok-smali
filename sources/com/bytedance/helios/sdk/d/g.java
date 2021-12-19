package com.bytedance.helios.sdk.d;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class g extends n {
    static {
        Covode.recordClassIndex(17925);
    }

    @Override // com.bytedance.helios.sdk.d.b
    public final int[] a() {
        return f.f30880c;
    }

    @Override // com.bytedance.helios.sdk.d.n
    public final String b() {
        return f.f30878a;
    }

    public g() {
        a(f.f30881d);
    }

    @Override // com.bytedance.helios.sdk.d.n
    public final List<Integer> b(int i2) {
        switch (i2) {
            case 100401:
                return n.a((Object) 100400);
            case 100403:
                return n.b(100402, 100400);
            case 100501:
                return n.a((Object) 100500);
            case 100503:
                return n.a((Object) 100502);
            default:
                return z.INSTANCE;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.helios.sdk.d.b
    public final void a(d dVar, Throwable th) {
        l.c(dVar, "");
        l.c(th, "");
        e eVar = (e) this.f30855a.get(dVar.f30865d);
        if (eVar.f30874b == 3) {
            switch (dVar.f30865d) {
                case 100404:
                case 100405:
                    b(dVar);
                    return;
                case 102200:
                    l.a((Object) eVar, "");
                    a(eVar, dVar, n.a((Object) 100400));
                    return;
                case 102201:
                    l.a((Object) eVar, "");
                    a(eVar, dVar, n.a((Object) 100401));
                    return;
                case 102202:
                    l.a((Object) eVar, "");
                    a(eVar, dVar, n.b(100400, 100402));
                    return;
                default:
                    return;
            }
        } else {
            l.a((Object) eVar, "");
            a(eVar, dVar, th);
        }
    }
}
