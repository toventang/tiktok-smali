package com.bytedance.android.live.design.widget.tintable;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.h.v;
import com.bytedance.android.live.design.widget.b.c;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a extends c<View> {

    /* renamed from: a  reason: collision with root package name */
    Drawable f9614a;

    /* renamed from: b  reason: collision with root package name */
    private final View f9615b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f9616c;

    /* renamed from: d  reason: collision with root package name */
    private C0141a f9617d;

    static {
        Covode.recordClassIndex(4875);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.design.widget.tintable.a$a  reason: collision with other inner class name */
    public static class C0141a {

        /* renamed from: a  reason: collision with root package name */
        public ColorStateList f9618a;

        /* renamed from: b  reason: collision with root package name */
        public PorterDuff.Mode f9619b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f9620c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f9621d;

        static {
            Covode.recordClassIndex(4876);
        }

        private C0141a() {
        }

        /* synthetic */ C0141a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.design.widget.b.c
    public final int[] a() {
        return new int[]{R.attr.jh, R.attr.ji};
    }

    public final ColorStateList c() {
        C0141a aVar = this.f9617d;
        if (aVar == null) {
            return null;
        }
        return aVar.f9618a;
    }

    public final PorterDuff.Mode d() {
        C0141a aVar = this.f9617d;
        if (aVar == null) {
            return null;
        }
        return aVar.f9619b;
    }

    private boolean e() {
        if (this.f9614a == null || Build.VERSION.SDK_INT != 21) {
            return false;
        }
        ColorStateList r = v.r(this.f9615b);
        PorterDuff.Mode s = v.s(this.f9615b);
        if (r != null) {
            androidx.core.graphics.drawable.a.a(this.f9614a, r);
            Drawable drawable = this.f9614a;
            if (s == null) {
                s = PorterDuff.Mode.SRC_IN;
            }
            androidx.core.graphics.drawable.a.a(drawable, s);
            return true;
        }
        androidx.core.graphics.drawable.a.d(this.f9614a);
        return true;
    }

    public final void b() {
        Drawable drawable;
        PorterDuff.Mode mode;
        if (!e() && this.f9617d != null && (drawable = this.f9614a) != null) {
            drawable.mutate();
            if (this.f9617d.f9621d) {
                androidx.core.graphics.drawable.a.a(this.f9614a, this.f9617d.f9618a);
            }
            if (this.f9617d.f9620c) {
                Drawable drawable2 = this.f9614a;
                if (this.f9617d.f9619b != null) {
                    mode = this.f9617d.f9619b;
                } else {
                    mode = PorterDuff.Mode.SRC_IN;
                }
                androidx.core.graphics.drawable.a.a(drawable2, mode);
            }
        }
    }

    public final void a(int i2) {
        f(i2);
    }

    public a(View view) {
        super(view);
        this.f9615b = view;
    }

    public final boolean b(Drawable drawable) {
        if (this.f9614a == drawable) {
            return true;
        }
        return false;
    }

    public final void a(ColorStateList colorStateList) {
        if (this.f9617d == null) {
            this.f9617d = new C0141a((byte) 0);
        }
        this.f9617d.f9618a = colorStateList;
        this.f9617d.f9621d = true;
        b();
    }

    public final void a(PorterDuff.Mode mode) {
        if (this.f9617d == null) {
            this.f9617d = new C0141a((byte) 0);
        }
        this.f9617d.f9619b = mode;
        this.f9617d.f9620c = true;
        b();
    }

    @Override // com.bytedance.android.live.design.widget.b.c
    public final void a(TypedArray typedArray) {
        ColorStateList colorStateList;
        if (typedArray.hasValue(0)) {
            int resourceId = typedArray.getResourceId(0, 0);
            if (resourceId == 0 || (colorStateList = androidx.appcompat.a.a.a.a(this.f9615b.getContext(), resourceId)) == null) {
                colorStateList = typedArray.getColorStateList(0);
            }
            v.a(this.f9615b, colorStateList);
        } else {
            v.a(this.f9615b, (ColorStateList) null);
        }
        if (typedArray.hasValue(1)) {
            v.a(this.f9615b, g.a(typedArray.getInt(1, -1), PorterDuff.Mode.SRC_IN));
        } else {
            v.a(this.f9615b, PorterDuff.Mode.SRC_IN);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f9616c
            if (r0 != r3) goto L_0x0005
            return
        L_0x0005:
            r2.f9616c = r3
            android.graphics.drawable.Drawable r1 = r2.f9614a
            r0 = 0
            if (r1 == 0) goto L_0x0011
            if (r1 == r3) goto L_0x0013
            r1.setCallback(r0)
        L_0x0011:
            if (r3 == 0) goto L_0x0024
        L_0x0013:
            android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.a.e(r3)
            r2.f9614a = r1
            if (r1 == r3) goto L_0x0020
            android.view.View r0 = r2.f9615b
            r1.setCallback(r0)
        L_0x0020:
            r2.b()
            return
        L_0x0024:
            r2.f9614a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.widget.tintable.a.a(android.graphics.drawable.Drawable):void");
    }

    @Override // com.bytedance.android.live.design.widget.b.c
    public final void a(AttributeSet attributeSet, int i2, int i3) {
        if (Build.VERSION.SDK_INT < 21) {
            this.f9615b.addOnLayoutChangeListener(new b(this));
        }
        a(this.f9615b.getBackground());
        super.a(attributeSet, i2, i3);
    }
}
