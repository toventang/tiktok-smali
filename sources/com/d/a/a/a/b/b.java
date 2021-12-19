package com.d.a.a.a.b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.d.a.a.a.a;
import com.d.a.a.a.e.d;

public abstract class b {
    static {
        Covode.recordClassIndex(28299);
    }

    public abstract void a();

    public abstract void a(View view);

    public abstract void b();

    public abstract void b(View view);

    public abstract void c(View view);

    public static b a(c cVar, d dVar) {
        if (a.f46317a.f46366a) {
            d.a(cVar, "AdSessionConfiguration is null");
            d.a(dVar, "AdSessionContext is null");
            return new l(cVar, dVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
