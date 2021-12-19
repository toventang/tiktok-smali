package com.ss.android.ugc.aweme.discover.lynx.d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.lynx.d.c;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.utils.es;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public long f81470a;

    static {
        Covode.recordClassIndex(50626);
    }

    public static void a(com.ss.android.ugc.aweme.discover.lynx.a.b bVar, String str, int i2, int i3) {
        String str2;
        l.d(bVar, "");
        l.d(str, "");
        d dVar = bVar.f81417h;
        if (dVar != null) {
            str2 = dVar.getSchema();
        } else {
            str2 = null;
        }
        int a2 = c.a.a(str2);
        c c2 = new c().a("load_failed").b(str2).d(String.valueOf(bVar.f81416g)).c(str);
        int i4 = 1;
        if (i2 != 1) {
            i4 = 0;
        }
        c2.g(String.valueOf(i4)).b(i3).a(a2).f();
        c.a.b(str2);
    }

    public final void a(com.ss.android.ugc.aweme.discover.lynx.a.b bVar, boolean z, int i2, int i3, boolean z2) {
        String str;
        l.d(bVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - this.f81470a;
        d dVar = bVar.f81417h;
        if (dVar != null) {
            str = dVar.getSchema();
        } else {
            str = null;
        }
        int a2 = c.a.a(str);
        c a3 = new c().a("load_success").b(str).d(String.valueOf(bVar.f81416g)).f(String.valueOf(j2)).e(String.valueOf(z ? 1 : 0)).a(z2);
        int i4 = 1;
        if (i2 != 1) {
            i4 = 0;
        }
        a3.g(String.valueOf(i4)).b(i3).a(a2).f();
        c.a.b(str);
        Uri parse = Uri.parse(str);
        if (bVar.o != null) {
            Object obj = bVar.o;
            if (obj == null) {
                l.b();
            }
            es a4 = es.a.a(obj);
            l.b(parse, "");
            a4.a(parse, new es.b(this.f81470a, currentTimeMillis));
        }
    }
}
