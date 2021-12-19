package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.b.b;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class bd implements e {
    static {
        Covode.recordClassIndex(1967);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(896);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setBackgroundColor(resources.getColor(R.color.f159924h));
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.dk3);
        smartImageView.setImageResource(2131232340);
        ConstraintLayout.a aVar = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            int i2 = Build.VERSION.SDK_INT;
            aVar.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2051h = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2054k = 0;
        }
        a.a(smartImageView);
        if (smartImageView.getParent() == null) {
            constraintLayout.addView(smartImageView, aVar);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.dk4);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(2);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView.setText(R.string.hb0);
        ConstraintLayout.a aVar2 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i3 = Build.VERSION.SDK_INT;
            aVar2.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i4 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.r = R.id.lk;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.z = 0.0f;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.p = R.id.dk3;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2051h = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.y = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("P3_Semibold"), tuxTextView, aVar2);
        f.a(tuxTextView, aVar2);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar2);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.lk);
        tuxIconView.setScaleType(ImageView.ScaleType.CENTER);
        ConstraintLayout.a aVar3 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i5 = Build.VERSION.SDK_INT;
            aVar3.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView, aVar3);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView, aVar3);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755199", "raw"), tuxIconView, aVar3);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2131099683", b.f37372a), tuxIconView, aVar3);
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2051h = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2054k = 0;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView, aVar3);
        android.view.a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, aVar3);
        }
        android.view.a.a(constraintLayout);
        constraintLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.o(896);
        return constraintLayout;
    }
}
