package com.bytedance.tux.dialog.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.widget.FlexLayout;
import h.f.b.l;

public final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    public int f44864a;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f44865b;

    /* renamed from: c  reason: collision with root package name */
    private int f44866c;

    static {
        Covode.recordClassIndex(27390);
    }

    @Override // com.bytedance.tux.dialog.internal.c
    public final View a() {
        FlexLayout flexLayout = new FlexLayout(this.f44902f, (AttributeSet) null, 6);
        ViewGroup.LayoutParams amVar = new FlexLayout.am(-1);
        flexLayout.setPadding(0, 0, 0, this.f44864a);
        flexLayout.setLayoutParams(amVar);
        flexLayout.setBackground(new ColorDrawable(this.f44874g));
        AppCompatImageView appCompatImageView = new AppCompatImageView(flexLayout.getContext());
        Drawable drawable = this.f44865b;
        if (!(drawable == null && (drawable = androidx.appcompat.a.a.a.b(appCompatImageView.getContext(), this.f44866c)) == null)) {
            double intrinsicHeight = (double) drawable.getIntrinsicHeight();
            double intrinsicWidth = (double) drawable.getIntrinsicWidth();
            Double.isNaN(intrinsicHeight);
            Double.isNaN(intrinsicWidth);
            FlexLayout.am amVar2 = new FlexLayout.am(-1);
            Context context = appCompatImageView.getContext();
            l.a((Object) context, "");
            amVar2.f45603h = FlexLayout.ao.a.a(context, "this.width * ".concat(String.valueOf(intrinsicHeight / intrinsicWidth)), "layout_height");
            appCompatImageView.setLayoutParams(amVar2);
            appCompatImageView.setImageDrawable(drawable);
        }
        flexLayout.addView(appCompatImageView);
        return flexLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, int i2) {
        super(context, 0);
        l.c(context, "");
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f44864a = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        this.f44866c = i2;
    }
}
