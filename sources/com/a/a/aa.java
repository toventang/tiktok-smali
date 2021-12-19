package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.ecommerce.review.view.RatingStar;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class aa implements e {
    static {
        Covode.recordClassIndex(1937);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        int i3;
        int i4;
        MethodCollector.i(2800);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.d_a);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(context);
        smartAvatarImageView.setId(R.id.or);
        ConstraintLayout.a aVar = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2051h = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2047d = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.q = 0;
        }
        a.a(smartAvatarImageView);
        if (smartAvatarImageView.getParent() == null) {
            constraintLayout.addView(smartAvatarImageView, aVar);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.fe1);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.bx));
        ConstraintLayout.a aVar2 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.p = R.id.or;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2051h = R.id.or;
        }
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView, aVar2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i5 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        f.a(tuxTextView, aVar2);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.e52);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.c5));
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setTextAlignment(5);
        ConstraintLayout.a aVar3 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i6 = Build.VERSION.SDK_INT;
            aVar3.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).topMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.p = R.id.or;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2052i = R.id.fe1;
        }
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView2, aVar3);
        tuxTextView2.setGravity(8388611);
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            i2 = 0;
            aVar3.s = 0;
        } else {
            i2 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2050g = i2;
        }
        f.a(tuxTextView2, aVar3);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, aVar3);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.fdv);
        linearLayout.setOrientation(0);
        ConstraintLayout.a aVar4 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            i3 = R.id.fe1;
            aVar4.f2051h = R.id.fe1;
        } else {
            i3 = R.id.fe1;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2054k = i3;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.p = i3;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i7 = Build.VERSION.SDK_INT;
            aVar4.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.r = R.id.e9k;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).rightMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i8 = Build.VERSION.SDK_INT;
            aVar4.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout.addView(linearLayout, aVar4);
        }
        RatingStar ratingStar = new RatingStar(context);
        ratingStar.setId(R.id.e9k);
        ConstraintLayout.a aVar5 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.f2054k = R.id.fe1;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.z = 1.0f;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.f2051h = R.id.fe1;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.A = 1.0f;
        }
        android.view.a.a(ratingStar);
        if (ratingStar.getParent() == null) {
            constraintLayout.addView(ratingStar, aVar5);
        }
        RatingStar ratingStar2 = new RatingStar(context);
        ratingStar2.setId(R.id.e9e);
        ConstraintLayout.a aVar6 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            ((ViewGroup.MarginLayoutParams) aVar6).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar6)) {
            i4 = R.id.e52;
            aVar6.q = R.id.e52;
        } else {
            i4 = R.id.e52;
        }
        if (ConstraintLayout.a.class.isInstance(aVar6)) {
            aVar6.f2052i = i4;
        }
        android.view.a.a(ratingStar2);
        if (ratingStar2.getParent() == null) {
            constraintLayout.addView(ratingStar2, aVar6);
        }
        android.view.a.a(constraintLayout);
        constraintLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.o(2800);
        return constraintLayout;
    }
}
