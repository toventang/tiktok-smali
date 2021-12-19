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

public final class al implements e {
    static {
        Covode.recordClassIndex(1948);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        MethodCollector.i(1253);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.fgp);
        constraintLayout.setBackgroundResource(2131231718);
        constraintLayout.setClickable(true);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.bi7);
        appCompatImageView.setImageResource(2131231744);
        ConstraintLayout.a aVar = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2053j = R.id.title;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2051h = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.H = 2;
        }
        a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            constraintLayout.addView(appCompatImageView, aVar);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.title);
        tuxTextView.setText("Thanks for reporting");
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        ConstraintLayout.a aVar2 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i3 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i4 = Build.VERSION.SDK_INT;
            aVar2.setMarginEnd((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        tuxTextView.setGravity(17);
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2053j = R.id.adh;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2052i = R.id.bi7;
        }
        f.a("app:tux_font", new a.c("H3_Semibold"), tuxTextView, aVar2);
        f.a(tuxTextView, aVar2);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.adh);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.a_));
        ConstraintLayout.a aVar3 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i5 = Build.VERSION.SDK_INT;
            aVar3.setMarginStart((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i6 = Build.VERSION.SDK_INT;
            aVar3.setMarginEnd((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        tuxTextView2.setGravity(17);
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2053j = R.id.button;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2052i = R.id.title;
        }
        f.a("app:tux_font", new a.c("P1_Regular"), tuxTextView2, aVar3);
        f.a(tuxTextView2, aVar3);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, aVar3);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.button);
        tuxTextView3.setBackgroundResource(R.drawable.a0a);
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.a9));
        ConstraintLayout.a aVar4 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i7 = Build.VERSION.SDK_INT;
            aVar4.setMarginStart((int) TypedValue.applyDimension(1, 32.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i8 = Build.VERSION.SDK_INT;
            aVar4.setMarginEnd((int) TypedValue.applyDimension(1, 32.5f, resources.getDisplayMetrics()));
        }
        tuxTextView3.setGravity(17);
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2053j = R.id.a0s;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2051h = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.A = 0.8f;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.H = 2;
        }
        f.a("app:tux_font", new a.c("H4_Semibold"), tuxTextView3, aVar4);
        f.a(tuxTextView3, aVar4);
        android.view.a.a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            constraintLayout.addView(tuxTextView3, aVar4);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.a0s);
        tuxTextView4.setBackgroundResource(R.drawable.zz);
        tuxTextView4.setTextColor(resources.getColorStateList(R.color.a9));
        ConstraintLayout.a aVar5 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            ((ViewGroup.MarginLayoutParams) aVar5).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            int i9 = Build.VERSION.SDK_INT;
            aVar5.setMarginStart((int) TypedValue.applyDimension(1, 32.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            int i10 = Build.VERSION.SDK_INT;
            aVar5.setMarginEnd((int) TypedValue.applyDimension(1, 32.5f, resources.getDisplayMetrics()));
        }
        tuxTextView4.setGravity(17);
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            i2 = 0;
            aVar5.f2054k = 0;
        } else {
            i2 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.s = i2;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.q = i2;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.f2052i = R.id.button;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.A = 0.8f;
        }
        f.a("app:tux_font", new a.c("H4_Semibold"), tuxTextView4, aVar5);
        f.a(tuxTextView4, aVar5);
        android.view.a.a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            constraintLayout.addView(tuxTextView4, aVar5);
        }
        android.view.a.a(constraintLayout);
        constraintLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.o(1253);
        return constraintLayout;
    }
}
