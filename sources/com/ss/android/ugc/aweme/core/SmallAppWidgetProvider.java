package com.ss.android.ugc.aweme.core;

import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.am;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.g.a;

public final class SmallAppWidgetProvider extends a {
    static {
        Covode.recordClassIndex(48516);
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final int b() {
        return R.layout.cr;
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final int[] c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final float d() {
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final String e() {
        return "hashtag_s";
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final int[] g() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final int a() {
        return am.f66368b;
    }

    @Override // com.ss.android.ugc.aweme.core.a
    public final int[] f() {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        return new int[]{a.a(TypedValue.applyDimension(1, 62.0f, system.getDisplayMetrics())), a.a(TypedValue.applyDimension(1, 62.0f, system2.getDisplayMetrics()))};
    }
}
