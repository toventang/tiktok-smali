package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.ui.FadeImageView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class a implements e {
    static {
        Covode.recordClassIndex(1935);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        MethodCollector.i(934);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams a2 = android.view.a.a(viewGroup, -1, -2);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setBackgroundColor(resources.getColor(R.color.c9));
        constraintLayout.setId(R.id.a_6);
        if (TextView.class.isInstance(constraintLayout)) {
            android.view.a.b(constraintLayout, (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        } else {
            constraintLayout.setMinimumHeight((int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        }
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.a9w);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bj});
        tuxTextView.setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        tuxTextView.setVisibility(8);
        ConstraintLayout.a aVar = new ConstraintLayout.a(-1, (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics()));
        tuxTextView.setGravity(17);
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.q = R.id.a_6;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2051h = R.id.a_6;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2054k = R.id.a_6;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            int i6 = Build.VERSION.SDK_INT;
            aVar.setMarginStart((int) TypedValue.applyDimension(1, 26.0f, resources.getDisplayMetrics()));
        }
        f.a("app:tux_font", new a.c("H4_Regular"), tuxTextView, aVar);
        f.a(tuxTextView, aVar);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar);
        }
        FadeImageView fadeImageView = new FadeImageView(context);
        fadeImageView.setId(R.id.dlj);
        fadeImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        fadeImageView.setVisibility(8);
        fadeImageView.setImageResource(2131231200);
        ConstraintLayout.a aVar2 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.q = R.id.a_6;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2054k = R.id.a_6;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i7 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(fadeImageView);
        if (fadeImageView.getParent() == null) {
            constraintLayout.addView(fadeImageView, aVar2);
        }
        SmartCircleImageView smartCircleImageView = new SmartCircleImageView(context);
        smartCircleImageView.setId(R.id.a9v);
        smartCircleImageView.setVisibility(8);
        ConstraintLayout.a aVar3 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.q = R.id.a_6;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2054k = R.id.a_6;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i8 = Build.VERSION.SDK_INT;
            aVar3.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        com.a.a.a.a.a aVar4 = new com.a.a.a.a.a();
        aVar4.a("app:placeholderImage", new a.b("2131232324", "drawable"), smartCircleImageView, aVar3);
        aVar4.a(smartCircleImageView, aVar3);
        android.view.a.a(smartCircleImageView);
        if (smartCircleImageView.getParent() == null) {
            constraintLayout.addView(smartCircleImageView, aVar3);
        }
        View view = new View(context);
        view.setId(R.id.c5j);
        if (TextView.class.isInstance(view)) {
            android.view.a.b(view, (int) TypedValue.applyDimension(1, 38.0f, resources.getDisplayMetrics()));
        } else {
            view.setMinimumHeight((int) TypedValue.applyDimension(1, 38.0f, resources.getDisplayMetrics()));
        }
        view.setBackgroundResource(R.drawable.la);
        ConstraintLayout.a aVar5 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.q = R.id.a_6;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.f2051h = R.id.a_6;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.f2054k = R.id.a_6;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.s = R.id.a_6;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            int i9 = Build.VERSION.SDK_INT;
            aVar5.setMarginEnd((int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            int i10 = Build.VERSION.SDK_INT;
            aVar5.setMarginStart((int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            ((ViewGroup.MarginLayoutParams) aVar5).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            ((ViewGroup.MarginLayoutParams) aVar5).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, aVar5);
        }
        MentionEditText mentionEditText = new MentionEditText(context);
        mentionEditText.setId(R.id.a_7);
        mentionEditText.setBackgroundColor(resources.getColor(R.color.c9));
        mentionEditText.setHint(context.getResources().getString(R.string.ajp));
        mentionEditText.setTextAlignment(5);
        mentionEditText.setTextColor(resources.getColorStateList(R.color.bx));
        mentionEditText.setHintTextColor(resources.getColor(R.color.bz));
        mentionEditText.setPadding(mentionEditText.getPaddingLeft(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), mentionEditText.getPaddingRight(), mentionEditText.getPaddingBottom());
        mentionEditText.setPadding(mentionEditText.getPaddingLeft(), mentionEditText.getPaddingTop(), mentionEditText.getPaddingRight(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (Build.VERSION.SDK_INT <= 28) {
            Integer valueOf = Integer.valueOf((int) R.drawable.lv);
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(mentionEditText, valueOf);
        } else {
            Method a3 = android.view.a.a(TextView.class, "setTextCursorDrawable", Drawable.class);
            Object[] objArr = {context.getResources().getDrawable(R.drawable.lv)};
            Pair<Boolean, Object> a4 = com.bytedance.helios.sdk.a.a(a3, new Object[]{mentionEditText, objArr}, 110000, "java.lang.Object", true, "com_by_andInflater_aweme_comment_comment_edit_layout_new_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a4.first).booleanValue()) {
                Object obj = a4.second;
            } else {
                com.bytedance.helios.sdk.a.a(a3.invoke(mentionEditText, objArr), a3, new Object[]{mentionEditText, objArr}, "com_by_andInflater_aweme_comment_comment_edit_layout_new_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
        }
        mentionEditText.setTextSize(1, 15.0f);
        mentionEditText.setMaxLines(4);
        ConstraintLayout.a aVar6 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        mentionEditText.setGravity(8388627);
        if (ConstraintLayout.a.class.isInstance(aVar6)) {
            aVar6.q = R.id.c5j;
        }
        if (ConstraintLayout.a.class.isInstance(aVar6)) {
            i2 = R.id.a_6;
            aVar6.f2051h = R.id.a_6;
        } else {
            i2 = R.id.a_6;
        }
        if (ConstraintLayout.a.class.isInstance(aVar6)) {
            aVar6.f2054k = i2;
        }
        if (ConstraintLayout.a.class.isInstance(aVar6)) {
            aVar6.r = R.id.biv;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            int i11 = Build.VERSION.SDK_INT;
            aVar6.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            int i12 = Build.VERSION.SDK_INT;
            aVar6.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            ((ViewGroup.MarginLayoutParams) aVar6).topMargin = (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            ((ViewGroup.MarginLayoutParams) aVar6).bottomMargin = (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics());
        }
        mentionEditText.setLineSpacing(TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), 1.0f);
        android.view.a.a(mentionEditText);
        if (mentionEditText.getParent() == null) {
            constraintLayout.addView(mentionEditText, aVar6);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.biv);
        ConstraintLayout.a aVar7 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(aVar7)) {
            aVar7.s = R.id.c5j;
        }
        if (ConstraintLayout.a.class.isInstance(aVar7)) {
            aVar7.f2054k = R.id.a_6;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar7)) {
            ((ViewGroup.MarginLayoutParams) aVar7).bottomMargin = (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.btt);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), -2);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView, layoutParams2);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView, layoutParams2);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755162", "raw"), tuxIconView, layoutParams2);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968652", "attr"), tuxIconView, layoutParams2);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView, layoutParams2);
        android.view.a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams2);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.bx_);
        tuxIconView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), -2);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView2, layoutParams3);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView2, layoutParams3);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755327", "raw"), tuxIconView2, layoutParams3);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968652", "attr"), tuxIconView2, layoutParams3);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView2, layoutParams3);
        android.view.a.a(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout.addView(tuxIconView2, layoutParams3);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.bwl);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), -2);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView3, layoutParams4);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView3, layoutParams4);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755298", "raw"), tuxIconView3, layoutParams4);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968652", "attr"), tuxIconView3, layoutParams4);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView3, layoutParams4);
        android.view.a.a(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            linearLayout.addView(tuxIconView3, layoutParams4);
        }
        android.view.a.a(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout.addView(linearLayout, aVar7);
        }
        FadeImageView fadeImageView2 = new FadeImageView(context);
        fadeImageView2.setId(R.id.aa2);
        fadeImageView2.setImageResource(R.drawable.mr);
        fadeImageView2.setVisibility(8);
        ConstraintLayout.a aVar8 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar8)) {
            i3 = R.id.a_6;
            aVar8.s = R.id.a_6;
        } else {
            i3 = R.id.a_6;
        }
        if (ConstraintLayout.a.class.isInstance(aVar8)) {
            aVar8.f2054k = i3;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar8)) {
            ((ViewGroup.MarginLayoutParams) aVar8).bottomMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar8)) {
            int i13 = Build.VERSION.SDK_INT;
            aVar8.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(fadeImageView2);
        if (fadeImageView2.getParent() == null) {
            constraintLayout.addView(fadeImageView2, aVar8);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.aa1);
        tuxTextView2.setBackgroundResource(R.drawable.lk);
        tuxTextView2.setText(R.string.bsb);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.aa});
        tuxTextView2.setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        tuxTextView2.setVisibility(8);
        ConstraintLayout.a aVar9 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar9)) {
            i4 = R.id.a_6;
            aVar9.s = R.id.a_6;
        } else {
            i4 = R.id.a_6;
        }
        if (ConstraintLayout.a.class.isInstance(aVar9)) {
            aVar9.f2054k = i4;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar9)) {
            ((ViewGroup.MarginLayoutParams) aVar9).bottomMargin = (int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar9)) {
            int i14 = Build.VERSION.SDK_INT;
            i5 = 17;
            aVar9.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            i5 = 17;
        }
        tuxTextView2.setGravity(i5);
        f.a("app:tux_font", new a.c("P1_Semibold"), tuxTextView2, aVar9);
        f.a(tuxTextView2, aVar9);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, aVar9);
        }
        android.view.a.a(constraintLayout);
        if (constraintLayout.getParent() == null) {
            frameLayout.addView(constraintLayout, layoutParams);
        }
        android.view.a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(934);
        return frameLayout;
    }
}
