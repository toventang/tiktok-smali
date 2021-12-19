package com.ss.android.ugc.aweme.benchmark;

import android.content.Context;
import com.benchmark.collection.b;
import com.benchmark.collection.e;
import com.benchmark.collection.f;
import com.benchmark.port.c;
import com.benchmark.settings.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.List;

public final class BenchmarkInitRequest implements a, w {
    static {
        Covode.recordClassIndex(42242);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final String[] c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final int d() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final ac e() {
        return ac.IO;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        c a2 = com.benchmark.c.a.a().a(d.n);
        a.C0085a aVar = new a.C0085a();
        aVar.f6344d = "a5fafb0vf8ba061000qzbwg0irxc02afaf4";
        aVar.f6345e = "00qzdilcy900ojjtxy674bozlqmt0yja";
        a2.a(new com.benchmark.settings.a(aVar, (byte) 0));
        b bVar = b.f6115a;
        l.b(bVar, "");
        f a3 = bVar.a();
        e.a aVar2 = new e.a();
        if (a.a() > 0) {
            int a4 = a.a();
            if (a4 <= 0) {
                aVar2.f6150a = false;
            } else {
                aVar2.f6150a = true;
                aVar2.f6151b = a4;
            }
        }
        a3.a(new e(aVar2));
        b bVar2 = b.f6115a;
        l.b(bVar2, "");
        bVar2.a().a();
    }
}
