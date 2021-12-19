package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends f {

    /* renamed from: a  reason: collision with root package name */
    public final int f77700a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f77701b;

    static {
        Covode.recordClassIndex(48098);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f
    public final int b() {
        return R.layout.uu;
    }

    public /* synthetic */ d(int i2) {
        this(i2, null);
    }

    public d(int i2, Integer num) {
        this.f77700a = i2;
        this.f77701b = num;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public final void a(h hVar, int i2) {
        int i3;
        l.d(hVar, "");
        View view = hVar.itemView;
        l.b(view, "");
        ((TuxTextView) view.findViewById(R.id.f9l)).setText(this.f77700a);
        View view2 = hVar.itemView;
        l.b(view2, "");
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.f8f);
        Integer num = this.f77701b;
        if (num != null) {
            tuxTextView.setText(num.intValue());
            i3 = 0;
        } else {
            i3 = 8;
        }
        tuxTextView.setVisibility(i3);
    }
}
