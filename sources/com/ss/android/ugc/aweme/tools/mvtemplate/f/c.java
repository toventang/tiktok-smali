package com.ss.android.ugc.aweme.tools.mvtemplate.f;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.dh;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f140845a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f140846b;

    static {
        Covode.recordClassIndex(91964);
    }

    c(b bVar, ViewGroup viewGroup) {
        this.f140845a = bVar;
        this.f140846b = viewGroup;
    }

    public final void run() {
        b bVar = this.f140845a;
        ViewGroup viewGroup = this.f140846b;
        if (viewGroup != null) {
            int b2 = (dh.b(bVar.f140835c.getContext()) - bVar.f140835c.getMeasuredWidth()) / 2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams.leftMargin = b2;
            layoutParams.rightMargin = b2;
            viewGroup.setLayoutParams(layoutParams);
        }
    }
}
