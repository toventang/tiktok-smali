package com.ss.android.ugc.aweme.story.base.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class RoundCornerImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    private final h f136936a;

    /* renamed from: b  reason: collision with root package name */
    private final int f136937b;

    static {
        Covode.recordClassIndex(89500);
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final Path getPath() {
        return (Path) this.f136936a.getValue();
    }

    static final class a extends m implements h.f.a.a<Path> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f136938a = new a();

        static {
            Covode.recordClassIndex(89501);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Path invoke() {
            return new Path();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public final void draw(Canvas canvas) {
        l.d(canvas, "");
        if (this.f136937b > 0) {
            Path path = getPath();
            RectF rectF = new RectF(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
            int i2 = this.f136937b;
            path.addRoundRect(rectF, (float) i2, (float) i2, Path.Direction.CW);
            canvas.clipPath(getPath());
        }
        try {
            super.draw(canvas);
        } catch (Throwable unused) {
        }
    }

    private /* synthetic */ RoundCornerImageView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RoundCornerImageView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f136936a = i.a((h.f.a.a) a.f136938a);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.a8p}, 0, 0);
        l.b(obtainStyledAttributes, "");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f136937b = dimensionPixelSize;
    }
}
