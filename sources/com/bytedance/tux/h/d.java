package com.bytedance.tux.h;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;

public final class d {
    static {
        Covode.recordClassIndex(27504);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<TypedValue, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f45099a = new a();

        static {
            Covode.recordClassIndex(27505);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(TypedValue typedValue) {
            TypedValue typedValue2 = typedValue;
            l.c(typedValue2, "");
            if (d.a(typedValue2)) {
                return Integer.valueOf(typedValue2.data);
            }
            return null;
        }
    }

    public static final class b extends m implements h.f.a.b<TypedValue, Drawable> {
        final /* synthetic */ Context $this_getAttrDrawable;

        static {
            Covode.recordClassIndex(27506);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(1);
            this.$this_getAttrDrawable = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Drawable invoke(TypedValue typedValue) {
            TypedValue typedValue2 = typedValue;
            l.c(typedValue2, "");
            if (d.a(typedValue2)) {
                return new ColorDrawable(typedValue2.data);
            }
            if (typedValue2.resourceId != 0) {
                return d.b(this.$this_getAttrDrawable, typedValue2.resourceId);
            }
            return null;
        }
    }

    public static final boolean a(TypedValue typedValue) {
        if (typedValue.type < 28 || typedValue.type > 31) {
            return false;
        }
        return true;
    }

    public static final Drawable b(Context context, int i2) {
        try {
            return androidx.appcompat.a.a.a.b(context, i2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Integer a(Context context, int i2) {
        l.c(context, "");
        return (Integer) a(context, i2, a.f45099a);
    }

    public static final <T> T a(Context context, int i2, h.f.a.b<? super TypedValue, ? extends T> bVar) {
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        l.a((Object) theme, "");
        return (T) a(theme, i2, typedValue, bVar);
    }

    public static final Integer a(Context context, int[] iArr, int i2) {
        l.c(context, "");
        l.c(iArr, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.cg, 0);
        l.a((Object) obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(i2, 1);
        obtainStyledAttributes.recycle();
        if (color == 1) {
            return null;
        }
        return Integer.valueOf(color);
    }

    private static final <T> T a(Resources.Theme theme, int i2, TypedValue typedValue, h.f.a.b<? super TypedValue, ? extends T> bVar) {
        while (theme.resolveAttribute(i2, typedValue, true)) {
            if (typedValue.type != 2) {
                return (T) bVar.invoke(typedValue);
            }
            i2 = typedValue.data;
        }
        return null;
    }
}
