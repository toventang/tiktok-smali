package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class ab implements e {
    static {
        Covode.recordClassIndex(1938);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(703);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.dhw);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bc});
        tuxTextView.setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ConstraintLayout.a aVar = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2047d = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2051h = 0;
        }
        f.a("app:tux_font", new a.c("H2_Semibold"), tuxTextView, aVar);
        f.a(tuxTextView, aVar);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.d0j);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bj});
        tuxTextView2.setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        ConstraintLayout.a aVar2 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2047d = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2052i = R.id.dhw;
        }
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView2, aVar2);
        f.a(tuxTextView2, aVar2);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, aVar2);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.akm);
        tuxTextView3.setTextAlignment(2);
        TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bc});
        tuxTextView3.setTextColor(obtainStyledAttributes3.getColor(0, 0));
        obtainStyledAttributes3.recycle();
        ConstraintLayout.a aVar3 = new ConstraintLayout.a(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        tuxTextView3.setGravity(8388611);
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2047d = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2052i = R.id.d0j;
        }
        f.a("app:tux_font", new a.c("H4_Regular"), tuxTextView3, aVar3);
        f.a(tuxTextView3, aVar3);
        android.view.a.a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            constraintLayout.addView(tuxTextView3, aVar3);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.e7j);
        TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bj});
        tuxTextView4.setTextColor(obtainStyledAttributes4.getColor(0, 0));
        obtainStyledAttributes4.recycle();
        ConstraintLayout.a aVar4 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2047d = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2052i = R.id.akm;
        }
        f.a("app:tux_font", new a.c("P1_Regular"), tuxTextView4, aVar4);
        f.a(tuxTextView4, aVar4);
        android.view.a.a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            constraintLayout.addView(tuxTextView4, aVar4);
        }
        android.view.a.a(constraintLayout);
        constraintLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.o(703);
        return constraintLayout;
    }
}
