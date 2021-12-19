package com.google.android.datatransport.cct;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.cct.d;
import com.google.android.datatransport.runtime.a.a;
import java.net.URL;

final /* synthetic */ class c implements com.google.android.datatransport.runtime.b.c {

    /* renamed from: a  reason: collision with root package name */
    static final c f49364a = new c();

    static {
        Covode.recordClassIndex(30891);
    }

    private c() {
    }

    @Override // com.google.android.datatransport.runtime.b.c
    public final Object a(Object obj, Object obj2) {
        d.a aVar = (d.a) obj;
        d.b bVar = (d.b) obj2;
        URL url = bVar.f49375b;
        if (url == null) {
            return null;
        }
        a.a("CctTransportBackend", "Following redirect to: %s", url);
        return new d.a(bVar.f49375b, aVar.f49372b, aVar.f49373c);
    }
}
