package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class BadgeView extends View {

    /* renamed from: a  reason: collision with root package name */
    private Collection<? extends b> f12429a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12430b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12431c;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f12432d;

    /* renamed from: e  reason: collision with root package name */
    private int f12433e;

    static {
        Covode.recordClassIndex(6828);
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setBadges(Collection<? extends b> collection) {
        l.d(collection, "");
        this.f12429a = collection;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        List k2;
        float f2;
        MethodCollector.i(7426);
        super.onDraw(canvas);
        if (canvas == null) {
            MethodCollector.o(7426);
            return;
        }
        Collection<? extends b> collection = this.f12429a;
        if (collection == null || (k2 = n.k(collection)) == null) {
            MethodCollector.o(7426);
            return;
        }
        boolean z = true;
        if (v.e(this) != 1) {
            z = false;
        }
        int i2 = this.f12433e;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            b bVar = (b) k2.get(i4);
            if (i4 > 0) {
                i3 += this.f12430b;
            }
            canvas.save();
            if (z) {
                f2 = (((float) getWidth()) - ((float) i3)) - ((float) bVar.b().a(this.f12432d));
            } else {
                f2 = (float) i3;
            }
            canvas.translate(f2, 0.0f);
            a b2 = bVar.b();
            Paint paint = this.f12432d;
            l.d(canvas, "");
            l.d(paint, "");
            b2.a(canvas, paint);
            Runnable runnable = b2.f12436c;
            if (runnable != null) {
                runnable.run();
            }
            canvas.restore();
            i3 += bVar.b().a(this.f12432d);
        }
        MethodCollector.o(7426);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(7410);
        super.onMeasure(i2, i3);
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        Collection<? extends b> collection = this.f12429a;
        int i4 = 0;
        if (collection != null && (!collection.isEmpty())) {
            int i5 = 0;
            int i6 = 0;
            for (T t : collection) {
                int i7 = i5 + 1;
                if (i5 < 0) {
                    n.a();
                }
                i6 += t.b().a(this.f12432d);
                if (i5 > 0) {
                    i6 += this.f12430b;
                }
                i5 = i7;
            }
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size = Math.min(i6, size);
                } else {
                    size = i6;
                }
            }
            if (mode2 != 1073741824) {
                size2 = this.f12431c;
            }
            this.f12433e = collection.size();
            Iterator<T> it = collection.iterator();
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                int i10 = i8 + 1;
                if (i8 < 0) {
                    n.a();
                }
                i9 += next.b().a(this.f12432d);
                if (i8 > 0) {
                    i9 += this.f12430b;
                }
                if (i9 > size) {
                    this.f12433e = i8;
                    break;
                }
                i8 = i10;
            }
            if (this.f12433e != 0) {
                i4 = size;
                setMeasuredDimension(i4, size2);
                MethodCollector.o(7410);
            }
        }
        size2 = 0;
        setMeasuredDimension(i4, size2);
        MethodCollector.o(7410);
    }

    private /* synthetic */ BadgeView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BadgeView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(7430);
        this.f12430b = context.getResources().getDimensionPixelSize(R.dimen.xv);
        this.f12431c = context.getResources().getDimensionPixelSize(R.dimen.xu);
        this.f12432d = new Paint(1);
        MethodCollector.o(7430);
    }
}
