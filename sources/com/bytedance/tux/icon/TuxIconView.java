package com.bytedance.tux.icon;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.b;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;

public final class TuxIconView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public b f45107a;

    static {
        Covode.recordClassIndex(27515);
    }

    public TuxIconView(Context context) {
        this(context, null, 0, 6);
    }

    public TuxIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public final void a() {
        b bVar = this.f45107a;
        bVar.f44760d = null;
        Drawable drawable = bVar.f44757a;
        if (drawable != null) {
            drawable.setColorFilter(null);
            drawable.setAlpha(255);
            bVar.invalidateSelf();
        }
    }

    public final void a(boolean z) {
        this.f45107a.b(z);
    }

    public final void setTintColor(int i2) {
        this.f45107a.c(i2);
    }

    public final void setIconHeight(int i2) {
        this.f45107a.b(i2);
        a(this.f45107a);
    }

    public final void setIconRes(int i2) {
        setTuxIcon(c.a(new a(this, i2)));
    }

    public final void setIconWidth(int i2) {
        this.f45107a.a(i2);
        a(this.f45107a);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable instanceof b) {
            this.f45107a = (b) drawable;
        }
    }

    public final void setTintColorRes(int i2) {
        b bVar = this.f45107a;
        Context context = getContext();
        l.a((Object) context, "");
        bVar.a(context, i2);
    }

    private final void a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            requestLayout();
            return;
        }
        setImageDrawable(null);
        setImageDrawable(drawable);
    }

    public final void setTuxIcon(com.bytedance.tux.c.a aVar) {
        if (aVar == null) {
            setImageDrawable(null);
            return;
        }
        Context context = getContext();
        l.a((Object) context, "");
        b a2 = aVar.a(context);
        setImageDrawable(a2);
        this.f45107a = a2;
    }

    static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ int $iconRes;
        final /* synthetic */ TuxIconView this$0;

        static {
            Covode.recordClassIndex(27517);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(TuxIconView tuxIconView, int i2) {
            super(1);
            this.this$0 = tuxIconView;
            this.$iconRes = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.c(aVar2, "");
            aVar2.f44749a = this.$iconRes;
            aVar2.f44752d = this.this$0.f45107a.f44760d;
            aVar2.f44750b = this.this$0.f45107a.getIntrinsicWidth();
            aVar2.f44751c = this.this$0.f45107a.getIntrinsicHeight();
            aVar2.f44754f = this.this$0.f45107a.f44759c;
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxIconView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ap8, R.attr.apa, R.attr.apg, R.attr.apn, R.attr.arl}, i2, 0);
        l.a((Object) obtainStyledAttributes, "");
        final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        final z.e eVar = new z.e();
        eVar.element = null;
        if (obtainStyledAttributes.hasValue(4)) {
            eVar.element = (T) Integer.valueOf(obtainStyledAttributes.getColor(4, 0));
        }
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        final int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        final boolean z = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.FIT_XY);
        b a2 = c.a(new h.f.a.b<com.bytedance.tux.c.a, h.z>() {
            /* class com.bytedance.tux.icon.TuxIconView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(27516);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
                com.bytedance.tux.c.a aVar2 = aVar;
                l.c(aVar2, "");
                aVar2.f44749a = resourceId;
                aVar2.f44752d = eVar.element;
                aVar2.f44750b = dimensionPixelSize;
                aVar2.f44751c = dimensionPixelSize2;
                aVar2.f44754f = z;
                return h.z.f158842a;
            }
        }).a(context);
        this.f45107a = a2;
        setImageDrawable(a2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxIconView(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.bv : i2);
    }
}
