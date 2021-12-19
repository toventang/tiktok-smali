package com.ss.android.ugc.aweme.sticker.view.internal.main;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.view.a.k;
import com.ss.android.ugc.aweme.sticker.view.internal.c;
import com.ss.android.ugc.tools.view.style.StyleTabLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d implements k {
    static {
        Covode.recordClassIndex(89015);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.k
    public final c a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View findViewById = viewGroup.findViewById(R.id.bms);
        l.b(findViewById, "");
        return new h(findViewById);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.k
    public final StyleTabLayout b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View findViewById = viewGroup.findViewById(R.id.ehk);
        l.b(findViewById, "");
        return (StyleTabLayout) findViewById;
    }
}
