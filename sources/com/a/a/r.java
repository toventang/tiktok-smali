package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.b.b;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.review.view.RatingNumber;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class r implements e {
    static {
        Covode.recordClassIndex(2023);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(2468);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.ahu);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.ahv);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.c5));
        ConstraintLayout.a aVar = new ConstraintLayout.a(-2, -2);
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView, aVar);
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.q = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2054k = 0;
        }
        f.a(tuxTextView, aVar);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.e9j);
        ConstraintLayout.a aVar2 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755492", "raw"), tuxIconView, aVar2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).rightMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i2 = Build.VERSION.SDK_INT;
            aVar2.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2131099648", b.f37372a), tuxIconView, aVar2);
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2051h = R.id.dhd;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2054k = R.id.dhd;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.r = R.id.dhd;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView, aVar2);
        android.view.a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, aVar2);
        }
        RatingNumber ratingNumber = new RatingNumber(context);
        ratingNumber.setId(R.id.dhd);
        ConstraintLayout.a aVar3 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        a.c cVar = new a.c("medium");
        l.d("app:commerce_style", "");
        l.d(cVar, "");
        l.d(ratingNumber, "");
        l.d(aVar3, "");
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.r = R.id.qh;
        }
        l.d(ratingNumber, "");
        l.d(aVar3, "");
        android.view.a.a(ratingNumber);
        if (ratingNumber.getParent() == null) {
            constraintLayout.addView(ratingNumber, aVar3);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.qh);
        ConstraintLayout.a aVar4 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755201", "raw"), tuxIconView2, aVar4);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2131099753", b.f37372a), tuxIconView2, aVar4);
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2054k = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView2, aVar4);
        android.view.a.a(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            constraintLayout.addView(tuxIconView2, aVar4);
        }
        android.view.a.a(constraintLayout);
        constraintLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.o(2468);
        return constraintLayout;
    }
}
