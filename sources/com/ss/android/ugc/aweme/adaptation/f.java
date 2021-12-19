package com.ss.android.ugc.aweme.adaptation;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.base.utils.n;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final int f66233a;

    /* renamed from: b  reason: collision with root package name */
    private final View f66234b;

    /* renamed from: c  reason: collision with root package name */
    private final View f66235c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f66236d;

    /* renamed from: e  reason: collision with root package name */
    private final View f66237e;

    /* renamed from: f  reason: collision with root package name */
    private final c.d f66238f;

    static {
        Covode.recordClassIndex(40703);
    }

    f(int i2, View view, View view2, boolean z, View view3, c.d dVar) {
        this.f66233a = i2;
        this.f66234b = view;
        this.f66235c = view2;
        this.f66236d = z;
        this.f66237e = view3;
        this.f66238f = dVar;
    }

    public final void run() {
        int i2 = this.f66233a;
        View view = this.f66234b;
        View view2 = this.f66235c;
        boolean z = this.f66236d;
        View view3 = this.f66237e;
        c.d dVar = this.f66238f;
        int a2 = n.a((double) c.f66193c);
        if (i2 == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams.bottomMargin != a2) {
                layoutParams.bottomMargin = a2;
                view.setLayoutParams(layoutParams);
            }
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2.height != a2) {
            layoutParams2.height = a2;
            view2.setLayoutParams(layoutParams2);
        }
        if (z) {
            Rect rect = new Rect();
            view2.getGlobalVisibleRect(rect);
            c.b.f66221a.f66203l.f66219e = rect;
        }
        if (view3 != null) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
            if (layoutParams3.height != a2) {
                layoutParams3.height = a2;
                layoutParams3.topMargin = -a2;
                view3.setLayoutParams(layoutParams3);
            }
        }
        if (dVar != null) {
            dVar.a();
        }
    }
}
