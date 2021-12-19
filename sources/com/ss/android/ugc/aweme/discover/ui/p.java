package com.ss.android.ugc.aweme.discover.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.jedi.ext.adapter.a.e;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class p implements e {

    /* renamed from: a  reason: collision with root package name */
    private final DmtLoadingLayout f82629a;

    /* renamed from: b  reason: collision with root package name */
    private final TuxTextView f82630b;

    /* renamed from: c  reason: collision with root package name */
    private final View f82631c;

    static {
        Covode.recordClassIndex(51458);
    }

    @Override // com.bytedance.jedi.ext.adapter.a.e
    public final View a() {
        return this.f82631c;
    }

    public p(View view) {
        l.d(view, "");
        this.f82631c = view;
        View findViewById = view.findViewById(R.id.e_o);
        l.b(findViewById, "");
        this.f82629a = (DmtLoadingLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.cvs);
        l.b(findViewById2, "");
        this.f82630b = (TuxTextView) findViewById2;
    }

    @Override // com.bytedance.jedi.ext.adapter.a.e
    public final void a(int i2) {
        switch (i2) {
            case 241:
                this.f82629a.setVisibility(8);
                this.f82630b.setVisibility(8);
                return;
            case 242:
                this.f82629a.setVisibility(0);
                this.f82630b.setVisibility(8);
                return;
            case 243:
                this.f82629a.setVisibility(8);
                this.f82630b.setVisibility(0);
                return;
            case 244:
                this.f82629a.setVisibility(8);
                this.f82630b.setVisibility(8);
                return;
            default:
                return;
        }
    }
}
