package com.ss.android.ugc.aweme.feed.ui.b;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f94308a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(59918);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.b.a$a  reason: collision with other inner class name */
    public static final class C2280a extends ShapeDrawable.ShaderFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f94309a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f94310b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f94311c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f94312d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int[] f94313e;

        static {
            Covode.recordClassIndex(59919);
        }

        C2280a(int[] iArr) {
            this.f94313e = iArr;
        }

        public final Shader resize(int i2, int i3) {
            float f2 = (float) i2;
            float f3 = (float) i3;
            return new LinearGradient(f2 * this.f94309a, f3 * this.f94310b, f2 * this.f94311c, f3 * this.f94312d, this.f94313e, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    public static Drawable a(int i2) {
        int max = Math.max(8, 4);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        int[] iArr = new int[max];
        int alpha = Color.alpha(i2);
        for (int i3 = 0; i3 < max; i3++) {
            iArr[i3] = (((int) (((float) alpha) * Math.max(0.0f, Math.min(1.0f, (float) Math.pow((double) ((((float) i3) * 1.0f) / ((float) (max - 1))), 3.0d))))) << 24) | (16777215 & i2);
        }
        paintDrawable.setShaderFactory(new C2280a(iArr));
        return paintDrawable;
    }
}
