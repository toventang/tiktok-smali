package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    View f78528a;

    /* renamed from: b  reason: collision with root package name */
    int f78529b;

    /* renamed from: c  reason: collision with root package name */
    FrameLayout.LayoutParams f78530c;

    /* renamed from: d  reason: collision with root package name */
    int f78531d;

    /* renamed from: e  reason: collision with root package name */
    boolean f78532e = true;

    /* renamed from: f  reason: collision with root package name */
    int f78533f;

    static {
        Covode.recordClassIndex(48770);
    }

    public a(Activity activity) {
        this.f78533f = activity.getResources().getDimensionPixelSize(activity.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        View childAt = ((FrameLayout) activity.findViewById(16908290)).getChildAt(0);
        this.f78528a = childAt;
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new b(this));
        this.f78530c = (FrameLayout.LayoutParams) this.f78528a.getLayoutParams();
    }
}
