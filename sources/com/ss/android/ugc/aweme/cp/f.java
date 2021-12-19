package com.ss.android.ugc.aweme.cp;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.g.a;

public final class f extends a {

    /* renamed from: a  reason: collision with root package name */
    public View f78265a;

    static {
        Covode.recordClassIndex(48526);
    }

    @Override // com.ss.android.ugc.aweme.cp.a
    public final void a() {
        View view = this.f78265a;
        if (view != null) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            int a2 = a.a(TypedValue.applyDimension(1, 18.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            i.a(view, a2, a.a(TypedValue.applyDimension(1, 18.0f, system2.getDisplayMetrics())));
        }
    }
}
