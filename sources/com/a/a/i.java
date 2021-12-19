package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.HalfWaistView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;
import dmt.viewpager.DmtRtlViewPager;

public final class i implements e {
    static {
        Covode.recordClassIndex(2014);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(2453);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        DmtRtlViewPager dmtRtlViewPager = new DmtRtlViewPager(context);
        dmtRtlViewPager.setId(R.id.abc);
        ConstraintLayout.a aVar = new ConstraintLayout.a(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2054k = 0;
        }
        aVar.B = "h,1:1";
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2047d = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2050g = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2051h = 0;
        }
        a.a(dmtRtlViewPager);
        if (dmtRtlViewPager.getParent() == null) {
            constraintLayout.addView(dmtRtlViewPager, aVar);
        }
        View view = new View(context);
        view.setBackgroundResource(R.drawable.zb);
        ConstraintLayout.a aVar2 = new ConstraintLayout.a(-1, (int) TypedValue.applyDimension(1, 126.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2051h = 0;
        }
        a.a(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, aVar2);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.bo4);
        tuxTextView.setBackgroundResource(R.drawable.z7);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a_));
        ConstraintLayout.a aVar3 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i2 = Build.VERSION.SDK_INT;
            aVar3.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.w = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2053j = R.id.abb;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.s = 0;
        }
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView, aVar3);
        f.a(tuxTextView, aVar3);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar3);
        }
        HalfWaistView halfWaistView = new HalfWaistView(context);
        halfWaistView.setId(R.id.abb);
        ConstraintLayout.a aVar4 = new ConstraintLayout.a(-1, -2);
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2047d = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2050g = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.s = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i3 = Build.VERSION.SDK_INT;
            aVar4.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i4 = Build.VERSION.SDK_INT;
            aVar4.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(halfWaistView);
        if (halfWaistView.getParent() == null) {
            constraintLayout.addView(halfWaistView, aVar4);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.abd);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        appCompatImageView.setVisibility(8);
        appCompatImageView.setImageResource(R.drawable.yy);
        ConstraintLayout.a aVar5 = new ConstraintLayout.a(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.f2054k = 0;
        }
        aVar5.B = "h,1:1";
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.f2047d = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.f2050g = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.f2051h = 0;
        }
        android.view.a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            constraintLayout.addView(appCompatImageView, aVar5);
        }
        android.view.a.a(constraintLayout);
        constraintLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.o(2453);
        return constraintLayout;
    }
}
