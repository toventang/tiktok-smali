package com.ss.android.ugc.aweme.sticker.view.internal.main;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.view.internal.c;
import com.ss.android.ugc.tools.view.widget.f;
import h.f.b.l;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private final View f136304a;

    static {
        Covode.recordClassIndex(89023);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.c
    public final void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        this.f136304a.setOnClickListener(onClickListener);
        l.d(this.f136304a, "");
    }

    public h(View view) {
        l.d(view, "");
        this.f136304a = view;
        view.setOnTouchListener(new f());
    }
}
