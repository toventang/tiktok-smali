package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    View f85225a;

    /* renamed from: b  reason: collision with root package name */
    View f85226b;

    /* renamed from: c  reason: collision with root package name */
    int f85227c;

    /* renamed from: d  reason: collision with root package name */
    int f85228d;

    /* renamed from: e  reason: collision with root package name */
    int f85229e;

    /* renamed from: f  reason: collision with root package name */
    FrameLayout.LayoutParams f85230f;

    /* renamed from: g  reason: collision with root package name */
    int f85231g;

    /* renamed from: h  reason: collision with root package name */
    boolean f85232h = true;

    static {
        Covode.recordClassIndex(53341);
    }

    public a(Fragment fragment) {
        View view = fragment.getView();
        if (view != null) {
            this.f85226b = ((ViewGroup) view.getRootView()).findViewById(R.id.ad7);
            this.f85225a = view;
            view.getViewTreeObserver().addOnGlobalLayoutListener(new b(this));
            this.f85230f = (FrameLayout.LayoutParams) this.f85225a.getLayoutParams();
        }
    }
}
