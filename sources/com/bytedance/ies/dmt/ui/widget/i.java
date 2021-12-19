package com.bytedance.ies.dmt.ui.widget;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public float[] f33669a = new float[8];

    /* renamed from: b  reason: collision with root package name */
    public Path f33670b;

    /* renamed from: c  reason: collision with root package name */
    public Paint f33671c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f33672d;

    /* renamed from: e  reason: collision with root package name */
    public int f33673e;

    /* renamed from: f  reason: collision with root package name */
    public int f33674f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f33675g;

    /* renamed from: h  reason: collision with root package name */
    public int f33676h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f33677i;

    /* renamed from: j  reason: collision with root package name */
    public Region f33678j;

    /* renamed from: k  reason: collision with root package name */
    public RectF f33679k;

    static {
        Covode.recordClassIndex(20035);
    }

    public final void a(View view) {
        float width;
        l.d(view, "");
        RectF rectF = this.f33679k;
        if (rectF == null) {
            l.a("mLayer");
        }
        int width2 = (int) rectF.width();
        RectF rectF2 = this.f33679k;
        if (rectF2 == null) {
            l.a("mLayer");
        }
        int height = (int) rectF2.height();
        RectF rectF3 = new RectF();
        rectF3.left = (float) view.getPaddingLeft();
        rectF3.top = (float) view.getPaddingTop();
        float f2 = (float) width2;
        rectF3.right = f2 - ((float) view.getPaddingRight());
        float f3 = (float) height;
        rectF3.bottom = f3 - ((float) view.getPaddingBottom());
        Path path = this.f33670b;
        if (path == null) {
            l.a("mClipPath");
        }
        path.reset();
        if (this.f33672d) {
            if (rectF3.width() >= rectF3.height()) {
                width = rectF3.height();
            } else {
                width = rectF3.width();
            }
            float f4 = width / 2.0f;
            float f5 = (float) (width2 / 2);
            float f6 = (float) (height / 2);
            PointF pointF = new PointF(f5, f6);
            if (Build.VERSION.SDK_INT <= 27) {
                Path path2 = this.f33670b;
                if (path2 == null) {
                    l.a("mClipPath");
                }
                path2.addCircle(pointF.x, pointF.y, f4, Path.Direction.CW);
                Path path3 = this.f33670b;
                if (path3 == null) {
                    l.a("mClipPath");
                }
                path3.moveTo(0.0f, 0.0f);
                Path path4 = this.f33670b;
                if (path4 == null) {
                    l.a("mClipPath");
                }
                path4.moveTo(f2, f3);
            } else {
                float f7 = f6 - f4;
                Path path5 = this.f33670b;
                if (path5 == null) {
                    l.a("mClipPath");
                }
                path5.moveTo(rectF3.left, f7);
                Path path6 = this.f33670b;
                if (path6 == null) {
                    l.a("mClipPath");
                }
                path6.addCircle(pointF.x, f7 + f4, f4, Path.Direction.CW);
            }
        } else {
            Path path7 = this.f33670b;
            if (path7 == null) {
                l.a("mClipPath");
            }
            path7.addRoundRect(rectF3, this.f33669a, Path.Direction.CW);
        }
        Region region = new Region((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
        Region region2 = this.f33678j;
        if (region2 == null) {
            l.a("mAreaRegion");
        }
        Path path8 = this.f33670b;
        if (path8 == null) {
            l.a("mClipPath");
        }
        region2.setPath(path8, region);
    }
}
