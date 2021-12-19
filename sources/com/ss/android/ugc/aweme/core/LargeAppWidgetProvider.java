package com.ss.android.ugc.aweme.core;

import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.am;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.g.a;

public final class LargeAppWidgetProvider extends a {
    static {
        Covode.recordClassIndex(48514);
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final int b() {
        return R.layout.cp;
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final float d() {
        return 1.7582418f;
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final String e() {
        return "hashtag_l";
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final int a() {
        return am.f66370d;
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final int[] c() {
        return new int[]{R.id.c2w, R.id.c2x, R.id.c2y};
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final int[] f() {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        return new int[]{a.a(TypedValue.applyDimension(1, 126.0f, system.getDisplayMetrics())), a.a(TypedValue.applyDimension(1, 126.0f, system2.getDisplayMetrics()))};
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final int[] g() {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        return new int[]{a.a(TypedValue.applyDimension(1, 91.0f, system.getDisplayMetrics())), a.a(TypedValue.applyDimension(1, 160.0f, system2.getDisplayMetrics()))};
    }
}
