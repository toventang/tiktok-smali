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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.tux.badge.TuxAlertBadge;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tux.a.j.b;
import com.zhiliaoapp.musically.R;

public final class k implements e {
    static {
        Covode.recordClassIndex(2016);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        int i3;
        float f2;
        int i4;
        float f3;
        int i5;
        int i6;
        MethodCollector.i(2660);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setId(R.id.d2x);
        linearLayout.setBackgroundResource(R.drawable.zc);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.a7u);
        ConstraintLayout.a aVar = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            int i7 = Build.VERSION.SDK_INT;
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
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconShadow", new a.c("true"), tuxIconView, aVar);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755555", "raw"), tuxIconView, aVar);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968652", "attr"), tuxIconView, aVar);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView, aVar);
        android.view.a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, aVar);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.e3_);
        tuxIconView2.setVisibility(8);
        ConstraintLayout.a aVar2 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i8 = Build.VERSION.SDK_INT;
            i2 = 1;
            aVar2.setMarginEnd((int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        } else {
            i2 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).rightMargin = (int) TypedValue.applyDimension(i2, 22.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.r = R.id.uf;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2051h = 0;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconShadow", new a.c("true"), tuxIconView2, aVar2);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755478", "raw"), tuxIconView2, aVar2);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968618", "attr"), tuxIconView2, aVar2);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView2, aVar2);
        android.view.a.a(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            constraintLayout.addView(tuxIconView2, aVar2);
        }
        TuxAlertBadge tuxAlertBadge = new TuxAlertBadge(context);
        tuxAlertBadge.setId(R.id.e3b);
        tuxAlertBadge.setVisibility(8);
        ConstraintLayout.a aVar3 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.s = R.id.e3a;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2050g = R.id.e3a;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2051h = R.id.e3a;
        }
        b.a("app:tux_badgeCount", new a.c("0"), tuxAlertBadge, aVar3);
        b.a("app:tux_badgeMaxCount", new a.c("unlimited"), tuxAlertBadge, aVar3);
        b.a("app:tux_badgeVariant", new a.c("number"), tuxAlertBadge, aVar3);
        b.a(tuxAlertBadge, aVar3);
        android.view.a.a(tuxAlertBadge);
        if (tuxAlertBadge.getParent() == null) {
            constraintLayout.addView(tuxAlertBadge, aVar3);
        }
        Space space = new Space(context);
        space.setId(R.id.e3a);
        ConstraintLayout.a aVar4 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            i3 = R.id.e3_;
            aVar4.f2053j = R.id.e3_;
        } else {
            i3 = R.id.e3_;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.s = i3;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2048e = i3;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2050g = i3;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.p = i3;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2051h = i3;
        }
        android.view.a.a(space);
        if (space.getParent() == null) {
            constraintLayout.addView(space, aVar4);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.uf);
        tuxIconView3.setVisibility(8);
        ConstraintLayout.a aVar5 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            int i9 = Build.VERSION.SDK_INT;
            f2 = 22.0f;
            aVar5.setMarginEnd((int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        } else {
            f2 = 22.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            ((ViewGroup.MarginLayoutParams) aVar5).rightMargin = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.r = R.id.co2;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.f2051h = 0;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconShadow", new a.c("true"), tuxIconView3, aVar5);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755177", "raw"), tuxIconView3, aVar5);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968618", "attr"), tuxIconView3, aVar5);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView3, aVar5);
        android.view.a.a(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            constraintLayout.addView(tuxIconView3, aVar5);
        }
        TuxIconView tuxIconView4 = new TuxIconView(context);
        tuxIconView4.setId(R.id.co2);
        ConstraintLayout.a aVar6 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            int i10 = Build.VERSION.SDK_INT;
            aVar6.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            ((ViewGroup.MarginLayoutParams) aVar6).leftMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            ((ViewGroup.MarginLayoutParams) aVar6).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            int i11 = Build.VERSION.SDK_INT;
            aVar6.setMarginStart((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(aVar6)) {
            i4 = 0;
            aVar6.f2054k = 0;
        } else {
            i4 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar6)) {
            aVar6.s = i4;
        }
        if (ConstraintLayout.a.class.isInstance(aVar6)) {
            aVar6.f2051h = i4;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconShadow", new a.c("true"), tuxIconView4, aVar6);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755296", "raw"), tuxIconView4, aVar6);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968618", "attr"), tuxIconView4, aVar6);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView4, aVar6);
        android.view.a.a(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            constraintLayout.addView(tuxIconView4, aVar6);
        }
        android.view.a.a(constraintLayout);
        if (constraintLayout.getParent() == null) {
            linearLayout.addView(constraintLayout, layoutParams2);
        }
        DmtTabLayout dmtTabLayout = new DmtTabLayout(context);
        dmtTabLayout.setId(R.id.d2y);
        dmtTabLayout.setSelectedTabIndicatorColor(resources.getColor(R.color.bi));
        dmtTabLayout.setSelectedTabIndicatorHeight((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        dmtTabLayout.setTabMinWidth((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        dmtTabLayout.setTabMode(0);
        dmtTabLayout.setTabPaddingEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        dmtTabLayout.setTabPaddingStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        android.view.a.a(dmtTabLayout);
        if (dmtTabLayout.getParent() == null) {
            linearLayout.addView(dmtTabLayout, layoutParams3);
        }
        android.view.a.a(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams);
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.chz);
        constraintLayout2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            f3 = 10.0f;
            i5 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        } else {
            f3 = 10.0f;
            i5 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(i5, f3, resources.getDisplayMetrics());
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.a7h);
        androidx.core.widget.e.a(appCompatImageView, resources.getColorStateList(R.color.bx));
        appCompatImageView.setImageResource(R.drawable.yt);
        ConstraintLayout.a aVar7 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar7)) {
            ((ViewGroup.MarginLayoutParams) aVar7).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar7)) {
            int i12 = Build.VERSION.SDK_INT;
            aVar7.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ConstraintLayout.a.class.isInstance(aVar7)) {
            i6 = 0;
            aVar7.f2054k = 0;
        } else {
            i6 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar7)) {
            aVar7.q = i6;
        }
        if (ConstraintLayout.a.class.isInstance(aVar7)) {
            aVar7.f2051h = i6;
        }
        android.view.a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            constraintLayout2.addView(appCompatImageView, aVar7);
        }
        android.view.a.a(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            frameLayout.addView(constraintLayout2, layoutParams4);
        }
        android.view.a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(2660);
        return frameLayout;
    }
}
