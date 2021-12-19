package com.lynx.tasm.behavior.ui.a;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import java.util.ArrayList;
import java.util.List;

public class d implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    public List<c> f56107a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public List<f> f56108b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<Integer> f56109c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<Integer> f56110d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public List<h> f56111e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public List<i> f56112f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public Bitmap.Config f56113g;

    /* renamed from: h  reason: collision with root package name */
    private j f56114h;

    /* renamed from: i  reason: collision with root package name */
    private BackgroundDrawable f56115i;

    /* renamed from: j  reason: collision with root package name */
    private float f56116j;

    static {
        Covode.recordClassIndex(35052);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final boolean a() {
        if (!this.f56107a.isEmpty()) {
            return true;
        }
        return false;
    }

    public void invalidateDrawable(Drawable drawable) {
        this.f56115i.invalidateSelf();
    }

    public final void a(Rect rect) {
        for (c cVar : this.f56107a) {
            cVar.a(rect.width(), rect.height());
        }
    }

    public final void a(ReadableArray readableArray) {
        this.f56107a.clear();
        if (readableArray != null) {
            int size = readableArray.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = readableArray.getInt(i2);
                if (i3 == 1) {
                    i2++;
                    if (LynxEnv.b().p != null) {
                        c a2 = LynxEnv.b().p.a(this.f56114h, readableArray.getString(i2));
                        a2.setCallback(this);
                        this.f56107a.add(a2);
                    }
                } else if (i3 == 2) {
                    i2++;
                    this.f56107a.add(new e(readableArray.getArray(i2)));
                } else if (i3 == 3) {
                    i2++;
                    this.f56107a.add(new g(readableArray.getArray(i2)));
                }
                i2++;
            }
        }
    }

    public d(j jVar, BackgroundDrawable backgroundDrawable, float f2) {
        this.f56114h = jVar;
        this.f56115i = backgroundDrawable;
        this.f56116j = f2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
        if (r1 < r6) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f2, code lost:
        if (r1 > r6) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f6, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0169 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0236  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.graphics.Canvas r20, android.graphics.RectF r21, android.graphics.RectF r22, android.graphics.RectF r23, android.graphics.RectF r24, android.graphics.Path r25) {
        /*
        // Method dump skipped, instructions count: 609
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.a.d.a(android.graphics.Canvas, android.graphics.RectF, android.graphics.RectF, android.graphics.RectF, android.graphics.RectF, android.graphics.Path):void");
    }
}
