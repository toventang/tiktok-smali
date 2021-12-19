package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
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
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.FlashSaleBg;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.FlashSaleCountDownView;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.PdpExtraInfoView;
import com.ss.android.ugc.aweme.ecommerce.widget.LogoTuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class s implements e {
    static {
        Covode.recordClassIndex(2024);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        float f2;
        float f3;
        int i2;
        int i3;
        float f4;
        int i4;
        float f5;
        int i5;
        int i6;
        float f6;
        int i7;
        float f7;
        int i8;
        int i9;
        float f8;
        int i10;
        int i11;
        float f9;
        float f10;
        int i12;
        float f11;
        int i13;
        float f12;
        int i14;
        float f13;
        int i15;
        int i16;
        int i17;
        MethodCollector.i(2431);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -2);
        View tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.flm);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ay});
        tuxIconView.setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ConstraintLayout.a aVar = new ConstraintLayout.a(-1, (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.r = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2051h = 0;
        }
        a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, aVar);
        }
        FlashSaleBg flashSaleBg = new FlashSaleBg(context);
        flashSaleBg.setId(R.id.b6y);
        flashSaleBg.setVisibility(8);
        flashSaleBg.setPadding(flashSaleBg.getPaddingLeft(), flashSaleBg.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), flashSaleBg.getPaddingBottom());
        flashSaleBg.setPadding(flashSaleBg.getPaddingLeft(), flashSaleBg.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), flashSaleBg.getPaddingBottom());
        flashSaleBg.setPadding((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), flashSaleBg.getPaddingTop(), flashSaleBg.getPaddingRight(), flashSaleBg.getPaddingBottom());
        flashSaleBg.setPadding((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), flashSaleBg.getPaddingTop(), flashSaleBg.getPaddingRight(), flashSaleBg.getPaddingBottom());
        ConstraintLayout.a aVar2 = new ConstraintLayout.a(-2, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2054k = R.id.flm;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2051h = R.id.flm;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a3 = a.a(flashSaleBg, -1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            ((LinearLayout.LayoutParams) a3).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = 16;
        }
        if (DrawerLayout.d.class.isInstance(a3)) {
            ((DrawerLayout.d) a3).f2691a = 16;
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.b71);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.bx));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        f.a("app:tux_font", new a.c("H4_Bold"), tuxTextView, layoutParams);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 8388613;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams)) {
            ((DrawerLayout.d) layoutParams).f2691a = 8388613;
        }
        f.a(tuxTextView, layoutParams);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.b6z);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 8388613;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.d) layoutParams2).f2691a = 8388613;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.b70);
        tuxTextView2.setText(R.string.bif);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        f.a("app:tux_font", new a.c("P3_Regular"), tuxTextView2, layoutParams3);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        tuxTextView2.setGravity(16);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams3)) {
            ((DrawerLayout.d) layoutParams3).f2691a = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i18 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        f.a(tuxTextView2, layoutParams3);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout2.addView(tuxTextView2, layoutParams3);
        }
        FlashSaleCountDownView flashSaleCountDownView = new FlashSaleCountDownView(context);
        flashSaleCountDownView.setId(R.id.b6x);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics()));
        f.a("app:tux_font", new a.c("SmallText2_Semibold"), flashSaleCountDownView, layoutParams4);
        flashSaleCountDownView.setGravity(16);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 16;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams4)) {
            ((DrawerLayout.d) layoutParams4).f2691a = 16;
        }
        f.a(flashSaleCountDownView, layoutParams4);
        android.view.a.a(flashSaleCountDownView);
        if (flashSaleCountDownView.getParent() == null) {
            linearLayout2.addView(flashSaleCountDownView, layoutParams4);
        }
        android.view.a.a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams2);
        }
        android.view.a.a(linearLayout);
        if (linearLayout.getParent() == null) {
            flashSaleBg.addView(linearLayout, a3);
        }
        android.view.a.a(flashSaleBg);
        if (flashSaleBg.getParent() == null) {
            constraintLayout.addView(flashSaleBg, aVar2);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.fln);
        linearLayout3.setOrientation(1);
        ConstraintLayout.a aVar3 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i19 = Build.VERSION.SDK_INT;
            f2 = 16.0f;
            aVar3.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            f2 = 16.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).rightMargin = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
        linearLayout3.setGravity(8388613);
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2054k = R.id.flm;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2051h = R.id.flm;
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.d4n);
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.a9));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        tuxTextView3.setGravity(8388613);
        f.a("app:tux_font", new a.c("P1_Semibold"), tuxTextView3, layoutParams5);
        f.a(tuxTextView3, layoutParams5);
        android.view.a.a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout3.addView(tuxTextView3, layoutParams5);
        }
        View view = new View(context);
        view.setId(R.id.d5_);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        android.view.a.a(view);
        if (view.getParent() == null) {
            linearLayout3.addView(view, layoutParams6);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.cx);
        tuxTextView4.setBackgroundResource(R.drawable.y1);
        tuxTextView4.setPadding((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), tuxTextView4.getPaddingTop(), tuxTextView4.getPaddingRight(), tuxTextView4.getPaddingBottom());
        tuxTextView4.setPadding(tuxTextView4.getPaddingLeft(), tuxTextView4.getPaddingTop(), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), tuxTextView4.getPaddingBottom());
        tuxTextView4.setTextColor(resources.getColorStateList(R.color.bd));
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        tuxTextView4.setGravity(8388613);
        f.a("app:tux_font", new a.c("SmallText2_Semibold"), tuxTextView4, layoutParams7);
        f.a(tuxTextView4, layoutParams7);
        android.view.a.a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout3.addView(tuxTextView4, layoutParams7);
        }
        android.view.a.a(linearLayout3);
        if (linearLayout3.getParent() == null) {
            constraintLayout.addView(linearLayout3, aVar3);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.bhs);
        tuxIconView2.setVisibility(8);
        ConstraintLayout.a aVar4 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i20 = Build.VERSION.SDK_INT;
            f3 = 16.0f;
            aVar4.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            f3 = 16.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).leftMargin = (int) TypedValue.applyDimension(1, f3, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2054k = R.id.d9c;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2051h = R.id.d9c;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755284", "raw"), tuxIconView2, aVar4);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968588", "attr"), tuxIconView2, aVar4);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView2, aVar4);
        android.view.a.a(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            constraintLayout.addView(tuxIconView2, aVar4);
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.d9c);
        tuxTextView5.setMaxLines(1);
        tuxTextView5.setEllipsize(TextUtils.TruncateAt.END);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bc});
        tuxTextView5.setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        ConstraintLayout.a aVar5 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            int i21 = Build.VERSION.SDK_INT;
            i2 = 1;
            aVar5.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        } else {
            i2 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            ((ViewGroup.MarginLayoutParams) aVar5).leftMargin = (int) TypedValue.applyDimension(i2, 2.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            ((ViewGroup.MarginLayoutParams) aVar5).topMargin = (int) TypedValue.applyDimension(i2, 6.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            int i22 = Build.VERSION.SDK_INT;
            i3 = 1;
            aVar5.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        } else {
            i3 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            ((ViewGroup.MarginLayoutParams) aVar5).rightMargin = (int) TypedValue.applyDimension(i3, 2.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.f2053j = R.id.ckl;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.p = R.id.bhs;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.f2051h = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.A = 0.5f;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.H = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            f4 = 16.0f;
            i4 = 1;
            aVar5.t = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            f4 = 16.0f;
            i4 = 1;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.x = (int) TypedValue.applyDimension(i4, f4, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("H2_Semibold"), tuxTextView5, aVar5);
        f.a(tuxTextView5, aVar5);
        android.view.a.a(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            constraintLayout.addView(tuxTextView5, aVar5);
        }
        TuxTextView tuxTextView6 = new TuxTextView(context);
        tuxTextView6.setId(R.id.ckl);
        tuxTextView6.setMaxLines(1);
        tuxTextView6.setEllipsize(TextUtils.TruncateAt.END);
        TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ab});
        tuxTextView6.setTextColor(obtainStyledAttributes3.getColor(0, 0));
        obtainStyledAttributes3.recycle();
        tuxTextView6.setVisibility(0);
        ConstraintLayout.a aVar6 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            int i23 = Build.VERSION.SDK_INT;
            f5 = 16.0f;
            i5 = 1;
            aVar6.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            f5 = 16.0f;
            i5 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            ((ViewGroup.MarginLayoutParams) aVar6).leftMargin = (int) TypedValue.applyDimension(i5, f5, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            ((ViewGroup.MarginLayoutParams) aVar6).topMargin = (int) TypedValue.applyDimension(i5, 2.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar6)) {
            aVar6.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar6)) {
            aVar6.f2052i = R.id.d9c;
        }
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView6, aVar6);
        f.a(tuxTextView6, aVar6);
        android.view.a.a(tuxTextView6);
        if (tuxTextView6.getParent() == null) {
            constraintLayout.addView(tuxTextView6, aVar6);
        }
        TuxTextView tuxTextView7 = new TuxTextView(context);
        tuxTextView7.setId(R.id.aml);
        tuxTextView7.setBackgroundResource(R.drawable.yf);
        tuxTextView7.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView7.getPaddingTop(), tuxTextView7.getPaddingRight(), tuxTextView7.getPaddingBottom());
        tuxTextView7.setPadding(tuxTextView7.getPaddingLeft(), tuxTextView7.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView7.getPaddingBottom());
        TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ay});
        tuxTextView7.setTextColor(obtainStyledAttributes4.getColor(0, 0));
        obtainStyledAttributes4.recycle();
        ConstraintLayout.a aVar7 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar7)) {
            int i24 = Build.VERSION.SDK_INT;
            i6 = 1;
            aVar7.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            i6 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar7)) {
            ((ViewGroup.MarginLayoutParams) aVar7).leftMargin = (int) TypedValue.applyDimension(i6, 5.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar7)) {
            aVar7.p = R.id.ckl;
        }
        if (ConstraintLayout.a.class.isInstance(aVar7)) {
            aVar7.f2052i = R.id.d9c;
        }
        if (ConstraintLayout.a.class.isInstance(aVar7)) {
            aVar7.A = 0.0f;
        }
        if (ConstraintLayout.a.class.isInstance(aVar7)) {
            f6 = 16.0f;
            i7 = 1;
            aVar7.t = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            f6 = 16.0f;
            i7 = 1;
        }
        if (ConstraintLayout.a.class.isInstance(aVar7)) {
            aVar7.x = (int) TypedValue.applyDimension(i7, f6, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView7, aVar7);
        f.a(tuxTextView7, aVar7);
        android.view.a.a(tuxTextView7);
        if (tuxTextView7.getParent() == null) {
            constraintLayout.addView(tuxTextView7, aVar7);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.czg);
        tuxIconView3.setImageResource(R.drawable.yp);
        androidx.core.widget.e.a(tuxIconView3, resources.getColorStateList(R.color.c5));
        ConstraintLayout.a aVar8 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(aVar8)) {
            ((LinearLayout.LayoutParams) aVar8).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(aVar8)) {
            ((FrameLayout.LayoutParams) aVar8).gravity = 8388629;
        }
        if (DrawerLayout.d.class.isInstance(aVar8)) {
            ((DrawerLayout.d) aVar8).f2691a = 8388629;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar8)) {
            int i25 = Build.VERSION.SDK_INT;
            f7 = 16.0f;
            i8 = 1;
            aVar8.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            f7 = 16.0f;
            i8 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar8)) {
            ((ViewGroup.MarginLayoutParams) aVar8).rightMargin = (int) TypedValue.applyDimension(i8, f7, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar8)) {
            aVar8.f2054k = R.id.age;
        }
        if (ConstraintLayout.a.class.isInstance(aVar8)) {
            i9 = 0;
            aVar8.s = 0;
        } else {
            i9 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar8)) {
            aVar8.f2050g = i9;
        }
        if (ConstraintLayout.a.class.isInstance(aVar8)) {
            aVar8.f2051h = R.id.age;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755201", "raw"), tuxIconView3, aVar8);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView3, aVar8);
        android.view.a.a(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            constraintLayout.addView(tuxIconView3, aVar8);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.b6u);
        linearLayout4.setVisibility(8);
        linearLayout4.setOrientation(0);
        ConstraintLayout.a aVar9 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar9)) {
            int i26 = Build.VERSION.SDK_INT;
            f8 = 16.0f;
            aVar9.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            f8 = 16.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar9)) {
            ((ViewGroup.MarginLayoutParams) aVar9).leftMargin = (int) TypedValue.applyDimension(1, f8, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar9)) {
            ((ViewGroup.MarginLayoutParams) aVar9).rightMargin = (int) TypedValue.applyDimension(1, f8, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar9)) {
            int i27 = Build.VERSION.SDK_INT;
            aVar9.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(aVar9)) {
            i10 = 1;
            aVar9.w = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            i10 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar9)) {
            ((ViewGroup.MarginLayoutParams) aVar9).topMargin = (int) TypedValue.applyDimension(i10, 8.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar9)) {
            aVar9.u = (int) TypedValue.applyDimension(i10, 8.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar9)) {
            aVar9.r = R.id.czg;
        }
        if (ConstraintLayout.a.class.isInstance(aVar9)) {
            aVar9.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar9)) {
            aVar9.f2052i = R.id.ckl;
        }
        TuxIconView tuxIconView4 = new TuxIconView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).rightMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755174", "raw"), tuxIconView4, layoutParams8);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2131099729", b.f37372a), tuxIconView4, layoutParams8);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            int i28 = Build.VERSION.SDK_INT;
            layoutParams8.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView4, layoutParams8);
        android.view.a.a(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            linearLayout4.addView(tuxIconView4, layoutParams8);
        }
        TuxTextView tuxTextView8 = new TuxTextView(context);
        tuxTextView8.setId(R.id.b6w);
        tuxTextView8.setTextColor(resources.getColorStateList(R.color.b9));
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        android.view.a.a(tuxTextView8);
        if (tuxTextView8.getParent() == null) {
            linearLayout4.addView(tuxTextView8, layoutParams9);
        }
        android.view.a.a(linearLayout4);
        if (linearLayout4.getParent() == null) {
            constraintLayout.addView(linearLayout4, aVar9);
        }
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setId(R.id.a4q);
        linearLayout5.setOrientation(0);
        ConstraintLayout.a aVar10 = new ConstraintLayout.a(-2, -2);
        linearLayout5.setGravity(16);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar10)) {
            i11 = 1;
            ((ViewGroup.MarginLayoutParams) aVar10).leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            i11 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar10)) {
            ((ViewGroup.MarginLayoutParams) aVar10).topMargin = (int) TypedValue.applyDimension(i11, 22.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar10)) {
            ((ViewGroup.MarginLayoutParams) aVar10).rightMargin = (int) TypedValue.applyDimension(i11, 16.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar10)) {
            aVar10.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar10)) {
            aVar10.f2052i = R.id.ckl;
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.a4r);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        android.view.a.a(smartImageView);
        if (smartImageView.getParent() == null) {
            linearLayout5.addView(smartImageView, layoutParams10);
        }
        TuxTextView tuxTextView9 = new TuxTextView(context);
        tuxTextView9.setId(R.id.a4s);
        tuxTextView9.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView9.setMaxLines(1);
        tuxTextView9.setTextAlignment(5);
        tuxTextView9.setTextColor(resources.getColorStateList(R.color.b9));
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.gravity = 8388611;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((FrameLayout.LayoutParams) layoutParams11).gravity = 8388611;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams11)) {
            ((DrawerLayout.d) layoutParams11).f2691a = 8388611;
        }
        tuxTextView9.setGravity(8388611);
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView9, layoutParams11);
        f.a(tuxTextView9, layoutParams11);
        android.view.a.a(tuxTextView9);
        if (tuxTextView9.getParent() == null) {
            linearLayout5.addView(tuxTextView9, layoutParams11);
        }
        android.view.a.a(linearLayout5);
        if (linearLayout5.getParent() == null) {
            constraintLayout.addView(linearLayout5, aVar10);
        }
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setId(R.id.age);
        linearLayout6.setOrientation(0);
        ConstraintLayout.a aVar11 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar11)) {
            int i29 = Build.VERSION.SDK_INT;
            f9 = 16.0f;
            aVar11.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            f9 = 16.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar11)) {
            ((ViewGroup.MarginLayoutParams) aVar11).leftMargin = (int) TypedValue.applyDimension(1, f9, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar11)) {
            ((ViewGroup.MarginLayoutParams) aVar11).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar11)) {
            int i30 = Build.VERSION.SDK_INT;
            f10 = 16.0f;
            i12 = 1;
            aVar11.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            f10 = 16.0f;
            i12 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar11)) {
            ((ViewGroup.MarginLayoutParams) aVar11).rightMargin = (int) TypedValue.applyDimension(i12, f10, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar11)) {
            aVar11.w = (int) TypedValue.applyDimension(i12, f10, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar11)) {
            aVar11.r = R.id.czg;
        }
        if (ConstraintLayout.a.class.isInstance(aVar11)) {
            aVar11.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar11)) {
            aVar11.f2052i = R.id.b6u;
        }
        android.view.a.a(linearLayout6);
        if (linearLayout6.getParent() == null) {
            constraintLayout.addView(linearLayout6, aVar11);
        }
        LogoTuxTextView logoTuxTextView = new LogoTuxTextView(context);
        logoTuxTextView.setId(R.id.bcm);
        logoTuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        logoTuxTextView.setMaxLines(1);
        logoTuxTextView.setTextAlignment(5);
        TypedArray obtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bc});
        logoTuxTextView.setTextColor(obtainStyledAttributes5.getColor(0, 0));
        obtainStyledAttributes5.recycle();
        ConstraintLayout.a aVar12 = new ConstraintLayout.a(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar12)) {
            int i31 = Build.VERSION.SDK_INT;
            f11 = 16.0f;
            i13 = 1;
            aVar12.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            f11 = 16.0f;
            i13 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar12)) {
            ((ViewGroup.MarginLayoutParams) aVar12).leftMargin = (int) TypedValue.applyDimension(i13, f11, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar12)) {
            ((ViewGroup.MarginLayoutParams) aVar12).topMargin = (int) TypedValue.applyDimension(i13, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar12)) {
            int i32 = Build.VERSION.SDK_INT;
            f12 = 16.0f;
            i14 = 1;
            aVar12.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            f12 = 16.0f;
            i14 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar12)) {
            ((ViewGroup.MarginLayoutParams) aVar12).rightMargin = (int) TypedValue.applyDimension(i14, f12, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar12)) {
            ((ViewGroup.MarginLayoutParams) aVar12).bottomMargin = (int) TypedValue.applyDimension(i14, 0.0f, resources.getDisplayMetrics());
        }
        logoTuxTextView.setGravity(8388611);
        if (ConstraintLayout.a.class.isInstance(aVar12)) {
            aVar12.f2053j = R.id.az6;
        }
        if (ConstraintLayout.a.class.isInstance(aVar12)) {
            aVar12.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar12)) {
            aVar12.f2052i = R.id.age;
        }
        if (ConstraintLayout.a.class.isInstance(aVar12)) {
            aVar12.w = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("H4_Regular"), logoTuxTextView, aVar12);
        f.a(logoTuxTextView, aVar12);
        android.view.a.a(logoTuxTextView);
        if (logoTuxTextView.getParent() == null) {
            constraintLayout.addView(logoTuxTextView, aVar12);
        }
        LinearLayout linearLayout7 = new LinearLayout(context);
        linearLayout7.setId(R.id.az6);
        linearLayout7.setOrientation(0);
        ConstraintLayout.a aVar13 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar13)) {
            ((ViewGroup.MarginLayoutParams) aVar13).bottomMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar13)) {
            int i33 = Build.VERSION.SDK_INT;
            f13 = 16.0f;
            i15 = 1;
            aVar13.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            f13 = 16.0f;
            i15 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar13)) {
            ((ViewGroup.MarginLayoutParams) aVar13).leftMargin = (int) TypedValue.applyDimension(i15, f13, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar13)) {
            ((ViewGroup.MarginLayoutParams) aVar13).rightMargin = (int) TypedValue.applyDimension(i15, f13, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar13)) {
            int i34 = Build.VERSION.SDK_INT;
            aVar13.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar13)) {
            ((ViewGroup.MarginLayoutParams) aVar13).topMargin = (int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar13)) {
            i16 = 0;
            aVar13.f2054k = 0;
        } else {
            i16 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar13)) {
            aVar13.s = i16;
        }
        if (ConstraintLayout.a.class.isInstance(aVar13)) {
            aVar13.q = i16;
        }
        if (ConstraintLayout.a.class.isInstance(aVar13)) {
            aVar13.f2052i = R.id.bcm;
        }
        linearLayout7.setGravity(16);
        View pdpExtraInfoView = new PdpExtraInfoView(context);
        pdpExtraInfoView.setId(R.id.az5);
        pdpExtraInfoView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        android.view.a.a(pdpExtraInfoView);
        if (pdpExtraInfoView.getParent() == null) {
            linearLayout7.addView(pdpExtraInfoView, layoutParams12);
        }
        LinearLayout linearLayout8 = new LinearLayout(context);
        linearLayout8.setId(R.id.b9y);
        linearLayout8.setOrientation(0);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            int i35 = Build.VERSION.SDK_INT;
            i17 = 1;
            layoutParams13.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            i17 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            ((ViewGroup.MarginLayoutParams) layoutParams13).leftMargin = (int) TypedValue.applyDimension(i17, 8.0f, resources.getDisplayMetrics());
        }
        linearLayout8.setGravity(8388629);
        TuxIconView tuxIconView5 = new TuxIconView(context);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(i17, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i17, 16.0f, resources.getDisplayMetrics()));
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755536", "raw"), tuxIconView5, layoutParams14);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968637", "attr"), tuxIconView5, layoutParams14);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView5, layoutParams14);
        android.view.a.a(tuxIconView5);
        if (tuxIconView5.getParent() == null) {
            linearLayout8.addView(tuxIconView5, layoutParams14);
        }
        TuxTextView tuxTextView10 = new TuxTextView(context);
        tuxTextView10.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView10.setMaxLines(1);
        tuxTextView10.setText(R.string.bg5);
        TypedArray obtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ay});
        tuxTextView10.setTextColor(obtainStyledAttributes6.getColor(0, 0));
        obtainStyledAttributes6.recycle();
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            ((ViewGroup.MarginLayoutParams) layoutParams15).leftMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            int i36 = Build.VERSION.SDK_INT;
            layoutParams15.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView10, layoutParams15);
        f.a(tuxTextView10, layoutParams15);
        android.view.a.a(tuxTextView10);
        if (tuxTextView10.getParent() == null) {
            linearLayout8.addView(tuxTextView10, layoutParams15);
        }
        android.view.a.a(linearLayout8);
        if (linearLayout8.getParent() == null) {
            linearLayout7.addView(linearLayout8, layoutParams13);
        }
        android.view.a.a(linearLayout7);
        if (linearLayout7.getParent() == null) {
            constraintLayout.addView(linearLayout7, aVar13);
        }
        android.view.a.a(constraintLayout);
        constraintLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.o(2431);
        return constraintLayout;
    }
}
