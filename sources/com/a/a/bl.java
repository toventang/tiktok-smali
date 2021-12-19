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
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class bl implements e {
    static {
        Covode.recordClassIndex(1975);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(2337);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.fku);
        constraintLayout.setBackgroundColor(resources.getColor(R.color.f159924h));
        constraintLayout.setFocusable(false);
        constraintLayout.setFocusableInTouchMode(false);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.boz);
        tuxTextView.setFocusable(false);
        tuxTextView.setFocusableInTouchMode(false);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        tuxTextView.setText(R.string.bw0);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        ConstraintLayout.a aVar = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2053j = R.id.czr;
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
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView, aVar);
        f.a(tuxTextView, aVar);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.czr);
        tuxTextView2.setBackgroundResource(R.drawable.a0e);
        tuxTextView2.setText(R.string.bw4);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.a9));
        ConstraintLayout.a aVar2 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i2 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i3 = Build.VERSION.SDK_INT;
            aVar2.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        tuxTextView2.setGravity(17);
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2052i = R.id.boz;
        }
        f.a("app:tux_font", new a.c("P1_Semibold"), tuxTextView2, aVar2);
        f.a(tuxTextView2, aVar2);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, aVar2);
        }
        android.view.a.a(constraintLayout);
        constraintLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.o(2337);
        return constraintLayout;
    }
}
