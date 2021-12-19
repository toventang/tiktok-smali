package com.bytedance.android.live.design.view;

import android.view.View;
import android.view.ViewParent;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class d extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public int f9427a = 3;

    static {
        Covode.recordClassIndex(4808);
    }

    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Throwable unused) {
        }
        View contentView = getContentView();
        if (contentView != null) {
            ViewParent parent = contentView.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                }
            }
        }
    }

    public d(g gVar) {
        super(gVar);
    }
}
