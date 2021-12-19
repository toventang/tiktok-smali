package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class bm implements e {
    static {
        Covode.recordClassIndex(1976);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(941);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setBackgroundColor(resources.getColor(R.color.bj));
        constraintLayout.setClickable(true);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.bi7);
        appCompatImageView.setImageResource(2131231548);
        ConstraintLayout.a aVar = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2053j = R.id.title;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.A = 0.4f;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.H = 2;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2051h = 0;
        }
        a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            constraintLayout.addView(appCompatImageView, aVar);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.title);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a_));
        tuxTextView.setText(R.string.bw3);
        ConstraintLayout.a aVar2 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2052i = R.id.bi7;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2053j = R.id.ak7;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i2 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i3 = Build.VERSION.SDK_INT;
            aVar2.setMarginEnd((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        tuxTextView.setGravity(17);
        f.a("app:tux_font", new a.c("H3_Bold"), tuxTextView, aVar2);
        f.a(tuxTextView, aVar2);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setText(R.string.bw2);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.aa));
        tuxTextView2.setId(R.id.ak7);
        ConstraintLayout.a aVar3 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2052i = R.id.title;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2054k = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i4 = Build.VERSION.SDK_INT;
            aVar3.setMarginStart((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i5 = Build.VERSION.SDK_INT;
            aVar3.setMarginEnd((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        tuxTextView2.setGravity(17);
        f.a("app:tux_font", new a.c("P1_Regular"), tuxTextView2, aVar3);
        f.a(tuxTextView2, aVar3);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, aVar3);
        }
        android.view.a.a(constraintLayout);
        constraintLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.o(941);
        return constraintLayout;
    }
}
