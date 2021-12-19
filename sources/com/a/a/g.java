package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.b.b;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tux.a.j.d;
import com.zhiliaoapp.musically.R;

public final class g implements e {
    static {
        Covode.recordClassIndex(2012);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        int i3;
        int i4;
        MethodCollector.i(4779);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.d2w);
        linearLayout.setBackgroundResource(R.drawable.xk);
        linearLayout.setClickable(true);
        linearLayout.setFocusable(true);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, (int) resources.getDimension(R.dimen.ff));
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.biu);
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 11.125f, resources.getDisplayMetrics()), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 11.125f, resources.getDisplayMetrics()), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (ConstraintLayout.a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.a) layoutParams).f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.a) layoutParams).f2047d = 0;
        }
        if (ConstraintLayout.a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.a) layoutParams).q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.a) layoutParams).f2051h = 0;
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.dyd);
        ConstraintLayout.a aVar = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(aVar)) {
            ((LinearLayout.LayoutParams) aVar).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(aVar)) {
            ((FrameLayout.LayoutParams) aVar).gravity = 16;
        }
        if (DrawerLayout.d.class.isInstance(aVar)) {
            ((DrawerLayout.d) aVar).f2691a = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            int i5 = Build.VERSION.SDK_INT;
            aVar.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2051h = 0;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755495", "raw"), tuxIconView, aVar);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2131099745", b.f37372a), tuxIconView, aVar);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView, aVar);
        android.view.a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, aVar);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.bl2);
        tuxIconView2.setVisibility(8);
        ConstraintLayout.a aVar2 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(aVar2)) {
            i2 = 16;
            ((LinearLayout.LayoutParams) aVar2).gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(aVar2)) {
            ((FrameLayout.LayoutParams) aVar2).gravity = i2;
        }
        if (DrawerLayout.d.class.isInstance(aVar2)) {
            ((DrawerLayout.d) aVar2).f2691a = i2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).leftMargin = (int) TypedValue.applyDimension(1, 17.25f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i6 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 17.25f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.p = R.id.dyd;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2051h = 0;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755334", "raw"), tuxIconView2, aVar2);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2131099745", b.f37372a), tuxIconView2, aVar2);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView2, aVar2);
        android.view.a.a(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            constraintLayout.addView(tuxIconView2, aVar2);
        }
        android.view.a.a(constraintLayout);
        if (constraintLayout.getParent() == null) {
            linearLayout.addView(constraintLayout, layoutParams);
        }
        TuxButton tuxButton = new TuxButton(context);
        tuxButton.setId(R.id.hr);
        tuxButton.setVisibility(8);
        tuxButton.setText(R.string.bj8);
        tuxButton.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) TypedValue.applyDimension(1, 11.125f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i7 = Build.VERSION.SDK_INT;
            i3 = 1;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 11.125f, resources.getDisplayMetrics()));
        } else {
            i3 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(i3, 12.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1.0f;
        }
        tuxButton.setGravity(17);
        d.a("app:tux_buttonAutoSizing", new a.c("false"), tuxButton, layoutParams2);
        d.a("app:tux_buttonVariant", new a.c("secondary"), tuxButton, layoutParams2);
        d.a("app:tux_buttonSize", new a.c("large"), tuxButton, layoutParams2);
        d.a(tuxButton, layoutParams2);
        android.view.a.a(tuxButton);
        if (tuxButton.getParent() == null) {
            linearLayout.addView(tuxButton, layoutParams2);
        }
        TuxButton tuxButton2 = new TuxButton(context);
        tuxButton2.setId(R.id.a1d);
        tuxButton2.setText(R.string.bfu);
        tuxButton2.setTextAlignment(4);
        tuxButton2.setAllCaps(false);
        tuxButton2.setTextColor(resources.getColorStateList(R.color.a9));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i8 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i9 = Build.VERSION.SDK_INT;
            i4 = 1;
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            i4 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(i4, 12.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.weight = 1.0f;
        }
        tuxButton2.setGravity(17);
        d.a("app:tux_buttonAutoSizing", new a.c("false"), tuxButton2, layoutParams3);
        d.a("app:tux_font", new a.c("H4_Semibold"), tuxButton2, layoutParams3);
        d.a("app:tux_buttonVariant", new a.c("primary"), tuxButton2, layoutParams3);
        d.a("app:tux_buttonSize", new a.c("large"), tuxButton2, layoutParams3);
        d.a(tuxButton2, layoutParams3);
        android.view.a.a(tuxButton2);
        if (tuxButton2.getParent() == null) {
            linearLayout.addView(tuxButton2, layoutParams3);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(4779);
        return linearLayout;
    }
}
