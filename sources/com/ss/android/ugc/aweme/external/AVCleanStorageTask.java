package com.ss.android.ugc.aweme.external;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.e.a;
import com.ss.android.ugc.aweme.cs.e.b;
import com.ss.android.ugc.aweme.cs.e.c;
import com.ss.android.ugc.aweme.cs.e.d;
import com.ss.android.ugc.aweme.cs.e.e;
import com.ss.android.ugc.aweme.cs.e.f;
import com.ss.android.ugc.aweme.cs.e.g;
import com.ss.android.ugc.aweme.cs.e.h;
import com.ss.android.ugc.aweme.cs.e.i;
import com.ss.android.ugc.aweme.cs.e.j;
import com.ss.android.ugc.aweme.cs.e.k;
import com.ss.android.ugc.aweme.cs.e.m;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class AVCleanStorageTask implements w {
    static {
        Covode.recordClassIndex(56630);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
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
        l.d(context, "");
        List<a> b2 = n.b(new b(), new d(), new c(), new f(), new h(), new i(), new k(), new com.ss.android.ugc.aweme.cs.e.l(), new com.ss.android.ugc.aweme.cs.e.n(), new g(), new j(), new e(), m.f79049c);
        ArrayList arrayList = new ArrayList(n.a((Iterable) b2, 10));
        for (a aVar : b2) {
            com.bytedance.u.d.a(aVar);
            if (aVar.f().length() > 0) {
                aVar.f();
            }
            arrayList.add(z.f158842a);
        }
    }
}
