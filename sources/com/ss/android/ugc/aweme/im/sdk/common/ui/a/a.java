package com.ss.android.ugc.aweme.im.sdk.common.ui.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final View f102496a;

    static {
        Covode.recordClassIndex(65642);
    }

    public final void a() {
        this.f102496a.setVisibility(0);
        TuxIconView tuxIconView = (TuxIconView) this.f102496a.findViewById(R.id.f2r);
        l.b(tuxIconView, "");
        tuxIconView.setVisibility(0);
        com.ss.android.ugc.aweme.notification.g.a.a(this.f102496a);
    }

    public a(Context context, ViewGroup.LayoutParams layoutParams) {
        l.d(context, "");
        l.d(layoutParams, "");
        View a2 = com.a.b.a.a(context, R.layout.a70);
        l.b(a2, "");
        this.f102496a = a2;
        a2.setLayoutParams(layoutParams);
    }
}
