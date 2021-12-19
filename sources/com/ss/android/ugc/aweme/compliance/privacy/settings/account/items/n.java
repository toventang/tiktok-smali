package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h;
import com.ss.android.ugc.aweme.setting.ui.Divider;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class n extends f {

    /* renamed from: a  reason: collision with root package name */
    public final int f77602a;

    static {
        Covode.recordClassIndex(48014);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f
    public final int b() {
        return R.layout.us;
    }

    public n(int i2) {
        this.f77602a = i2;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public final void a(h hVar, int i2) {
        l.d(hVar, "");
        View view = hVar.itemView;
        l.b(view, "");
        String string = view.getContext().getString(this.f77602a);
        l.b(string, "");
        ((Divider) view.findViewById(R.id.bde)).setLeftText(string);
    }
}
