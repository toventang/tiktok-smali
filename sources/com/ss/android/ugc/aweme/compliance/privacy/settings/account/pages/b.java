package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public final int f77684a = R.string.eu4;

    static {
        Covode.recordClassIndex(48079);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f
    public final int b() {
        return R.layout.uq;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public final void a(h hVar, int i2) {
        l.d(hVar, "");
        View view = hVar.itemView;
        l.b(view, "");
        ((TuxTextView) view.findViewById(R.id.ags)).setText(this.f77684a);
    }
}
