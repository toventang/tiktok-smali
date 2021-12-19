package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.d;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class x implements e {
    static {
        Covode.recordClassIndex(2029);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        int i3;
        MethodCollector.i(3565);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -2);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.e33);
        ConstraintLayout.a aVar = new ConstraintLayout.a((int) resources.getDimension(R.dimen.fm), (int) resources.getDimension(R.dimen.fm));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            int i4 = Build.VERSION.SDK_INT;
            aVar.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = (int) resources.getDimension(R.dimen.fj);
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
        com.a.a.a.a.a aVar2 = new com.a.a.a.a.a();
        aVar2.a("app:placeholderImage", new a.b("2131232615", "drawable"), smartImageView, aVar);
        aVar2.a("app:placeholderImageScaleType", new a.c("centerCrop"), smartImageView, aVar);
        aVar2.a("app:roundedCornerRadius", new a.d("24", "dp"), smartImageView, aVar);
        aVar2.a(smartImageView, aVar);
        android.view.a.a(smartImageView);
        if (smartImageView.getParent() == null) {
            constraintLayout.addView(smartImageView, aVar);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.d_n);
        linearLayout.setOrientation(1);
        ConstraintLayout.a aVar3 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i5 = Build.VERSION.SDK_INT;
            aVar3.setMarginStart((int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).leftMargin = (int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i6 = Build.VERSION.SDK_INT;
            aVar3.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2054k = R.id.e33;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.r = R.id.fkg;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2048e = R.id.e33;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2049f = R.id.fkg;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.p = R.id.e33;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2051h = R.id.e33;
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.e34);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTextAlignment(5);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.bx));
        tuxTextView.setTypeface(Typeface.defaultFromStyle(1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        tuxTextView.setGravity(8388611);
        if (ConstraintLayout.a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.a) layoutParams).f2053j = R.id.d9y;
        }
        if (ConstraintLayout.a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.a) layoutParams).r = R.id.fkg;
        }
        if (ConstraintLayout.a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.a) layoutParams).z = 0.0f;
        }
        if (ConstraintLayout.a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.a) layoutParams).p = R.id.e33;
        }
        if (ConstraintLayout.a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.a) layoutParams).f2051h = R.id.e33;
        }
        f.a("app:tux_font", new a.c("H4_Semibold"), tuxTextView, layoutParams);
        f.a(tuxTextView, layoutParams);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.d9y);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.c5));
        tuxTextView2.setTextSize(1, 13.0f);
        tuxTextView2.setTypeface(Typeface.defaultFromStyle(1));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        f.a("android:textFontWeight", new a.c("600"), tuxTextView2, layoutParams2);
        f.a(tuxTextView2, layoutParams2);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout.addView(tuxTextView2, layoutParams2);
        }
        android.view.a.a(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout.addView(linearLayout, aVar3);
        }
        TuxButton tuxButton = new TuxButton(context);
        tuxButton.setId(R.id.fkg);
        if (TextView.class.isInstance(tuxButton)) {
            android.view.a.a(tuxButton, (int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()));
        } else {
            tuxButton.setMinimumWidth((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()));
        }
        tuxButton.setText(R.string.bgi);
        ConstraintLayout.a aVar4 = new ConstraintLayout.a(-2, (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i7 = Build.VERSION.SDK_INT;
            i2 = R.dimen.fj;
            aVar4.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        } else {
            i2 = R.dimen.fj;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).rightMargin = (int) resources.getDimension(i2);
        }
        tuxButton.setGravity(17);
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            i3 = 0;
            aVar4.f2054k = 0;
        } else {
            i3 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.s = i3;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2050g = i3;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2051h = i3;
        }
        d.a("app:tux_buttonSize", new a.c("small"), tuxButton, aVar4);
        d.a("app:tux_buttonVariant", new a.c("secondary"), tuxButton, aVar4);
        d.a("app:tux_font", new a.c("P1_Semibold"), tuxButton, aVar4);
        d.a(tuxButton, aVar4);
        android.view.a.a(tuxButton);
        if (tuxButton.getParent() == null) {
            constraintLayout.addView(tuxButton, aVar4);
        }
        android.view.a.a(constraintLayout);
        constraintLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.o(3565);
        return constraintLayout;
    }
}
