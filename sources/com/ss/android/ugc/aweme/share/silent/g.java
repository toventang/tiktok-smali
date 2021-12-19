package com.ss.android.ugc.aweme.share.silent;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.g.a;

public final class g extends a {
    static {
        Covode.recordClassIndex(81643);
    }

    @Override // com.ss.android.ugc.aweme.share.silent.a
    public final int getLayoutResId() {
        return R.layout.azp;
    }

    @Override // com.ss.android.ugc.aweme.share.silent.a
    public final void a() {
        a(32, 20);
        b();
        setSyncIconSize((int) n.b(getContext(), 32.0f));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.share.silent.a
    public final void a(View view) {
        l.d(view, "");
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        i.b(view, Integer.valueOf(a.a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()))), null, 0, null, false, 26);
    }
}
