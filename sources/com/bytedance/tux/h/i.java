package com.bytedance.tux.h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.badge.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;

public final class i {

    /* renamed from: a */
    public static final Rect f45103a = new Rect();

    /* renamed from: b */
    private static final Map<View, View.OnLayoutChangeListener> f45104b = new LinkedHashMap();

    public static final boolean a(View view) {
        l.c(view, "");
        return v.e(view) == 1;
    }

    static {
        Covode.recordClassIndex(27512);
    }

    public static void b(View view) {
        l.c(view, "");
        view.setOnTouchListener(new a(0.75f, 50, null));
    }

    public static final void c(View view) {
        l.c(view, "");
        int i2 = Build.VERSION.SDK_INT;
        View.OnLayoutChangeListener remove = f45104b.remove(view);
        if (remove != null) {
            view.removeOnLayoutChangeListener(remove);
        }
        view.getOverlay().clear();
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<c, z> {
        final /* synthetic */ float $baseOffset;
        final /* synthetic */ c $drawable;
        final /* synthetic */ float $extraPaddingHorizontalPx;
        final /* synthetic */ View $this_attachTuxAlertBadge;

        static {
            Covode.recordClassIndex(27513);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, float f2, float f3, c cVar) {
            super(1);
            this.$this_attachTuxAlertBadge = view;
            this.$extraPaddingHorizontalPx = f2;
            this.$baseOffset = f3;
            this.$drawable = cVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c cVar) {
            a(cVar);
            return z.f158842a;
        }

        public final void a(c cVar) {
            float width;
            l.c(cVar, "");
            if (i.a(this.$this_attachTuxAlertBadge)) {
                width = this.$extraPaddingHorizontalPx - this.$baseOffset;
            } else {
                this.$this_attachTuxAlertBadge.getDrawingRect(i.f45103a);
                width = ((((float) i.f45103a.width()) - this.$extraPaddingHorizontalPx) - ((float) this.$drawable.f44725c)) + this.$baseOffset;
            }
            cVar.f44727e = width;
        }
    }

    public static final Drawable b(Context context) {
        l.c(context, "");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ab_});
        l.a((Object) obtainStyledAttributes, "");
        return androidx.core.content.b.a(context, obtainStyledAttributes.getResourceId(0, 0));
    }

    public static final ColorMatrixColorFilter a(int i2) {
        return new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, (float) Color.red(i2), 0.0f, 1.0f, 0.0f, 0.0f, (float) Color.green(i2), 0.0f, 0.0f, 1.0f, 0.0f, (float) Color.blue(i2), 0.0f, 0.0f, 0.0f, (((float) Color.alpha(i2)) * 1.0f) / 255.0f, 0.0f});
    }

    public static final boolean a(Context context) {
        l.c(context, "");
        int i2 = Build.VERSION.SDK_INT;
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        Configuration configuration = resources.getConfiguration();
        l.a((Object) configuration, "");
        if (configuration.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static final LayerDrawable a(Drawable drawable, Drawable drawable2) {
        l.c(drawable, "");
        l.c(drawable2, "");
        return new LayerDrawable(new Drawable[]{drawable2, drawable});
    }

    public static final void a(View view, int i2, float f2, float f3) {
        l.c(view, "");
        int i3 = Build.VERSION.SDK_INT;
        view.getOverlay().clear();
        Context context = view.getContext();
        l.a((Object) context, "");
        c a2 = com.bytedance.tux.badge.a.a(context, null, 0, 0, 0, 62);
        a2.f44731i = i2;
        a2.a(com.bytedance.tux.badge.a.a(0, 2, 0));
        a2.a();
        float f4 = ((float) i2) / 2.0f;
        a2.f44728f = f2 - f4;
        a aVar = new a(view, f3, f4, a2);
        aVar.a(a2);
        b bVar = new b(aVar, a2);
        f45104b.put(view, bVar);
        view.addOnLayoutChangeListener(bVar);
        view.getOverlay().add(a2);
    }

    public static final void b(View view, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        l.c(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Context context = view.getContext();
            l.a((Object) context, "");
            a((ViewGroup.MarginLayoutParams) layoutParams, context, num, num2, num3, num4, z);
        }
        view.setLayoutParams(layoutParams);
    }

    public static final void a(View view, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        boolean z2;
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        int paddingBottom;
        l.c(view, "");
        if (!(num == null && num3 == null) && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (num != null) {
            paddingLeft = num.intValue();
        } else {
            paddingLeft = view.getPaddingLeft();
        }
        if (num2 != null) {
            paddingTop = num2.intValue();
        } else {
            paddingTop = view.getPaddingTop();
        }
        if (num3 != null) {
            paddingRight = num3.intValue();
        } else {
            paddingRight = view.getPaddingRight();
        }
        if (num4 != null) {
            paddingBottom = num4.intValue();
        } else {
            paddingBottom = view.getPaddingBottom();
        }
        if (z2) {
            Context context = view.getContext();
            l.a((Object) context, "");
            if (a(context)) {
                view.setPadding(paddingRight, paddingTop, paddingLeft, paddingBottom);
                return;
            }
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public static /* synthetic */ void a(View view, Integer num, Integer num2, Integer num3, Integer num4, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 2) != 0) {
            num2 = null;
        }
        if ((i2 & 4) != 0) {
            num3 = null;
        }
        if ((i2 & 8) != 0) {
            num4 = null;
        }
        if ((i2 & 16) != 0) {
            z = true;
        }
        a(view, num, num2, num3, num4, z);
    }

    public static /* synthetic */ void b(View view, Integer num, Integer num2, Integer num3, Integer num4, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 2) != 0) {
            num2 = null;
        }
        if ((i2 & 4) != 0) {
            num3 = null;
        }
        if ((i2 & 8) != 0) {
            num4 = null;
        }
        if ((i2 & 16) != 0) {
            z = true;
        }
        b(view, num, num2, num3, num4, z);
    }

    public static void a(ViewGroup.MarginLayoutParams marginLayoutParams, Context context, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        l.c(marginLayoutParams, "");
        l.c(context, "");
        if (!(num == null && num3 == null)) {
            if (!z || !a(context)) {
                if (num != null) {
                    marginLayoutParams.leftMargin = num.intValue();
                }
                if (num3 != null) {
                    marginLayoutParams.rightMargin = num3.intValue();
                }
            } else {
                if (num != null) {
                    marginLayoutParams.rightMargin = num.intValue();
                }
                if (num3 != null) {
                    marginLayoutParams.leftMargin = num3.intValue();
                }
            }
        }
        if (num2 != null) {
            marginLayoutParams.topMargin = num2.intValue();
        }
        if (num4 != null) {
            marginLayoutParams.bottomMargin = num4.intValue();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (num != null) {
            marginLayoutParams.setMarginStart(num.intValue());
        }
        if (num3 != null) {
            marginLayoutParams.setMarginEnd(num3.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ a f45105a;

        /* renamed from: b */
        final /* synthetic */ c f45106b;

        static {
            Covode.recordClassIndex(27514);
        }

        b(a aVar, c cVar) {
            this.f45105a = aVar;
            this.f45106b = cVar;
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f45105a.a(this.f45106b);
        }
    }
}
