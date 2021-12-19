package com.ss.android.ugc.aweme.feed.ui.masklayer2.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;
import h.z;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private final a<z> f94891a;

    static {
        Covode.recordClassIndex(60182);
    }

    public abstract void a(View view);

    public f(a<z> aVar) {
        l.d(aVar, "");
        this.f94891a = aVar;
    }

    public void b(View view) {
        l.d(view, "");
        this.f94891a.invoke();
        a(view);
    }
}
