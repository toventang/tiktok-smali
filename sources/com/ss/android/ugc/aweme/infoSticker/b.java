package com.ss.android.ugc.aweme.infoSticker;

import androidx.fragment.app.e;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private e f104593a;

    /* renamed from: b  reason: collision with root package name */
    private String f104594b;

    static {
        Covode.recordClassIndex(67008);
    }

    public final void a(a aVar) {
        String str = this.f104594b;
        t tVar = new t();
        g.a().x().a(str, new d(tVar));
        tVar.observe(this.f104593a, new c(aVar));
    }

    public b(e eVar, String str) {
        this.f104593a = eVar;
        this.f104594b = str;
    }
}
