package com.bytedance.android.livesdk.widget.roundcorner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class RoundCornerFrameLayout extends FrameLayout implements a {

    /* renamed from: a  reason: collision with root package name */
    private final b f22642a;

    static {
        Covode.recordClassIndex(13366);
    }

    public RoundCornerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.bytedance.android.livesdk.widget.roundcorner.a
    public final void a(Canvas canvas) {
        l.d(canvas, "");
        super.draw(canvas);
    }

    public final void draw(Canvas canvas) {
        c cVar = this.f22642a.f22643a;
        if (canvas != null) {
            if (cVar.f22644a == 0 && cVar.f22646c == 0 && cVar.f22645b == 0 && cVar.f22647d == 0) {
                cVar.f22653j.a(canvas);
                return;
            }
            int a2 = c.a(canvas, cVar.f22648e, cVar.f22651h);
            cVar.f22650g.reset();
            cVar.f22650g.addRoundRect(cVar.f22648e, cVar.f22649f, Path.Direction.CW);
            canvas.drawPath(cVar.f22650g, cVar.f22651h);
            cVar.f22651h.setXfermode(cVar.f22652i);
            c.a(canvas, cVar.f22648e, cVar.f22651h);
            cVar.f22653j.a(canvas);
            cVar.f22651h.setXfermode(null);
            cVar.f22651h.setColorFilter(null);
            canvas.restoreToCount(a2);
        }
    }

    private /* synthetic */ RoundCornerFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RoundCornerFrameLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(10766);
        b bVar = new b(this);
        this.f22642a = bVar;
        l.d(context, "");
        c cVar = bVar.f22643a;
        l.d(context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.amz, R.attr.an5, R.attr.an6, R.attr.ani, R.attr.anj}, 0, 0);
        l.b(obtainStyledAttributes, "");
        if (obtainStyledAttributes != null) {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            cVar.f22644a = obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
            cVar.f22645b = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
            cVar.f22646c = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
            cVar.f22647d = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
            cVar.f22649f[0] = (float) cVar.f22644a;
            cVar.f22649f[1] = cVar.f22649f[0];
            cVar.f22649f[2] = (float) cVar.f22646c;
            cVar.f22649f[3] = cVar.f22649f[2];
            cVar.f22649f[4] = (float) cVar.f22647d;
            cVar.f22649f[5] = cVar.f22649f[4];
            cVar.f22649f[6] = (float) cVar.f22645b;
            cVar.f22649f[7] = cVar.f22649f[6];
            obtainStyledAttributes.recycle();
        }
        if (cVar.f22645b > 0 || cVar.f22644a > 0 || cVar.f22646c > 0 || cVar.f22647d > 0) {
            a aVar = cVar.f22653j;
            ViewGroup viewGroup = (ViewGroup) (!(aVar instanceof ViewGroup) ? null : aVar);
            if (viewGroup != null) {
                viewGroup.setWillNotDraw(false);
                MethodCollector.o(10766);
                return;
            }
        }
        MethodCollector.o(10766);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        b bVar = this.f22642a;
        int width = getWidth();
        int height = getHeight();
        c cVar = bVar.f22643a;
        if ((cVar.f22644a != 0 || cVar.f22646c != 0 || cVar.f22647d != 0 || cVar.f22645b != 0) && width != 0 && height != 0) {
            cVar.f22648e.set(0.0f, 0.0f, (float) width, (float) height);
        }
    }
}
