package com.ss.android.ugc.aweme.core;

import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.am;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.g.a;

public final class MediumAppWidgetProvider extends a {
    static {
        Covode.recordClassIndex(48515);
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final int b() {
        return R.layout.cq;
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final float d() {
        return 1.0952381f;
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final String e() {
        return "hashtag_m";
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final int a() {
        return am.f66369c;
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final int[] c() {
        return new int[]{R.id.c2w, R.id.c2x, R.id.c2y, R.id.c2z};
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final int[] f() {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        return new int[]{a.a(TypedValue.applyDimension(1, 48.0f, system.getDisplayMetrics())), a.a(TypedValue.applyDimension(1, 48.0f, system2.getDisplayMetrics()))};
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final int[] g() {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        return new int[]{a.a(TypedValue.applyDimension(1, 63.0f, system.getDisplayMetrics())), a.a(TypedValue.applyDimension(1, 69.0f, system2.getDisplayMetrics()))};
    }
}
