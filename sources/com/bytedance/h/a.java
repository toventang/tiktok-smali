package com.bytedance.h;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    protected final LinkedList<Paint> f30624a;

    /* renamed from: b  reason: collision with root package name */
    protected final Paint f30625b;

    /* renamed from: c  reason: collision with root package name */
    protected final Path f30626c = new Path();

    static {
        Covode.recordClassIndex(17788);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(Canvas canvas);

    public int getOpacity() {
        return -1;
    }

    public a() {
        LinkedList<Paint> linkedList = new LinkedList<>();
        this.f30624a = linkedList;
        Paint paint = new Paint();
        this.f30625b = paint;
        linkedList.add(paint);
        a();
        Iterator<Paint> it = linkedList.iterator();
        while (it.hasNext()) {
            it.next().setAntiAlias(true);
        }
    }

    public void draw(Canvas canvas) {
        canvas.save();
        a(canvas);
        canvas.restore();
    }

    public final void a(Xfermode xfermode) {
        Iterator<Paint> it = this.f30624a.iterator();
        while (it.hasNext()) {
            it.next().setXfermode(xfermode);
        }
        invalidateSelf();
    }

    public void setAlpha(int i2) {
        Iterator<Paint> it = this.f30624a.iterator();
        while (it.hasNext()) {
            it.next().setAlpha(i2);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Iterator<Paint> it = this.f30624a.iterator();
        while (it.hasNext()) {
            it.next().setColorFilter(colorFilter);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Canvas canvas, float f2) {
        a(canvas, f2, f2);
    }

    /* access modifiers changed from: protected */
    public final void a(Canvas canvas, float f2, float f3) {
        canvas.translate((float) getBounds().left, (float) getBounds().top);
        canvas.scale(((float) getBounds().width()) / f2, ((float) getBounds().height()) / f3);
    }
}
