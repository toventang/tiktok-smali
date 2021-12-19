package com.bytedance.android.live.effect.d;

import android.view.View;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.google.android.material.tabs.TabLayout;
import com.zhiliaoapp.musically.R;

public final class f {
    static {
        Covode.recordClassIndex(4984);
    }

    public static final void a(TabLayout.f fVar) {
        View findViewById;
        View findViewById2;
        if (fVar != null) {
            View view = fVar.f52655f;
            if (!(view == null || (findViewById2 = view.findViewById(R.id.ehf)) == null)) {
                findViewById2.setAlpha(0.5f);
            }
            View view2 = fVar.f52655f;
            if (view2 != null && (findViewById = view2.findViewById(R.id.eh9)) != null) {
                p.a(findViewById);
            }
        }
    }

    public static final void b(TabLayout.f fVar) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        if (fVar != null) {
            View view = fVar.f52655f;
            if (!(view == null || (findViewById3 = view.findViewById(R.id.ehf)) == null)) {
                findViewById3.setAlpha(0.9f);
            }
            View view2 = fVar.f52655f;
            if (!(view2 == null || (findViewById2 = view2.findViewById(R.id.eh9)) == null)) {
                p.b(findViewById2);
            }
            View view3 = fVar.f52655f;
            if (view3 != null && (findViewById = view3.findViewById(R.id.ehi)) != null) {
                p.a(findViewById);
            }
        }
    }
}
