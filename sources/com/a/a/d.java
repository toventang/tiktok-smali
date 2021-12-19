package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class d implements e {
    static {
        Covode.recordClassIndex(2009);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        MethodCollector.i(1548);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setBackgroundColor(resources.getColor(R.color.f159926j));
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        SmartCircleImageView smartCircleImageView = new SmartCircleImageView(context);
        smartCircleImageView.setId(R.id.os);
        ConstraintLayout.a aVar = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2051h = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2054k = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            int i3 = Build.VERSION.SDK_INT;
            aVar.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2047d = 0;
        }
        a.a(smartCircleImageView);
        if (smartCircleImageView.getParent() == null) {
            constraintLayout.addView(smartCircleImageView, aVar);
        }
        SmartCircleImageView smartCircleImageView2 = new SmartCircleImageView(context);
        smartCircleImageView2.setId(R.id.ot);
        ConstraintLayout.a aVar2 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2051h = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2054k = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i4 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).leftMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.q = R.id.os;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2047d = R.id.os;
        }
        a.a(smartCircleImageView2);
        if (smartCircleImageView2.getParent() == null) {
            constraintLayout.addView(smartCircleImageView2, aVar2);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(context);
        autoRTLImageView.setImageResource(R.drawable.mo);
        autoRTLImageView.setId(R.id.awu);
        ConstraintLayout.a aVar3 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2050g = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2051h = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2054k = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i5 = Build.VERSION.SDK_INT;
            aVar3.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        a.a(autoRTLImageView);
        if (autoRTLImageView.getParent() == null) {
            constraintLayout.addView(autoRTLImageView, aVar3);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bc});
        tuxTextView.setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        tuxTextView.setId(R.id.ak7);
        ConstraintLayout.a aVar4 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            i2 = R.id.ot;
            aVar4.f2048e = R.id.ot;
        } else {
            i2 = R.id.ot;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.p = i2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i6 = Build.VERSION.SDK_INT;
            aVar4.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2051h = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2049f = R.id.awu;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.r = R.id.awu;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i7 = Build.VERSION.SDK_INT;
            aVar4.setMarginEnd((int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).rightMargin = (int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("P1_Semibold"), tuxTextView, aVar4);
        f.a(tuxTextView, aVar4);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar4);
        }
        android.view.a.a(constraintLayout);
        constraintLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.o(1548);
        return constraintLayout;
    }
}
