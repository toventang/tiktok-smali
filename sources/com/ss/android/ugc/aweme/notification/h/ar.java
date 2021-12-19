package com.ss.android.ugc.aweme.notification.h;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ar extends p {

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f113573a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f113574b;

    static {
        Covode.recordClassIndex(73008);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        return false;
    }

    public final void b(String str) {
        l.d(str, "");
        this.f113574b.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ar(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.f6u);
        l.b(findViewById, "");
        this.f113574b = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.dnz);
        l.b(findViewById2, "");
        this.f113573a = (RelativeLayout) findViewById2;
    }
}
