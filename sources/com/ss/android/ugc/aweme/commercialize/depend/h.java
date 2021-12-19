package com.ss.android.ugc.aweme.commercialize.depend;

import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.newmedia.d;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.ad.b.c;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a;
import h.f.b.l;

public class h extends a {
    static {
        Covode.recordClassIndex(45422);
    }

    private final String e() {
        return d().f75408b.f75444a;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.e
    public final boolean a() {
        if (e().length() != 0 && d().f75408b.s == 1) {
            return d.a(e());
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.e
    public final boolean b() {
        Context c2 = c();
        if (!(c2 instanceof e)) {
            c2 = null;
        }
        e eVar = (e) c2;
        if (eVar == null) {
            return false;
        }
        l.b(b.a.f65586a, "");
        c a2 = b.a();
        if (a2 == null) {
            return true;
        }
        a2.a(eVar, e(), d().f75408b.f75445b);
        return true;
    }
}
