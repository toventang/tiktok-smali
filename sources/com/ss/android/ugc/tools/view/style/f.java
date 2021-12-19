package com.ss.android.ugc.tools.view.style;

import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static c f150193a;

    /* renamed from: b  reason: collision with root package name */
    public static a<? extends Typeface> f150194b;

    /* renamed from: c  reason: collision with root package name */
    public static final f f150195c = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(98840);
    }

    public static final Typeface a(String str) {
        l.d(str, "");
        c cVar = f150193a;
        if (cVar != null) {
            return cVar.a(str);
        }
        return null;
    }
}
