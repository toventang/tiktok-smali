package com.bytedance.tux.dialog.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.g.a;

public final class g extends h {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f44872a;

    /* renamed from: b  reason: collision with root package name */
    private int f44873b;

    static {
        Covode.recordClassIndex(27396);
    }

    @Override // com.bytedance.tux.dialog.internal.c
    public final View a() {
        MethodCollector.i(7774);
        FrameLayout frameLayout = new FrameLayout(this.f44902f);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a2 = a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        frameLayout.setPadding(0, a2, 0, a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics())));
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(new ColorDrawable(this.f44874g));
        ImageView imageView = new ImageView(frameLayout.getContext());
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        int a3 = a.a(TypedValue.applyDimension(1, 48.0f, system3.getDisplayMetrics()));
        Resources system4 = Resources.getSystem();
        l.a((Object) system4, "");
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a3, a.a(TypedValue.applyDimension(1, 48.0f, system4.getDisplayMetrics())));
        layoutParams2.gravity = 17;
        imageView.setLayoutParams(layoutParams2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setAdjustViewBounds(true);
        Drawable drawable = this.f44872a;
        int i2 = this.f44873b;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else if (i2 != 0) {
            imageView.setImageResource(i2);
        }
        frameLayout.addView(imageView);
        MethodCollector.o(7774);
        return frameLayout;
    }

    public /* synthetic */ g(Context context) {
        this(context, 2131232469);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, int i2) {
        super(context, 0);
        l.c(context, "");
        this.f44873b = i2;
    }
}
